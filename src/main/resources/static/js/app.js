var app = angular.module('app', ['ngRoute','ngResource']);
app.config(function($routeProvider){
    $routeProvider
        .when('/profile',{
            templateUrl: 'views/contactus.html',
            controller: 'homeController'
        })
        .when('/contactus',{
            templateUrl: 'views/profile.html',
            controller: 'profileController'
        })
        .otherwise(
        { redirectTo: '/'}
    );
});