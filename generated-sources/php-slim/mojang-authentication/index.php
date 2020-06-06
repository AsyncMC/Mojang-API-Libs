<?php
/**
 * Mojang Authentication API
 * @version 2020-06-05
 */

require_once __DIR__ . '/vendor/autoload.php';

use OpenAPIServer\SlimRouter;

$router = new SlimRouter();
$app = $router->getSlimApp();
$app->run();
