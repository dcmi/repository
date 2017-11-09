'use strict';

/* Factories */

angular.module('resourceApp.factories', []).

factory('cache', ['$cacheFactory',
  function ($cacheFactory) {
    var cache = $cacheFactory('myCache');
    return cache;
  }
])

.factory('getSchemeJson', ['$resource',
  function ($resource) {
    return $resource('data/profiles/:profileName/:schemeName.json', {}, {
      query: {
        method: 'GET',
        params: {
          schemeName: 'xml-lang'
        },
        isArray: true,
        cache: true
      }
    });
  }
])

.factory('getProfileJson', ['$resource',
  function ($resource) {
    return $resource('data/profiles/profiles.json', {}, {
      query: {
        method: 'GET',
        isArray: true,
        cache: true
      }
    });
  }
])

.factory('getXmlLangJson', ['$resource',
  function ($resource) {
    return $resource('data/profiles/xml-lang.json', {}, {
      query: {
        method: 'GET',
        isArray: true,
        cache: true
      }
    });
  }
])

.factory('getLocaleJson', ['$resource',
  function ($resource) {
    return $resource('data/profiles/locale.json', {}, {
      query: {
        method: 'GET',
        isArray: true,
        cache: true
      }
    });
  }
])

.factory('getLanguagesJson', ['$resource',
  function ($resource) {
    return $resource('data/profiles/languages.json', {}, {
      query: {
        method: 'GET',
        isArray: true,
        cache: true
      }
    });
  }
])

.factory('userConfig', function () {
  return {
    options: []
  };
})

.factory('uriFactory', function () {
  return {
    value: ''
  };
})

.factory('alo', ['$http', function($http){
  return {
    loadExisting: function(uri) {
      return '';
    }
  };
}])

.factory('generateID', function () {
  return {
    createUUID: function () {
      //https://github.com/broofa/node-uuid/
      var id = 'xxxxxxxx-xxxx-4xxx-yxxx-xxxxxxxxxxxx'.replace(/[xy]/g, function (c) {
        var r = Math.random() * 16 | 0, v = c == 'x' ? r : (r & 0x3 | 0x8);
        return v.toString(16);
      });
      return id;
    },
    createBase: function () {
      //TODO:  should default to configuration so you could change this to things like:  urn:guid: or http://purl.org/
      return 'urn:uuid:';
    }
  };
})

.factory('predicatesFactory', function(){
  var predicatesFactory = {};
  var predicates = {
    'entity'                : 'http://www.w3.org/1999/02/22-rdf-syntax-ns#type',
    'names'                 : 'http://schema.org/name',
    'isbasedonurls'         : 'http://schema.org/isBasedOnUrl',
    'inlanguages'           : 'http://schema.org/inLanguage',
    'created'               : 'http://schema.org/dateCreated',
    'licenses'              : 'http://schema.org/license',
    'authors'               : 'http://schema.org/author',
    'publishers'            : 'http://schema.org/publisher',
    'educationaluses'       : 'http://schema.org/educationalUse',
    'learningresourcetypes' : 'http://schema.org/learningResourceType',
    'typicalagerange'       : 'http://schema.org/typicalAgeRange',
    'timerequired'          : 'http://schema.org/timeRequired',
    'interactivitytypes'    : 'http://schema.org/interactivityType',
    'accessibilityapis'     : 'http://schema.org/accessibilityAPI',
    'accessibilitycontrols' : 'http://schema.org/accessibilityControl',
    'accessibilityfeatures' : 'http://schema.org/accessibilityFeature',
    'accessibilityhazards'  : 'http://schema.org/accessibilityHazard',
    'abouts'                : 'http://schema.org/about',
    'descriptions'          : 'http://schema.org/description',
    'educationalalignments' : 'http://schema.org/educationalAlignment',
    'educationalaudiences'  : 'http://schema.org/EducationalAudience',
    'proficiencylevels'     : 'http://dublincore.org/dcx/pet-terms/proficiencyLevel',
    'competencyindexes'     : 'http://purl.org/dc/terms/subject'
  };
  return predicatesFactory = {
    get: function() {
      return predicates;
    },
    flip: function() {
      var flip_obj = {};
      for (var prop in predicates) {
        if(predicates.hasOwnProperty(prop)) {
          flip_obj[predicates[prop]] = prop;
        }
      }
      return flip_obj;
    }
  };
})

