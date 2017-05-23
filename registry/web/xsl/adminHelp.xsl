<?xml version="1.0" encoding='UTF-8'?>
 
<xsl:stylesheet version="1.0"
  xmlns:xsl="http://www.w3.org/1999/XSL/Transform" 
  xmlns:rdf="http://www.w3.org/1999/02/22-rdf-syntax-ns#"
  xmlns:rdfs="http://www.w3.org/2000/01/rdf-schema#"
  xmlns:reg="http://dublincore.org/registry/"
  xmlns:java="java" exclude-result-prefixes="java rdf rdfs reg">

<xsl:output method="html" indent="yes" encoding="UTF-8"
    doctype-system="http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd"
    doctype-public="-//W3C//DTD XHTML 1.0 Transitional//EN" />


<xsl:include href="banner.xsl"/>
<xsl:include href="footer.xsl"/>
<xsl:include href="_url_encode.xsl"/>

<xsl:param name="reqType" select="' '"/>
<xsl:param name="uiStyle" select="'std'"/>
<xsl:param name="uiLang" select="'en-US'"/>
<xsl:param name="resultsLang" select="'en-US'"/>
<xsl:param name="location" select="'administration'"/>

<xsl:variable name="rdf" select="'http://www.w3.org/1999/02/22-rdf-syntax-ns#'" />
<xsl:variable name="rdfs" select="'http://www.w3.org/2000/01/rdf-schema#'"/>

<xsl:variable name="locale" select="java:util.Locale.new(substring($uiLang,1,2), substring($uiLang,4,2))"/>
<xsl:variable name="resources" select="java:util.ResourceBundle.getBundle('ui', $locale)"/>

