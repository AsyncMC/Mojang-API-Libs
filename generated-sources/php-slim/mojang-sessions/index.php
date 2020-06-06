<?php
/**
 * Mojang Session API
 * @version 2020-06-05
 */

require_once __DIR__ . '/vendor/autoload.php';

use com.github.asyncmc.mojang.sessions.php.slim.server\SlimRouter;

$router = new SlimRouter();
$app = $router->getSlimApp();
$app->run();
