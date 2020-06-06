<?php
/**
 * LoginApi
 * PHP version 5
 *
 * @category Class
 * @package  com.github.asyncmc.mojang.sessions.php.server
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 */

/**
 * Mojang Session API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2020-06-05
 * 
 * Generated by: https://openapi-generator.tech
 * OpenAPI Generator version: 3.3.4
 */

/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

namespace com.github.asyncmc.mojang.sessions.php.server\com.github.asyncmc.mojang.sessions.php.api;

use GuzzleHttp\Client;
use GuzzleHttp\ClientInterface;
use GuzzleHttp\Exception\RequestException;
use GuzzleHttp\Psr7\MultipartStream;
use GuzzleHttp\Psr7\Request;
use GuzzleHttp\RequestOptions;
use com.github.asyncmc.mojang.sessions.php.server\ApiException;
use com.github.asyncmc.mojang.sessions.php.server\Configuration;
use com.github.asyncmc.mojang.sessions.php.server\HeaderSelector;
use com.github.asyncmc.mojang.sessions.php.server\ObjectSerializer;

/**
 * LoginApi Class Doc Comment
 *
 * @category Class
 * @package  com.github.asyncmc.mojang.sessions.php.server
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 */
class LoginApi
{
    /**
     * @var ClientInterface
     */
    protected $client;

    /**
     * @var Configuration
     */
    protected $config;

    /**
     * @var HeaderSelector
     */
    protected $headerSelector;

    /**
     * @param ClientInterface $client
     * @param Configuration   $config
     * @param HeaderSelector  $selector
     */
    public function __construct(
        ClientInterface $client = null,
        Configuration $config = null,
        HeaderSelector $selector = null
    ) {
        $this->client = $client ?: new Client();
        $this->config = $config ?: new Configuration();
        $this->headerSelector = $selector ?: new HeaderSelector();
    }

    /**
     * @return Configuration
     */
    public function getConfig()
    {
        return $this->config;
    }

    /**
     * Operation getPlayerProfile
     *
     * Gets the player's game profile
     *
     * @param  string $stripped_uuid The player UUID without hyphens (required)
     * @param  bool $unsigned When set to false, the signature data are sent (optional)
     *
     * @throws \com.github.asyncmc.mojang.sessions.php.server\ApiException on non-2xx response
     * @throws \InvalidArgumentException
     * @return \com.github.asyncmc.mojang.sessions.php.server\com.github.asyncmc.mojang.sessions.php.model\PlayerProfile|\com.github.asyncmc.mojang.sessions.php.server\com.github.asyncmc.mojang.sessions.php.model\SessionApiError
     */
    public function getPlayerProfile($stripped_uuid, $unsigned = null)
    {
        list($response) = $this->getPlayerProfileWithHttpInfo($stripped_uuid, $unsigned);
        return $response;
    }

