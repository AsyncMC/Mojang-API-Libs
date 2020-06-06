<?php
/**
 * OpenAPIServerBundle
 *
 * PHP version 5
 *
 * @category Class
 * @package  com.github.asyncmc.mojang.authentication.php.symfony.server
 * @author   OpenAPI Generator team
 * @link     https://github.com/openapitools/openapi-generator
 */

/**
 * Mojang Authentication API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2020-06-05
 * 
 * Generated by: https://github.com/openapitools/openapi-generator.git
 *
 */

/**
 * NOTE: This class is auto generated by the openapi generator program.
 * https://github.com/openapitools/openapi-generator
 * Do not edit the class manually.
 */

namespace com.github.asyncmc.mojang.authentication.php.symfony.server;

use Symfony\Component\HttpKernel\Bundle\Bundle;
use Symfony\Component\DependencyInjection\ContainerBuilder;
use com.github.asyncmc.mojang.authentication.php.symfony.server\DependencyInjection\Compiler\OpenAPIServerApiPass;

/**
 * OpenAPIServerBundle Class Doc Comment
 *
 * @category Class
 * @package  com.github.asyncmc.mojang.authentication.php.symfony.server
 * @author   OpenAPI Generator team
 * @link     https://github.com/openapitools/openapi-generator
 */
class OpenAPIServerBundle extends Bundle
{
    public function build(ContainerBuilder $container)
    {
        $container->addCompilerPass(new OpenAPIServerApiPass());
    }
}