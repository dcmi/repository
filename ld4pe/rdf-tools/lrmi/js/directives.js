'use strict';

/* Directives */

angular.module('resourceApp.directives', [])

.directive('appVersion', ['version',
  function (version) {
    return function (scope, elm, attrs) {
      elm.text(version);
    };
  }
])

.directive('rdfLiteralTextField', [
  function() {
    return {
      restrict: 'A',
      scope: {
        item: '=',
        collection: '=',
        index: '@',
        definition: '@',
        languages: '='
      },
      replace: true,
      templateUrl: 'partials/forms/fields/rdf-literal-text-field.html',
      link: function(scope, elem, attrs){
        scope.label           = attrs.label;
        scope.helpText        = attrs.help;
        scope.index           = attrs.index;
        scope.definition      = attrs.definition;
        scope.defaultLanguage = attrs.defaultLanguage;

        scope.addLiteral = function(){
          scope.collection.push({'value': '', 'lang': scope.defaultLanguage, 'type': 'literal'});
        };
        
        scope.removeLiteral = function(index){
          scope.collection.splice(index, 1);
        };
      }
    };
  }
])

.directive('rdfLiteralTextArea', [
  function() {
    return {
      restrict: 'A',
      scope: {
        item: '=',
        collection: '=',
        index: '@',
        definition: '@',
        languages: '='
      },
      replace: true,
      templateUrl: 'partials/forms/fields/rdf-literal-text-area.html',
      link: function(scope, elem, attrs){
        scope.label           = attrs.label;
        scope.helpText        = attrs.help;
        scope.index           = attrs.index;
        scope.definition      = attrs.definition;
        scope.defaultLanguage = attrs.defaultLanguage;

        scope.addLiteral = function(){
          scope.collection.push({'value': '', 'lang': scope.defaultLanguage, 'type': 'literal'});
        };
        
        scope.removeLiteral = function(index){
          scope.collection.splice(index, 1);
        };
      }
    };
  }
])

.directive('rdfLiteralUriTextField', [
  function() {
    return {
      restrict: 'A',
      scope: {
        item: '=',
        collection: '=',
        index: '@',
        definition: '@'
      },
      replace: true,
      templateUrl: 'partials/forms/fields/rdf-literal-uri-text-field.html',
      link: function(scope, elem, attrs){
        scope.label      = attrs.label;
        scope.helpText   = attrs.help;
        scope.index      = attrs.index;
        scope.definition = attrs.definition;

        scope.addLiteral = function(){
          scope.collection.push({'value': '', 'type': 'uri'});
        };
        
        scope.removeLiteral = function(index){
          scope.collection.splice(index, 1);
        };
      }
    };
  }
])

.directive('rdfNonLiteralMultiSelectGrouped', [
  function() {
    return {
      restrict: 'A',
      scope: {
        collection: '=',
        definition: '@',
        options: '='
      },
      replace: true,
      templateUrl: 'partials/forms/fields/rdf-non-literal-multi-select-grouped.html',
      link: function(scope, elem, attrs){
        scope.label      = attrs.label;
        scope.helpText   = attrs.help;
        scope.definition = attrs.definition;
      }
    };
  }
])

.directive('rdfNonLiteralCheckbox', [
  function() {
    return {
      restrict: 'A',
      scope: {
        collection: '=',
        definition: '@',
        options: '='
      },
      replace: true,
      templateUrl: 'partials/forms/fields/rdf-non-literal-checkbox.html',
      link: function(scope, elem, attrs){
        scope.label      = attrs.label;
        scope.helpText   = attrs.help;
        scope.definition = attrs.definition;
      }
    };
  }
])

.directive('rdfLiteralDatatypeTextField', [
  function() {
    return {
      restrict: 'A',
      scope: {
        collection: '=',
        definition: '@',
        options: '='
      },
      replace: true,
      templateUrl: 'partials/forms/fields/rdf-literal-datatype-text-field.html',
      link: function(scope, elem, attrs){
        scope.label      = attrs.label;
        scope.helpText   = attrs.help;
        scope.definition = attrs.definition;
      }
    };
  }
])

.directive('rdfSparqlResultsTable', ['$http', '$sce',
  function($http, $sce) {
    return {
      restrict: 'A',
      scope: {
        sparqlEndpoint: '@'
      },
      replace: true,
      templateUrl: 'partials/forms/fields/rdf-sparql-results-table.html',
      link: function(scope, elem, attrs){
        function buildTable(headers, rows){
          var table = '<tr>' + headers + '</tr>' + rows;
          scope.table_contents = $sce.trustAsHtml(table);
          elem.removeClass('hide');
        };
        
        function getTableHeaders(sparqlResponse){
          var html = '';
          angular.forEach(sparqlResponse['data']['head']['vars'], function(value) {
             html += '<th>' + value + '</th>';
          });
          return html;
        };
        
        function getTableRows(sparqlResponse){
          var html = '';
          angular.forEach(sparqlResponse['data']['results']['bindings'], function(value, key) {
             html += '<tr>';
             html += '<td>' + value['record']['value'] + '</td>';
             html += '<td>' + value['date']['value'] + '</td>';
             html += '</tr>';
          });
          return html;
        };
        
        function getTotalRecords(sparqlEndpoint){
          var endpoint    = scope.sparqlEndpoint;
          var sparqlQuery = endpoint + '?query=' + encodeURIComponent('PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#> PREFIX dcterms: <http://purl.org/dc/terms/> SELECT count(?url) as ?url WHERE {?url rdf:type <http://schema.org/CreativeWork>;}') + '&output=json';
          $http.get(sparqlQuery).
            then(function(response) {
              var total = response.data.results.bindings[0].url.value;
              scope.totalItems = total;
              getResults(0, scope.itemsPerPage);
            }, function(response) {
              alert('cannot display results - error fetching from SPARQL endpoint');
            });
        };
        
        function getResults(offset, limit){
          var endpoint    = scope.sparqlEndpoint;
          var sparqlQuery = endpoint + '?query=' + encodeURIComponent('PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#> PREFIX dcterms: <http://purl.org/dc/terms/> SELECT distinct ?record ?date WHERE {?record rdf:type <http://schema.org/CreativeWork>; dcterms:created ?date.}ORDER BY DESC(?date) OFFSET ' + offset + ' LIMIT ' + limit) + '&output=json';
          $http.get(sparqlQuery).
            then(function(response) {
              var headers = getTableHeaders(response);
              var rows    = getTableRows(response);
              buildTable(headers, rows);
            }, function(response) {
              alert('cannot display results - error fetching from SPARQL endpoint');
            });
        };
        
        var total = getTotalRecords();
        scope.currentPage = 1;
        scope.itemsPerPage = attrs.itemsPerPage;
        
        scope.setPage = function (pageNo) {
          scope.currentPage = pageNo;
          var offset = (pageNo - 1) * scope.itemsPerPage;
          getResults(offset, scope.itemsPerPage);
        };
      }
    };
  }
])

.directive('appProject', ['project',
  function (project) {
    return function (scope, elm, attrs) {
      elm.text(project);
    };
  }
]);