<?php
/**
 * SlimRouter
 *
 * PHP version 5
 *
 * @category Class
 * @package  OpenAPIServer
 * @author   OpenAPI Generator team
 * @link     https://github.com/openapitools/openapi-generator
 */

/**
 * Mojang API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 * OpenAPI spec version: 2020-06-05
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */

/**
 * NOTE: This class is auto generated by the openapi generator program.
 * https://github.com/openapitools/openapi-generator
 * Do not edit the class manually.
 */
namespace OpenAPIServer;

use OpenAPIServer\Api\MiscellaneousApi;
use OpenAPIServer\Api\NameHistoryApi;
use OpenAPIServer\Api\SecurityQuestionAnswerApi;
use OpenAPIServer\Api\SkinOperationsApi;
use Slim\App;
use Psr\Container\ContainerInterface;
use InvalidArgumentException;
use Tuupola\Middleware\HttpBasicAuthentication;

/**
 * SlimRouter Class Doc Comment
 *
 * PHP version 5
 *
 * @category Class
 * @package  OpenAPIServer\Api
 * @author   OpenAPI Generator team
 * @link     https://github.com/openapitools/openapi-generator
 */
class SlimRouter
{

    /**
     * @var $slimApp Slim\App instance
     */
    private $slimApp;

    /**
     * Class constructor
     *
     * @param ContainerInterface|array $container Either a ContainerInterface or an associative array of app settings
     * @throws InvalidArgumentException when no container is provided that implements ContainerInterface
     */
    public function __construct($container = [])
    {
        $app = new App($container);

        $basicAuth = new HttpBasicAuthentication([
            "secure" => false,
            "authenticator" => function ($arguments) {
                $user = $arguments["user"];
                $password = $arguments["password"];
                return false;
            }
        ]);

        $app->POST(
            '/orders/statistics',
            MiscellaneousApi::class . ':getOrdersStatistics'
        )->add(
            $basicAuth
        );
        $app->POST(
            '/profiles/minecraft',
            NameHistoryApi::class . ':findUniqueIdsByName'
        );
        $app->GET(
            '/user/profiles/{stripped_uuid}/names',
            NameHistoryApi::class . ':getNameHistory'
        );
        $app->GET(
            '/users/profiles/minecraft/{username}',
            NameHistoryApi::class . ':getUniqueIdByName'
        );
        $app->GET(
            '/user/security/location',
            SecurityQuestionAnswerApi::class . ':checkSecurityStatus'
        )->add(
            $basicAuth
        );
        $app->GET(
            '/user/security/challenges',
            SecurityQuestionAnswerApi::class . ':listPendingSecurityQuestions'
        )->add(
            $basicAuth
        );
        $app->POST(
            '/user/security/location',
            SecurityQuestionAnswerApi::class . ':sendSecurityQuestionAnswers'
        )->add(
            $basicAuth
        );
        $app->POST(
            '/user/profile/{stripped_uuid}/skin',
            SkinOperationsApi::class . ':changePlayerSkin'
        )->add(
            $basicAuth
        );
        $app->DELETE(
            '/user/profile/{stripped_uuid}/skin',
            SkinOperationsApi::class . ':resetPlayerSkin'
        )->add(
            $basicAuth
        );
        $app->PUT(
            '/user/profile/{stripped_uuid}/skin',
            SkinOperationsApi::class . ':uploadPlayerSkin'
        )->add(
            $basicAuth
        );

        $this->slimApp = $app;
    }

    /**
     * Returns Slim Framework instance
     * @return App
     */
    public function getSlimApp()
    {
        return $this->slimApp;
    }
}
