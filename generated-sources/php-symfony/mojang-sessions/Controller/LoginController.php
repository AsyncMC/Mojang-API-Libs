<?php

/**
 * LoginController
 * PHP version 5
 *
 * @category Class
 * @package  com.github.asyncmc.mojang.sessions.php.symfony.server\Controller
 * @author   OpenAPI Generator team
 * @link     https://github.com/openapitools/openapi-generator
 */

/**
 * Mojang Session API
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

namespace com.github.asyncmc.mojang.sessions.php.symfony.server\Controller;

use \Exception;
use Symfony\Component\HttpFoundation\Request;
use Symfony\Component\HttpFoundation\Response;
use Symfony\Component\HttpKernel\Exception\HttpException;
use Symfony\Component\Validator\Constraints as Assert;
use com.github.asyncmc.mojang.sessions.php.symfony.server\com.github.asyncmc.mojang.sessions.php.symfony.api\LoginApiInterface;
use com.github.asyncmc.mojang.sessions.php.symfony.server\com.github.asyncmc.mojang.sessions.php.symfony.model\PlayerProfile;
use com.github.asyncmc.mojang.sessions.php.symfony.server\com.github.asyncmc.mojang.sessions.php.symfony.model\SessionApiError;

/**
 * LoginController Class Doc Comment
 *
 * @category Class
 * @package  com.github.asyncmc.mojang.sessions.php.symfony.server\Controller
 * @author   OpenAPI Generator team
 * @link     https://github.com/openapitools/openapi-generator
 */
class LoginController extends Controller
{

    /**
     * Operation getPlayerProfile
     *
     * Gets the player's game profile
     *
     * @param Request $request The Symfony request to handle.
     * @return Response The Symfony response.
     */
    public function getPlayerProfileAction(Request $request, $strippedUuid)
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
        $unsigned = $request->query->get('unsigned');

        // Use the default value if no value was provided

        // Deserialize the input values that needs it
        $strippedUuid = $this->deserialize($strippedUuid, 'string', 'string');
        $unsigned = $this->deserialize($unsigned, 'bool', 'string');

        // Validate the input values
        $asserts = [];
        $asserts[] = new Assert\NotNull();
        $asserts[] = new Assert\Type("string");
        $response = $this->validate($strippedUuid, $asserts);
        if ($response instanceof Response) {
            return $response;
        }
        $asserts = [];
        $asserts[] = new Assert\Type("bool");
        $response = $this->validate($unsigned, $asserts);
        if ($response instanceof Response) {
            return $response;
        }


        try {
            $handler = $this->getApiHandler();

            
            // Make the call to the business logic
            $responseCode = 200;
            $responseHeaders = [];
            $result = $handler->getPlayerProfile($strippedUuid, $unsigned, $responseCode, $responseHeaders);

            // Find default response message
            $message = 'The player profile and all properties';

            // Find a more specific message, if available
            switch ($responseCode) {
                case 200:
                    $message = 'The player profile and all properties';
                    break;
                case 400:
                    $message = 'UUID is invalid';
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
     * @return LoginApiInterface
     */
    public function getApiHandler()
    {
        return $this->apiServer->getApiHandler('login');
    }
}
