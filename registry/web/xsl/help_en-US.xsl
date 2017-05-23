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
<xsl:include href="footer.xsl"/>

<xsl:param name="uiLang" select="'en-US'"/>
<xsl:param name="location" select="'help'"/>

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

	<h1>Overview</h1>
	<p/>
	The <a href='http://purl.org/dc/'>Dublin Core Metadata Initiative's</a> Metadata 
	Registry is an application designed to promote the discovery and reuse of exiting metadata definitions.
	Discovery and reuse are essential to standardization, and promote greater interoperability between metadata element sets.
	<p/>
	The DCMI Metadata Registry provides users and applications with an authoritative source of information 
	about the Dublin Core element set and related vocabularies.  This information is intended to simplify the discovery  
	of terms, and their definitions, and to illustrate the relationship between terms.
	<p/>
	The Registry is comprised of two primary sections; a preferences component where users can specify 
	their language preferences, and a 'browse | search' component for exploring the registry contents.  
	Each of these components is described in more detail in the following sections.

	<p/>
	<dl>
	<dt><a href="#H1">I. Language Preferences</a></dt>
	<dt class="toc"><a href="#H4">1.1 User Interface Language</a></dt>
	<dt class="toc"><a href="#H6">1.2 Metadata Language</a></dt>
	<dt><a href="#H2">II. Browsing The Registry</a></dt>
	<dt><a href="#H10">III. Searching The Registry</a></dt>
	<dt class="toc"><a href="#H13">3.1 Understanding Results</a></dt>
	<dt><a href="#H3">IV. Multilingual Issues</a></dt>
	<dt><a href="#H8">V. Application Interface</a></dt>
	<dt class="toc"><a href="#H11">5.1 Registry REST Application Interface</a></dt>
	<dt class="toc"><a href="#H12">5.2 Registry SOAP Application Interface</a></dt>
	<dt><a href="#H7">VI. Acknowledgements</a></dt>
	</dl>
	
	<p/>
	<a name="H1"><xsl:text> </xsl:text></a>
	<h1>I. Language Preferences</h1>

	<p/>
	The language preference component enables users to customize their environment by offering them a choice
	of user interface language and result-set language.  Click on the 'Language preference' link found on the 
	'Browse | Search' screen.

	<p/>
	<a name="H4"><xsl:text> </xsl:text></a>
	<h3>1.1 User Interface Language</h3>
	<p/>
	This option is used to select from a list of available user interface languages.
	
	<p/>
	<a name="H6"><xsl:text> </xsl:text></a>
	<h3>1.2 Metadata Language</h3>
	<p/>
	The 'Display Results In' option is used to select the language for displaying metadata results.  Select
	from the list of available languages.
	
	<p/>
	<div align="center">
	<table border="1"><tr><td>
	<img src="images/preferences.gif" />
	</td></tr></table>
	 <p/>
	 <i>Figure 1: Selecting language preferences</i>
	 </div>

	 <p/>
	<a name="H2"><xsl:text> </xsl:text></a>
	<h1>II. Browsing The Registry</h1>
	<p/>
	The browse component provides a number of pre-generated queries that can be selected
	 from a drop-down box.  These can be used to display summary listings of:

	<ul>
	<li>DCMI Terms Overview</li>
	<li>DCMI elements</li>
	<li>DCMI element refinements</li>
	<li>DCMI controlled vocabulary terms</li>
	<li>DCMI vocabulary and encoding schemes</li>
	<li>All registered contents</li>
	</ul>
	
	<p/>
	<div align="center">
	<table border="1"><tr><td>
	<img src="images/browse.gif" />
	</td></tr></table>
	 <p/>
	 <i>Figure 2: Browse interface</i>
	 </div>

	<p/>
	Clicking on any of the items in the summary listing will generate a query for that particular
	item.
	 
	<p/>
	<a name="H10"><xsl:text> </xsl:text></a>
	<h1>III. Searching The Registry</h1>
	<p/>
	<h3>Text Searching</h3>
	The search form enables users to search for metadata that matches specific words or phrases.  The 
	form supports both case-sensitive and case-insensitive searching and enables users to restrict 
	their search to terms that match:

	<ul>
	<li>An exact word or phrase</li>
	<li>At least one of the words provided</li>
	<li>All of the words provided</li>
	</ul>
	
	<p/>
	<div align="center">
	<table border="1"><tr><td>
	<img src="images/searchResults.gif" />
	</td></tr></table>
	 <p/>
	 <i>Figure 3: Search interface</i>
	 </div>

	<p/>
	<a name="H13"><xsl:text> </xsl:text></a>
	<h3>3.1 Understanding Results</h3>
	Query results are produced by clicking on one of the items returned from a text search, or  
	included in a summary display.  The query results include all of the known properties for that item.
	These can 
	include both text literals and resources.  Resources are displayed as hyperlinks that either
	resolve to that resource definition, or that generate a new query for that particular resource.
	for example, a query result-set that included the term 'title' 	would produce a display similar to:

	<p/>
	<div align="center">
	<table border="1"><tr><td>
	<img src="images/title.gif" />
	</td></tr></table>
	 <p/>
	 <i>Figure 4: Item detail</i>
	 </div>

	<p/>
	Each of the resources in the result-set above are displayed as hyperlinks that provide the user with
	a simple means to navigate between terms and their relationships.  Clicking on any of the property
	labels (i.e., Label, Definition, Description, etc.) would resolve to the definition of that resource.  
	Likewise, clicking on 'Property' would resolve to the definition of a 'property'.  
	However, clicking on resources known locally to the Registry (such as 
	'http://purl.org/dc/elements/1.1/' and 'alternative') would generate a new query for
	that particular resource.  This is true for all resources that are displayed.  Users can quickly
	differentiate between these two types of links by their 'hover' color.  This is the color a link changes to when 
	the mouse (or other pointing device) is placed over the link.  Local links are displayed in blue and remote links
	in green.
	
	For example, clicking on <u>alternative</u> in the above result-set
	would generate a new query with the following results:

	<p/>
	<div align="center">
	<table border="1"><tr><td>
	<img src="images/alternative.gif" />
	</td></tr></table>
	 <p/>
	 <i>Figure 5: Navigating relationships between terms</i>
	 </div>
	 
	<p/>
	<a name="H3"><xsl:text> </xsl:text></a>
	<h1>IV. Miltilingual Issues</h1>
	<p/>
	The language preference information (selected on the preferences
	screen) is stored as a 'cookie' on the client session.  This requires that
	cookies be enabled on your browser.  This is the default setting for both IE
	and Netscape.  Cookies are not required to use the Registry, but they are required 
	to view the language translations.
	<p/>
	User interface and term translations are encoded in UTF-8 encoding.  Set your browser's 
	character coding to 'Unicode - UTF8' to display the translations.  You may also require
	additional fonts for some languages.  Newer versions of many browsers include support for
	this.  It is recommended that you use a recent release of your browser.  For example: Netscape 6.2 
	(or higher) or Internet Explorer 5.5 (or higher).
	<p/>
	The Dublin Core elements and qualifiers have been translated in dozens of languages and the 
	Registry provides support for many of these.  However, there is only one official (or canonical) 
	definition for a term.  For this reason, all items in 
	result-sets that are displayed in languages other than their 'official' translation will include a 'quick-link' option
	that enables users to quickly compare the 'canonical' version to the translated version.  Click on
	the <u> Canonical Translation</u> link to view the canonical translation
	of an item.

	<p/>
	Term translations are made by translating the label, definition and (optional) comment fields for 
	each term.  Additional information is associated with each translated property.  This includes a 
	description and right-management properties, and when available, a creator, date, publisher and 
	source properties.  This is accomplished by providing a link to this information next to each 
	translation.
	
	<p/>
	For example: the following is displayed for the German translation of the term 'title':

	<p/>
	<div align="center">
	<table border="1"><tr><td>
	<img src="images/german_title.gif" />
	</td></tr></table>
	 <p/>
	 <i>Figure 6: Accessing provenance for term translations</i> 
	</div>
	
	<p/>
	Clicking on the [ de-DE ] links will display provenance information about that translation.

	<p/>
	<a name="H8"><xsl:text> </xsl:text></a>
	<h1>V. Application Interface</h1>
	<p/>
	The Registry application interface provides information about the Registry contents in a format that is suitable for 
	applications and other registries.  This is accomplished thru a collection of Web services, collectively known as the 
	Registry application interface.  The two principal approaches to Web services are SOAP and REST.  The Registry currently 
	supports both approaches.  Each of the services will return results in RDF/XML format that can be parsed by applications.  
	Each approach is described below, along with information regarding how to use each service. 
	
	<p/>
	<a name="H11"><xsl:text> </xsl:text></a>
	<h3>5.1 Registry REST Application Interface</h3>
	
	<p/>
	 The REpresentational State Transfer (REST) approach uses URLs to identify resources, which are then accessed using simple HTTP 
	 GET and POST requests.  The <a href="http://internet.conveyor.com/RESTwiki/moin.cgi/FrontPage">RESTwiki</a> 
	 site is a great source of information about REST. The remainder of this section describes the REST style services and how to 
	 invoke them.

	<p/>
	http://dublincore.org/dcregistry/listItemSummary
	<br/>Summary: This service returns a list of all resources that are registered.
	<br/>Parameters: No input parameters are required.
	<br/>Sample Call: <a href="/dcregistry/listItemSummary">
	http://dublincore.org/dcregistry/listItemSummary</a>
	
	<p/>
	http://dublincore.org/dcregistry/listSupportedLanguages
	<br/>Summary: This service returns a list of all supported languages. 
	<br/>Parameters: No input parameters are required.
	<br/>Sample Call: <a href="/dcregistry/listSupportedLanguages">
	http://dublincore.org/dcregistry/listSupportedLanguages</a>
	
	<p/>
	http://dublincore.org/dcregistry/listItemDetail
	<br/>Summary: This service returns all known information about a resource in a requested language.
	<br/>Parameters: A resource name (i.g., http://purl.org/dc/elements/1.1/creator) and a (optional) language code (i.g., en-US).  
	Note that omitting the language code will return detail about the requested item in all supported languages.
	<br/>Sample Call: 
	<a href="/dcregistry/listItemDetail?item=http://purl.org/dc/elements/1.1/creator&amp;lang=en-US">
	http://dublincore.org/dcregistry/listItemDetail?item=http://purl.org/dc/elements/1.1/creator&amp;lang=en-US</a>
	
	<p/>
	http://dublincore.org/dcregistry/getUpdates
	<br/>Summary: This service returns a list of all changes to the Registry, in a specific language, since a specific date.
	<br/>Parameters: This interface requires a date and a language (i.g., 20021015 en-US).
	<br/>Sample Call: <a href="/dcregistry/getUpdates?date=20030101&amp;lang=en-US">
	http://dublincore.org/dcregistry/getUpdates?date=20030101&amp;lang=en-US</a>
	
	<p/>
	http://dublincore.org/dcregistry/listElements
	<br/>Summary: This service returns a list of all registered elements. 
	<br/>Parameters: No input parameters are required.
	<br/>Sample Call: <a href="/dcregistry/listElements">
	http://dublincore.org/dcregistry/listElements</a>	
		
	<p/>
	http://dublincore.org/dcregistry/listElementRefinements
	<br/>Summary: This service returns a list of all registered element refinements. 
	<br/>Parameters: No input parameters are required.
	<br/>Sample Call: <a href="/dcregistry/listElementRefinements">
	http://dublincore.org/dcregistry/listElementRefinements</a>
		
	<p/>
	http://dublincore.org/dcregistry/listVocabularyTerms
	<br/>Summary: This service returns a list of all registered controlled vocabulary terms. 
	<br/>Parameters: No input parameters are required.
	<br/>Sample Call: <a href="/dcregistry/listVocabularyTerms">
	http://dublincore.org/dcregistry/listVocabularyTerms</a>
	
	<p/>
	http://dublincore.org/dcregistry/listEncodingSchemes
	<br/>Summary: This service returns a list of all registered encoding schemes. 
	<br/>Parameters: No input parameters are required.
	<br/>Sample Call: <a href="/dcregistry/listEncodingSchemes">
	http://dublincore.org/dcregistry/listEncodingSchemes</a>
		
	<p/>
	<a name="H12"><xsl:text> </xsl:text></a>
	<h3>5.2 Registry SOAP Application Interface</h3>
	The Registry SOAP application interface is a collection of Web services that were developed with the 
	<a href="http://ws.apache.org/axis/index.html">Apache Axis toolkit</a>.  The available services are listed below.  
	Each of these services publishes Web Services Description Language (WSDL), which provides a degree of platform and 
	language neutrality to the service.  The WSDL can be used by a growing number of tools, such as 
	<a href="http://www.themindelectric.com/">Mind Electric's GLUE</a> and 
	<a href="http://www.alphaworks.ibm.com/tech/webservicestoolkit">Alphaworks Web Services Toolkit</a>, 
	to automatically generate client code with which to access the service.  Sample client code, generated using GLUE, for the 
	itemSummary and itemDetail services, can be found <a href="/dcregistry/sampleClient.tar.gz">here</a>.  
	Clients for the remaining services can easily be modeled from the itemSummary and itemDetail examples.
	
	<p/>
	Service discovery is an important aspect of Web services. The 
	<a href="http://cvs.apache.org/viewcvs.cgi/*checkout*/xml-axis-wsil/java/README.htm">Web Services Inspection 
	Language (WSIL)</a> 
	is a distributed discovery mechanism that provides references to service descriptions.  WSIL documents are XML documents which
	rely on conventions, not only for specifying the service description syntax, but also for specifying the name and 
	location within a Web site that should be inspected for service descriptions.  
	<p/>
	The DCMI Registry follows these conventions
	by providing a WSIL service desctiption document at the following address: 
	<a href="/services/inspection.wsil">
	http://dublincore.org/services/inspection.wsil</a>.  
	Sample source code which demonstrates how to read and use a WSIL document can be found 
	<a href="/dcregistry/WSInspectionExample2.tar">here</a>.
	
	<p/>
	ItemSummary
	<br/>This service returns a list of all resources that are registered.  No input parameters are required.
	The WSDL for this service can be found at: 
	<a href="/axis/services/itemSummary?wsdl">
	http://dublincore.org/axis/services/itemSummary?wsdl</a>
	
	<p/>
	ItemDetail
	<br/>This interface requires a resource name (i.g., http://purl.org/dc/elements/1.1/creator) and a language code (i.g., en-US).  
	It returns all known information about the resource in the requested language.
	The WSDL for this service can be found at: 
	<a href="/axis/services/itemDetail?wsdl">
	http://dublincore.org/axis/services/itemDetail?wsdl</a>
	
	<p/>
	encodingSchemesSummary
	<br/>This service returns a list of all registered encoding schemes. No input parameters are required.
	<a href="/axis/services/encodingSchemesSummary?wsdl">
	http://dublincore.org/axis/services/encodingSchemesSummary?wsdl</a>
	
	<p/>
	refinementsSummary
	<br/>This service returns a list of all registered element refinements. No input parameters are required.
	The WSDL for this service can be found at:
	<a href="/axis/services/refinementsSummary?wsdl">
	http://dublincore.org/axis/services/refinementsSummary?wsdl</a>
	
	<p/>
	termUpdates
	<br/>This service returns a list of all changes to the Registry, in a specific language, since a specific date.
	This interface requires a date and a language (i.g., 20021015 en-US).
	The WSDL for this service can be found at:
	<a href="/axis/services/termUpdates?wsdl">
	http://dublincore.org/axis/services/termUpdates?wsdl</a>
	
	<p/>
	vocabularyTermsSummary
	<br/>This service returns a list of all registered controlled vocabulary terms. No input parameters are required.
	The WSDL for this service can be found at:
	<a href="/axis/services/vocabularyTermsSummary?wsdl">
	http://dublincore.org/axis/services/vocabularyTermsSummary?wsdl</a>
	
	<p/>
	languagesSummary
	<br/>This service returns a list of all supported languages. No input parameters are required.
	The WSDL for this service can be found at:
	<a href="/axis/services/languagesSummary?wsdl">
	http://dublincore.org/axis/services/languagesSummary?wsdl</a>
	
	<p/>
	elementSummary
	<br/>This service returns a list of all registered elements. No input parameters are required.
	The WSDL for this service can be found at:
	<a href="/axis/services/elementSummary?wsdl">
	http://dublincore.org/axis/services/elementSummary?wsdl</a>
	
	<p/>
	<a name="H7">&#160;</a>
	<h1>VI. Acknowledgements</h1>
	<p/>
	The <a href='http://purl.org/dc/'>Dublin Core Metadata Initiative</a> and the 
	<a href='http://dublincore.org/groups/registry/'>DCMI Registry Working Group</a>
	would like to express their appreciation to the following
	volunteers who have contributed their time, ideas, expertise and support in the development 
	of this application:
	<p/>
	<dl>
	<dt>Antonio Alba, OCLC</dt>
	<dt>Leif Andresen, Danish National Library Authority</dt>
	<dt>Thomas Baker, Institutszentrum Schloss Birlinghoven, Sankt Augustin, Germany</dt>
	<dt>Miroslav Bartosek, MU v Brn&#x011b; - &#x00da;stav v&#x00fd;po&#x010d;etn&#x00ed; techniky, Czech Republic</dt>
	<dt>Maria Bruna Baldacci, Istituto di Elaborazione dell'Informazione, Italy</dt>
	<dt>&#x041e;&#x043b;&#x044c;&#x0433;&#x0430; &#x0411;&#x0430;&#x0440;&#x044b;&#x0448;&#x0435;&#x0432;&#x0430; (Olga Barysheva), The National Library of Russia</dt>
	<dt>Biblioteca de Catalunya, Spain</dt>
	<dt>Jos&#x00e9; Luis Borbinha, Biblioteca Nacional, Portugal</dt>
	<dt>Marcela Calderon, Universidad de Chile</dt>
	<dt>&#x9673;&#x96ea;&#x83ef; (Dr. Hsueh-hua Chen), National Taiwan University</dt>
	<dt>Yong Cho, OCLC</dt>
	<dt>Lyn Lewis Dafis, Llyfrgell Genedlaethol Cymru (National Library of Wales)</dt>
	<dt>Stina Degerstedt, National Library of Sweden</dt>
	<dt>Makx Dekkers, DCMI</dt>
	<dt>&#x0637;&#x0627;&#x0631;&#x0642; &#x0623;&#x0633;&#x0627;&#x0645;&#x0629; &#x0627;&#x0644;&#x0645;&#x0631;&#x0627;&#x063a;&#x064a; (Tarik Osama El-Maraghy)</dt>
        <dt>Stefan Farrenkopf, State and University Library at G&#0246;ettingen, Germany</dt>
	<dt>Thomas Fischer, State and University Library at G&#0246;ettingen, Germany</dt>
	<dt>Juha Hakala, Helsinki University Library, Finland</dt>
	<dt>Dr. Hachim Haddouti, Arabic</dt>
	<dt>Frank B. Haugen, Den norske katalogkomit&#0233;, Norway</dt>
	<dt>&#x0411;&#x0430;&#x043d;&#x044c;&#x043a;&#x0456;&#x0432;&#x0441;&#x044c;&#x043a;&#x0430; &#x0406;&#x0440;&#x0438;&#x043d;&#x0430; (Bankovskay Irina), Lesya Ukrainka Public Library</dt>
	<dt>Istituto Centrale per il Catalogo Unico delle Biblioteche Italiane e per le Informazioni Bibliografiche - ICCU, Italy</dt>
	<dt>Pete Johnston, UKOLN</dt>
	<dt>&#x97a0;&#x653e; (Fang Ju), OCLC, USA</dt>
	<dt>&#x03a3;&#x03b1;&#x03c1;&#x03ac;&#x03bd;&#x03c4;&#x03bf;&#x03c2; &#x039a;&#x03b1;&#x03c0;&#x03b9;&#x03b4;&#x03ac;&#x03ba;&#x03b7;&#x03c2; (Sarantos Kapidakis), Ionian University, Greece</dt>
	<dt>Traugott Koch, NetLab Lund University Libraries, Sweden</dt>	
	<dt>Javi Masa Marin, RedIRIS. Edificio CICA, Spain</dt>	
	<dt>Maria Moreno, Spain</dt>
	<dt>&#x6c38;&#x68ee;&#x5149;&#x6674; (Mitsuharu Nagamori), University of Library and Information Science, Japan</dt>
	<dt>&#x0936;&#x0941;&#x092d;&#x0926;&#x093e; &#x0928;&#x0917;&#x0930;&#x0915;&#x0930; (Shubhada Nagarkar), Bioinformatics Centre, University of Pune, India</dt>
	<dt>Marek Nahotko, Energoprojekt - Krak&#x00f3;w S.A., Poland</dt>
	<dt>Heike Neuroth, State and University Library at G&#0246;ettingen, Germany</dt>
	<dt>&#xc624;&#xc0bc;&#xade0; (Dr. Sam-Gyun Oh), SungKyunKwan University, Korea</dt>
	<dt>Lawrence Olszewski, OCLC</dt>
	<dt>Shaochun Ouyang, OCLC</dt>
	<dt>Hubert Padiou, France</dt>
	<dt>&#x0e2a;&#x0e34;&#x0e17;&#x0e18;&#x0e34;&#x0e1e;&#x0e23; &#x0e1b;&#x0e23;&#x0e30;&#x0e20;&#x0e32;&#x0e27;&#x0e31;&#x0e15; (Sittiporn Prabhavat), Technical Information Access Center - TIAC, Thailand</dt>
        <dt>Karen Rollitt, National Library of New Zealand Te Puna M&#x0101;tauranga o Aotearoa</dt>
	<dt>Diann Rusch-Feja, Max-Planck-Institut f&#0252;r Bildungsforschung, Germany</dt>
	<dt>Kanya Saengswang, OCLC</dt>
	<dt>&#x0421;&#x0432;&#x0456;&#x0442;&#x043b;&#x0430;&#x043d;&#x0430; &#x0421;&#x0430;&#x043d;&#x0436;&#x0430;&#x043a;(Svetlana Sanzhak), Lesya Ukrainka Public Library</dt>
	<dt>Roland Schw&#0228;enzl, Universit&#0228;t Osnabr&#0252;ck, Germany</dt>
	<dt>&#x0e1b;&#x0e23;&#x0e30;&#x0e14;&#x0e34;&#x0e29;&#x0e10;&#x0e32; &#x0e28;&#x0e34;&#x0e23;&#x0e34;&#x0e1e;&#x0e31;&#x0e19;&#x0e18;&#x0e4c; (Praditta Siripan), Technical Information Access Center - TIAC, Thailand</dt>
	<dt>Jani Stenvall, Helsinki University Library, Finland</dt>
	<dt>&#x6749;&#x672c;&#x91cd;&#x96c4; (Shigeo Sugimoto), University of Library and Information Science, Japan</dt>
	<dt>Carol van Nuys, Den norske katalogkomit&#0233;, Norway</dt>
	<dt>Anne-Marie.Vercoustre, Inria Rocquencourt, France</dt>
	<dt>Herve de Villemeur, France</dt>
	<dt>&#x0413;&#x0430;&#x043d;&#x043d;&#x0430; &#x0412;&#x043e;&#x0441;&#x043a;&#x0440;&#x0435;&#x0441;&#x0435;&#x043d;&#x0441;&#x044c;&#x043a;&#x0430; (Hanna Voskresenska), National Parliamentary Library of Ukraine</dt>
	<dt>Liu Wei, Shanghai Library</dt>
	<dt>Petr Zabicka, MU v Brn&#x011b; - &#x00da;stav v&#x00fd;po&#x010d;etn&#x00ed; techniky, Czech Republic</dt>
	<dt>Klaus Zaepke, State and University Library at G&#0246;ettingen, Germany</dt>
	</dl>
	
<xsl:call-template name="footer" />

</body>
</html>
	
</xsl:template>

</xsl:stylesheet>