.factory('generateModel', ['generateID', 'userConfig',
  function (generateID, userConfig) {
    return {
      alignmentObject: function(alignmentType, targetDescription, targetUrl) {
        var alo = {
          'http://www.w3.org/1999/02/22-rdf-syntax-ns#type': [{'value': 'http://schema.org/AlignmentObject', 'type': 'uri'}],
          'http://schema.org/alignmentType':                 [{'value': alignmentType, 'type': 'literal'}],
          'http://schema.org/targetDescription':             [{'value': targetDescription, 'type': 'literal'}],
          'http://schema.org/targetUrl':                     [{'value': targetUrl, 'type': 'uri'}]
        };
        return alo;
      },
      schemaOrgLrmi: function () {
        //get defaults
        var defaultLanguage      = userConfig['options']['language']['value'];
        var defaultLanguages     = userConfig['options']['languages'];
        var defaultAlignmentType = userConfig['options']['alignment-type'];
        //blank lrmi object
        var lrmi = {
          url                   : '',
          names                 : [{'value': '', 'lang': defaultLanguage, 'type': 'literal'}],
          abouts                : [{'value': '', 'lang': defaultLanguage, 'type': 'literal'}],
          descriptions          : [{'value': '', 'lang': defaultLanguage, 'type': 'literal'}],
          authors               : [{'value': '', 'lang': defaultLanguage, 'type': 'literal'}],
          publishers            : [{'value': '', 'lang': defaultLanguage, 'type': 'literal'}],
          learningresourcetypes : [],
          educationaluses       : [],
          educationalaudiences  : [],
          isbasedonurls         : [{'value': '', 'type': 'uri'}],
          licenses              : [{'value': '', 'type': 'uri'}],
          inlanguages           : defaultLanguages,
          entity                : [{'value': 'http://schema.org/CreativeWork', 'type': 'uri'}],
          typicalagerange       : [{'value': '', 'type': 'literal'}],
          timerequired          : [{'value': '', 'type': 'literal', 'datatype': 'http://www.w3.org/2001/XMLSchema#duration'}],
          created               : [{'value': '', 'type': 'literal', 'datatype': 'http://purl.org/dc/terms/W3CDTF'}],
          interactivitytypes    : [],
          accessibilityapis     : [],
          accessibilitycontrols : [],
          accessibilityfeatures : [],
          accessibilityhazards  : [],
          proficiencylevels     : [],
          competencyindexes     : [],
          educationalalignments : [{'alo':{'originalObject': {'targetDescription': '', 'targetUrl': '', 'url': ''}}, 'alignmentType': defaultAlignmentType}]
        };
        return lrmi;
      }
    };
  }
])

