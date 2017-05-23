/*
  (c) Copyright 2003, Hewlett-Packard Development Company, LP
  [See end of file]
  $Id: SelectorSearch.java,v 1.3 2004/07/26 16:15:12 wagnerh Exp $ 
  Last Modified: H. Wagner, OCLC 20040108
*/

package org.dublincore.dcregistry.servlet;

import com.hp.hpl.jena.db.*;
import com.hp.hpl.jena.rdf.model.*;
import com.hp.hpl.jena.vocabulary.*;
import com.hp.hpl.jena.rdf.arp.JenaReader;

import java.text.*;

/** A Statement selector.
 *
 * <p>Model includes list and query methods which will return all the
 * statements which are selected by a selector object.  This is the interface
 * of such selector objects.
 * 
 * @author bwm, kers
 * @version Release='$Name:  $' Revision='$Revision: 1.3 $' Date='$Date: 2004/07/26 16:15:12 $'
*/

public class SelectorSearch implements Selector {
	
	protected Resource subject;
	protected Property predicate;
	protected RDFNode  object;
	protected String language;
	protected String searchTerm;
	protected String searchCase;
	protected boolean language_match_only;
	protected boolean language_specific_match;
	
	public  SelectorSearch() {
		subject = null;
		predicate = null;
		object = null;
		language = null;
		language_match_only = false;
		language_specific_match = false;
	}
    

	/** Create a selector.  Since no subject, predicate or object constraints are
	* specified a model will test all statements.  Set the searchTerm, case and scope 
	* values to be used in the selects method.
	*/
	public  SelectorSearch(String st, String ca) {
		subject = null;
		predicate = null;
		object = null;
		language = null;
		searchTerm = st;
		searchCase = ca;
		language_match_only = false;
		language_specific_match = false;
	}
	
	
	public  SelectorSearch(String st, String ca, String lang) {
		subject = null;
		predicate = null;
		object = null;
		language = lang;
		searchTerm = st;
		searchCase = ca;
		language_match_only = false;
		language_specific_match = true;
	}
	
	
	/** Create a selector.  A model <b>may</b> restrict statements that are tested using
	* the <CODE>selects</CODE> method to those whose subject matches the
	* subject parameter, whose predicate matches the predicate parameter and whose
	* object matches the object paramater.  Any null parameter is considered to
	* match anything.
	* @param subject if not null, the subject of selected statements
	* must equal this argument.
	* @param predicate if not null, the predicate of selected statements
	* must equal this argument.
	* @param object if not null, the object of selected statements
	* must equal this argument.
	*/
	public SelectorSearch(Resource subj, Property pro, RDFNode obj) {
		subject = subj;
		predicate = pro;
		object = obj;
		language = null;
		language_match_only = false;
		language_specific_match = false;
	}
	
	
	public SelectorSearch(Resource subj, Property pro, String lang, boolean langMatch) {
		subject = subj;
		predicate = pro;
		object = null;
		language = lang;
		language_match_only = langMatch;
		language_specific_match = false;
	}
	
	
	/** Determine whether a Statement should be selected.
	* @param s The statement to be considered.
	* @return true if the statement has been selected.
	*/
	public boolean test(Statement s) {
		
		if (language_match_only) {
			return (subject == null || subject.equals(s.getSubject()))
			&& (predicate == null || predicate.equals(s.getPredicate()))
			&& (language == null || language.equals(s.getLanguage()));
		} else if (language_specific_match) {
			if (s.getObject() instanceof Literal) {
				String sLang = s.getLanguage();
				if ((sLang == null) || (sLang == "")) {
					return selects(s);
				} else if (!language.equals(sLang)) {
					return false;
				} else {
					return selects(s);
				}
			} else {
				return false;
			}
		} else {		
			return (subject == null || subject.equals(s.getSubject()))
			&& (predicate == null || predicate.equals(s.getPredicate()))
			&& (object == null || object.equals(s.getObject()))
			&& (language == null || language.equals(s.getLanguage()))
			&& selects(s);
		}
	}	
    
   
	public boolean selects(Statement s) {
	
		RDFNode node = s.getObject();		// get the object
		boolean result = false;
		
		if (node instanceof Literal) {		//ignore resources
			String object = node.toString();
			int pos = 0;
			if (searchCase.equals("Y")) {
				pos = object.indexOf(searchTerm);
				if (pos != -1)
					result = true;
			} else {
				String lcObject = object.toLowerCase();
				String lcSearchTerm = searchTerm.toLowerCase();
				pos = lcObject.indexOf(lcSearchTerm);
				if (pos != -1) 		   	
					result = true;
			}
		}
		
		return result;
	}
    
	/**
	Answer true iff this Selector is completely characterised by its subject,
	predicate, and object fields. If so, the <code>test</code> predicate need
	not be called to decide if a statement is acceptable. This allows query engines
	lattitude for optimisation (and our memory-based and RDB-based model
	implementations both exploit this licence).
	*/
	public boolean isSimple() {
	
	return ((subject != null) 
		&& (predicate != null)
		&& (object != null));
	}
      
	/**
	Answer the only subject Resource that this Selector will match, or null if it
	can match more that a single resource.
	*/
	public Resource getSubject() { return subject; }
	
	/**
	Answer the only predicate Property that this Selector will match, or null
	if it can match more than a single property.
	*/
	public Property getPredicate() { return predicate; }
	
	/**
	Answer the only RDFNode object that this Selector will match, or null if
	it can match more than a single node. 
	*/
	public RDFNode  getObject() { return object; }
    
}