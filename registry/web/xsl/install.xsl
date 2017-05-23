<?xml version="1.0" encoding='UTF-8'?>
 
<xsl:stylesheet version="1.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform" 
	xmlns:rdf="http://www.w3.org/1999/02/22-rdf-syntax-ns#"
	xmlns:dc="http://purl.org/dc/elements/1.1/"
	xmlns:reg="http://dublincore.org/registry/"
	xmlns:java="java" >

<xsl:output method="xml" indent="yes" encoding="UTF-8"
    doctype-system="http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd"
    doctype-public="-//W3C//DTD XHTML 1.0 Transitional//EN" />

<xsl:include href="banner.xsl"/>
<xsl:include href="navbar.xsl"/>
<xsl:include href="footer.xsl"/>	
<xsl:include href="_url_encode.xsl"/>

<xsl:param name="uiLang" select="'en-US'"/>
<xsl:param name="location" select="'about'"/>

<xsl:variable name="rdf" select="'http://www.w3.org/1999/02/22-rdf-syntax-ns#'" />
<xsl:variable name="rdfs" select="'http://www.w3.org/2000/01/rdf-schema#'"/>
<xsl:variable name="dc" select="'http://purl.org/dc/elements/1.1/'" />
<xsl:variable name="dcq" select="'http://purl.org/dc/terms/'" />
<xsl:variable name="dctype" select="'http://purl.org/dc/dcmitype/'" />

<xsl:variable name="locale" select="java:util.Locale.new(substring($uiLang,1,2), substring($uiLang,4,2))"/>
<xsl:variable name="resources" select="java:util.ResourceBundle.getBundle('ui', $locale)"/>

