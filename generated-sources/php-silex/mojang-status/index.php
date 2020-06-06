<?php
require_once __DIR__ . '/vendor/autoload.php';

use Symfony\Component\HttpFoundation\Request;
use Symfony\Component\HttpFoundation\Response;
use Silex\Application;

$app = new Silex\Application();


$app->GET('/check', function(Application $app, Request $request) {
            return new Response('How about implementing checkStatuses as a GET method ?');
            });


$app->run();
