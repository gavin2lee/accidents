
const services = angular.module('appServices', ['ngResource']);

services.factory('RoadAccident', function($resource){
    var factory = {};
    var r = $resource('http://localhost:8090/rest-data/road-accidents', {},{fetch:'JSONP', query:{method:'GET', isArray:true}});

    factory.query=function(scopeObject){

        r.query().$promise.then(function(returnedObjects){
            scopeObject.roadAccidents = returnedObjects;
        });

    };
    return factory;
});
