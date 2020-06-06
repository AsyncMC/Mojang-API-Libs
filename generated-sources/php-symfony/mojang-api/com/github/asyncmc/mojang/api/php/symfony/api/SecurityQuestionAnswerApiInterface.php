<?php
/**
 * SecurityQuestionAnswerApiInterface
 * PHP version 5
 *
 * @category Class
 * @package  com.github.asyncmc.mojang.api.php.symfony.server
 * @author   OpenAPI Generator team
 * @link     https://github.com/openapitools/openapi-generator
 */

/**
 * Mojang API
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

namespace com.github.asyncmc.mojang.api.php.symfony.server\com.github.asyncmc.mojang.api.php.symfony.api;

use Symfony\Component\HttpFoundation\File\UploadedFile;
use com.github.asyncmc.mojang.api.php.symfony.server\com.github.asyncmc.mojang.api.php.symfony.model\Error;
use com.github.asyncmc.mojang.api.php.symfony.server\com.github.asyncmc.mojang.api.php.symfony.model\SecurityAnswer;
use com.github.asyncmc.mojang.api.php.symfony.server\com.github.asyncmc.mojang.api.php.symfony.model\SecurityChallenge;

/**
 * SecurityQuestionAnswerApiInterface Interface Doc Comment
 *
 * @category Interface
 * @package  com.github.asyncmc.mojang.api.php.symfony.server\com.github.asyncmc.mojang.api.php.symfony.api
 * @author   OpenAPI Generator team
 * @link     https://github.com/openapitools/openapi-generator
 */
interface SecurityQuestionAnswerApiInterface
{

    /**
     * Sets authentication method PlayerAccessToken
     *
     * @param string $value Value of the PlayerAccessToken authentication method.
     *
     * @return void
     */
    public function setPlayerAccessToken($value);

    /**
     * Operation checkSecurityStatus
     *
     * Check if security questions are needed
     *
     * @param  integer $responseCode     The HTTP response code to return
     * @param  array   $responseHeaders  Additional HTTP headers to return with the response ()
     *
     * @return void
     *
     */
    public function checkSecurityStatus(&$responseCode, array &$responseHeaders);

    /**
     * Operation listPendingSecurityQuestions
     *
     * Get list of questions
     *
     * @param  integer $responseCode     The HTTP response code to return
     * @param  array   $responseHeaders  Additional HTTP headers to return with the response ()
     *
     * @return com.github.asyncmc.mojang.api.php.symfony.server\com.github.asyncmc.mojang.api.php.symfony.model\SecurityChallenge[]
     *
     */
    public function listPendingSecurityQuestions(&$responseCode, array &$responseHeaders);

    /**
     * Operation sendSecurityQuestionAnswers
     *
     * Send back the answers
     *
     * @param  com.github.asyncmc.mojang.api.php.symfony.server\com.github.asyncmc.mojang.api.php.symfony.model\SecurityAnswer[] $securityAnswer  An array with all the answers (required)
     * @param  integer $responseCode     The HTTP response code to return
     * @param  array   $responseHeaders  Additional HTTP headers to return with the response ()
     *
     * @return void
     *
     */
    public function sendSecurityQuestionAnswers(array $securityAnswer, &$responseCode, array &$responseHeaders);
}
