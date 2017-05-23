/*
 * Copyright (c) 2001 Matthew Feldt. All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided the copyright notice above is
 * retained.
 */
 
/* 
 * The contents of this file, as updated from time to time by Dublin Core
 * Metadata Initiative (DCMI), are subject to the Dublin Core Public
 * License Version 1.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a current copy of the
 * License at http://dublincore.org/dcpl/.
 *
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See
 * the License for the specific language governing rights and
 * limitations under the License.
 *
 * This software consists of voluntary contributions made by many
 * individuals on behalf of the Dublin Core Metadata Initiative. For
 * more information on the Dublin Core Metadata Initiative, please see
 * http://dublincore.org/.
 *
 * Original Code witten by: Matthew Feldt (see copyright notice above)
 * Modified for DCMI use by: H.Wagner <wagnerh@oclc.org>
 * 
 * Portions created by DCMI are Copyright (C) 2000. 
 */

package org.dublincore.dcregistrylt.tools;

import javax.crypto.*;
import javax.crypto.spec.*;
import java.security.*;
import java.security.spec.*;
import java.io.*;

public class registryDES {
	final static String CIPHER_TRANS = "DESede/CBC/PKCS5Padding";
	final static String KEY_GEN_TRANS = "DESede";
	final static String USAGE = "Usage: java registryDES -d|-e|-g <keyfile> <string to encode or pw file to decode>";
	final static int BUFSIZE = 2048;

	/** create DES encryption/decryption key */
	private static SecretKey generateKey() throws NoSuchAlgorithmException {
		KeyGenerator keygen = KeyGenerator.getInstance("DESede");
		return keygen.generateKey();
	}

	/** read DES SecretKey from the specified file */
	public static SecretKey readKey(File f) throws InvalidKeyException, InvalidKeySpecException, IOException, NoSuchAlgorithmException {
		DataInputStream in = new DataInputStream(new FileInputStream(f));
		byte[] rawkey = new byte[(int)f.length()];
		in.readFully(rawkey);
		in.close();
		
		DESedeKeySpec keyspec = new DESedeKeySpec(rawkey);
		SecretKeyFactory keyfactory = SecretKeyFactory.getInstance("DESede");
		SecretKey key = keyfactory.generateSecret(keyspec);
		return key;
	}

	/** write DES SecretKey to the specified file */
	private static void writeKey(SecretKey key, File f) throws InvalidKeySpecException, IOException, NoSuchAlgorithmException {
		SecretKeyFactory keyfactory = SecretKeyFactory.getInstance(KEY_GEN_TRANS);
		DESedeKeySpec keyspec = (DESedeKeySpec)keyfactory.getKeySpec(key, DESedeKeySpec.class);
		byte[] rawkey = keyspec.getKey();
		
		// write the raw key to the file
		FileOutputStream out = new FileOutputStream(f);
		out.write(rawkey);
		out.close();
	}

	/** encrypt data from InputStream using the specified key */
	private static void encrypt(SecretKey key, String stringToDecrypt)
		throws BadPaddingException, IllegalBlockSizeException, InvalidKeyException, IOException, NoSuchAlgorithmException,
		NoSuchPaddingException {
			
		Cipher cipher = Cipher.getInstance(CIPHER_TRANS);
		cipher.init(Cipher.ENCRYPT_MODE, key);
		
		DataOutputStream outstream = new DataOutputStream(new FileOutputStream("pass.enc"));
		
		byte[] iv = cipher.getIV(); // get the initialization vector
		outstream.writeInt(iv.length); // write IV length
		outstream.write(iv); // write IV
		
		byte[] buffer = stringToDecrypt.getBytes();
		outstream.write(cipher.update(buffer));
		outstream.write(cipher.doFinal());
		outstream.close();
		
		java.util.Arrays.fill(buffer, (byte)0); // clear memory
	}

