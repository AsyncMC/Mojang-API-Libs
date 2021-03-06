<?php

/**
 * NameHistoryController
 * PHP version 5
 *
 * @category Class
 * @package  com.github.asyncmc.mojang.api.php.symfony.server\Controller
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

namespace com.github.asyncmc.mojang.api.php.symfony.server\Controller;

use \Exception;
use Symfony\Component\HttpFoundation\Request;
use Symfony\Component\HttpFoundation\Response;
use Symfony\Component\HttpKernel\Exception\HttpException;
use Symfony\Component\Validator\Constraints as Assert;
use com.github.asyncmc.mojang.api.php.symfony.server\com.github.asyncmc.mojang.api.php.symfony.api\NameHistoryApiInterface;
use com.github.asyncmc.mojang.api.php.symfony.server\com.github.asyncmc.mojang.api.php.symfony.model\CurrentPlayerIDs;
use com.github.asyncmc.mojang.api.php.symfony.server\com.github.asyncmc.mojang.api.php.symfony.model\Error;
use com.github.asyncmc.mojang.api.php.symfony.server\com.github.asyncmc.mojang.api.php.symfony.model\NameChange;

/**
 * NameHistoryController Class Doc Comment
 *
 * @category Class
 * @package  com.github.asyncmc.mojang.api.php.symfony.server\Controller
 * @author   OpenAPI Generator team
 * @link     https://github.com/openapitools/openapi-generator
 */
class NameHistoryController extends Controller
{

    /**
     * Operation findUniqueIdsByName
     *
     * Find the current UUID of multiple players at once
     *
     * @param Request $request The Symfony request to handle.
     * @return Response The Symfony response.
     */
    public function findUniqueIdsByNameAction(Request $request)
    {
        // Make sure that the client is providing something that we can consume
        $consumes = ['application/json'];
        $inputFormat = $request->headers->has('Content-Type')?$request->headers->get('Content-Type'):$consumes[0];
        if (!in_array($inputFormat, $consumes)) {
            // We can't consume the content that the client is sending us
            return new Response('', 415);
        }

        // Figure out what data format to return to the client
        $produces = ['application/json'];
        // Figure out what the client accepts
        $clientAccepts = $request->headers->has('Accept')?$request->headers->get('Accept'):'*/*';
        $responseFormat = $this->getOutputFormat($clientAccepts, $produces);
        if ($responseFormat === null) {
            return new Response('', 406);
        }

        // Handle authentication

        // Read out all input parameter values into variables
        $requestBody = $request->getContent();

        // Use the default value if no value was provided

        // Deserialize the input values that needs it
        $requestBody = $this->deserialize($requestBody, 'array<string>', $inputFormat);

        // Validate the input values
        $asserts = [];
        $asserts[] = new Assert\NotNull();
        $asserts[] = new Assert\All([
            new Assert\Type("string")
        ]);
        $response = $this->validate($requestBody, $asserts);
        if ($response instanceof Response) {
            return $response;
        }


        try {
            $handler = $this->getApiHandler();

            
            // Make the call to the business logic
            $responseCode = 200;
            $responseHeaders = [];
            $result = $handler->findUniqueIdsByName($requestBody, $responseCode, $responseHeaders);

            // Find default response message
            $message = 'An array containing all players found';

            // Find a more specific message, if available
            switch ($responseCode) {
                case 200:
                    $message = 'An array containing all players found';
                    break;
            }

            return new Response(
                $result?$this->serialize($result, $responseFormat):'',
                $responseCode,
                array_merge(
                    $responseHeaders,
                    [
                        'Content-Type' => $responseFormat,
                        'X-OpenAPI-Message' => $message
                    ]
                )
            );
        } catch (Exception $fallthrough) {
            return $this->createErrorResponse(new HttpException(500, 'An unsuspected error occurred.', $fallthrough));
        }
    }

