'use strict';

/* Services */

// Demonstrate how to register services
// In this case it is a simple value service.
angular.module('resourceApp.services', [])
  .value('project', 'LRMI (LD4PE)')
  .value('version', '1.1.0');