.factory('createRdf', ['generateModel', '$filter', 'predicatesFactory',
  function (generateModel, $filter, predicatesFactory) {
    return {
      getPredicate: function (entity) {
        var rdf = {};
        var identifier = entity['id'];
        rdf[identifier] = {};
        var predicates = predicatesFactory.get();
        var entityNew = angular.copy(entity);
        angular.forEach(entityNew, function(value, key, obj){
          switch(key) {
            case 'educationalalignments':
              var arr = [];
              angular.forEach(value, function(v, k, o){
                if(angular.isDefined(v.alo)){
                  if(v.alo.originalObject.url != ''){
                    arr.push(v);
                  }
                }
              });
              entityNew[key] = arr;
            break;
            case 'accessibilityapis':
            case 'accessibilitycontrols':
            case 'accessibilityfeatures':
            case 'accessibilityhazards':
            case 'educationaluses':
            case 'educationalaudiences':
            case 'interactivitytypes':
            case 'learningresourcetypes':
            case 'proficiencylevels':
            case 'competencyindexes':
              var arr = [];
              angular.forEach(value, function(v, k, o){
                if(angular.isDefined(v)){
                  arr.push({'value': v, 'type': 'uri'});
                }
              });
              entityNew[key] = arr;
            break;
            default:
              var arr = [];
              angular.forEach(value, function(v, k, o){
                if(angular.isDefined(v['value'])){
                  if(v['value'] != ''){
                    arr.push(v);
                  }
                }
              });
              entityNew[key] = arr;
          };
          //strip out form fields with labels so we can just dump all the values into the rdf
          if(angular.isDefined(value)){
            angular.forEach(value, function(v, k, o){
              if(typeof v.label != 'undefined'){
                delete v.label;
              }
            });
          }
        });
        //alo hack
        if(angular.isDefined(entityNew['educationalalignments'])){
          angular.forEach(entityNew['educationalalignments'], function(v, k, o){
            if(angular.isDefined(v.alo)){
              if(v.alo.originalObject.url != ''){
                var url = v.alo.originalObject.url;
                var targetUrl = v.alo.originalObject.targetUrl;
                var targetDescription = v.alo.originalObject.targetDescription;
                var alignmentType = v.alignmentType;
                delete v.alo;
                delete v.alignmentType;
                v.type = 'uri';
                v.value = url;
                rdf[url] = generateModel.alignmentObject(alignmentType, targetDescription, targetUrl);
              }else{
                v = null;
              }
            }
          });
        }
        //generate rdf/json
        for(var formProperty in entityNew) {
          if(angular.isObject(entityNew[formProperty]) && angular.isDefined(entityNew[formProperty][0])) {
            if(entityNew[formProperty][0]['value']) { 
              var prop = predicates[formProperty];
              rdf[identifier][prop] = entityNew[formProperty];
            }
          }
        }
        return rdf;
      }
    };
  }
])