	/** decrypt data from InputStream to OutputStream using the specified key */
	private static void decrypt(SecretKey key, InputStream in, OutputStream out) 
		throws BadPaddingException, IllegalBlockSizeException, InvalidAlgorithmParameterException, InvalidKeyException,
		IOException, NoSuchAlgorithmException, NoSuchPaddingException {
			
		Cipher cipher = Cipher.getInstance(CIPHER_TRANS);
		DataInputStream instream = new DataInputStream(in);
		
		int len = instream.readInt();
		byte[] iv = new byte[len];
		in.read(iv);
		
		IvParameterSpec ivp = new IvParameterSpec(iv);
		cipher.init(Cipher.DECRYPT_MODE, key, ivp);
		
		byte[] buffer = new byte[BUFSIZE];
		int bytesRead;
		while((bytesRead = in.read(buffer)) != -1) {
			out.write(cipher.update(buffer, 0, bytesRead));
		}

	    out.write(cipher.doFinal());
	    out.flush();
    }
    
    /** compare data from InputStream to pw file using the specified key */
    public static boolean compare(SecretKey key, String pw_enc_in, String pw_in)
		throws BadPaddingException, IllegalBlockSizeException, InvalidAlgorithmParameterException, InvalidKeyException,
		IOException, NoSuchAlgorithmException, NoSuchPaddingException {
		
		InputStream in = new FileInputStream(pw_enc_in);
		Cipher cipher = Cipher.getInstance(CIPHER_TRANS);
		DataInputStream instream = new DataInputStream(in);
		
		int len = instream.readInt();
		byte[] iv = new byte[len];
		in.read(iv);
		
		IvParameterSpec ivp = new IvParameterSpec(iv);
		cipher.init(Cipher.DECRYPT_MODE, key, ivp);
		
		byte[] buffer = new byte[BUFSIZE];
		String clearPW = "";
		int bytesRead;
		while((bytesRead = in.read(buffer)) != -1) {
			byte[] t1 = cipher.update(buffer, 0, bytesRead);
			clearPW = new String(t1);
		}

	    byte[] t2 = cipher.doFinal();
	    clearPW = clearPW + new String(t2);
	    in.close();
	    if (pw_in.equals(clearPW))
		    return true;
	    else
		    return false;
    }

    public static void main(String[] args) {
	    try {
		// Check to see whether there is a provider that can do TripleDES
		// encryption.  If not, explicitly install the SunJCE provider.
		try {
			Cipher c = Cipher.getInstance(CIPHER_TRANS);
		} catch(Exception e) {
			// An exception here probably means the JCE provider hasn't
			// been permanently installed on this system by listing it
			// in the $JAVA_HOME/jre/lib/security/java.security file.
			// Therefore, we have to install the JCE provider explicitly.
			System.err.println("Installing SunJCE provider.");
			Provider sunjce = new com.sun.crypto.provider.SunJCE();
			Security.addProvider(sunjce);
		}

		File keyfile = new File(args[1]);

		// parse command line arguments
		if (args[0].equals("-g")) { 		// generate key
			System.out.print("Generating SecretKey, please wait... ");
			System.out.flush();
			SecretKey key = generateKey();
			writeKey(key, keyfile);
			System.out.println("complete.");
		} else if (args[0].equals("-e")) { 	// encrypt
			SecretKey key = readKey(keyfile);
			encrypt(key, new String(args[2]));
		} else if (args[0].equals("-d")) { 	// decrypt
			SecretKey key = readKey(keyfile);
			decrypt(key, new FileInputStream(args[2]), System.out);
		} else if (args[0].equals("-c")) { 	// decrypt
			SecretKey key = readKey(keyfile);
			boolean pw_ok = compare(key, args[2], args[3]);
			if (pw_ok)
			    System.out.println("passwords match");
			else
			    System.out.println("incorrect pw entered");
		}
	    } catch(Exception e) {
		System.err.println(e);
		System.err.println(USAGE);
		System.exit(-1);
	    }
    }
}
