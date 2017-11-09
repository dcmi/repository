'use strict';

/* Controllers */

angular.module('resourceApp.controllers', []).

controller('HomeCtrl1', [
    function () {
      //home page contents
    }
])

.controller('DescribeResourceCtrl', ['$scope', '$filter', '$window', 'cache', 'getSchemeJson', 'userConfig', 'getXmlLangJson', 'createRdf', 'generateModel', 'generateID', 'crudFactory', 'uriFactory', 'alertFactory',
    function ($scope, $filter, $window, cache, getSchemeJson, userConfig, getXmlLangJson, createRdf, generateModel, generateID, crudFactory, uriFactory, alertFactory) {
      var defaultProfile       = userConfig['options']['profile']['path'];
      var defaultLanguages     = userConfig['options']['languages'];
      var defaultAlignmentType = userConfig['options']['alignment-type'];
      $scope.sparqlEndpoint    = userConfig['options']['crud-factory-sparql'];
      $scope.hideForm = true;
      alertFactory.add("info", 'load.static.MESSAGE_WELCOME');
      $scope.wslang                 = getXmlLangJson.query();
      $scope.wslanguages            = angular.fromJson(localStorage.getItem("scheme-languages-dd"));
      $scope.wsaccessibilityapi     = angular.fromJson(localStorage.getItem("scheme-accessibility-api-cbo"));
      $scope.wsaccessibilitycontrol = angular.fromJson(localStorage.getItem("scheme-accessibility-control-cbo"));
      $scope.wsaccessibilityfeature = angular.fromJson(localStorage.getItem("scheme-accessibility-feature-cbo"));
      $scope.wsaccessibilityhazard  = angular.fromJson(localStorage.getItem("scheme-accessibility-hazard-cbo"));
      $scope.wsinteractivitytype    = angular.fromJson(localStorage.getItem("scheme-interactivity-type-cbo"));
      $scope.wsalignmenttype        = angular.fromJson(localStorage.getItem("scheme-alignment-type-cbo"));
      $scope.wslearningresourcetype = angular.fromJson(localStorage.getItem("scheme-learning-resource-type-cbo"));
      $scope.wseducationaluse       = angular.fromJson(localStorage.getItem("scheme-educational-use-cbo"));
      $scope.wseducationalaudience  = angular.fromJson(localStorage.getItem("scheme-educational-audience-cbo"));
      $scope.wsproficiencylevel     = angular.fromJson(localStorage.getItem("scheme-proficiency-level-cbo"));
      $scope.wscompetencyindex      = angular.fromJson(localStorage.getItem("scheme-competency-index-cbo"));
      
      $scope.defaultLanguage = userConfig['options']['language']['value'];
      //should we display definitions
      $scope.definitions = userConfig['options']['definitions'];
      
      //build the properties
      var master = generateModel.schemaOrgLrmi();

      //bind to form
      $scope.form = angular.copy(master);
      
      $scope.addToCache = function() {
        cache.put($scope.key, $scope.val);
      };

      $scope.getFromCache = function() {
        $scope.val = cache.get($scope.key);
      };
      
      //xeditable languages and storage
      $scope.showLanguages = function() {
        var selected = [];
        var languages = localStorage.getItem("scheme-languages");
        var jsonSession = angular.fromJson(languages);
        angular.forEach($scope.form.inlanguages, function(s) {
          if(jsonSession != null) {
            selected.push(jsonSession[s.value]);
          }
        });
        return selected.length ? selected.join(', ') : 0;
      };
            
      //TODO rename.  This is adding alignment object not a typed literal
      $scope.addTypedLiteral = function (property) {
          $scope.form[property].push({'alo': {'originalObject': {'targetDescription': '', 'targetUrl': '', 'url': ''}}, 'alignmentType': defaultAlignmentType});
      };
      
      //add non-literal value to form
      $scope.addNonLiteral = function (property) {
          $scope.form[property].push({});
      };
      
      //remove literal
      $scope.removeLiteral = function (property, index) {
          $scope.form[property].splice(index, 1);
      };

      
      //configure to use SPARQL for querying
      $scope.remoteUrlRequestFn = function(str) {
        var clean       = str.replace(/[-\/\\^$*+?.()|[\]{}]/g, '\\$&');
        var cleanQuotes = clean.replace("\"", "\\\\\"");
        var sparql = "PREFIX dcterms: <http://purl.org/dc/terms/> PREFIX asn: <http://purl.org/ASN/schema/core/> SELECT distinct ?description ?uri WHERE { ?uri dcterms:isPartOf <http://asn.desire2learn.com/resources/D2695955>; asn:indexingStatus <http://purl.org/ASN/scheme/ASNIndexingStatus/Yes>; dcterms:description ?description. FILTER regex(?description, \"" + cleanQuotes + "\", \"i\")}";
        return {query: sparql};
      };
      
      //convert SPARQL response to autofill style with new UUID
      $scope.remoteUrlResponseFn = function (response) {
        if(angular.isDefined(response)) {
          var formatted = [];
          angular.forEach(response.results.bindings, function (k, v) {
            formatted.push({'targetDescription': k.description.value, 'targetUrl': k.uri.value, 'url': generateID.createBase() + generateID.createUUID()});
          });
          return formatted;
        }
      };
      
      $scope.fetchRecord = function () {
        var uri = $scope.form.url;
        crudFactory.findRecord(uri).then(function(exists) {
          if(exists) {
            uriFactory['value'] = uri;
            crudFactory.loadRecord(uri)
              .then(function(record) {
                 alertFactory.add("warning", 'load.static.MESSAGE_YES_URI');
                 angular.extend($scope.form, record);
                 $scope.hideForm = false;
              }, function(recordError){
                //error on loading record
                alertFactory.add("danger", 'load.static.FATAL_ERROR');
              });
          }else{
            //Could not find any record matching the supplied identifier
            alertFactory.add("info", 'load.static.MESSAGE_NO_URI');
            $scope.hideForm = false;
            $window.scrollTo(0,0);
          }
        }, function(error){
          alertFactory.add("danger", 'load.static.FATAL_ERROR');
        });
      };
      
      $scope.preview = function () {
        $scope.rdf = {};
        $scope.rdf[0] = {
          'id'                    : $scope.form.url,
          'entity'                : $scope.form.entity,
          'names'                 : $scope.form.names,
          'abouts'                : $scope.form.abouts,
          'descriptions'          : $scope.form.descriptions,
          'isbasedonurls'         : $scope.form.isbasedonurls,
          'inlanguages'           : $scope.form.inlanguages,
          'created'               : $scope.form.created,
          'licenses'              : $scope.form.licenses,
          'educationaluses'       : $scope.form.educationaluses,
          'educationalaudiences'  : $scope.form.educationalaudiences,
          'learningresourcetypes' : $scope.form.learningresourcetypes,
          'authors'               : $scope.form.authors,
          'publishers'            : $scope.form.publishers,
          'typicalagerange'       : $scope.form.typicalagerange,
          'timerequired'          : $scope.form.timerequired,
          'interactivitytypes'    : $scope.form.interactivitytypes,
          'accessibilityapis'     : $scope.form.accessibilityapis,
          'accessibilitycontrols' : $scope.form.accessibilitycontrols,
          'accessibilityfeatures' : $scope.form.accessibilityfeatures,
          'accessibilityhazards'  : $scope.form.accessibilityhazards,
          'educationalalignments' : $scope.form.educationalalignments,
          'proficiencylevels'     : $scope.form.proficiencylevels,
          'competencyindexes'     : $scope.form.competencyindexes
        };
        var rdfJson = {};
        rdfJson = createRdf.getPredicate($scope.rdf[0]);
        var resource = angular.toJson(rdfJson, true);
        console.log(resource);//crudFactory.outputRdfJson(resource);
      };
      
      $scope.update = function () {
        $scope.rdf = {};
        $scope.rdf[0] = {
          'id'                    : $scope.form.url,
          'entity'                : $scope.form.entity,
          'names'                 : $scope.form.names,
          'abouts'                : $scope.form.abouts,
          'descriptions'          : $scope.form.descriptions,
          'isbasedonurls'         : $scope.form.isbasedonurls,
          'inlanguages'           : $scope.form.inlanguages,
          'created'               : $scope.form.created,
          'licenses'              : $scope.form.licenses,
          'educationaluses'       : $scope.form.educationaluses,
          'educationalaudiences'  : $scope.form.educationalaudiences,
          'learningresourcetypes' : $scope.form.learningresourcetypes,
          'authors'               : $scope.form.authors,
          'publishers'            : $scope.form.publishers,
          'typicalagerange'       : $scope.form.typicalagerange,
          'timerequired'          : $scope.form.timerequired,
          'interactivitytypes'    : $scope.form.interactivitytypes,
          'accessibilityapis'     : $scope.form.accessibilityapis,
          'accessibilitycontrols' : $scope.form.accessibilitycontrols,
          'accessibilityfeatures' : $scope.form.accessibilityfeatures,
          'accessibilityhazards'  : $scope.form.accessibilityhazards,
          'educationalalignments' : $scope.form.educationalalignments,
          'proficiencylevels'     : $scope.form.proficiencylevels,
          'competencyindexes'     : $scope.form.competencyindexes
        };

        var rdfJson = {};
        rdfJson = createRdf.getPredicate($scope.rdf[0]);
        var resource = angular.toJson(rdfJson, true);
        
        crudFactory.insertNew(resource)
          .success(function (data, status, headers, config, statusText) {
            if(data.success) {
             // success
              alertFactory.add("success", data.message);
              //reset form
              var frmReset = generateModel.schemaOrgLrmi();
              $scope.form = angular.copy(frmReset);
              $scope.hideForm = true;
            }else{
             // if not successful, bind error
             alertFactory.add("danger", data.errors); 
            }
            $window.scrollTo(0,0);
          })
          .error(function (error) {
            //error
            alertFactory.add("danger", error.errors);
            $window.scrollTo(0,0);
          });
      };
      
      $scope.delete = function () {
        var uri = $scope.form.url;
        crudFactory.deleteRecord(uri)
        .success(function (data, status, headers, config, statusText) {
            if(data.success) {
              //success
              alertFactory.add("success", data.message);
              //reset the form
              var frmReset = generateModel.schemaOrgLrmi();
              $scope.form = angular.copy(frmReset);
              $scope.hideForm = true;
            }else{
              //error when trying to delete
              alertFactory.add("danger", data.errors);
            }
            $window.scrollTo(0,0);
          })
        .error(function (error) {
          //error
          alertFactory.add("danger", error.errors);
          $window.scrollTo(0,0);
        });
      };
    }
])

