<?php
require_once __DIR__ . '/vendor/autoload.php';

use Symfony\Component\HttpFoundation\Request;
use Symfony\Component\HttpFoundation\Response;
use Silex\Application;

$app = new Silex\Application();


$app->POST('/authenticate', function(Application $app, Request $request) {
            return new Response('How about implementing authenticate as a POST method ?');
            });


$app->POST('/invalidate', function(Application $app, Request $request) {
            return new Response('How about implementing invalidate as a POST method ?');
            });


$app->POST('/refresh', function(Application $app, Request $request) {
            return new Response('How about implementing refresh as a POST method ?');
            });


$app->POST('/signout', function(Application $app, Request $request) {
            return new Response('How about implementing siginout as a POST method ?');
            });


$app->POST('/validate', function(Application $app, Request $request) {
            return new Response('How about implementing validate as a POST method ?');
            });


$app->run();