<xsl:template match="rdf:RDF">
	<html>
	<head>
		<title>The Open Metadata Registry</title>
		<link type="text/css" rel="stylesheet" href="/dcregistry/css/default.css" />
	</head>
	<body>

	<xsl:call-template name="banner">		
		<xsl:with-param name="location" select="$location" />
	</xsl:call-template>
	<p/>
	<h1>Installation Guide</h1>
	<p/>
		
	The <a href='http://purl.org/dc/'>Dublin Core Metadata Initiative's (DCMI)</a> 
	Metadata Registry is an application designed to promote the discovery and reuse of exiting metadata definitions.
	Discovery and reuse are essential to standardization, and promote greater interoperability between metadata element sets.
	<p/>
	The DCMI Metadata Registry provides users and applications with an authoritative source of information 
	about the Dublin Core element set and related vocabularies.  This information is intended to simplify the discovery  
	of terms, and their definitions, and to illustrate the relationship between terms.
	<p/>
	This document describes the steps that are necessary to install a DCMI metadata registry.
	<p/>
		
	<p/>&#160;<p/><h1>Contents</h1>
	<dl>
	<dt><a href="#S1">I. Overview</a></dt>
	<dt><a href="#S2">II. Installing The Base Software</a></dt>
	<dt class="toc"><a href="#S2.1">2.1 Java</a></dt>
	<dt class="toc"><a href="#S2.2">2.2 Apache HTTP Server</a></dt>
	<dt class="toc"><a href="#S2.3">2.3 Jakarta Tomcat Application Server</a></dt>
	<dt class="toc"><a href="#S2.4">2.4 Jakarta Ant</a></dt>
	<dt class="toc"><a href="#S2.5">2.5 PostgreSQL</a></dt>
	<dt class="toc"><a href="#S2.6">2.6 Jena</a></dt>
	<dt class="toc"><a href="#S2.7">2.7 Axis</a></dt>
	<dt class="toc"><a href="#S2.8">2.8 WSIL4J</a></dt>
	<dt class="toc"><a href="#S2.9">2.9 UDDI4J</a></dt>
	<dt><a href="#S3">III. Setting Your Environment Variables</a></dt>
	<dt><a href="#S4">IV. Configuring Tomcat</a></dt>
	<dt class="toc"><a href="#S4.1">4.1 Deploy The Java Properties File</a></dt>
	<dt class="toc"><a href="#S4.2">4.2 Load The JAR files</a></dt>
	<dt class="toc"><a href="#S4.3">4.3 Configure the Apache-Tomcat mod_jk Connector (optional)</a></dt>
	<dt><a href="#S5">V. Download The Project Source</a></dt>
	<dt><a href="#S6">VI. Building The Application</a></dt>
	<dt class="toc"><a href="#S6.1">6.1 The Application Configuration Property File</a></dt>
	<dt class="toc"><a href="#S6.2">6.2 Building and Deploying</a></dt>
	<dt><a href="#S7">VII. Creating And Loading The Database</a></dt>
	<dt><a href="#S8">VIII. Enabling The Axis (SOAP) Application Interface</a></dt>
	<dt class="toc"><a href="#S8.1">8.1 Deploy The Services</a></dt>
	<dt class="toc"><a href="#S8.2">8.2 Enable Service Discovery</a></dt>
	<dt><a href="#S9">IX. Installation Verification</a></dt>
	<dt><a href="#A1">Appendix A: Project Directory</a></dt>
	<dt><a href="#B1">Appendix B: Sample WSIL Document</a></dt>
	</dl>
	
	<p/>&#160;<p/><a name="S1"><h1>I. Overview</h1></a>
	
	<p/>
	The DCMI registry was developed, and is distributed, as an open-source project.  It is built entirely upon open-source / open-standards 
	software.  The registry is a Java application, and as such, can be run on any platform that can run Java.  That being said, the 
	application was developed on Linux, and the installation instructions described in this document are intended for installation on a 
	Linux platform.  
	While it is possible to run the application on other operating systems (i.e., Windows), this has not been tested.  It is reasonable 
	to expect a modest number of changes to the application configuration to enable this degree of portability.
	<p/>
	Since the application is built upon open standards it is also possible to replace core components of the underlying architecture with 
	functionally-equivelent replacements.  For example, the registry was developed using the Jakarta Tomcat application server, but could 
	be run on any application server that complies with the servlet 2.3 specification.  Likewise, this document describes the installation 
	of PostgreSQL as a backend data store.  The Jena RDF API that is part of the application also supports other databases (i.e., MySQL).  
	These could be implemented instead.
	<p/>
	There are alternative ways to accomplish many of the tasks outlined in this document.  This includes the online tools provided in 
	the administration area of the Registry.  However, this is a simple, fast and recommended way to install a registry for implementers 
	new to the project.
	
	<p/>&#160;<p/><a name="S2"><h1>II. Installing The Base Software</h1></a>
	
	<p/>&#160;<p/><a name="S2.1"><h3>2.1 Java</h3></a>
	<p/>
	Java is an object-oriented programming language.  The Registry is written in this language. 
	The full software developers kit (sdk) is needed.  j2sdk1.4.2_03 is recommended, but earlier 1.4 releases should work also.
	<p/> 
	Java can be be downloaded from here: <a href="http://java.sun.com/">http://java.sun.com/</a>
	
	<p/>&#160;<p/><a name="S2.2"><h3>2.3 Apache HTTP Server</h3></a>
	<p/>
	Apache is the leading HTTP server.  An HTTP server is actually optional - the Registry can run without it.  However, it is recommended
	since it (in combination with the mod_jk connector) enables installations to offer Tomcat applications (such as the Registry) via 
	port 80.  This eliminates the need to expose any port other than port 80, and thereby reduces potential security exposures.
	<p/>
	Apache can be downloaded here: <a href="http://httpd.apache.org/">http://httpd.apache.org</a>
	
	<p/>&#160;<p/><a name="S2.3"><h3>Jakarta Tomcat Application Server</h3></a>
	<p/>
	Tomcat is a Java appliation server.  This is a extension to an HTTP server, although it can also run as a stand-alone server.
	<p/>
	Release jakarta-tomcat-5.0.18 is recommended, but any 4.1+ release should work.  Tomcat can be downloaded here: 
	<a href="http://jakarta.apache.org/">http://jakarta.apache.org/</a>
	
	<p/>&#160;<p/><a name="S2.4"><h3>2.4 Jakarta Ant</h3></a>
	<p/>
	Ant is a Java-based build tool.  It is similar to the Unix make command - in principle.  However, unlike make it is written
	in Java and uses XML build files for target definition.  Ant is used to build and deploy the Registry.
	<p/>
	Version 1.6.1 or higher is required, and is available here: <a href="http://ant.apache.org/">http://ant.apache.org/</a>
	
	<p/>&#160;<p/><a name="S2.5"><h3>2.5 PostgreSQL</h3></a>
	<p/>
	PostgreSQL is a relational database application.  The Registry uses PostgreSQL to store metadata terms.  Release postgresql-7.2.4 is 
	recommended.  However any version 7.1 or 7.2 will also work.  Version 7.3 is also reported to work, 
	but this has not been tested.  
	<p/>
	Configure PostgreSQL with Java and Unicode support:
	<p/>
	<i>./configure --with-java --enable-unicode --enable-multibyte='UNICODE'</i>
	<p/>
	PostgreSQL can be downloaded here: <a href="http://www.postgresql.org/">http://www.postgresql.org/</a>
	
	<p/>&#160;<p/><a name="S2.6"><h3>2.6 Jena</h3></a>
	<p/>
	Jena is the RDF application interface the Registry uses to create and manage RDF data.  Version 2.0 is required.  
	Note: Do not use Jena 2.1.  There are still unresolved issues (i.e., the way models are serialized) that present problems for 
	the Registry.
	<p/>
	Jena can be downloaded here: <a href="http://jena.sourceforge.net/">http://jena.sourceforge.net/</a>  
	
	<p/>&#160;<p/><a name="S2.7"><h3>2.7 Axis</h3></a>
	<p/>
	Axis is a SOAP-based toolkit for implementing web services.  The registry uses Axis to offer a SOAP-style application interface.  
	Version 1.1 is required.
	<p/>
	Axis can be downloaded here: <a href="http://ws.apache.org/axis/index.html">http://ws.apache.org/axis/index.html</a>
	
	<p/>&#160;<p/><a name="S2.8"><h3>2.8 WSIL4J</h3></a>
	<p/>
	WSIL4J is a Java-based discovery mechanism for web services.  The Registry uses WSIL4J to facilitate the discovery of it's
	SOAP-style application interface.
	<p/>
	WSIL4J can be downloaded here: <a href="http://cvs.apache.org/viewcvs/*checkout*/ws-wsil/java/README.htm">
	http://cvs.apache.org/viewcvs/*checkout*/ws-wsil/java/README.htm</a>
	
	<p/>&#160;<p/><a name="S2.9"><h3>2.9 UDDI4J</h3></a>
	<p/>
	UDDI4J is a Java API for interacting with a UDDI (Universal Description, Discovery and Integration) registry.
	<p/>
	UDDI4J can be downloaded here: <a href="http://www-124.ibm.com/developerworks/oss/uddi4j/">
	http://www-124.ibm.com/developerworks/oss/uddi4j/</a>
	
	
	<p/>&#160;<p/><a name="S3"><h1>III Setting Your Environment Variables</h1></a>
	<p/>
	Verify that you have the following environment variables set:
	<br/>setenv JAVA_HOME /usr/java/j2sdk1.4.2_03
	<br/>setenv TOMCAT_HOME /usr/apache/tomcat
	<br/>setenv CATALINA_HOME ${TOMCAT_HOME}
	<br/>setenv ANT_HOME /usr/apache/apache-ant-1.6.1/
	<br/>setenv LD_LIBRARY_PATH /usr/local/pgsql/lib
	<br/>setenv PGDATA /usr/local/pgsql/data
	<br/>setenv JENAROOT /usr/local/Jena/Jena-2.0
	<br/>setenv AXISROOT /usr/local/axis-1_1
	<br/>setenv REGISTRY ~/work/projects/dcregistry-3.0/build/WEB-INF/classes/
	<br/>setenv WSILROOT /usr/local/xml-axis-wsil/java/build/lib
	<br/>&#160;
	<br/>setenv CLASSPATH .:${REGISTRY}
	<br/>setenv CLASSPATH ${CLASSPATH}:${ANT_HOME}/lib/ant.jar
	<br/>setenv CLASSPATH ${CLASSPATH}:/usr/local/pgsql/share/java/postgresql.jar
	<br/>setenv CLASSPATH ${CLASSPATH}:${JENAROOT}/lib/antlr.jar
	<br/>setenv CLASSPATH ${CLASSPATH}:${JENAROOT}/lib/icu4j.jar
	<br/>setenv CLASSPATH ${CLASSPATH}:${JENAROOT}/lib/jena.jar
	<br/>setenv CLASSPATH ${CLASSPATH}:${JENAROOT}/lib/xercesImpl.jar
	<br/>setenv CLASSPATH ${CLASSPATH}:${AXISROOT}/lib/log4j-1.2.8.jar
	<br/>setenv CLASSPATH ${CLASSPATH}:${JENAROOT}/lib/concurrent.jar
	<br/>setenv CLASSPATH ${CLASSPATH}:${JENAROOT}/lib/jakarta-oro-2.0.5.jar
	<br/>setenv CLASSPATH ${CLASSPATH}:${JENAROOT}/lib/junit.jar
	<br/>setenv CLASSPATH ${CLASSPATH}:${JENAROOT}/lib/rdf-api-2001-01-19.jar
	<br/>setenv CLASSPATH ${CLASSPATH}:${JENAROOT}/lib/xmlParserAPIs.jar
	<br/>setenv CLASSPATH ${CLASSPATH}:${AXISROOT}/lib/axis.jar
	<br/>setenv CLASSPATH ${CLASSPATH}:${AXISROOT}/lib/jaxrpc.jar
	<br/>setenv CLASSPATH ${CLASSPATH}:${AXISROOT}/lib/saaj.jar
	<br/>setenv CLASSPATH ${CLASSPATH}:${AXISROOT}/lib/wsdl4j.jar
	<br/>setenv CLASSPATH ${CLASSPATH}:${AXISROOT}/lib/log4j-1.2.8.jar
	<br/>setenv CLASSPATH ${CLASSPATH}:${AXISROOT}/lib/log4j-1.2.8.jar
	<br/>setenv CLASSPATH ${CLASSPATH}:${AXISROOT}/lib/commons-discovery.jar
	<br/>setenv CLASSPATH ${CLASSPATH}:${AXISROOT}/lib/commons-logging.jar
	<br/>setenv CLASSPATH ${CLASSPATH}:${WSILROOT}/wsil4j.jar
	<br/>&#160;
	<br/>setenv PATH .:${JAVA_HOME}/bin:${ANT_HOME}/bin
	<br/>setenv PATH ${PATH}:/usr/local/pgsql/bin:/home/wagnerh/bin
	<br/>setenv PATH ${PATH}:/usr/kerberos/bin:/usr/local/bin
	<br/>setenv PATH ${PATH}:/usr/bin:/bin:/usr/X11R6/bin:/sbin
	
	
	<p/>&#160;<p/><a name="S4"><h1>IV. Configuring Tomcat</h1></a>
	
	<p/>&#160;<p/><a name="S4.1"><h3>4.1 Deploy The Java Properties File</h3></a>
	<p/>
	Add a 'properties' directory to your Tomcat installation.  For example, if your tomcat is installed in '/usr/apache/tomcat' 
	then create a directory named '/usr/apache/tomcat/properties'.  Copy the 'dcregi18n.jar' property file into this directory 
	(this file is created during in the build process which is described below).
	<p/>
	Configure Tomcat to include this file in it's CLASSPATH.  Edit the tomcat/bin/catalina.sh file.  Look for a line that reads:  
	<p/>
	# Add on extra jar files to CLASSPATH
	<p/>
	Add the following lines immediately after it:
	<p/>
	CLASSPATH="$CLASSPATH":"$CATALINA_HOME"/properties/dcregi18n.jar
	CLASSPATH="$CLASSPATH":/usr/java/j2sdk1.4.2_03/lib/tools.jar
	
	<p/>&#160;<p/><a name="S4.2"><h3>4.2 Load The JAR files</h3></a>
	<p/>
	Copy the following files to your tomcat/shared/lib directory:
	<p/>
	<table width="100%" border="0">
	<tr><td colspan="4"><b>From your axis/lib directory:</b></td></tr>
	<tr><td>axis-ant.jar</td><td>axis.jar</td><td>commons-discovery.jar</td><td>commons-logging.jar</td></tr>
	<tr><td>jaxrpc.jar</td><td>log4j-1.2.8.jar</td><td colspan="2">saaj.jar  wsdl4j.jar</td></tr>
	<tr><td colspan="4">&#160;</td></tr>
	<tr><td colspan="4"><b>From your Jena/lib directory:</b></td></tr>
	<tr><td>antlr.jar</td><td>icu4j.jar</td><td>jena.jar</td><td>xercesImpl.jar</td></tr>
	<tr><td>concurrent.jar</td><td>jakarta-oro-2.0.5.jar</td><td>junit.jar</td><td>rdf-api-2001-01-19.jar</td></tr>
	<tr><td colspan="4">xmlParserAPIs.jar</td></tr>
	<tr><td colspan="4">&#160;</td></tr>
	<tr><td colspan="4"><b>From your postgreSQL/share/java directory:</b></td></tr>
	<tr><td colspan="4">postgresql.jar</td></tr>
	<tr><td colspan="4">&#160;</td></tr>
	<tr><td colspan="4"><b>From your uddi4j/lib directory:</b></td></tr>
	<tr><td colspan="4">uddi4j.jar</td></tr>
	<tr><td colspan="4">&#160;</td></tr>
	<tr><td colspan="4"><b>From your wsil/java/build/lib directory:</b></td></tr>
	<tr><td colspan="4">wsil4j.jar</td></tr>
	</table>
	<p/>
	
	<p/>&#160;<p/><a name="S4.3"><h3>4.3 Configure the Apache-Tomcat mod_jk Connector (optional)</h3></a>
	<p/>
	Configure the apache-tomcat connector to enable users to access the Registry via port 80.  While this step is optional. it is recommend 
	as a security precaution. .  It is also recommended that implementers do this step last, after the registry is installed and functional, 
	unless they are comfortable with configuring this connector.  
	<P/>
	See <a href="http://jakarta.apache.org/tomcat/tomcat-3.3-doc/mod_jk-howto.html">
	http://jakarta.apache.org/tomcat/tomcat-3.3-doc/mod_jk-howto.html</a> 
	for detailed instructions regarding installing the Apache-Tomcat connector.
	
	
	
	<p/>&#160;<p/><a name="S5"><h1>V. Download The Project Source</h1></a>
	<p/>
	Download the source from the SVN repository.  To access the repository follow the instructions found  
	<a href="/dcregistry/pageDisplayServlet?page=source.xsl">here</a>.
	
	
	<p/>&#160;<p/><a name="S6"><h1>VI. Building The Application</h1></a>
	<p/>
	
	<p/>&#160;<p/><a name="S6.1"><h3>6.1 Application Configuration</h3></a>
	<p/>
	The registry uses a Java properties file to specify a number of customizable options.  These are described 
	below.  This file is located in the project/web/WEB-INF/ directory and is named jdbc.properties.  Installers should edit this file 
	prior to a build to verify it matches their installation.
	
	<div align="center">
	<table width="95%" border="0">
	<tr><td><b>db_user = someUser</b>
	<br/>Specifies the authorized PostgreSQL user.</td></tr>
	<tr><td><b>db_uri = jdbc:postgresql://localhost:5432/registry3</b>
	<br/>Specifies the database URI</td></tr>
	<tr><td><b>JDBCDriver = org.postgresql.Driver</b>
	<br/>Specifies the PostgreSQL JDBC driver</td></tr>
	<tr><td><b>registry_model = registry</b>
	<br/>Specifies the name of the registry model</td></tr>
	<tr><td><b>provenance_model = provenance</b>
	<br/>Specifies the name of the provenance model</td></tr>
	<tr><td><b>translations_model = translations</b>
	<br/>Specifies the name of the translations model</td></tr>
	<tr><td><b>account_model = account</b>
	<br/>Specifies the name of the account model</td></tr>
	<tr><td><b>remote_model	= remote</b>
	<br/>Specifies the name of the remote model</td></tr>
	<tr><td><b>collection_model = collection</b>
	<br/>Specifies the name of the collection model</td></tr>
	<tr><td><b>canonical_model = canonical</b>
	<br/>Specifies the name of the canonical model</td></tr>
	<tr><td><b>extensions_model = extensions</b>
	<br/>Specifies the name of the extensions model</td></tr>
	<tr><td><b>db_type = PostgreSQL</b>
	<br/>Identifies the database type being used</td></tr>
	<tr><td><b>defaut_ui_lang = en_US</b>
	<br/>Specifies the default user interface language</td></tr>
	<tr><td><b>defaut_rs_lang = en_US</b>
	<br/>Specifies the default data language</td></tr>
	<tr><td><b>provenance = N</b>
	<br/>Indicates whether or not to enable the provenance function for non-English default language data (no longer used)</td></tr>
	<tr><td><b>restLog = /usr/apache/tomcat/logs/rest.log</b>
	<br/>file name to use as log file for the REST-style web services</td></tr>	
	<tr><td><b>axisLog = /usr/apache/tomcat/logs/rest.log</b>
	<br/>file name to use as log file for the SOAP-style web services</td></tr>
	<tr><td><b>appLog = /usr/apache/tomcat/logs/rest.log</b>
	<br/>file name to use as log file for the web interface</td></tr>
	
	<tr><td><b>summary_xsl = summary-3col-itemized.xsl</b>
	<br/>The name of the XSLT stylesheet to use for the summary function</td></tr>
	<tr><td><b>detail_xsl = detail.xsl</b>
	<br/>The name of the XSLT stylesheet to use for the item detail function</td></tr>
	<tr><td><b>documents_xsl = documents.xsl</b>
	<br/>The name of the XSLT stylesheet to use for the documents function</td></tr>
	<tr><td><b>translations_xsl = translations.xsl</b>
	<br/>The name of the XSLT stylesheet to use for the translations function</td></tr>
	<tr><td><b>refinements_xsl = refinements.xsl</b>
	<br/>The name of the XSLT stylesheet to use for the refinements function</td></tr>
	<tr><td><b>query_xsl = query.xsl</b>
	<br/>The name of the XSLT stylesheet to use for the query function</td></tr>
	<tr><td><b>preference_xsl = preference.xsl</b>
	<br/>The name of the XSLT stylesheet to use for the preference function</td></tr>
	<tr><td><b>properties_xsl = properties.xsl</b>
	<br/>The name of the XSLT stylesheet to use for the properties function</td></tr>
	<tr><td><b>provenance_xsl = provenance.xsl</b>
	<br/>The name of the XSLT stylesheet to use for the provenance function</td></tr>
	<tr><td><b>searchResults_xsl = searchResults.xsl</b>
	<br/>The name of the XSLT stylesheet to use for the search-results function</td></tr>
	<tr><td><b>encodingSchemes_xsl = encodingSchemes.xsl</b>
	<br/>The name of the XSLT stylesheet to use for the encoding-schemes function</td></tr>
	<tr><td><b>elements_xsl	= elements.xsl</b>
	<br/>The name of the XSLT stylesheet to use for the elements function</td></tr>
	<tr><td><b>controlledTerms_xsl = controlledTerms.xsl</b>
	<br/>The name of the XSLT stylesheet to use for the controlled-terms function</td></tr>
	<tr><td><b>classes_xsl = classes.xsl</b>
	<br/>The name of the XSLT stylesheet to use for the classes function</td></tr>
	</table>
	</div>
	
	
	<p/>&#160;<p/><a name="S6.2"><h3>6.2 Building and Deploying</h3></a>
	<p/>
	Modify the project 'build.xml' file (located in the project root directory) to reflect your installation.  Only the following lines 
	should be changed:
	<p/>
	
	<dl>
	<dt>&lt;property name="catalina.home"  value="/usr/apache/tomcat"/&gt;</dt>
	<dt>&lt;property name="axis.home"      value="/usr/local/axis-1_1"/&gt;</dt>
	<dt>&lt;property name="wsil.home"      value="/usr/local/xml-axis-wsil/java"/&gt;</dt>
	<dt>&lt;property name="uddi.home"      value="/usr/local/uddi4j"/&gt;</dt>
	</dl>
	
	<p/>
	Change the value= to reflect your installation.
	<p/>
	The build.xml file is an Ant build-file and includes the following targets for building the registry.
	<ul>
	<li><b>dist</b> Used to build a distribution.  This will create the 'dcregistry.war' file and 'dcregi18n.jar' files.  These are saved 
	in the project /dist directory by Ant.</li>
	<li><b>deploy</b> This target will build the application and deploy it to the tomcat/webapps directory.</li>
	<li><b>clean</b> Used to cleanup old build directory (work area used by Ant buildfile).</li>
	<li><b>javadoc</b> This target will generate the application documentation.</li>
	<li><b>axis-prepare</b> This target will copy the files required to enable the SOAP interface to the tomcat/webapps/axis directories.</li>
	<li><b>axis-deploy</b> Used to deploy the SOAP services.</li>
	<li><b>axis-undeploy</b> Used to undeploy the SOAP services.</li>
	</ul>
	<p/>
	All of the commands are prefixed with "ant" and should be executed from the project home directory (for example <b>ant deploy</b>). 
	To get started quickly execute the <b>ant deploy</b> command, followed by the <b>ant dist</b> command.  Then copy the files in the 
	project/dist directory to your tomcat 
	installation.  Copy the jar file to your tomcat/properties file, the war file to your tomcat/webapps directory and the 
	logger.dtd file to the directory that your log files are being written to (The directory specified for the appLog, restLog 
	and axisLog in the jdbc.properties file).
	
	
	
	<p/>&#160;<p/><a name="S7"><h1>VII. Creating And Loading The Database</h1></a>
	<p/>
	Jena 2.0 uses one database for all models.  This is a departure from previous releases and greatly simplifies the database build 
	process.  Follow these procedures to build and load the database:
	<p/>
	<ol>
	<li>Start PostgreSQL.  Be sure to use the '-i' option to enable the Java interface.  For example:
	<p/><i>pg_ctl start -l logfile -o "-i -N 64 -B 128"</i>
	</li>
	<li>Create the database with the following commands:
	<ul>
	<li>psql template1</li>
	<li>create database registry3 with encoding='UNICODE';</li>
	</ul>
	</li>
	<li>Load the database.  There are a number of ways this can be done.  Here is a simple, but effective, approach:
	<ul>
	<li>Verify that your PATH and CLASSPATH variables are set correctly (see the example above).</li>
	<li>Evaluate the RDF files found in the /RDF directory.  By default, the /RDF/schemas and /RDF/provenance directories include 
	translations for all of the currently supported languages.  Your installation may not require all of these translations.  Delete any 
	translations that you do not plan to support.  Note that the importRDF tool will load all files in a 
	directory, but will skip the '.svn' directory.</li>
	<li>Change to the project/tools/ShellScripts directory.</li>
	<li>Run the 'initRegistry.sh'.  This will initialize the Registry models, load them with default values and create an administrative 
	account.  For example: 'initRegistry.sh aUser aPassword' will initialize the Registry and create an administrative account for 
	'aUser', with a password of 'aPassword'.</li>
	</ul>
	</li>
	</ol>
	
	
	<p/>&#160;<p/><a name="S8"><h1>VIII. Enabling The Axis (SOAP) Application Interface</h1></a>
	
	<p/>&#160;<p/><a name="S8.1"><h3>8.1 Deploy The Services</h3></a>
	<p/>
	The following steps outline how to enable the Registry SOAP-style web services:
	<p/>
	<ol>
	<li>Copy the axis/webapps/axis directory (and it's contents) to your tomcat/webapps directory.</li>
	<li>Edit the 'deployAll.wsdd' file in the project/axis/wsdd directory.  This file describes 8 services that are standard with the 
	registry.  Each of these services uses a log file, which is specified in this file.  The file name is: 
	/usr/apache/tomcat/logs/axis.log  Change this (for each service) to point to your tomcat log file directory.</li>
	<li>Deploy the services by executing the Ant target:
	<p/>
	ant axis-deploy
	<p/>
	This will compile the Axis services, move them (and the jdbc.properties file) to the tomcat/webapps/axis directory and deploy 
	the services using the Axis AdminService.</li>
	</ol>
	
	<p/>&#160;<p/><a name="S8.2"><h3>8.2 Enable Service Discovery</h3></a>
	<p/>
	The Web Services Inspection Language (WSIL) is a distributed discovery mechanism that enables discovery of SOAP service 
	descriptions (WSDL). WSIL documents are XML documents, which rely on conventions, not only for specifying the service description 
	syntax, but also for specifying the name and location within a Web site that should be inspected for service descriptions. 
	<p/>
	The DCMI Registry follows these conventions by providing a WSIL service description document in a /services directory off of the root 
	directory of the server the Registry is deployed on.  For example: the registry deployed at 
	<a href="http://dublincore.org/dcregistry/">http://dublincore.org/dcregistry/</a> includes a WSIL service description document at 
	the following address: <a href="http://dublincore.org/services/inspection.wsil">http://dublincore.org/services/inspection.wsil</a>.  
	This document is included in the projects/axis/wsil directory.  It is also listed in Appendix B for reference.  
	Use it as a starting point for creating your own WSIL document.  Change the document abstract, and the location attribute for each 
	service to reflect your installation and place this file at your server's root/services.  Note that the accepted convention for 
	this file name is 'inspection.wsil'.  This is the name applications will use when searching for deployed services.
	
	
	
	<p/>&#160;<p/><a name="S9"><h1>IX. Installation Verification</h1></a>
	<p/>
	Start your tomcat and access to at: 
	<p/>
	http://&lt;your server&gt;:8080/dcregistry/ 
	<p/>
	or at 
	<p/>
	http://&lt;your server&gt;/dcregistry/
	<p/>
	if you have installed the Apache-Tomcat connector.
	
	
	<p/>&#160;<p/><a name="A1"><h1>Appendix A: Project Directory</h1></a>
	
	<p/>
	<b>/dcregistry-3.0</b>
	<p/>
	build.xml&#160;&#160;<i>This is the project Ant build-file</i>
	<p/><b>/axis</b>
	<br/>&#160;&#160;&#160;&#160;<b>/wsdd</b>&#160;&#160;<i>Axis web services deployment descriptors</i>
	<br/>&#160;&#160;&#160;&#160;<b>/wsil</b>&#160;&#160;<i>Sample web services inspection language document</i>
	<p/>
	<b>/RDF</b>&#160;&#160;<i>This is the core Dublin core terms, their translations and related provenance data</i>
	<p/>
	<b>/src</b>
	<br/>&#160;&#160;&#160;&#160;<b>/org</b>
	<br/>&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;<b>/dublincore</b>
	<br/>&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;<b>/dcregistry</b>
	<br/>&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;
	<b>/bean</b>&#160;&#160;<i>JavaBeans directory</i>
	<br/>&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;
	<b>/filters</b>&#160;&#160;<i>Filter for setting UTF8 character encoding</i>
	<br/>&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;
	<b>/services</b>&#160;&#160;<i>Inter-registry communication modules</i>
	<br/>&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;
	&#160;&#160;&#160;&#160;&#160;<b>/axis</b>&#160;&#160;<i>SOAP-style services</i>
	<br/>&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;
	&#160;&#160;&#160;&#160;&#160;<b>/rest</b>&#160;&#160;<i>REST-style services</i>
	<br/>&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;
	<b>/servlet</b>&#160;&#160;<i>Application servlets</i>
	<br/>&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;
	<b>/tools</b>&#160;&#160;<i>Batch tools</i> 
	<p/>
	<b>/tools</b>
	<br/>&#160;&#160;<b>ShellScripts</b>&#160;&#160;<i>Sample shell scripts for using the batch tools</i>
	<p/>
	<b>/web</b>
	<br/>&#160;&#160;&#160;&#160;index.html, volunteers.html and sample code.
	<br/>&#160;&#160;&#160;&#160;<b>/CSS</b>&#160;&#160;<i>Cascading style sheets</i>
	<br/>&#160;&#160;&#160;&#160;<b>/images</b>&#160;&#160;<i>Application images</i>
	<br/>&#160;&#160;&#160;&#160;<b>/properties</b>&#160;&#160;<i>Java property files used for internationalization</i>
	<br/>&#160;&#160;&#160;&#160;<b>/WEB-INF</b>&#160;&#160;<i>Application properties file and web.xml file</i>
	<br/>&#160;&#160;&#160;&#160;<b>/xsl</b>&#160;&#160;<i>XML files and XSLT stylesheets</i>
	
	
	
	<p/>&#160;<p/><a name="B1"><h1>Appendix B: Sample WSIL Document</h1></a>
	
	<p/>
	&lt;?xml version="1.0" encoding="UTF-8"?&gt;
	<br/>&lt;inspection xmlns="http://schemas.xmlsoap.org/ws/2001/10/inspection/"&gt;
	<br/>&lt;abstract&gt;Dublin Core Metadata Initiative&lt;/abstract&gt;
	<p/>
	&lt;service&gt;
	<br/>&lt;name&gt;ItemSummary&lt;/name&gt;
	<br/>&lt;abstract&gt;This service returns a list of all resources that are registered. No input parameters are required.
	<br/>&lt;/abstract&gt;
	<br/>&lt;description referencedNamespace="http://schemas.xmlsoap.org/wsdl/"
	<br/>	   location="http://dublincore.org/axis/services/itemSummary?wsdl"&gt;&lt;/description&gt;
	<br/>&lt;/service&gt;
	<p/>
	&lt;service&gt;
	<br/>&lt;name&gt;ItemDetail&lt;/name&gt;
	<br/>&lt;abstract&gt;This service returns all known information about a resource in the requested language. 
	<br/>This interface requires a resource name (i.g., http://purl.org/dc/elements/1.1/creator) and a 
	<br/>language code (i.g., en-US).
	<br/>&lt;/abstract&gt;
	<br/>&lt;description referencedNamespace="http://schemas.xmlsoap.org/wsdl/"
	<br/>	   location="http://dublincore.org/axis/services/itemDetail?wsdl"&gt;&lt;/description&gt;
	<br/>&lt;/service&gt;
	<p/>
	&lt;service&gt;
	<br/>&lt;name&gt;encodingSchemesSummary&lt;/name&gt;
	<br/>&lt;abstract&gt;This service returns a list of all registered encoding schemes.  No input parameters are required.
	<br/>&lt;/abstract&gt;
	<br/>&lt;description referencedNamespace="http://schemas.xmlsoap.org/wsdl/"
	<br/>	   location="http://dublincore.org/axis/services/encodingSchemesSummary?wsdl"&gt;&lt;/description&gt;
	<br/>&lt;/service&gt;
	<p/>
	&lt;service&gt;
	<br/>&lt;name&gt;refinementsSummary&lt;/name&gt;
	<br/>&lt;abstract&gt;This service returns a list of all registered element refinements. No input parameters are required.
	<br/>&lt;/abstract&gt;
	<br/>&lt;description referencedNamespace="http://schemas.xmlsoap.org/wsdl/"
	<br/>	   location="http://dublincore.org/axis/services/refinementsSummary?wsdl"&gt;&lt;/description&gt;
	<br/>&lt;/service&gt;
	<p/>
	&lt;service&gt;
	<br/>&lt;name&gt;termUpdates&lt;/name&gt;
	<br/>&lt;abstract&gt;This service returns a list of all changes to the Registry, in a specific language, since a specific date.
	<br/>This interface requires a date and a language (i.g., 20021015 en-US).
	<br/>&lt;/abstract&gt;
	<br/>&lt;description referencedNamespace="http://schemas.xmlsoap.org/wsdl/"
	<br/>	   location="http://dublincore.org/axis/services/termUpdates?wsdl"&gt;&lt;/description&gt;
	<br/>&lt;/service&gt;
	<p/>
	&lt;service&gt;
	<br/>&lt;name&gt;vocabularyTermsSummary&lt;/name&gt;
	<br/>&lt;abstract&gt;This service returns a list of all registered controlled vocabulary terms. No input parameters are required.
	<br/>&lt;/abstract&gt;
	<br/>&lt;description referencedNamespace="http://schemas.xmlsoap.org/wsdl/"
	<br/>	   location="http://dublincore.org/axis/services/vocabularyTermsSummary?wsdl"&gt;&lt;/description&gt;
	<br/>&lt;/service&gt;
	<p/>
	&lt;service&gt;
	<br/>&lt;name&gt;languagesSummary&lt;/name&gt;
	<br/>&lt;abstract&gt;This service returns a list of all supported languages. No input parameters are required.
	<br/>&lt;/abstract&gt;
	<br/>&lt;description referencedNamespace="http://schemas.xmlsoap.org/wsdl/"
	<br/>	   location="http://dublincore.org/axis/services/languagesSummary?wsdl"&gt;&lt;/description&gt;
	<br/>&lt;/service&gt;
	<p/>
	&lt;service&gt;
	<br/>&lt;name&gt;elementSummary&lt;/name&gt;
	<br/>&lt;abstract&gt;This service returns a list of all registered elements. No input parameters are required.
	<br/>&lt;/abstract&gt;
	<br/>&lt;description referencedNamespace="http://schemas.xmlsoap.org/wsdl/"
	<br/>	   location="http://dublincore.org/axis/services/elementSummary?wsdl"&gt;&lt;/description&gt;
	<br/>&lt;/service&gt;
	<p/>
	&lt;/inspection&gt;
	
	<p/>
	<xsl:call-template name="footer" />

	</body>
	</html>
</xsl:template>

</xsl:stylesheet>


