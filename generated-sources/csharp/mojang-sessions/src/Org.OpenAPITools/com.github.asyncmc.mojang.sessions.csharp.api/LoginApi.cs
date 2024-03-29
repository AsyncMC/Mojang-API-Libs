/* 
 * Mojang Session API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2020-06-05
 * 
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */

using System;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using RestSharp;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.com.github.asyncmc.mojang.sessions.csharp.model;

namespace Org.OpenAPITools.com.github.asyncmc.mojang.sessions.csharp.api
{
    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface ILoginApi : IApiAccessor
    {
        #region Synchronous Operations
        /// <summary>
        /// Gets the player&#39;s game profile
        /// </summary>
        /// <remarks>
        /// This will return the player&#39;s username plus any additional information about them (e.g. skins). This has a much stricter rate limit: You can request the same profile once per minute, however you can send as many unique requests as you like.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="strippedUuid">The player UUID without hyphens</param>
        /// <param name="unsigned">When set to false, the signature data are sent (optional)</param>
        /// <returns>PlayerProfile</returns>
        PlayerProfile GetPlayerProfile (string strippedUuid, bool? unsigned = null);

        /// <summary>
        /// Gets the player&#39;s game profile
        /// </summary>
        /// <remarks>
        /// This will return the player&#39;s username plus any additional information about them (e.g. skins). This has a much stricter rate limit: You can request the same profile once per minute, however you can send as many unique requests as you like.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="strippedUuid">The player UUID without hyphens</param>
        /// <param name="unsigned">When set to false, the signature data are sent (optional)</param>
        /// <returns>ApiResponse of PlayerProfile</returns>
        ApiResponse<PlayerProfile> GetPlayerProfileWithHttpInfo (string strippedUuid, bool? unsigned = null);
        #endregion Synchronous Operations
        #region Asynchronous Operations
        /// <summary>
        /// Gets the player&#39;s game profile
        /// </summary>
        /// <remarks>
        /// This will return the player&#39;s username plus any additional information about them (e.g. skins). This has a much stricter rate limit: You can request the same profile once per minute, however you can send as many unique requests as you like.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="strippedUuid">The player UUID without hyphens</param>
        /// <param name="unsigned">When set to false, the signature data are sent (optional)</param>
        /// <returns>Task of PlayerProfile</returns>
        System.Threading.Tasks.Task<PlayerProfile> GetPlayerProfileAsync (string strippedUuid, bool? unsigned = null);

        /// <summary>
        /// Gets the player&#39;s game profile
        /// </summary>
        /// <remarks>
        /// This will return the player&#39;s username plus any additional information about them (e.g. skins). This has a much stricter rate limit: You can request the same profile once per minute, however you can send as many unique requests as you like.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="strippedUuid">The player UUID without hyphens</param>
        /// <param name="unsigned">When set to false, the signature data are sent (optional)</param>
        /// <returns>Task of ApiResponse (PlayerProfile)</returns>
        System.Threading.Tasks.Task<ApiResponse<PlayerProfile>> GetPlayerProfileAsyncWithHttpInfo (string strippedUuid, bool? unsigned = null);
        #endregion Asynchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public partial class LoginApi : ILoginApi
    {
        private Org.OpenAPITools.Client.ExceptionFactory _exceptionFactory = (name, response) => null;

        /// <summary>
        /// Initializes a new instance of the <see cref="LoginApi"/> class.
        /// </summary>
        /// <returns></returns>
        public LoginApi(String basePath)
        {
            this.Configuration = new Org.OpenAPITools.Client.Configuration { BasePath = basePath };

            ExceptionFactory = Org.OpenAPITools.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="LoginApi"/> class
        /// </summary>
        /// <returns></returns>
        public LoginApi()
        {
            this.Configuration = Org.OpenAPITools.Client.Configuration.Default;

            ExceptionFactory = Org.OpenAPITools.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="LoginApi"/> class
        /// using Configuration object
        /// </summary>
        /// <param name="configuration">An instance of Configuration</param>
        /// <returns></returns>
        public LoginApi(Org.OpenAPITools.Client.Configuration configuration = null)
        {
            if (configuration == null) // use the default one in Configuration
                this.Configuration = Org.OpenAPITools.Client.Configuration.Default;
            else
                this.Configuration = configuration;

            ExceptionFactory = Org.OpenAPITools.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Gets the base path of the API client.
        /// </summary>
        /// <value>The base path</value>
        public String GetBasePath()
        {
            return this.Configuration.ApiClient.RestClient.BaseUrl.ToString();
        }

        /// <summary>
        /// Sets the base path of the API client.
        /// </summary>
        /// <value>The base path</value>
        [Obsolete("SetBasePath is deprecated, please do 'Configuration.ApiClient = new ApiClient(\"http://new-path\")' instead.")]
        public void SetBasePath(String basePath)
        {
            // do nothing
        }

        /// <summary>
        /// Gets or sets the configuration object
        /// </summary>
        /// <value>An instance of the Configuration</value>
        public Org.OpenAPITools.Client.Configuration Configuration {get; set;}

        /// <summary>
        /// Provides a factory method hook for the creation of exceptions.
        /// </summary>
        public Org.OpenAPITools.Client.ExceptionFactory ExceptionFactory
        {
            get
            {
                if (_exceptionFactory != null && _exceptionFactory.GetInvocationList().Length > 1)
                {
                    throw new InvalidOperationException("Multicast delegate for ExceptionFactory is unsupported.");
                }
                return _exceptionFactory;
            }
            set { _exceptionFactory = value; }
        }

        /// <summary>
        /// Gets the default header.
        /// </summary>
        /// <returns>Dictionary of HTTP header</returns>
        [Obsolete("DefaultHeader is deprecated, please use Configuration.DefaultHeader instead.")]
        public IDictionary<String, String> DefaultHeader()
        {
            return new ReadOnlyDictionary<string, string>(this.Configuration.DefaultHeader);
        }

        /// <summary>
        /// Add default header.
        /// </summary>
        /// <param name="key">Header field name.</param>
        /// <param name="value">Header field value.</param>
        /// <returns></returns>
        [Obsolete("AddDefaultHeader is deprecated, please use Configuration.AddDefaultHeader instead.")]
        public void AddDefaultHeader(string key, string value)
        {
            this.Configuration.AddDefaultHeader(key, value);
        }

        /// <summary>
        /// Gets the player&#39;s game profile This will return the player&#39;s username plus any additional information about them (e.g. skins). This has a much stricter rate limit: You can request the same profile once per minute, however you can send as many unique requests as you like.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="strippedUuid">The player UUID without hyphens</param>
        /// <param name="unsigned">When set to false, the signature data are sent (optional)</param>
        /// <returns>PlayerProfile</returns>
        public PlayerProfile GetPlayerProfile (string strippedUuid, bool? unsigned = null)
        {
             ApiResponse<PlayerProfile> localVarResponse = GetPlayerProfileWithHttpInfo(strippedUuid, unsigned);
             return localVarResponse.Data;
        }

        /// <summary>
        /// Gets the player&#39;s game profile This will return the player&#39;s username plus any additional information about them (e.g. skins). This has a much stricter rate limit: You can request the same profile once per minute, however you can send as many unique requests as you like.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="strippedUuid">The player UUID without hyphens</param>
        /// <param name="unsigned">When set to false, the signature data are sent (optional)</param>
        /// <returns>ApiResponse of PlayerProfile</returns>
        public ApiResponse< PlayerProfile > GetPlayerProfileWithHttpInfo (string strippedUuid, bool? unsigned = null)
        {
            // verify the required parameter 'strippedUuid' is set
            if (strippedUuid == null)
                throw new ApiException(400, "Missing required parameter 'strippedUuid' when calling LoginApi->GetPlayerProfile");

            var localVarPath = "/session/minecraft/profile/{stripped_uuid}";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (strippedUuid != null) localVarPathParams.Add("stripped_uuid", this.Configuration.ApiClient.ParameterToString(strippedUuid)); // path parameter
            if (unsigned != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "unsigned", unsigned)); // query parameter


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) this.Configuration.ApiClient.CallApi(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("GetPlayerProfile", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<PlayerProfile>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => x.Value.ToString()),
                (PlayerProfile) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(PlayerProfile)));
        }

        /// <summary>
        /// Gets the player&#39;s game profile This will return the player&#39;s username plus any additional information about them (e.g. skins). This has a much stricter rate limit: You can request the same profile once per minute, however you can send as many unique requests as you like.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="strippedUuid">The player UUID without hyphens</param>
        /// <param name="unsigned">When set to false, the signature data are sent (optional)</param>
        /// <returns>Task of PlayerProfile</returns>
        public async System.Threading.Tasks.Task<PlayerProfile> GetPlayerProfileAsync (string strippedUuid, bool? unsigned = null)
        {
             ApiResponse<PlayerProfile> localVarResponse = await GetPlayerProfileAsyncWithHttpInfo(strippedUuid, unsigned);
             return localVarResponse.Data;

        }

        /// <summary>
        /// Gets the player&#39;s game profile This will return the player&#39;s username plus any additional information about them (e.g. skins). This has a much stricter rate limit: You can request the same profile once per minute, however you can send as many unique requests as you like.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="strippedUuid">The player UUID without hyphens</param>
        /// <param name="unsigned">When set to false, the signature data are sent (optional)</param>
        /// <returns>Task of ApiResponse (PlayerProfile)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<PlayerProfile>> GetPlayerProfileAsyncWithHttpInfo (string strippedUuid, bool? unsigned = null)
        {
            // verify the required parameter 'strippedUuid' is set
            if (strippedUuid == null)
                throw new ApiException(400, "Missing required parameter 'strippedUuid' when calling LoginApi->GetPlayerProfile");

            var localVarPath = "/session/minecraft/profile/{stripped_uuid}";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (strippedUuid != null) localVarPathParams.Add("stripped_uuid", this.Configuration.ApiClient.ParameterToString(strippedUuid)); // path parameter
            if (unsigned != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "unsigned", unsigned)); // query parameter


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await this.Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("GetPlayerProfile", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<PlayerProfile>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => x.Value.ToString()),
                (PlayerProfile) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(PlayerProfile)));
        }

    }
}
