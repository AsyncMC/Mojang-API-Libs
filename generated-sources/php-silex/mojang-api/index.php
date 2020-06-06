<?php
require_once __DIR__ . '/vendor/autoload.php';

use Symfony\Component\HttpFoundation\Request;
use Symfony\Component\HttpFoundation\Response;
use Silex\Application;

$app = new Silex\Application();


$app->POST('/orders/statistics', function(Application $app, Request $request) {
            return new Response('How about implementing getOrdersStatistics as a POST method ?');
            });


$app->POST('/profiles/minecraft', function(Application $app, Request $request) {
            return new Response('How about implementing findUniqueIdsByName as a POST method ?');
            });


$app->GET('/user/profiles/{strippedUuid}/names', function(Application $app, Request $request, $stripped_uuid) {
            return new Response('How about implementing getNameHistory as a GET method ?');
            });


$app->GET('/users/profiles/minecraft/{username}', function(Application $app, Request $request, $username) {
            $at = $request->get('at');
            return new Response('How about implementing getUniqueIdByName as a GET method ?');
            });


$app->GET('/user/security/location', function(Application $app, Request $request) {
            return new Response('How about implementing checkSecurityStatus as a GET method ?');
            });


$app->GET('/user/security/challenges', function(Application $app, Request $request) {
            return new Response('How about implementing listPendingSecurityQuestions as a GET method ?');
            });


$app->POST('/user/security/location', function(Application $app, Request $request) {
            return new Response('How about implementing sendSecurityQuestionAnswers as a POST method ?');
            });


$app->POST('/user/profile/{strippedUuid}/skin', function(Application $app, Request $request, $stripped_uuid) {
            $model = $request->get('model');
            $url = $request->get('url');
            return new Response('How about implementing changePlayerSkin as a POST method ?');
            });


$app->DELETE('/user/profile/{strippedUuid}/skin', function(Application $app, Request $request, $stripped_uuid) {
            return new Response('How about implementing resetPlayerSkin as a DELETE method ?');
            });


$app->PUT('/user/profile/{strippedUuid}/skin', function(Application $app, Request $request, $stripped_uuid) {
            $model = $request->get('model');
            $file = $request->get('file');
            return new Response('How about implementing uploadPlayerSkin as a PUT method ?');
            });


$app->run();
