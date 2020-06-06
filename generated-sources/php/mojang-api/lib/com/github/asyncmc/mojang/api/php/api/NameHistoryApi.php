<?php
/**
 * NameHistoryApi
 * PHP version 5
 *
 * @category Class
 * @package  com.github.asyncmc.mojang.api.php.server
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 */

/**
 * Mojang API
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

namespace com.github.asyncmc.mojang.api.php.server\com.github.asyncmc.mojang.api.php.api;

use GuzzleHttp\Client;
use GuzzleHttp\ClientInterface;
use GuzzleHttp\Exception\RequestException;
use GuzzleHttp\Psr7\MultipartStream;
use GuzzleHttp\Psr7\Request;
use GuzzleHttp\RequestOptions;
use com.github.asyncmc.mojang.api.php.server\ApiException;
use com.github.asyncmc.mojang.api.php.server\Configuration;
use com.github.asyncmc.mojang.api.php.server\HeaderSelector;
use com.github.asyncmc.mojang.api.php.server\ObjectSerializer;

/**
 * NameHistoryApi Class Doc Comment
 *
 * @category Class
 * @package  com.github.asyncmc.mojang.api.php.server
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 */
class NameHistoryApi
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
     * Operation findUniqueIdsByName
     *
     * Find the current UUID of multiple players at once
     *
     * @param  string[] $request_body Array with the player names (required)
     *
     * @throws \com.github.asyncmc.mojang.api.php.server\ApiException on non-2xx response
     * @throws \InvalidArgumentException
     * @return \com.github.asyncmc.mojang.api.php.server\com.github.asyncmc.mojang.api.php.model\CurrentPlayerIDs[]
     */
    public function findUniqueIdsByName($request_body)
    {
        list($response) = $this->findUniqueIdsByNameWithHttpInfo($request_body);
        return $response;
    }

    /**
     * Operation findUniqueIdsByNameWithHttpInfo
     *
     * Find the current UUID of multiple players at once
     *
     * @param  string[] $request_body Array with the player names (required)
     *
     * @throws \com.github.asyncmc.mojang.api.php.server\ApiException on non-2xx response
     * @throws \InvalidArgumentException
     * @return array of \com.github.asyncmc.mojang.api.php.server\com.github.asyncmc.mojang.api.php.model\CurrentPlayerIDs[], HTTP status code, HTTP response headers (array of strings)
     */
    public function findUniqueIdsByNameWithHttpInfo($request_body)
    {
        $request = $this->findUniqueIdsByNameRequest($request_body);

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
                    if ('\com.github.asyncmc.mojang.api.php.server\com.github.asyncmc.mojang.api.php.model\CurrentPlayerIDs[]' === '\SplFileObject') {
                        $content = $responseBody; //stream goes to serializer
                    } else {
                        $content = $responseBody->getContents();
                    }

                    return [
                        ObjectSerializer::deserialize($content, '\com.github.asyncmc.mojang.api.php.server\com.github.asyncmc.mojang.api.php.model\CurrentPlayerIDs[]', []),
                        $response->getStatusCode(),
                        $response->getHeaders()
                    ];
            }

            $returnType = '\com.github.asyncmc.mojang.api.php.server\com.github.asyncmc.mojang.api.php.model\CurrentPlayerIDs[]';
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
                        '\com.github.asyncmc.mojang.api.php.server\com.github.asyncmc.mojang.api.php.model\CurrentPlayerIDs[]',
                        $e->getResponseHeaders()
                    );
                    $e->setResponseObject($data);
                    break;
            }
            throw $e;
        }
    }

    /**
     * Operation findUniqueIdsByNameAsync
     *
     * Find the current UUID of multiple players at once
     *
     * @param  string[] $request_body Array with the player names (required)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Promise\PromiseInterface
     */
    public function findUniqueIdsByNameAsync($request_body)
    {
        return $this->findUniqueIdsByNameAsyncWithHttpInfo($request_body)
            ->then(
                function ($response) {
                    return $response[0];
                }
            );
    }

    /**
     * Operation findUniqueIdsByNameAsyncWithHttpInfo
     *
     * Find the current UUID of multiple players at once
     *
     * @param  string[] $request_body Array with the player names (required)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Promise\PromiseInterface
     */
    public function findUniqueIdsByNameAsyncWithHttpInfo($request_body)
    {
        $returnType = '\com.github.asyncmc.mojang.api.php.server\com.github.asyncmc.mojang.api.php.model\CurrentPlayerIDs[]';
        $request = $this->findUniqueIdsByNameRequest($request_body);

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
     * Create request for operation 'findUniqueIdsByName'
     *
     * @param  string[] $request_body Array with the player names (required)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Psr7\Request
     */
    protected function findUniqueIdsByNameRequest($request_body)
    {
        // verify the required parameter 'request_body' is set
        if ($request_body === null || (is_array($request_body) && count($request_body) === 0)) {
            throw new \InvalidArgumentException(
                'Missing the required parameter $request_body when calling findUniqueIdsByName'
            );
        }

        $resourcePath = '/profiles/minecraft';
        $formParams = [];
        $queryParams = [];
        $headerParams = [];
        $httpBody = '';
        $multipart = false;



        // body params
        $_tempBody = null;
        if (isset($request_body)) {
            $_tempBody = $request_body;
        }

        if ($multipart) {
            $headers = $this->headerSelector->selectHeadersForMultipart(
                ['application/json']
            );
        } else {
            $headers = $this->headerSelector->selectHeaders(
                ['application/json'],
                ['application/json']
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
            'POST',
            $this->config->getHost() . $resourcePath . ($query ? "?{$query}" : ''),
            $headers,
            $httpBody
        );
    }

    /**
     * Operation getNameHistory
     *
     * Gets the full player's name history
     *
     * @param  string $stripped_uuid The player UUID without hyphens (required)
     *
     * @throws \com.github.asyncmc.mojang.api.php.server\ApiException on non-2xx response
     * @throws \InvalidArgumentException
     * @return \com.github.asyncmc.mojang.api.php.server\com.github.asyncmc.mojang.api.php.model\NameChange[]
     */
    public function getNameHistory($stripped_uuid)
    {
        list($response) = $this->getNameHistoryWithHttpInfo($stripped_uuid);
        return $response;
    }

    /**
     * Operation getNameHistoryWithHttpInfo
     *
     * Gets the full player's name history
     *
     * @param  string $stripped_uuid The player UUID without hyphens (required)
     *
     * @throws \com.github.asyncmc.mojang.api.php.server\ApiException on non-2xx response
     * @throws \InvalidArgumentException
     * @return array of \com.github.asyncmc.mojang.api.php.server\com.github.asyncmc.mojang.api.php.model\NameChange[], HTTP status code, HTTP response headers (array of strings)
     */
    public function getNameHistoryWithHttpInfo($stripped_uuid)
    {
        $request = $this->getNameHistoryRequest($stripped_uuid);

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
                    if ('\com.github.asyncmc.mojang.api.php.server\com.github.asyncmc.mojang.api.php.model\NameChange[]' === '\SplFileObject') {
                        $content = $responseBody; //stream goes to serializer
                    } else {
                        $content = $responseBody->getContents();
                    }

                    return [
                        ObjectSerializer::deserialize($content, '\com.github.asyncmc.mojang.api.php.server\com.github.asyncmc.mojang.api.php.model\NameChange[]', []),
                        $response->getStatusCode(),
                        $response->getHeaders()
                    ];
            }

            $returnType = '\com.github.asyncmc.mojang.api.php.server\com.github.asyncmc.mojang.api.php.model\NameChange[]';
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
                        '\com.github.asyncmc.mojang.api.php.server\com.github.asyncmc.mojang.api.php.model\NameChange[]',
                        $e->getResponseHeaders()
                    );
                    $e->setResponseObject($data);
                    break;
            }
            throw $e;
        }
    }

    /**
     * Operation getNameHistoryAsync
     *
     * Gets the full player's name history
     *
     * @param  string $stripped_uuid The player UUID without hyphens (required)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Promise\PromiseInterface
     */
    public function getNameHistoryAsync($stripped_uuid)
    {
        return $this->getNameHistoryAsyncWithHttpInfo($stripped_uuid)
            ->then(
                function ($response) {
                    return $response[0];
                }
            );
    }

    /**
     * Operation getNameHistoryAsyncWithHttpInfo
     *
     * Gets the full player's name history
     *
     * @param  string $stripped_uuid The player UUID without hyphens (required)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Promise\PromiseInterface
     */
    public function getNameHistoryAsyncWithHttpInfo($stripped_uuid)
    {
        $returnType = '\com.github.asyncmc.mojang.api.php.server\com.github.asyncmc.mojang.api.php.model\NameChange[]';
        $request = $this->getNameHistoryRequest($stripped_uuid);

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
     * Create request for operation 'getNameHistory'
     *
     * @param  string $stripped_uuid The player UUID without hyphens (required)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Psr7\Request
     */
    protected function getNameHistoryRequest($stripped_uuid)
    {
        // verify the required parameter 'stripped_uuid' is set
        if ($stripped_uuid === null || (is_array($stripped_uuid) && count($stripped_uuid) === 0)) {
            throw new \InvalidArgumentException(
                'Missing the required parameter $stripped_uuid when calling getNameHistory'
            );
        }

        $resourcePath = '/user/profiles/{stripped_uuid}/names';
        $formParams = [];
        $queryParams = [];
        $headerParams = [];
        $httpBody = '';
        $multipart = false;


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
     * Operation getUniqueIdByName
     *
     * Find the UUID by name
     *
     * @param  string $username The username in a given time, or in present if \&quot;at\&quot; is not sent (required)
     * @param  int $at Find the username in a given time, when 0 selects the original name however, it only works if the name was changed at least once, or if the account is legacy. The time is an UNIX timestamp (without milliseconds) (optional)
     *
     * @throws \com.github.asyncmc.mojang.api.php.server\ApiException on non-2xx response
     * @throws \InvalidArgumentException
     * @return \com.github.asyncmc.mojang.api.php.server\com.github.asyncmc.mojang.api.php.model\CurrentPlayerIDs|\com.github.asyncmc.mojang.api.php.server\com.github.asyncmc.mojang.api.php.model\Error
     */
    public function getUniqueIdByName($username, $at = null)
    {
        list($response) = $this->getUniqueIdByNameWithHttpInfo($username, $at);
        return $response;
    }

    /**
     * Operation getUniqueIdByNameWithHttpInfo
     *
     * Find the UUID by name
     *
     * @param  string $username The username in a given time, or in present if \&quot;at\&quot; is not sent (required)
     * @param  int $at Find the username in a given time, when 0 selects the original name however, it only works if the name was changed at least once, or if the account is legacy. The time is an UNIX timestamp (without milliseconds) (optional)
     *
     * @throws \com.github.asyncmc.mojang.api.php.server\ApiException on non-2xx response
     * @throws \InvalidArgumentException
     * @return array of \com.github.asyncmc.mojang.api.php.server\com.github.asyncmc.mojang.api.php.model\CurrentPlayerIDs|\com.github.asyncmc.mojang.api.php.server\com.github.asyncmc.mojang.api.php.model\Error, HTTP status code, HTTP response headers (array of strings)
     */
    public function getUniqueIdByNameWithHttpInfo($username, $at = null)
    {
        $request = $this->getUniqueIdByNameRequest($username, $at);

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
                    if ('\com.github.asyncmc.mojang.api.php.server\com.github.asyncmc.mojang.api.php.model\CurrentPlayerIDs' === '\SplFileObject') {
                        $content = $responseBody; //stream goes to serializer
                    } else {
                        $content = $responseBody->getContents();
                    }

                    return [
                        ObjectSerializer::deserialize($content, '\com.github.asyncmc.mojang.api.php.server\com.github.asyncmc.mojang.api.php.model\CurrentPlayerIDs', []),
                        $response->getStatusCode(),
                        $response->getHeaders()
                    ];
                case 400:
                    if ('\com.github.asyncmc.mojang.api.php.server\com.github.asyncmc.mojang.api.php.model\Error' === '\SplFileObject') {
                        $content = $responseBody; //stream goes to serializer
                    } else {
                        $content = $responseBody->getContents();
                    }

                    return [
                        ObjectSerializer::deserialize($content, '\com.github.asyncmc.mojang.api.php.server\com.github.asyncmc.mojang.api.php.model\Error', []),
                        $response->getStatusCode(),
                        $response->getHeaders()
                    ];
            }

            $returnType = '\com.github.asyncmc.mojang.api.php.server\com.github.asyncmc.mojang.api.php.model\CurrentPlayerIDs';
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
                        '\com.github.asyncmc.mojang.api.php.server\com.github.asyncmc.mojang.api.php.model\CurrentPlayerIDs',
                        $e->getResponseHeaders()
                    );
                    $e->setResponseObject($data);
                    break;
                case 400:
                    $data = ObjectSerializer::deserialize(
                        $e->getResponseBody(),
                        '\com.github.asyncmc.mojang.api.php.server\com.github.asyncmc.mojang.api.php.model\Error',
                        $e->getResponseHeaders()
                    );
                    $e->setResponseObject($data);
                    break;
            }
            throw $e;
        }
    }

    /**
     * Operation getUniqueIdByNameAsync
     *
     * Find the UUID by name
     *
     * @param  string $username The username in a given time, or in present if \&quot;at\&quot; is not sent (required)
     * @param  int $at Find the username in a given time, when 0 selects the original name however, it only works if the name was changed at least once, or if the account is legacy. The time is an UNIX timestamp (without milliseconds) (optional)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Promise\PromiseInterface
     */
    public function getUniqueIdByNameAsync($username, $at = null)
    {
        return $this->getUniqueIdByNameAsyncWithHttpInfo($username, $at)
            ->then(
                function ($response) {
                    return $response[0];
                }
            );
    }

    /**
     * Operation getUniqueIdByNameAsyncWithHttpInfo
     *
     * Find the UUID by name
     *
     * @param  string $username The username in a given time, or in present if \&quot;at\&quot; is not sent (required)
     * @param  int $at Find the username in a given time, when 0 selects the original name however, it only works if the name was changed at least once, or if the account is legacy. The time is an UNIX timestamp (without milliseconds) (optional)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Promise\PromiseInterface
     */
    public function getUniqueIdByNameAsyncWithHttpInfo($username, $at = null)
    {
        $returnType = '\com.github.asyncmc.mojang.api.php.server\com.github.asyncmc.mojang.api.php.model\CurrentPlayerIDs';
        $request = $this->getUniqueIdByNameRequest($username, $at);

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
     * Create request for operation 'getUniqueIdByName'
     *
     * @param  string $username The username in a given time, or in present if \&quot;at\&quot; is not sent (required)
     * @param  int $at Find the username in a given time, when 0 selects the original name however, it only works if the name was changed at least once, or if the account is legacy. The time is an UNIX timestamp (without milliseconds) (optional)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Psr7\Request
     */
    protected function getUniqueIdByNameRequest($username, $at = null)
    {
        // verify the required parameter 'username' is set
        if ($username === null || (is_array($username) && count($username) === 0)) {
            throw new \InvalidArgumentException(
                'Missing the required parameter $username when calling getUniqueIdByName'
            );
        }

        $resourcePath = '/users/profiles/minecraft/{username}';
        $formParams = [];
        $queryParams = [];
        $headerParams = [];
        $httpBody = '';
        $multipart = false;

        // query params
        if ($at !== null) {
            $queryParams['at'] = ObjectSerializer::toQueryValue($at);
        }

        // path params
        if ($username !== null) {
            $resourcePath = str_replace(
                '{' . 'username' . '}',
                ObjectSerializer::toPathValue($username),
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
