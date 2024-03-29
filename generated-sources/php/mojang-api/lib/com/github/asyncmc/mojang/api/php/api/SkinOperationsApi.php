<?php
/**
 * SkinOperationsApi
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
 * SkinOperationsApi Class Doc Comment
 *
 * @category Class
 * @package  com.github.asyncmc.mojang.api.php.server
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 */
class SkinOperationsApi
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
     * Operation changePlayerSkin
     *
     * Changes the player skin by URL
     *
     * @param  string $stripped_uuid The player UUID without hyphens (required)
     * @param  string $url The URL which Mojang servers will download and apply the skin (required)
     * @param  \com.github.asyncmc.mojang.api.php.server\com.github.asyncmc.mojang.api.php.model\SkinModel $model model (optional)
     *
     * @throws \com.github.asyncmc.mojang.api.php.server\ApiException on non-2xx response
     * @throws \InvalidArgumentException
     * @return void
     */
    public function changePlayerSkin($stripped_uuid, $url, $model = null)
    {
        $this->changePlayerSkinWithHttpInfo($stripped_uuid, $url, $model);
    }

    /**
     * Operation changePlayerSkinWithHttpInfo
     *
     * Changes the player skin by URL
     *
     * @param  string $stripped_uuid The player UUID without hyphens (required)
     * @param  string $url The URL which Mojang servers will download and apply the skin (required)
     * @param  \com.github.asyncmc.mojang.api.php.server\com.github.asyncmc.mojang.api.php.model\SkinModel $model (optional)
     *
     * @throws \com.github.asyncmc.mojang.api.php.server\ApiException on non-2xx response
     * @throws \InvalidArgumentException
     * @return array of null, HTTP status code, HTTP response headers (array of strings)
     */
    public function changePlayerSkinWithHttpInfo($stripped_uuid, $url, $model = null)
    {
        $request = $this->changePlayerSkinRequest($stripped_uuid, $url, $model);

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

            return [null, $statusCode, $response->getHeaders()];

        } catch (ApiException $e) {
            switch ($e->getCode()) {
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
     * Operation changePlayerSkinAsync
     *
     * Changes the player skin by URL
     *
     * @param  string $stripped_uuid The player UUID without hyphens (required)
     * @param  string $url The URL which Mojang servers will download and apply the skin (required)
     * @param  \com.github.asyncmc.mojang.api.php.server\com.github.asyncmc.mojang.api.php.model\SkinModel $model (optional)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Promise\PromiseInterface
     */
    public function changePlayerSkinAsync($stripped_uuid, $url, $model = null)
    {
        return $this->changePlayerSkinAsyncWithHttpInfo($stripped_uuid, $url, $model)
            ->then(
                function ($response) {
                    return $response[0];
                }
            );
    }

    /**
     * Operation changePlayerSkinAsyncWithHttpInfo
     *
     * Changes the player skin by URL
     *
     * @param  string $stripped_uuid The player UUID without hyphens (required)
     * @param  string $url The URL which Mojang servers will download and apply the skin (required)
     * @param  \com.github.asyncmc.mojang.api.php.server\com.github.asyncmc.mojang.api.php.model\SkinModel $model (optional)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Promise\PromiseInterface
     */
    public function changePlayerSkinAsyncWithHttpInfo($stripped_uuid, $url, $model = null)
    {
        $returnType = '';
        $request = $this->changePlayerSkinRequest($stripped_uuid, $url, $model);

        return $this->client
            ->sendAsync($request, $this->createHttpClientOption())
            ->then(
                function ($response) use ($returnType) {
                    return [null, $response->getStatusCode(), $response->getHeaders()];
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
     * Create request for operation 'changePlayerSkin'
     *
     * @param  string $stripped_uuid The player UUID without hyphens (required)
     * @param  string $url The URL which Mojang servers will download and apply the skin (required)
     * @param  \com.github.asyncmc.mojang.api.php.server\com.github.asyncmc.mojang.api.php.model\SkinModel $model (optional)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Psr7\Request
     */
    protected function changePlayerSkinRequest($stripped_uuid, $url, $model = null)
    {
        // verify the required parameter 'stripped_uuid' is set
        if ($stripped_uuid === null || (is_array($stripped_uuid) && count($stripped_uuid) === 0)) {
            throw new \InvalidArgumentException(
                'Missing the required parameter $stripped_uuid when calling changePlayerSkin'
            );
        }
        // verify the required parameter 'url' is set
        if ($url === null || (is_array($url) && count($url) === 0)) {
            throw new \InvalidArgumentException(
                'Missing the required parameter $url when calling changePlayerSkin'
            );
        }

        $resourcePath = '/user/profile/{stripped_uuid}/skin';
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

        // form params
        if ($model !== null) {
            $formParams['model'] = ObjectSerializer::toFormValue($model);
        }
        // form params
        if ($url !== null) {
            $formParams['url'] = ObjectSerializer::toFormValue($url);
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
                ['application/x-www-form-urlencoded']
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

        // this endpoint requires HTTP basic authentication
        if ($this->config->getUsername() !== null || $this->config->getPassword() !== null) {
            $headers['Authorization'] = 'Basic ' . base64_encode($this->config->getUsername() . ":" . $this->config->getPassword());
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
     * Operation resetPlayerSkin
     *
     * Resets the player skin to default
     *
     * @param  string $stripped_uuid The player UUID without hyphens (required)
     *
     * @throws \com.github.asyncmc.mojang.api.php.server\ApiException on non-2xx response
     * @throws \InvalidArgumentException
     * @return void
     */
    public function resetPlayerSkin($stripped_uuid)
    {
        $this->resetPlayerSkinWithHttpInfo($stripped_uuid);
    }

    /**
     * Operation resetPlayerSkinWithHttpInfo
     *
     * Resets the player skin to default
     *
     * @param  string $stripped_uuid The player UUID without hyphens (required)
     *
     * @throws \com.github.asyncmc.mojang.api.php.server\ApiException on non-2xx response
     * @throws \InvalidArgumentException
     * @return array of null, HTTP status code, HTTP response headers (array of strings)
     */
    public function resetPlayerSkinWithHttpInfo($stripped_uuid)
    {
        $request = $this->resetPlayerSkinRequest($stripped_uuid);

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

            return [null, $statusCode, $response->getHeaders()];

        } catch (ApiException $e) {
            switch ($e->getCode()) {
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
     * Operation resetPlayerSkinAsync
     *
     * Resets the player skin to default
     *
     * @param  string $stripped_uuid The player UUID without hyphens (required)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Promise\PromiseInterface
     */
    public function resetPlayerSkinAsync($stripped_uuid)
    {
        return $this->resetPlayerSkinAsyncWithHttpInfo($stripped_uuid)
            ->then(
                function ($response) {
                    return $response[0];
                }
            );
    }

    /**
     * Operation resetPlayerSkinAsyncWithHttpInfo
     *
     * Resets the player skin to default
     *
     * @param  string $stripped_uuid The player UUID without hyphens (required)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Promise\PromiseInterface
     */
    public function resetPlayerSkinAsyncWithHttpInfo($stripped_uuid)
    {
        $returnType = '';
        $request = $this->resetPlayerSkinRequest($stripped_uuid);

        return $this->client
            ->sendAsync($request, $this->createHttpClientOption())
            ->then(
                function ($response) use ($returnType) {
                    return [null, $response->getStatusCode(), $response->getHeaders()];
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
     * Create request for operation 'resetPlayerSkin'
     *
     * @param  string $stripped_uuid The player UUID without hyphens (required)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Psr7\Request
     */
    protected function resetPlayerSkinRequest($stripped_uuid)
    {
        // verify the required parameter 'stripped_uuid' is set
        if ($stripped_uuid === null || (is_array($stripped_uuid) && count($stripped_uuid) === 0)) {
            throw new \InvalidArgumentException(
                'Missing the required parameter $stripped_uuid when calling resetPlayerSkin'
            );
        }

        $resourcePath = '/user/profile/{stripped_uuid}/skin';
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

        // this endpoint requires HTTP basic authentication
        if ($this->config->getUsername() !== null || $this->config->getPassword() !== null) {
            $headers['Authorization'] = 'Basic ' . base64_encode($this->config->getUsername() . ":" . $this->config->getPassword());
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
            'DELETE',
            $this->config->getHost() . $resourcePath . ($query ? "?{$query}" : ''),
            $headers,
            $httpBody
        );
    }

    /**
     * Operation uploadPlayerSkin
     *
     * Changes the player skin by upload
     *
     * @param  string $stripped_uuid The player UUID without hyphens (required)
     * @param  \SplFileObject $file The skin image in PNG format (required)
     * @param  \com.github.asyncmc.mojang.api.php.server\com.github.asyncmc.mojang.api.php.model\SkinModel $model model (optional)
     *
     * @throws \com.github.asyncmc.mojang.api.php.server\ApiException on non-2xx response
     * @throws \InvalidArgumentException
     * @return void
     */
    public function uploadPlayerSkin($stripped_uuid, $file, $model = null)
    {
        $this->uploadPlayerSkinWithHttpInfo($stripped_uuid, $file, $model);
    }

    /**
     * Operation uploadPlayerSkinWithHttpInfo
     *
     * Changes the player skin by upload
     *
     * @param  string $stripped_uuid The player UUID without hyphens (required)
     * @param  \SplFileObject $file The skin image in PNG format (required)
     * @param  \com.github.asyncmc.mojang.api.php.server\com.github.asyncmc.mojang.api.php.model\SkinModel $model (optional)
     *
     * @throws \com.github.asyncmc.mojang.api.php.server\ApiException on non-2xx response
     * @throws \InvalidArgumentException
     * @return array of null, HTTP status code, HTTP response headers (array of strings)
     */
    public function uploadPlayerSkinWithHttpInfo($stripped_uuid, $file, $model = null)
    {
        $request = $this->uploadPlayerSkinRequest($stripped_uuid, $file, $model);

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

            return [null, $statusCode, $response->getHeaders()];

        } catch (ApiException $e) {
            switch ($e->getCode()) {
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
     * Operation uploadPlayerSkinAsync
     *
     * Changes the player skin by upload
     *
     * @param  string $stripped_uuid The player UUID without hyphens (required)
     * @param  \SplFileObject $file The skin image in PNG format (required)
     * @param  \com.github.asyncmc.mojang.api.php.server\com.github.asyncmc.mojang.api.php.model\SkinModel $model (optional)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Promise\PromiseInterface
     */
    public function uploadPlayerSkinAsync($stripped_uuid, $file, $model = null)
    {
        return $this->uploadPlayerSkinAsyncWithHttpInfo($stripped_uuid, $file, $model)
            ->then(
                function ($response) {
                    return $response[0];
                }
            );
    }

    /**
     * Operation uploadPlayerSkinAsyncWithHttpInfo
     *
     * Changes the player skin by upload
     *
     * @param  string $stripped_uuid The player UUID without hyphens (required)
     * @param  \SplFileObject $file The skin image in PNG format (required)
     * @param  \com.github.asyncmc.mojang.api.php.server\com.github.asyncmc.mojang.api.php.model\SkinModel $model (optional)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Promise\PromiseInterface
     */
    public function uploadPlayerSkinAsyncWithHttpInfo($stripped_uuid, $file, $model = null)
    {
        $returnType = '';
        $request = $this->uploadPlayerSkinRequest($stripped_uuid, $file, $model);

        return $this->client
            ->sendAsync($request, $this->createHttpClientOption())
            ->then(
                function ($response) use ($returnType) {
                    return [null, $response->getStatusCode(), $response->getHeaders()];
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
     * Create request for operation 'uploadPlayerSkin'
     *
     * @param  string $stripped_uuid The player UUID without hyphens (required)
     * @param  \SplFileObject $file The skin image in PNG format (required)
     * @param  \com.github.asyncmc.mojang.api.php.server\com.github.asyncmc.mojang.api.php.model\SkinModel $model (optional)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Psr7\Request
     */
    protected function uploadPlayerSkinRequest($stripped_uuid, $file, $model = null)
    {
        // verify the required parameter 'stripped_uuid' is set
        if ($stripped_uuid === null || (is_array($stripped_uuid) && count($stripped_uuid) === 0)) {
            throw new \InvalidArgumentException(
                'Missing the required parameter $stripped_uuid when calling uploadPlayerSkin'
            );
        }
        // verify the required parameter 'file' is set
        if ($file === null || (is_array($file) && count($file) === 0)) {
            throw new \InvalidArgumentException(
                'Missing the required parameter $file when calling uploadPlayerSkin'
            );
        }

        $resourcePath = '/user/profile/{stripped_uuid}/skin';
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

        // form params
        if ($model !== null) {
            $formParams['model'] = ObjectSerializer::toFormValue($model);
        }
        // form params
        if ($file !== null) {
            $multipart = true;
            $formParams['file'] = \GuzzleHttp\Psr7\try_fopen(ObjectSerializer::toFormValue($file), 'rb');
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
                ['multipart/form-data']
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

        // this endpoint requires HTTP basic authentication
        if ($this->config->getUsername() !== null || $this->config->getPassword() !== null) {
            $headers['Authorization'] = 'Basic ' . base64_encode($this->config->getUsername() . ":" . $this->config->getPassword());
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
            'PUT',
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