    /**
     * Operation getPlayerProfileWithHttpInfo
     *
     * Gets the player's game profile
     *
     * @param  string $stripped_uuid The player UUID without hyphens (required)
     * @param  bool $unsigned When set to false, the signature data are sent (optional)
     *
     * @throws \com.github.asyncmc.mojang.sessions.php.server\ApiException on non-2xx response
     * @throws \InvalidArgumentException
     * @return array of \com.github.asyncmc.mojang.sessions.php.server\com.github.asyncmc.mojang.sessions.php.model\PlayerProfile|\com.github.asyncmc.mojang.sessions.php.server\com.github.asyncmc.mojang.sessions.php.model\SessionApiError, HTTP status code, HTTP response headers (array of strings)
     */
    public function getPlayerProfileWithHttpInfo($stripped_uuid, $unsigned = null)
    {
        $request = $this->getPlayerProfileRequest($stripped_uuid, $unsigned);

        try {
            $options = $this->createHttpClientOption();
            try {
                $response = $this->client->send($request, $options);
            } catch (RequestException $e) {
                throw new ApiException(
                    "[{$e->getCode()}] {$e->getMessage()}",
                    $e->getCode(),
                    $e->getResponse() ? $e->getResponse()->getHeaders() : null,
                    $e->getResponse() ? $e->getResponse()->getBody()->getContents() : null
                );
            }

            $statusCode = $response->getStatusCode();

            if ($statusCode < 200 || $statusCode > 299) {
                throw new ApiException(
                    sprintf(
                        '[%d] Error connecting to the API (%s)',
                        $statusCode,
                        $request->getUri()
                    ),
                    $statusCode,
                    $response->getHeaders(),
                    $response->getBody()
                );
            }

            $responseBody = $response->getBody();
            switch($statusCode) {
                case 200:
                    if ('\com.github.asyncmc.mojang.sessions.php.server\com.github.asyncmc.mojang.sessions.php.model\PlayerProfile' === '\SplFileObject') {
                        $content = $responseBody; //stream goes to serializer
                    } else {
                        $content = $responseBody->getContents();
                    }

                    return [
                        ObjectSerializer::deserialize($content, '\com.github.asyncmc.mojang.sessions.php.server\com.github.asyncmc.mojang.sessions.php.model\PlayerProfile', []),
                        $response->getStatusCode(),
                        $response->getHeaders()
                    ];
                case 400:
                    if ('\com.github.asyncmc.mojang.sessions.php.server\com.github.asyncmc.mojang.sessions.php.model\SessionApiError' === '\SplFileObject') {
                        $content = $responseBody; //stream goes to serializer
                    } else {
                        $content = $responseBody->getContents();
                    }

                    return [
                        ObjectSerializer::deserialize($content, '\com.github.asyncmc.mojang.sessions.php.server\com.github.asyncmc.mojang.sessions.php.model\SessionApiError', []),
                        $response->getStatusCode(),
                        $response->getHeaders()
                    ];
            }

            $returnType = '\com.github.asyncmc.mojang.sessions.php.server\com.github.asyncmc.mojang.sessions.php.model\PlayerProfile';
            $responseBody = $response->getBody();
            if ($returnType === '\SplFileObject') {
                $content = $responseBody; //stream goes to serializer
            } else {
                $content = $responseBody->getContents();
            }

            return [
                ObjectSerializer::deserialize($content, $returnType, []),
                $response->getStatusCode(),
                $response->getHeaders()
            ];

        } catch (ApiException $e) {
            switch ($e->getCode()) {
                case 200:
                    $data = ObjectSerializer::deserialize(
                        $e->getResponseBody(),
                        '\com.github.asyncmc.mojang.sessions.php.server\com.github.asyncmc.mojang.sessions.php.model\PlayerProfile',
                        $e->getResponseHeaders()
                    );
                    $e->setResponseObject($data);
                    break;
                case 400:
                    $data = ObjectSerializer::deserialize(
                        $e->getResponseBody(),
                        '\com.github.asyncmc.mojang.sessions.php.server\com.github.asyncmc.mojang.sessions.php.model\SessionApiError',
                        $e->getResponseHeaders()
                    );
                    $e->setResponseObject($data);
                    break;
            }
            throw $e;
        }
    }

    /**
     * Operation getPlayerProfileAsync
     *
     * Gets the player's game profile
     *
     * @param  string $stripped_uuid The player UUID without hyphens (required)
     * @param  bool $unsigned When set to false, the signature data are sent (optional)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Promise\PromiseInterface
     */
    public function getPlayerProfileAsync($stripped_uuid, $unsigned = null)
    {
        return $this->getPlayerProfileAsyncWithHttpInfo($stripped_uuid, $unsigned)
            ->then(
                function ($response) {
                    return $response[0];
                }
            );
    }

    /**
     * Operation getPlayerProfileAsyncWithHttpInfo
     *
     * Gets the player's game profile
     *
     * @param  string $stripped_uuid The player UUID without hyphens (required)
     * @param  bool $unsigned When set to false, the signature data are sent (optional)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Promise\PromiseInterface
     */
    public function getPlayerProfileAsyncWithHttpInfo($stripped_uuid, $unsigned = null)
    {
        $returnType = '\com.github.asyncmc.mojang.sessions.php.server\com.github.asyncmc.mojang.sessions.php.model\PlayerProfile';
        $request = $this->getPlayerProfileRequest($stripped_uuid, $unsigned);

        return $this->client
            ->sendAsync($request, $this->createHttpClientOption())
            ->then(
                function ($response) use ($returnType) {
                    $responseBody = $response->getBody();
                    if ($returnType === '\SplFileObject') {
                        $content = $responseBody; //stream goes to serializer
                    } else {
                        $content = $responseBody->getContents();
                    }

                    return [
                        ObjectSerializer::deserialize($content, $returnType, []),
                        $response->getStatusCode(),
                        $response->getHeaders()
                    ];
                },
                function ($exception) {
                    $response = $exception->getResponse();
                    $statusCode = $response->getStatusCode();
                    throw new ApiException(
                        sprintf(
                            '[%d] Error connecting to the API (%s)',
                            $statusCode,
                            $exception->getRequest()->getUri()
                        ),
                        $statusCode,
                        $response->getHeaders(),
                        $response->getBody()
                    );
                }
            );
    }