<xsl:template match="/">
	<html>
	<head>
	<title>The Open Metadata Registry</title>
	<link type="text/css" rel="stylesheet" href="/dcregistry/css/default.css" />
	</head>	
	<body>

	<xsl:call-template name="banner">		
		<xsl:with-param name="action" select="$location" />
	</xsl:call-template>
	
	<h1>Overview</h1>
	<p/>
	This document describes the primary interface for online administration of the registry.  
	<p/>
	<b>Note:</b> this document
	is a work-in-progress, and has an expected completion date of 2004-11-30.
	<p/>
	<dl>
	<dt><a href="#H1">I. Collection &amp; Resource Management</a></dt>
	<dt class="toc"><a href="#H12">1.1 Adding Collections</a></dt>
	<dt class="toc"><a href="#H13">1.2 Deleting Collections</a></dt>
	<dt class="toc"><a href="#H11">1.3 Managing Existing Resources</a></dt>
	<dt class="toc"><a href="#H11">1.4 Managing Provenance Information</a></dt>
	<dt><a href="#H2">II. Internationalization Support</a></dt>
	<dt class="toc"><a href="#H21">2.1 Managing Language Support</a></dt>
	<dt class="toc"><a href="#H22">2.2 Property File Editor</a></dt>
	<dt><a href="#H3">III. Inter-Registry Communication Support</a></dt>
	<dt class="toc"><a href="#H31">3.1 Managing Language Support</a></dt>
	<dt class="toc"><a href="#H32">3.2 Property File Editor</a></dt>
	<dt><a href="#H4">IV. Application Statistics</a></dt>
	<dt class="toc"><a href="#H41">4.1 Managing Language Support</a></dt>
	<dt class="toc"><a href="#H42">4.2 Property File Editor</a></dt>
	<dt><a href="#H5">V. Other Tools</a></dt>
	<dt class="toc"><a href="#H51">5.1 Managing Existing Collections</a></dt>
	<dt class="toc"><a href="#H52">5.2 Adding Collections</a></dt>
	<dt class="toc"><a href="#H53">5.3 Deleting Collections</a></dt>
	</dl>
	
	<p/>
	<a name="H1"><xsl:text> </xsl:text></a>
	<h1>I. Collection &amp; Resource Management</h1>
	The 'Registry Administration' screen (figure 1) is the primary interface for managing resources and collections.  Functions are provided 
	to add, update and delete 
	resources, and to group resources into 'collections'.  Collections are a logical way to group terms that facilitates their 
	management.  The registry concept of collections is loosely based on the RDF schema approach.  Resources in a collection 
	are linked using the RDF 'isDefinedBy' assertion (all resources in a collection have the same 'isDefinedBy' assertion).
	<p/>
	This page provides a list of all existing collections.  Additionally, access is provided to resources that are not part 
	of any collection, and to a listing of all resources (irregardless of their collecion status).  Select from one of the 
	provided lists to view the resources associated with that collection. 
	
	<p/>
	<table cellspacing="0" width="100%" class="border" align="center">
	<tr><td align="center"><img src="images/admin/admin-start.gif" /></td></tr>
	<tr><td align="center"><i>Figure 1: The Registry Administration Screen</i></td></tr>
	</table>

	<p/>
	<a name="H11"><xsl:text> </xsl:text></a>
	<h3>1.1 Adding Collections</h3>
	New collections can be created using the form provided on the main registry administration page.  Enter a name for the 
	collection and press the 'Add Collection' button to add a new collection.  Common practice is to group terms into collections 
	based on their namespace and to use the namespace as the collection name.	
	
	<p/>
	<a name="H12"><xsl:text> </xsl:text></a>
	<h3>1.2 Deleting Collections</h3>
	Use the 'Delete Collection' link provided to delete  collection.  Note that deleting a collection only removes the logical
	grouping.  It does not delete the resources that comprise that collection.  Use the 'Delete Resource' screen to delete 
	resources.
	
	<p/>
	<a name="H13"><xsl:text> </xsl:text></a>
	<h3>1.3 Managing Existing Resources</h3>
	Click on one of the existing collections to display a list of resources associated with that collection.  Use the functions 
	provided to add or delete a collection.  
	<p/>
	Selecting a collection from the provided list will display a list of all of resources belonging to that collection (figure 2).  
	Administrators can add additional resources to this collection, or select an existing resource.  Selecting an existing 
	resource will produce a list of assertions for that resource.
	<p/>
	The 'Collection Resources' screen provides a list of all resourses associated with a collection (or other logical grouping).  
	Click on a resource name to view a list of the properties for that resource, or press the 'Add New Term' button to add a 
	new resource to this collection.
	<p/>
	New terms require the following information:
	<ul>
	<li>Identifier (term name)</li>
	<li>RFC 3066 language identifier (for literals)</li>
	<li>Definition</li>
	<li>Description</li>
	<li>RDF type</li>
	<li>Term type</li>
	<li>Superior term (optional, if this term refines another)</li>
	<li>Version identifier</li>
	<li>Date added</li>
	</ul>
	
	<p/>
	Additionally, the form fields are provided for the following provenance information:
	<ul>
	<li>Description</li>
	<li>Title</li>
	<li>Creator</li>
	<li>Contributor</li>
	<li>Publisher</li>
	<li>Source</li>
	<li>Rights</li>
	</ul>
		
	<p/>
	The 'Resource Properties' screen (figure 3) provides a listing of all of the assertions for a particular resource.  
	Click on the 'Delete Resource' link to delete the resource, and it's associated properties.
	<p/>
	Additional properties can be added to this resource by selecting the 'Add New Property' button located at the bottom of the 
	Resource Properties screen.  Doing so will display the 'Add Property' screen.  Use the form provided to specify the 
	property type, valuem and (optional) language.  Press the 'Add Property' button when finished.
	
	<p/>
	<table cellspacing="2" width="100%" border="0" align="center">
	<tr><td width="50%" align="left">
	<table cellspacing="0" width="100%" class="border" align="center">
	<tr><td><img src="images/admin/resources.gif" /></td></tr>
	<tr><td align="center"><i>Figure 2: Collection Resources Screen</i></td></tr>
	</table>
	</td><td width="10%">&#160;
	</td><td width="40%" align="right">
	<table cellspacing="0" class="border" align="center">
	<tr><td><img src="images/admin/properties.gif" /></td></tr>
	<tr><td align="center"><i>Figure 3: The Resource Properties Screen</i></td></tr>
	</table>
	</td></tr>
	</table>
	
	<p/>
	Click on one of the listed assertions to display the "Property Detail" screen (figure 4).  This screen can be used to view, 
	update or delete the property value(s) associated with that assertion.  The property value can be updated by changing the 
	form field provided and pressing the 'Update' button.  Press the 'Delete' button to Delete a property value. 
	<p/>
	Property values fall into one of three categories; resources, language-neutral literals (i.g., dates) and language-specific 
	literals.  Language-specific literals include an RFC-3066 code to indicate the language, and two additional properties; a 
	canonical-definition and associated provenance information (section 1.4 describes functionality for managing the provenance 
	information).  
	<p/>
	Canonical definitions are indicated by a checkbox just to the right of the 
	object value.  A check in this box indicates that this definition is considered the canonical-definition (see figure 4).  
	The registry treats the first definition of a term property as canonical.  All subsequent definitions of the same term are 
	treated as translations of that term.
	
	<p/>
	<table cellspacing="0" width="100%" class="border" align="center">
	<tr><td align="center"><img src="images/admin/property-detail.gif" /></td></tr>
	<tr><td align="center"><i>Figure 4: The Property Detail Screen</i></td></tr>
	</table>

	<p/>
	<a name="H14"><xsl:text> </xsl:text></a>
	<h3>1.4 Managing Provenance Information</h3>
	
	<p/>
	<a name="H2"><xsl:text> </xsl:text></a>
	<h1>II. Internationalization Support</h1>
	 The Internationalization component provide an interface for enabling and disabling language support for both the registry 
	 content and the user interface. The Property File Editor enables administrators to manage the internationalization aspects 
	 of the user interface.
	<p/>
	
	<p/>
	<a name="H21"><xsl:text> </xsl:text></a>
	<h3>2.1 Managing Language Support</h3>
	<p/>
	
	
	<p/>
	<a name="H22"><xsl:text> </xsl:text></a>
	<h3>2.2 Property File Editor</h3>
	<p/>
	
	<p/>
	<a name="H3"><xsl:text> </xsl:text></a>
	<h1>III. Inter-Registry Communication Support</h1>
	The Remote Services component provides a set of tools to facilitate registry-to-registry cooperation. Use this feature to 
	discover, register and execute services offered by remote registries.
	<p/>
	
	 
	<p/>
	<a name="H4"><xsl:text> </xsl:text></a>
	<h1>IV. Application Statistics</h1>
	<p/>
	
	<p/>
	<a name="H5"><xsl:text> </xsl:text></a>
	<h1>V. Other Tools</h1>
	The Other Tools section includes a collection of tools that provide support for managing local extensions, importing RDF 
	statements, and logging out of the administration component. 
	<p/>
	
	
	<p />
	<xsl:call-template name="footer" />
	
	</body>
	</html>

</xsl:template>

</xsl:stylesheet>
