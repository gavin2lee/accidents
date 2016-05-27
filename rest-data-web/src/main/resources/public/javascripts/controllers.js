const controllers = angular.module('appControllers', ['appServices']);

controllers.controller('RoadAccidentsController',function($scope, RoadAccident){
        RoadAccident.query($scope);

        $scope.detail = function(){
            alert('o');
        };
    }
);