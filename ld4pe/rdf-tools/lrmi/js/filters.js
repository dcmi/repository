'use strict';

/* Filters */

angular.module('resourceApp.filters', []).

filter('interpolate', ['version',
    function (version) {
        return function (text) {
            return String(text).replace(/\%VERSION\%/mg, version);
        }
    }
])

.filter('interpolate1', ['project',
    function (project) {
        return function (text) {
            return String(text).replace(/\%PROJECT\%/mg, project);
        }
    }
]);