.factory('configCache', ['getSchemeJson', 'getLanguagesJson', 'userConfig', '$http', '$templateCache',
  function (getSchemeJson, getLanguagesJson, userConfig, $http, $templateCache) {
    return {
      flush: function() {
        localStorage.removeItem("scheme-languages");
        localStorage.removeItem("scheme-accessibility-api");
        localStorage.removeItem("scheme-accessibility-control");
        localStorage.removeItem("scheme-accessibility-feature");
        localStorage.removeItem("scheme-accessibility-hazard");
        localStorage.removeItem("scheme-interactivity-type");
        localStorage.removeItem("scheme-alignment-type");
        localStorage.removeItem("scheme-learning-resource-type");
        localStorage.removeItem("scheme-educational-use");
        localStorage.removeItem("scheme-educational-audience");
        localStorage.removeItem("scheme-proficiency-level");
        localStorage.removeItem("scheme-competency-index");
        
        var profile = userConfig['options']['profile']['path'];

        var accessibilityApi = getSchemeJson.query({
            schemeName: 'accessibility-api',
            profileName: profile
        });
        
        var accessibilityControl = getSchemeJson.query({
            schemeName: 'accessibility-control',
            profileName: profile
        });

        var accessibilityFeature = getSchemeJson.query({
            schemeName: 'accessibility-feature',
            profileName: profile
        });
        
        var accessibilityHazard = getSchemeJson.query({
            schemeName: 'accessibility-hazard',
            profileName: profile
        });
        
        var proficiencyLevel = getSchemeJson.query({
            schemeName: 'proficiency-level',
            profileName: profile
        });
        
        var competencyIndex = getSchemeJson.query({
            schemeName: 'competency-index',
            profileName: profile
        });
        
        var interactivityType = getSchemeJson.query({
            schemeName: 'interactivity-type',
            profileName: profile
        });
        
        var learningResourceType = getSchemeJson.query({
            schemeName: 'learning-resource-type',
            profileName: profile
        });
        
        var educationalUse = getSchemeJson.query({
            schemeName: 'educational-use',
            profileName: profile
        });
        
        var educationalAudience = getSchemeJson.query({
            schemeName: 'educational-audience',
            profileName: profile
        });
        
        var alignmentType = getSchemeJson.query({
            schemeName: 'alignment-type',
            profileName: profile
        });
        
        var lang = getLanguagesJson.query();

        lang.$promise.then(function (result) {
          var temp = {};
          angular.forEach(result, function (s) {
            temp[s.value] = s.label;
          });
          localStorage.setItem("scheme-languages", angular.toJson(temp));
          localStorage.setItem("scheme-languages-dd", angular.toJson(lang));
        });
        
        accessibilityApi.$promise.then(function (result) {
          var temp = {};
          angular.forEach(result, function (s) {
            temp[s.value] = s.value;
          });
          localStorage.setItem("scheme-accessibility-api", angular.toJson(temp));
          localStorage.setItem("scheme-accessibility-api-cbo", angular.toJson(accessibilityApi));
        });
        
        accessibilityControl.$promise.then(function (result) {
          var temp = {};
          angular.forEach(result, function (s) {
            temp[s.value] = s.value;
          });
          localStorage.setItem("scheme-accessibility-control", angular.toJson(temp));
          localStorage.setItem("scheme-accessibility-control-cbo", angular.toJson(accessibilityControl));
        });

        accessibilityFeature.$promise.then(function (result) {
          var temp = {};
          angular.forEach(result, function (s) {
            temp[s.value] = s.value;
          });
          localStorage.setItem("scheme-accessibility-feature", angular.toJson(temp));
          localStorage.setItem("scheme-accessibility-feature-cbo", angular.toJson(accessibilityFeature));
        });
        
        proficiencyLevel.$promise.then(function (result) {
          var temp = {};
          angular.forEach(result, function (s) {
            temp[s.value] = s.value;
          });
          localStorage.setItem("scheme-proficiency-level", angular.toJson(temp));
          localStorage.setItem("scheme-proficiency-level-cbo", angular.toJson(proficiencyLevel));
        });

        competencyIndex.$promise.then(function (result) {
          var temp = {};
          angular.forEach(result, function (s) {
            temp[s.value] = s.value;
          });
          localStorage.setItem("scheme-competency-index", angular.toJson(temp));
          localStorage.setItem("scheme-competency-index-cbo", angular.toJson(competencyIndex));
        });
        
        accessibilityHazard.$promise.then(function (result) {
          var temp = {};
          angular.forEach(result, function (s) {
            temp[s.value] = s.value;
          });
          localStorage.setItem("scheme-accessibility-hazard", angular.toJson(temp));
          localStorage.setItem("scheme-accessibility-hazard-cbo", angular.toJson(accessibilityHazard));
        });
        
        interactivityType.$promise.then(function (result) {
          var temp = {};
          angular.forEach(result, function (s) {
            temp[s.value] = s.value;
          });
          localStorage.setItem("scheme-interactivity-type", angular.toJson(temp));
          localStorage.setItem("scheme-interactivity-type-cbo", angular.toJson(interactivityType));
        });
        
        learningResourceType.$promise.then(function (result) {
          var temp = {};
          angular.forEach(result, function (s) {
            temp[s.value] = s.value;
          });
          localStorage.setItem("scheme-learning-resource-type", angular.toJson(temp));
          localStorage.setItem("scheme-learning-resource-type-cbo", angular.toJson(learningResourceType));
        });
        
        educationalUse.$promise.then(function (result) {
          var temp = {};
          angular.forEach(result, function (s) {
            temp[s.value] = s.value;
          });
          localStorage.setItem("scheme-educational-use", angular.toJson(temp));
          localStorage.setItem("scheme-educational-use-cbo", angular.toJson(educationalUse));
        });
        
        educationalAudience.$promise.then(function (result) {
          var temp = {};
          angular.forEach(result, function (s) {
            temp[s.value] = s.value;
          });
          localStorage.setItem("scheme-educational-audience", angular.toJson(temp));
          localStorage.setItem("scheme-educational-audience-cbo", angular.toJson(educationalAudience));
        });
        
        alignmentType.$promise.then(function (result) {
          var temp = {};
          angular.forEach(result, function (s) {
            temp[s.value] = s.value;
          });
          localStorage.setItem("scheme-alignment-type", angular.toJson(temp));
          localStorage.setItem("scheme-alignment-type-cbo", angular.toJson(alignmentType));
        });
        
        $http.get('partials/forms/fields/rdf-literal-text-field.html', {
          cache: $templateCache
        });
        $http.get('partials/forms/fields/rdf-literal-text-area.html', {
          cache: $templateCache
        });
        $http.get('partials/forms/fields/rdf-literal-uri-text-field.html', {
          cache: $templateCache
        });
        $http.get('partials/forms/fields/rdf-non-literal-checkbox.html', {
          cache: $templateCache
        });
        $http.get('partials/forms/fields/rdf-literal-datatype-text-field.html', {
          cache: $templateCache
        });
        $http.get('partials/forms/fields/rdf-sparql-results-table.html', {
          cache: $templateCache
        });
        $http.get('partials/forms/fields/rdf-non-literal-multi-select-grouped.html', {
          cache: $templateCache
        });
        
      }
    };
  }
])

