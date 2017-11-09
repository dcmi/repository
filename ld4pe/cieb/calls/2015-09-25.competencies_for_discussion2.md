2015-09-24

Stuart: Building on Sean's synthesis (at bottom of this version), this version
reduces the text from my previous version earlier to just the synthesis and
eliminates the base texts from Sean's version. 

----------------------------------------------------------------------
TOPIC CLUSTER
-- Fundamentals of Linked Data 
    
    TOPIC
    -- Basic Linked Data Principles and Concepts

        COMPETENCIES
        -- Knows the subject-predicate-object structure of a triple

        -- Understands the differences between URI (thing) and literal (string)

        -- Understands blank nodes and their appropriate use

        -- Understands that RDF serializations and graphical representations 
           are just multiple alternative ways to write down, or "encode", a set 
           of triples, i.e., the "RDF graph"

    TOPIC
    -- Accessing RDF data on the Web

        COMPETENCIES
        -- Retrieves and accesses RDF data from the "open Web"

    TOPIC
    -- Existing public vocabularies

        COMPETENCIES
        -- Uses relevant resources to discover existing Linked Data datasets

        -- Monitors and updates lists which report the status of SPARQL endpoints

        -- Formulates QNames as a shorthand mechanism in writing prefixes 
           for long URIs 
           BENCHMARKS
           -- Uses prefixes for URIs in RDF specifications and data

    TOPIC
    -- @Something about serialization

        COMPETENCIES
        -- Formulates QNames as a shorthand mechanism in writing prefixes 
           for long URIs 
           BENCHMARKS
           -- Uses prefixes for URIs in RDF specifications and data

        -- @What is a URI

        -- @Turtle

        -- @Understands the concept of the named graph