    /**
     * Operation getNameHistory
     *
     * Gets the full player's name history
     *
     * @param Request $request The Symfony request to handle.
     * @return Response The Symfony response.
     */
    public function getNameHistoryAction(Request $request, $strippedUuid)
    {
        // Figure out what data format to return to the client
        $produces = ['application/json'];
        // Figure out what the client accepts
        $clientAccepts = $request->headers->has('Accept')?$request->headers->get('Accept'):'*/*';
        $responseFormat = $this->getOutputFormat($clientAccepts, $produces);
        if ($responseFormat === null) {
            return new Response('', 406);
        }

        // Handle authentication

        // Read out all input parameter values into variables

        // Use the default value if no value was provided

        // Deserialize the input values that needs it
        $strippedUuid = $this->deserialize($strippedUuid, 'string', 'string');

        // Validate the input values
        $asserts = [];
        $asserts[] = new Assert\NotNull();
        $asserts[] = new Assert\Type("string");
        $response = $this->validate($strippedUuid, $asserts);
        if ($response instanceof Response) {
            return $response;
        }


        try {
            $handler = $this->getApiHandler();

            
            // Make the call to the business logic
            $responseCode = 200;
            $responseHeaders = [];
            $result = $handler->getNameHistory($strippedUuid, $responseCode, $responseHeaders);

            // Find default response message
            $message = 'A list of name changes, the first entry usually don&#39;t have a change time';

            // Find a more specific message, if available
            switch ($responseCode) {
                case 200:
                    $message = 'A list of name changes, the first entry usually don&#39;t have a change time';
                    break;
                case 204:
                    $message = 'Username not found at the given time';
                    break;
            }

            return new Response(
                $result?$this->serialize($result, $responseFormat):'',
                $responseCode,
                array_merge(
                    $responseHeaders,
                    [
                        'Content-Type' => $responseFormat,
                        'X-OpenAPI-Message' => $message
                    ]
                )
            );
        } catch (Exception $fallthrough) {
            return $this->createErrorResponse(new HttpException(500, 'An unsuspected error occurred.', $fallthrough));
        }
    }

    /**
     * Operation getUniqueIdByName
     *
     * Find the UUID by name
     *
     * @param Request $request The Symfony request to handle.
     * @return Response The Symfony response.
     */
    public function getUniqueIdByNameAction(Request $request, $username)
    {
        // Figure out what data format to return to the client
        $produces = ['application/json'];
        // Figure out what the client accepts
        $clientAccepts = $request->headers->has('Accept')?$request->headers->get('Accept'):'*/*';
        $responseFormat = $this->getOutputFormat($clientAccepts, $produces);
        if ($responseFormat === null) {
            return new Response('', 406);
        }

        // Handle authentication

        // Read out all input parameter values into variables
        $at = $request->query->get('at');

        // Use the default value if no value was provided

        // Deserialize the input values that needs it
        $username = $this->deserialize($username, 'string', 'string');
        $at = $this->deserialize($at, 'int', 'string');

        // Validate the input values
        $asserts = [];
        $asserts[] = new Assert\NotNull();
        $asserts[] = new Assert\Type("string");
        $response = $this->validate($username, $asserts);
        if ($response instanceof Response) {
            return $response;
        }
        $asserts = [];
        $asserts[] = new Assert\Type("int");
        $response = $this->validate($at, $asserts);
        if ($response instanceof Response) {
            return $response;
        }


        try {
            $handler = $this->getApiHandler();

            
            // Make the call to the business logic
            $responseCode = 200;
            $responseHeaders = [];
            $result = $handler->getUniqueIdByName($username, $at, $responseCode, $responseHeaders);

            // Find default response message
            $message = 'The user was found';

            // Find a more specific message, if available
            switch ($responseCode) {
                case 200:
                    $message = 'The user was found';
                    break;
                case 204:
                    $message = 'User not found';
                    break;
                case 400:
                    $message = 'If the timestamp is invalid';
                    break;
            }

            return new Response(
                $result?$this->serialize($result, $responseFormat):'',
                $responseCode,
                array_merge(
                    $responseHeaders,
                    [
                        'Content-Type' => $responseFormat,
                        'X-OpenAPI-Message' => $message
                    ]
                )
            );
        } catch (Exception $fallthrough) {
            return $this->createErrorResponse(new HttpException(500, 'An unsuspected error occurred.', $fallthrough));
        }
    }

    /**
     * Returns the handler for this API controller.
     * @return NameHistoryApiInterface
     */
    public function getApiHandler()
    {
        return $this->apiServer->getApiHandler('nameHistory');
    }
}
