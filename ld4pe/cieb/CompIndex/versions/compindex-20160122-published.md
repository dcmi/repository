COMPETENCY INDEX

    [A] Fundamentals of Resource Description Framework 
        [B] Identity in RDF 
        [B] RDF data model 
            [C] Knows the subject-predicate-object component structure of a triple 
            [C] Understands the difference between literals and non-literals
            [C] Understands that any URI or literal denotes some "thing" in the world 
               whether real, imagined, or conceptual; and, all things are called "resources"
            [C] Understands that "resources" may be divided into groups called classes and 
               the members of a class are known as instances of the class (rdf:type)
            [C] Understands the use of datatypes and language tags with literals
            [C] Understands blank nodes and their appropriate use
            [C] Formulates QNames as a shorthand mechanism in writing prefixes for long URIs 
                [D] Uses prefixes for URIs in RDF specifications and data
            [C] Understands the concept of the named graph
        [B] Related data models
        [B] RDF serialization
            [C] Understands that RDF serializations and graphical representations 
               are just multiple alternative ways to write down, or "encode", a set 
               of triples, i.e., the "RDF graph"

    [A] Fundamentals of Linked Data
        [B] Web technology
        [B] Linked data principles
        [B] Linked Data architectures and services
        [B] Linked Data policies and best practices
        [B] Non-RDF Linked Data

    [A] RDF vocabularies
        [B] Finding RDF vocabularies
            [C] Retrieves and accesses RDF data from the "open Web"
        [B] Maintaining RDF vocabularies
        [B] Versioning RDF vocabularies
        [B] Publishing RDF vocabularies
        [B] Mapping RDF vocabularies
        [B] RDF application profiles

    [A] Creating and transforming RDF Data
        [B] Managing identifiers (URIs)
        [B] Creating RDF data
            [C] Structures data using blank nodes where appropriate    
        [B] Versioning RDF data
        [B] RDF data provenance
        [B] Cleaning and reconciling RDF data
        [B] Mapping and enriching RDF data

    [A] Interacting with RDF Data
        [B] Finding RDF Data
            [C] Retrieves and accesses RDF data from the "open Web"
            [C] Uses relevant resources to discover existing Linked Data datasets
            [C] Monitors and updates lists which report the status of SPARQL endpoints
            [C] Uses available vocabularies for dataset description to support their
                discovery
            [C] Registers datasets with relevant services for discovery        
        [B] Programming RDF Data
        [B] Querying RDF Data
            [C] Understands the "basic graph pattern" (BGP) of a SPARQL query as a 
                set of triple patterns.
            [C] Understands that the most basic SPARQL query matches the triples of 
                an RDF graph against a triple pattern consisting of fixed and variable 
                values
            [C] Understands the role of punctuation in a SPARQL query
                [D] Uses angle brackets for delimiting URIs
                [D] Uses question marks for indicating variables
            [C] Formulates advanced queries on data containing blank nodes
            [C] Uses PREFIX for URIs in SPARQL queries
            [C] Demonstrates a working knowledge of the forms and uses of 
                SPARQL result sets (SELECT, CONSTRUCT, DESCRIBE, and ASK)
                [D] Uses the SELECT clause to identify the variables to appear 
                    in a table of query results
                [D] Uses the WHERE clause provide the graph pattern to match
                    against the graph data
                [D] Uses variables in SELECT and WHERE clauses to yield a table
                    of results
                [D] Uses ASK for a simple True/False result in testing whether
                    a query pattern has a solution
                [D] Uses DESCRIBE to extract a single graph containing RDF data
                    about resources
                [D] Uses CONSTRUCT to extract and transform results into a single
                    RDF graph specified by a graph template
            [C] Understands how to combine and filter graph patterns using operators such 
                as UNION, OPTIONAL, FILTER, and MINUS
                [D] Uses UNION to formulate queries with multiple possible graph patterns
                [D] Uses OPTIONAL to formulate queries to return the values of
                    optional variables when available
                [D] Uses FILTER to formulates queries that eliminate solutions from a
                    result set
                [D] Uses NOT EXISTS to limit whether a given graph pattern exists in
                    the data
                [D] Uses MINUS to remove matches from a result based on the
                    evaluation of two patterns
                [D] Uses NOT IN to restrict a variable to not being in a given set 
                    of values
            [C] Understands the major SPARQL result set modifiers, e.g., to limit or
                sort results, or to return distinct results only once
                [D] Uses ORDER BY to define ordering conditions by variable, function
                    call, or expression
                [D] Uses DISTINCT to ensure solutions in the sequence are unique
                [D] Uses OFFSET to control where the solutions processed start in the
                    overall sequence of solutions
                [D] Uses LIMIT to restrict the number of solutions processed for
                    query results
                [D] Uses projection to transforms a solution sequence into one
                    involving only a subset of the variables 
            [C] Understands the use of SPARQL functions and operators
                [D] Uses the regular expression (regex()) function for string
                    matching
                [D] Uses aggregates to apply expressions over groups of solutions
                    (GROUP BY, COUNT, SUM, AVG, MIN) for partitioning results,
                    evaluating projections, and filtering
                [D] Uses the lang() function to return the language tag of an RDF
                    literal
                [D] Uses the langMatches() function to match a language tag against a
                    language range
                [D] Uses the xsd:decimal(expn) function to convert an expression to
                    an integer
                [D] Uses the GROUP BY clause to transforms a result set so that only
                    one row will appear for each unique set of grouping variables 
                [D] Uses the HAVING clause to apply a filter to the result set after
                    grouping             
            [C] Differentiates between a Default Graph and a Named Graph, and
               formulates queries using the GRAPH clause
                [D] Formulates advanced queries using FROM NAMED and GRAPH on local data
                [D] Formulate advanced queries using FROM NAMED on remote data
            [C] Formulate advanced queries using subqueries
            [C] Uses a temporary variable to extend a query
            [C] Understands the role of Property Paths and how they are formed by
                combining predicates with regular expression-like operators
            [C] Understands how to perform Federated Searches
                [D] Formulates advanced queries on a remote SPARQL endpoint using the
                    SERVICE directive
                [D] Uses federated query to query over a local graph store and one or
                    more other SPARQL endpoints
                [D] Pulls data from a different SPARQL endpoints in one single query
                    using the SERVICE directive
            [C] Converts/manipulates SPARQL query outputs (RDF-XML, JSON) to the
                exact format required by a third party tools and APIs
            [C] Formulates queries using FROM with URLs and local files
            [C] Reads and understands high-level descriptions of the classes and
                properties of a dataset in order to write queries 
            [C] Uses available tools, servers, and endpoints to issue queries against a dataset 
                [D] Execute SPARQL queries using the Jena ARQ command-line utility
                [D] Queries multiple local data files using ARQ
                [D] Uses ARQ to evaluate queries on local data
                [D] Uses Fuseki server to evaluate queries on a dataset
                [D] Queries multiple data files using Fuseki
                [D] Accesses DBPedia's SNORQL/SPARQL endpoint and issues simple
                    queries              
        [B] Visualizing RDF Data
            [C] Uses publicly available tools to visualize data
                [D] Uses Google FusionTables to create maps and charts
            [C] Distills results taken from large datasets so that visualizations are
                human-friendly
            [C] Converts/manipulates SPARQL query outputs (RDF-XML, JSON) to the
                exact format required by a third party tools and APIs    
        [B] Reasoning over RDF
        [B] Assessing RDF data quality
        [B] RDF Data analytics
            [C] Uses available ontology browsing tools to explore the ontologies used
                in a particular dataset    
        [B] Manipulating RDF Data
            [C] Understands the SPARQL Graph Store HTTP protocol for editing 
                graphs on remote servers
            [C] Uses SPARQL to inserting, deleting, modifying RDF data
                [D] Uses POST to add triples to an existing graph
                [D] Uses GET to retrieve triples from a default graph or a named graph
                [D] Uses PUT to insert set of triples into a new graph (or replace an existing graph)
                [D] Uses DELETE to remove a graph
                [D] Uses proper syntax to request specific media types, such as Turtle              

    [A] Creating Linked Data applications
        [B] Storing RDF data
        [B] Linked Data application architecture
        [B] Linked Data mashups




