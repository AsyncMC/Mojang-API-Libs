<?php
/**
 * AuthenticationRequest
 *
 * PHP version 5
 *
 * @category Class
 * @package  com.github.asyncmc.mojang.authentication.php.symfony.server\com.github.asyncmc.mojang.authentication.php.symfony.model
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

namespace com.github.asyncmc.mojang.authentication.php.symfony.server\com.github.asyncmc.mojang.authentication.php.symfony.model;

use Symfony\Component\Validator\Constraints as Assert;
use JMS\Serializer\Annotation\Type;
use JMS\Serializer\Annotation\SerializedName;

/**
 * Class representing the AuthenticationRequest model.
 *
 * Request body needed to authenticate the player using the username/e-mail and password. Use with care. This is a risky operation.
 *
 * @package com.github.asyncmc.mojang.authentication.php.symfony.server\com.github.asyncmc.mojang.authentication.php.symfony.model
 * @author  OpenAPI Generator team
 */
class AuthenticationRequest extends UsernamePassword 
{
        /**
     * Constructor
     * @param mixed[] $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        parent::__construct($data);

    }
}