.controller('ConfigCtrl', ['$scope', 'getSchemeJson', 'userConfig', '$translate', 'getProfileJson', 'getXmlLangJson', 'getLocaleJson', 'tmhDynamicLocale', 'getLanguagesJson', 'configCache',
    function ($scope, getSchemeJson, userConfig, $translate, getProfileJson, getXmlLangJson, getLocaleJson, tmhDynamicLocale, getLanguagesJson, configCache) {

        var defaultLanguage      = userConfig['options']['language'];
        var defaultProfileObject = userConfig['options']['profile'];
        var defaultLocale        = userConfig['options']['locale'];
        var defaultLanguages     = userConfig['options']['languages'];
        var defaultDefinitions   = userConfig['options']['definitions'];

        $scope.form = {};
        $scope.wslang      = getXmlLangJson.query();
        $scope.wslocale    = getLocaleJson.query();
        $scope.wsprofile   = getProfileJson.query();
        $scope.wslanguages = getLanguagesJson.query();

        $scope.form.configlocale    = defaultLocale;
        $scope.form.configlang      = defaultLanguage;
        $scope.form.configprofile   = defaultProfileObject;
        $scope.form.configlanguages = defaultLanguages;
        $scope.form.definitions     = defaultDefinitions;
        
        $scope.changeLanguage = function (langKey) {
          $translate.use(langKey);
        };

        $scope.changeDefinitions = function () {
          userConfig['options']['definitions'] = $scope.form.definitions;
        };

        $scope.updateLang = function () {
          userConfig['options']['language'] = $scope.form.configlang;
        };

        $scope.updateLanguages = function () {
          userConfig['options']['languages'] = $scope.form.configlanguages;
        };

        $scope.updateLocale = function () {
          tmhDynamicLocale.set($scope.form.configlocale.value);
          userConfig['options']['locale'] = $scope.form.configlocale;
        };

        $scope.updateProfile = function () {
          userConfig['options']['profile'] = $scope.form.configprofile;
          configCache.flush();
        };
    }
])

.controller('ViewAllCtrl', ['$scope', 'userConfig',
    function ($scope, userConfig) {
      $scope.sparqlEndpoint = userConfig['options']['crud-factory-sparql'];
    }
])
.controller('MainMenuCtrl', ['$scope', '$location',
    function ($scope, $location) {
      $scope.isCollapsed = true;
      $scope.isActive = function (viewLocation) {
        return viewLocation === $location.path();
      };
    }
]);