/*
 * Mojang API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2020-06-05
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.github.asyncmc.mojang.api.java.api;

import com.github.asyncmc.mojang.api.java.server.ApiCallback;
import com.github.asyncmc.mojang.api.java.server.ApiClient;
import com.github.asyncmc.mojang.api.java.server.ApiException;
import com.github.asyncmc.mojang.api.java.server.ApiResponse;
import com.github.asyncmc.mojang.api.java.server.Configuration;
import com.github.asyncmc.mojang.api.java.server.Pair;
import com.github.asyncmc.mojang.api.java.server.ProgressRequestBody;
import com.github.asyncmc.mojang.api.java.server.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.github.asyncmc.mojang.api.java.model.Error;
import java.io.File;
import com.github.asyncmc.mojang.api.java.model.SkinModel;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SkinOperationsApi {
    private ApiClient apiClient;

    public SkinOperationsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public SkinOperationsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for changePlayerSkin
     * @param strippedUuid The player UUID without hyphens (required)
     * @param url The URL which Mojang servers will download and apply the skin (required)
     * @param model  (optional, default to null)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call changePlayerSkinCall(String strippedUuid, String url, SkinModel model, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = new Object();

        // create path and map variables
        String localVarPath = "/user/profile/{stripped_uuid}/skin"
            .replaceAll("\\{" + "stripped_uuid" + "\\}", apiClient.escapeString(strippedUuid.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (model != null) {
            localVarFormParams.put("model", model);
        }

        if (url != null) {
            localVarFormParams.put("url", url);
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/x-www-form-urlencoded"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if (progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "PlayerAccessToken" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call changePlayerSkinValidateBeforeCall(String strippedUuid, String url, SkinModel model, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'strippedUuid' is set
        if (strippedUuid == null) {
            throw new ApiException("Missing the required parameter 'strippedUuid' when calling changePlayerSkin(Async)");
        }
        
        // verify the required parameter 'url' is set
        if (url == null) {
            throw new ApiException("Missing the required parameter 'url' when calling changePlayerSkin(Async)");
        }
        

        com.squareup.okhttp.Call call = changePlayerSkinCall(strippedUuid, url, model, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Changes the player skin by URL
     * This will set the skin for the selected profile, but Mojang&#39;s servers will fetch the skin from a URL. This will also work for legacy accounts.
     * @param strippedUuid The player UUID without hyphens (required)
     * @param url The URL which Mojang servers will download and apply the skin (required)
     * @param model  (optional, default to null)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void changePlayerSkin(String strippedUuid, String url, SkinModel model) throws ApiException {
        changePlayerSkinWithHttpInfo(strippedUuid, url, model);
    }

    /**
     * Changes the player skin by URL
     * This will set the skin for the selected profile, but Mojang&#39;s servers will fetch the skin from a URL. This will also work for legacy accounts.
     * @param strippedUuid The player UUID without hyphens (required)
     * @param url The URL which Mojang servers will download and apply the skin (required)
     * @param model  (optional, default to null)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> changePlayerSkinWithHttpInfo(String strippedUuid, String url, SkinModel model) throws ApiException {
        com.squareup.okhttp.Call call = changePlayerSkinValidateBeforeCall(strippedUuid, url, model, null, null);
        return apiClient.execute(call);
    }

    /**
     * Changes the player skin by URL (asynchronously)
     * This will set the skin for the selected profile, but Mojang&#39;s servers will fetch the skin from a URL. This will also work for legacy accounts.
     * @param strippedUuid The player UUID without hyphens (required)
     * @param url The URL which Mojang servers will download and apply the skin (required)
     * @param model  (optional, default to null)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call changePlayerSkinAsync(String strippedUuid, String url, SkinModel model, final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = changePlayerSkinValidateBeforeCall(strippedUuid, url, model, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for resetPlayerSkin
     * @param strippedUuid The player UUID without hyphens (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call resetPlayerSkinCall(String strippedUuid, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = new Object();

        // create path and map variables
        String localVarPath = "/user/profile/{stripped_uuid}/skin"
            .replaceAll("\\{" + "stripped_uuid" + "\\}", apiClient.escapeString(strippedUuid.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if (progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "PlayerAccessToken" };
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call resetPlayerSkinValidateBeforeCall(String strippedUuid, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'strippedUuid' is set
        if (strippedUuid == null) {
            throw new ApiException("Missing the required parameter 'strippedUuid' when calling resetPlayerSkin(Async)");
        }
        

        com.squareup.okhttp.Call call = resetPlayerSkinCall(strippedUuid, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Resets the player skin to default
     * 
     * @param strippedUuid The player UUID without hyphens (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void resetPlayerSkin(String strippedUuid) throws ApiException {
        resetPlayerSkinWithHttpInfo(strippedUuid);
    }

    /**
     * Resets the player skin to default
     * 
     * @param strippedUuid The player UUID without hyphens (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> resetPlayerSkinWithHttpInfo(String strippedUuid) throws ApiException {
        com.squareup.okhttp.Call call = resetPlayerSkinValidateBeforeCall(strippedUuid, null, null);
        return apiClient.execute(call);
    }

    /**
     * Resets the player skin to default (asynchronously)
     * 
     * @param strippedUuid The player UUID without hyphens (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call resetPlayerSkinAsync(String strippedUuid, final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = resetPlayerSkinValidateBeforeCall(strippedUuid, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for uploadPlayerSkin
     * @param strippedUuid The player UUID without hyphens (required)
     * @param file The skin image in PNG format (required)
     * @param model  (optional, default to null)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call uploadPlayerSkinCall(String strippedUuid, File file, SkinModel model, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = new Object();

        // create path and map variables
        String localVarPath = "/user/profile/{stripped_uuid}/skin"
            .replaceAll("\\{" + "stripped_uuid" + "\\}", apiClient.escapeString(strippedUuid.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (model != null) {
            localVarFormParams.put("model", model);
        }

        if (file != null) {
            localVarFormParams.put("file", file);
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "multipart/form-data"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if (progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "PlayerAccessToken" };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call uploadPlayerSkinValidateBeforeCall(String strippedUuid, File file, SkinModel model, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'strippedUuid' is set
        if (strippedUuid == null) {
            throw new ApiException("Missing the required parameter 'strippedUuid' when calling uploadPlayerSkin(Async)");
        }
        
        // verify the required parameter 'file' is set
        if (file == null) {
            throw new ApiException("Missing the required parameter 'file' when calling uploadPlayerSkin(Async)");
        }
        

        com.squareup.okhttp.Call call = uploadPlayerSkinCall(strippedUuid, file, model, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Changes the player skin by upload
     * This uploads a skin to Mojang&#39;s servers. It also sets the users skin. This works on legacy counts as well.
     * @param strippedUuid The player UUID without hyphens (required)
     * @param file The skin image in PNG format (required)
     * @param model  (optional, default to null)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void uploadPlayerSkin(String strippedUuid, File file, SkinModel model) throws ApiException {
        uploadPlayerSkinWithHttpInfo(strippedUuid, file, model);
    }

    /**
     * Changes the player skin by upload
     * This uploads a skin to Mojang&#39;s servers. It also sets the users skin. This works on legacy counts as well.
     * @param strippedUuid The player UUID without hyphens (required)
     * @param file The skin image in PNG format (required)
     * @param model  (optional, default to null)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> uploadPlayerSkinWithHttpInfo(String strippedUuid, File file, SkinModel model) throws ApiException {
        com.squareup.okhttp.Call call = uploadPlayerSkinValidateBeforeCall(strippedUuid, file, model, null, null);
        return apiClient.execute(call);
    }

    /**
     * Changes the player skin by upload (asynchronously)
     * This uploads a skin to Mojang&#39;s servers. It also sets the users skin. This works on legacy counts as well.
     * @param strippedUuid The player UUID without hyphens (required)
     * @param file The skin image in PNG format (required)
     * @param model  (optional, default to null)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call uploadPlayerSkinAsync(String strippedUuid, File file, SkinModel model, final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = uploadPlayerSkinValidateBeforeCall(strippedUuid, file, model, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
}