.factory('alertFactory', ['$rootScope', function($rootScope){
  var alertFactory = {};
  $rootScope.alerts = [];
  return alertFactory = {
    add: function(type, msg) {
      //allow only 1 alert displayed at a time; remove to allow alerts to pile up
      if($rootScope.alerts.length == 1){
        $rootScope.alerts.splice(0, 1);
      }
      return $rootScope.alerts.push({
        type: type,
        msg: msg,
        close: function() {
          return alertFactory.closeAlert(this);
        }
      });
    },
    closeAlert: function(alert) {
      return this.closeAlertIdx($rootScope.alerts.indexOf(alert));
    },
    closeAlertIdx: function(index) {
      return $rootScope.alerts.splice(index, 1);
    },
    reset: function() {
      return $rootScope.alerts = [];
    }
  };
}])

.factory('crudFactory', ['$http', '$location', '$q', 'generateModel', 'uriFactory', 'alo', 'predicatesFactory', 'userConfig', function($http, $location, $q, generateModel, uriFactory, alo, predicatesFactory, userConfig) {
  return {
    insertNew: function(rdfJson) {
      return $http({
        method  : 'POST',
        url     :  userConfig['options']['crud-factory'],
        data    : "rdf=" + encodeURIComponent(rdfJson),
        headers : {'Content-Type': 'application/x-www-form-urlencoded'}
      });
    },
    deleteRecord: function(uri) {
      return $http({
        method  : 'DELETE',
        url     : userConfig['options']['crud-factory'],
        headers : {'Content-Type': 'application/x-www-form-urlencoded', 'X-LD4PE-Identifier': uri}
      });
    },
    findRecord: function(uri) {
      return $http({
        method  : 'GET',
        url     : userConfig['options']['crud-factory-sparql'],
        params  : {query: 'PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#> ASK {<' + uri + '> rdf:type <http://schema.org/CreativeWork>}'}
      }).then(function (result){
        return result.data.boolean;
      });
    },
    loadRecord: function(uri) {
      var promises = [];
      var deferredCombinedItems = $q.defer();
      return $http({
        method  : 'GET',
        url     : userConfig['options']['crud-factory-sparql'],
        params  : {query: 'PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#> SELECT ?p ?o WHERE {<' + uri + '> ?p ?o.}'}
      }).then(function (result){
          var response = result.data.results.bindings;
          var deferredItemList = $q.defer();
          var incoming = generateModel.schemaOrgLrmi();
          var lrmi = {};
          var predicates = predicatesFactory.flip();
          
          angular.forEach(response, function(values, keys, o) {
            if(angular.isDefined(predicates[values.p.value])) {
              var predicate = predicates[values.p.value];
              switch(predicate)
              {
                case 'names':
                case 'abouts':
                case 'descriptions':
                case 'publishers':
                case 'authors':
                  if(angular.isDefined(lrmi[predicate])) {
                    lrmi[predicate].push({'value': values.o.value, 'lang': values.o['xml:lang'], 'type': 'literal'});
                  }else{
                    lrmi[predicate] = [{'value': values.o.value, 'lang': values.o['xml:lang'], 'type': 'literal'}];
                  }
                  break;
                case 'typicalagerange':
                  if(angular.isDefined(lrmi[predicate])) {
                    lrmi[predicate].push({'value': values.o.value, 'type': 'literal'});
                  }else{
                    lrmi[predicate] = [];
                    lrmi[predicate].push({'value': values.o.value, 'type': 'literal'});
                  }
                  break;
                case 'accessibilityapis':
                case 'accessibilitycontrols':
                case 'accessibilityfeatures':
                case 'accessibilityhazards':
                case 'educationaluses':
                case 'educationalaudiences':
                case 'interactivitytypes':
                case 'learningresourcetypes':
                case 'proficiencylevels':
                case 'competencyindexes':
                  if(angular.isDefined(lrmi[predicate])) {
                    lrmi[predicate].push(values.o.value);
                  }else{
                    lrmi[predicate] = [];
                    lrmi[predicate].push(values.o.value);
                  }
                  break;
                case 'inlanguages':
                case 'isbasedonurls':
                case 'licenses':
                  if(angular.isDefined(lrmi[predicate])) {
                    lrmi[predicate].push({'value': values.o.value, 'type': 'uri'});
                  }else{
                    lrmi[predicate] = [{'value': values.o.value, 'type': 'uri'}];
                  }
                  break;
                case 'timerequired':
                  lrmi[predicate] = [{'value':  values.o.value, 'type': 'literal', 'datatype': 'http://www.w3.org/2001/XMLSchema#duration'}];
                  break;
                case 'created':
                  lrmi[predicate] = [{'value':  values.o.value, 'type': 'literal', 'datatype': 'http://purl.org/dc/terms/W3CDTF'}];
                  break;
                case 'entity':
                  lrmi[predicate] = [{'value': values.o.value, 'type': 'uri'}];
                  break;
                case 'educationalalignments':
                    $http({
                      method  : 'GET',
                      url     : userConfig['options']['crud-factory-sparql'],
                      params  : {query: 'PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#> SELECT ?p ?o WHERE {<' + values.o.value + '> ?p ?o.}'}
                    }).then(function (response){
                       var aloResponse = response.data.results.bindings;
                       var alignmentType = '';
                       var targetDescription = '';
                       var targetUrl = '';
                       var url = uri;
                       angular.forEach(aloResponse, function(aloValues, aloKeys, aloO){
                         switch(aloValues.p.value)
                         {
                           case 'http://schema.org/alignmentType':
                             alignmentType = aloValues.o.value;
                             break;
                           case 'http://schema.org/targetDescription':
                             targetDescription = aloValues.o.value;
                             break;
                           case 'http://schema.org/targetUrl':
                             targetUrl = aloValues.o.value;
                             break;
                         }
                       });
                       if(angular.isDefined(lrmi[predicate])) {
                         lrmi[predicate].push({'alo':{'originalObject': {'targetDescription': targetDescription, 'targetUrl': targetUrl, 'url': values.o.value}}, 'alignmentType': alignmentType});
                       }else{
                         lrmi[predicate] = [{'alo':{'originalObject': {'targetDescription': targetDescription, 'targetUrl': targetUrl, 'url': values.o.value}}, 'alignmentType': alignmentType}];
                       }
                       deferredItemList.resolve();
                    });
                    promises.push(deferredItemList.promise);
                  break;
              }
            }
          });
        //load up all the alo requests and wait for them to process before finishing
        $q.all(promises).then(function() {
           lrmi['url'] = uriFactory.value;
           angular.extend(incoming, lrmi);
           deferredCombinedItems.resolve(incoming);
        });
        
        return deferredCombinedItems.promise;
      });
    },
    outputRdfJson: function(rdfJson) {
      var rdf = new Blob([rdfJson], {
        type: "application/json;charset=utf-8"
      });
      saveAs(rdf, "rdf.json");
    }
  };
}]);