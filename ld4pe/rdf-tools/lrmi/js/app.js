'use strict';

angular.module('resourceApp', [
  'ngResource',
  'ngRoute',
  'resourceApp.filters',
  'resourceApp.services',
  'resourceApp.factories',
  'resourceApp.directives',
  'resourceApp.controllers',
  'ui.bootstrap',
  'ui.router',
  'pascalprecht.translate',
  'tmh.dynamicLocale',
  'xeditable',
  'checklist-model',
  'angular-loading-bar',
  'angucomplete-alt'
])

.config(['$stateProvider', '$urlRouterProvider',
  function ($stateProvider, $urlRouterProvider) {
    $urlRouterProvider.otherwise("/home");
    $stateProvider
      .state('home', {
        url: "/home",
        templateUrl: "partials/home.html",
        controller: 'HomeCtrl1'
      })
      .state('getting-started', {
        url: "/configure",
        templateUrl: "partials/forms/configure.html",
        controller: 'ConfigCtrl'
      })
      .state('resource', {
        url: "/resource",
        templateUrl: "partials/forms/resource.html",
        controller: 'DescribeResourceCtrl'
      })
      .state('view-records', {
        url: "/view-records",
        templateUrl: "partials/forms/view-records.html",
        controller: 'ViewAllCtrl'
      })
  }
])

.config(['$translateProvider', 'tmhDynamicLocaleProvider',
    function ($translateProvider, tmhDynamicLocaleProvider) {
      //register custom i18n location
      tmhDynamicLocaleProvider.localeLocationPattern('bower_components/angular-i18n/angular-locale_{{locale}}.js');
      //register custom loader for the static language files
      $translateProvider.useStaticFilesLoader({
        type: 'static-files',
        prefix: './data/languages/',
        suffix: '.json'
      });
      //set language to use by default
      $translateProvider.preferredLanguage('en_US');
    }
])

.config(['$compileProvider',
  function ($compileProvider) {
    //disable in production for a significant performance boost
    //https://docs.angularjs.org/guide/production
    $compileProvider.debugInfoEnabled(false);
  }
])

.config(['cfpLoadingBarProvider', 
    function (cfpLoadingBarProvider) {
      cfpLoadingBarProvider.latencyThreshold = 100;
    }
])

.run(['editableOptions', 'editableThemes',
  function (editableOptions, editableThemes) {
    //xeditable bootstrap3 theme
    editableOptions.theme = 'bs3';
  }
])

.run(['userConfig', 'tmhDynamicLocale', 
  function (userConfig, tmhDynamicLocale) {
    //set user config default options
    tmhDynamicLocale.set('en-us');
    userConfig['options']['locale']   = {"value": "en-us", "label": "en-us"};
    userConfig['options']['language'] = {"value": "en-US", "label": "en-US"};
    userConfig['options']['profile'] = {label: 'LRMI (LD4PE)', path: 'lrmi-ld4pe'};
    userConfig['options']['languages']   = [{"value": "http://id.loc.gov/vocabulary/iso639-2/eng", "type": "uri"}];
    userConfig['options']['definitions'] = true;
    //TODO: add alignment-type to configuration page so user can modify
    userConfig['options']['alignment-type'] = 'Assesses';
    userConfig['options']['crud-factory'] = 'http://explore.dublincore.net/rdf/process.php';
    userConfig['options']['crud-factory-sparql'] = 'http://explore.dublincore.net/rdf/endpoint.php';
  }
])

.run(['configCache',
    function (configCache) {
      configCache.flush();
    }
])

.run(['$rootScope', '$state', '$stateParams',
    function ($rootScope, $state, $stateParams) {
      // It's very handy to add references to $state and $stateParams to the $rootScope so that you can access them from any scope within your applications.
      $rootScope.$state = $state;
      $rootScope.$stateParams = $stateParams;
    }
]);