----------------------------------------------------------------------
TOPIC CLUSTER
-- Interacting with Linked Data

    TOPIC
    -- Searching RDF datastores with SPARQL

        COMPETENCIES
        -- Understands the "basic graph pattern" (BGP) of a SPARQL query as a 
           set of triple patterns.

        -- Understands that the most basic SPARQL query matches the triples of 
           an RDF graph against a triple pattern consisting of fixed and variable 
           values

        -- Understands the role of punctuation in a SPARQL query
           BENCHMARKS
           -- Uses angle brackets for delimiting URIs
           -- Uses question marks for indicating variables

        -- Formulates advanced queries on data containing blank nodes

        -- @Where?
           -- Uses PREFIX for URIs in SPARQL queries

        -- Demonstrates a working knowledge of the forms and uses of 
           SPARQL result sets (SELECT, CONSTRUCT, DESCRIBE, and ASK)
           BENCHMARKS
           -- Uses the SELECT clause to identify the variables to appear
              in a table of query results
           -- Uses the WHERE clause provide the graph pattern to match
              against the graph data
           -- Uses variables in SELECT and WHERE clauses to yield a table
              of results
           -- Uses ASK for a simple True/False result in testing whether
              a query pattern has a solution
           -- Uses DESCRIBE to extract a single graph containing RDF data
              about resources
           -- Uses CONSTRUCT to extract and transform results into a single
              RDF graph specified by a graph template

        -- Understands how to combine and filter graph patterns using 
           operators such as UNION, OPTIONAL, FILTER, and MINUS
           BENCHMARKS
           -- Uses UNION to formulate queries with multiple possible graph patterns
           -- Uses OPTIONAL to formulate queries to return the values of
              optional variables when available
           -- Uses FILTER to formulates queries that eliminate solutions from a
              result set
           -- Uses NOT EXISTS to limit whether a given graph pattern exists in
              the data
           -- Uses MINUS to remove matches from a result based on the
              evaluation of two patterns
           -- Uses NOT IN to restrict a variable to not being in a given set 
              of values

        -- Understands the major SPARQL result set modifiers, e.g., to limit or
           sort results, or to return distinct results only once
           BENCHMARKS
           -- Uses ORDER BY to define ordering conditions by variable, function
              call, or expression
              [Or Tom: to sort query results by...]
           -- Uses DISTINCT to ensure solutions in the sequence are unique
              [Or, Stuart: to eliminates redundant output...]
              [Or, Tom: to eliminate redundant items from the result set...]
           -- Uses OFFSET to control where the solutions processed start in the
              overall sequence of solutions
           -- Uses LIMIT to restrict the number of solutions processed for
              query results
              [Or Tom: number of items included in...]
           -- Uses projection to transforms a solution sequence into one
              involving only a subset of the variables

        -- Understands the use of SPARQL functions and operators
           BENCHMARKS
           -- Uses the regular expression (regex()) function regex() for string
              matching
           -- Uses aggregates to apply expressions over groups of solutions
              (GROUP BY, COUNT, SUM, AVG, MIN) for ---partitioning results,
              evaluating projections, and filtering
           -- Uses the lang() function to return the language tag of an RDF
              literal
           -- Uses the langMatches() function to match a language tag against a
              language range
           -- Uses the xsd:decimal(expn) function to convert an expression to
              an integer
           -- Uses the GROUP BY clause to transforms a result set so that only
              one row will appear for each unique set of grouping variables 
           -- Uses the HAVING clause to apply a filter to the result set after
              grouping 

        -- Differentiates between a Default Graph and a Named Graph, and
           formulates queries using the GRAPH clause
           @Check terminology against SPARQL spec
           BENCHMARKS
           -- Formulates advanced queries using FROM NAMED and GRAPH on local data
           -- Formulate advanced queries using FROM NAMED on remote data

        -- Formulate advanced queries using subqueries

        -- Uses a temporary variable to extend a query

        -- Understands the role of Property Paths and how they are formed by
           combining predicates with regular expression-like operators

        -- Understands how to perform Federated Searches
           BENCHMARKS
           -- Formulates advanced queries on a remote SPARQL endpoint using the
              SERVICE directive
           -- Uses federated query to query over a local graph store and one or
              more other SPARQL endpoints
           -- Pulls data from a different SPARQL endpoints in one single query
              using the SERVICE directive

        -- Converts/manipulates SPARQL query outputs (RDF-XML, JSON) to the
           exact format required by a third party tools and APIs

        -- Formulates queries using FROM with URLs and local files

        -- Reads and understands high-level descriptions of the classes and
           properties of a dataset in order to write queries

        -- Uses available tools, servers, and endpoints to issue queries
           against a dataset 
           BENCHMARKS
           -- Execute SPARQL queries using the Jena ARQ command-line utility
           -- Queries multiple local data files using ARQ
           -- Uses ARQ to evaluate queries on local data
           -- Uses Fuseki server to evaluate queries on a dataset
           -- Queries multiple data files using Fuseki
           -- Accesses DBPedia's SNORQL/SPARQL endpoint and issues simple
              queries

        -- Uses SPARQL to inserting, deleting, modifying RDF data

    TOPIC
    -- Visualization tools and techniques

       COMPETENCIES
       -- Uses publicly available tools to visualize data
          BENCHMARKS
          -- Uses Google FusionTables to create maps and charts

       -- Distills results taken from large datasets so that visualizations are
          human-friendly

       -- Converts/manipulates SPARQL query outputs (RDF-XML, JSON) to the
          exact format required by a third party tools and APIs

    TOPIC 
    -- Methods for Linked Data analysis

       COMPETENCY
       -- Uses available ontology browsing tools to explore the ontologies used
          in a particular dataset

----------------------------------------------------------------------
TOPIC CLUSTER
-- Providing Linked Data

    TOPIC
    -- Creating RDF data

        COMPETENCIES
        -- Structures data using blank nodes where appropriate

    TOPIC
    -- Describing Linked Data for discovery
       
       COMPETENCIES
       -- Uses available vocabularies for dataset description to support their
          discovery

       -- Registers datasets with relevant services for discovery

    TOPIC
    -- Updating RDF with SPARQL 1.1

       COMPETENCY
       -- Understands the SPARQL Graph Store HTTP protocol for editing 
          graphs on remote servers
          BENCHMARKS
          -- Uses POST to add triples to an existing graph
          -- Uses GET to retrieve triples from a default graph or a named graph
          -- Uses PUT to insert set of triples into a new graph (or replace an existing
             graph)
          -- Uses DELETE to remove a graph
          -- Uses proper syntax to request specific media types, such as Turtle

