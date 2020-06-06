<?php
require_once __DIR__ . '/vendor/autoload.php';

use Symfony\Component\HttpFoundation\Request;
use Symfony\Component\HttpFoundation\Response;
use Silex\Application;

$app = new Silex\Application();


$app->GET('/blockedservers', function(Application $app, Request $request) {
            return new Response('How about implementing getBlockedServerHashes as a GET method ?');
            });


$app->GET('/session/minecraft/profile/{strippedUuid}', function(Application $app, Request $request, $stripped_uuid) {
            $unsigned = $request->get('unsigned');
            return new Response('How about implementing getPlayerProfile as a GET method ?');
            });


$app->run();