    /**
     * Create request for operation 'getPlayerProfile'
     *
     * @param  string $stripped_uuid The player UUID without hyphens (required)
     * @param  bool $unsigned When set to false, the signature data are sent (optional)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Psr7\Request
     */
    protected function getPlayerProfileRequest($stripped_uuid, $unsigned = null)
    {
        // verify the required parameter 'stripped_uuid' is set
        if ($stripped_uuid === null || (is_array($stripped_uuid) && count($stripped_uuid) === 0)) {
            throw new \InvalidArgumentException(
                'Missing the required parameter $stripped_uuid when calling getPlayerProfile'
            );
        }

        $resourcePath = '/session/minecraft/profile/{stripped_uuid}';
        $formParams = [];
        $queryParams = [];
        $headerParams = [];
        $httpBody = '';
        $multipart = false;

        // query params
        if ($unsigned !== null) {
            $queryParams['unsigned'] = ObjectSerializer::toQueryValue($unsigned);
        }

        // path params
        if ($stripped_uuid !== null) {
            $resourcePath = str_replace(
                '{' . 'stripped_uuid' . '}',
                ObjectSerializer::toPathValue($stripped_uuid),
                $resourcePath
            );
        }

        // body params
        $_tempBody = null;

        if ($multipart) {
            $headers = $this->headerSelector->selectHeadersForMultipart(
                ['application/json']
            );
        } else {
            $headers = $this->headerSelector->selectHeaders(
                ['application/json'],
                []
            );
        }

        // for model (json/xml)
        if (isset($_tempBody)) {
            // $_tempBody is the method argument, if present
            if ($headers['Content-Type'] === 'application/json') {
                $httpBody = \GuzzleHttp\json_encode(ObjectSerializer::sanitizeForSerialization($_tempBody));
            } else {
                $httpBody = $_tempBody;
            }
        } elseif (count($formParams) > 0) {
            if ($multipart) {
                $multipartContents = [];
                foreach ($formParams as $formParamName => $formParamValue) {
                    $multipartContents[] = [
                        'name' => $formParamName,
                        'contents' => $formParamValue
                    ];
                }
                // for HTTP post (form)
                $httpBody = new MultipartStream($multipartContents);

            } elseif ($headers['Content-Type'] === 'application/json') {
                $httpBody = \GuzzleHttp\json_encode($formParams);

            } else {
                // for HTTP post (form)
                $httpBody = \GuzzleHttp\Psr7\build_query($formParams);
            }
        }


        $defaultHeaders = [];
        if ($this->config->getUserAgent()) {
            $defaultHeaders['User-Agent'] = $this->config->getUserAgent();
        }

        $headers = array_merge(
            $defaultHeaders,
            $headerParams,
            $headers
        );

        $query = \GuzzleHttp\Psr7\build_query($queryParams);
        return new Request(
            'GET',
            $this->config->getHost() . $resourcePath . ($query ? "?{$query}" : ''),
            $headers,
            $httpBody
        );
    }

    /**
     * Create http client option
     *
     * @throws \RuntimeException on file opening failure
     * @return array of http client options
     */
    protected function createHttpClientOption()
    {
        $options = [];
        if ($this->config->getDebug()) {
            $options[RequestOptions::DEBUG] = fopen($this->config->getDebugFile(), 'a');
            if (!$options[RequestOptions::DEBUG]) {
                throw new \RuntimeException('Failed to open the debug file: ' . $this->config->getDebugFile());
            }
        }

        return $options;
    }
}