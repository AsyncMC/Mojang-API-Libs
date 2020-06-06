/* 
 * Mojang API
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
using Org.OpenAPITools.Model;

namespace Org.OpenAPITools.Api
{
    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface INameHistoryApi : IApiAccessor
    {
        #region Synchronous Operations
        /// <summary>
        /// Find the current UUID of multiple players at once
        /// </summary>
        /// <remarks>
        /// Find the current players name, UUID, demo status and migration flag by the current players name. The \&quot;at\&quot; parameter is not supported. Players not found are not returned. If no players are found, an empty array is returned.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="requestBody">Array with the player names</param>
        /// <returns>List&lt;CurrentPlayerIDs&gt;</returns>
        List<CurrentPlayerIDs> FindUniqueIdsByName (List<string> requestBody);

        /// <summary>
        /// Find the current UUID of multiple players at once
        /// </summary>
        /// <remarks>
        /// Find the current players name, UUID, demo status and migration flag by the current players name. The \&quot;at\&quot; parameter is not supported. Players not found are not returned. If no players are found, an empty array is returned.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="requestBody">Array with the player names</param>
        /// <returns>ApiResponse of List&lt;CurrentPlayerIDs&gt;</returns>
        ApiResponse<List<CurrentPlayerIDs>> FindUniqueIdsByNameWithHttpInfo (List<string> requestBody);
        /// <summary>
        /// Gets the full player&#39;s name history
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="strippedUuid">The player UUID without hyphens</param>
        /// <returns>List&lt;NameChange&gt;</returns>
        List<NameChange> GetNameHistory (string strippedUuid);

        /// <summary>
        /// Gets the full player&#39;s name history
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="strippedUuid">The player UUID without hyphens</param>
        /// <returns>ApiResponse of List&lt;NameChange&gt;</returns>
        ApiResponse<List<NameChange>> GetNameHistoryWithHttpInfo (string strippedUuid);
        /// <summary>
        /// Find the UUID by name
        /// </summary>
        /// <remarks>
        /// Find the current player name, UUID, demo status and migration flag by the current player name or at a given time.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="username">The username in a given time, or in present if \&quot;at\&quot; is not sent</param>
        /// <param name="at">Find the username in a given time, when 0 selects the original name however, it only works if the name was changed at least once, or if the account is legacy. The time is an UNIX timestamp (without milliseconds) (optional)</param>
        /// <returns>CurrentPlayerIDs</returns>
        CurrentPlayerIDs GetUniqueIdByName (string username, long? at = null);

        /// <summary>
        /// Find the UUID by name
        /// </summary>
        /// <remarks>
        /// Find the current player name, UUID, demo status and migration flag by the current player name or at a given time.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="username">The username in a given time, or in present if \&quot;at\&quot; is not sent</param>
        /// <param name="at">Find the username in a given time, when 0 selects the original name however, it only works if the name was changed at least once, or if the account is legacy. The time is an UNIX timestamp (without milliseconds) (optional)</param>
        /// <returns>ApiResponse of CurrentPlayerIDs</returns>
        ApiResponse<CurrentPlayerIDs> GetUniqueIdByNameWithHttpInfo (string username, long? at = null);
        #endregion Synchronous Operations
        #region Asynchronous Operations
        /// <summary>
        /// Find the current UUID of multiple players at once
        /// </summary>
        /// <remarks>
        /// Find the current players name, UUID, demo status and migration flag by the current players name. The \&quot;at\&quot; parameter is not supported. Players not found are not returned. If no players are found, an empty array is returned.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="requestBody">Array with the player names</param>
        /// <returns>Task of List&lt;CurrentPlayerIDs&gt;</returns>
        System.Threading.Tasks.Task<List<CurrentPlayerIDs>> FindUniqueIdsByNameAsync (List<string> requestBody);

        /// <summary>
        /// Find the current UUID of multiple players at once
        /// </summary>
        /// <remarks>
        /// Find the current players name, UUID, demo status and migration flag by the current players name. The \&quot;at\&quot; parameter is not supported. Players not found are not returned. If no players are found, an empty array is returned.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="requestBody">Array with the player names</param>
        /// <returns>Task of ApiResponse (List&lt;CurrentPlayerIDs&gt;)</returns>
        System.Threading.Tasks.Task<ApiResponse<List<CurrentPlayerIDs>>> FindUniqueIdsByNameAsyncWithHttpInfo (List<string> requestBody);
        /// <summary>
        /// Gets the full player&#39;s name history
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="strippedUuid">The player UUID without hyphens</param>
        /// <returns>Task of List&lt;NameChange&gt;</returns>
        System.Threading.Tasks.Task<List<NameChange>> GetNameHistoryAsync (string strippedUuid);

        /// <summary>
        /// Gets the full player&#39;s name history
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="strippedUuid">The player UUID without hyphens</param>
        /// <returns>Task of ApiResponse (List&lt;NameChange&gt;)</returns>
        System.Threading.Tasks.Task<ApiResponse<List<NameChange>>> GetNameHistoryAsyncWithHttpInfo (string strippedUuid);
        /// <summary>
        /// Find the UUID by name
        /// </summary>
        /// <remarks>
        /// Find the current player name, UUID, demo status and migration flag by the current player name or at a given time.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="username">The username in a given time, or in present if \&quot;at\&quot; is not sent</param>
        /// <param name="at">Find the username in a given time, when 0 selects the original name however, it only works if the name was changed at least once, or if the account is legacy. The time is an UNIX timestamp (without milliseconds) (optional)</param>
        /// <returns>Task of CurrentPlayerIDs</returns>
        System.Threading.Tasks.Task<CurrentPlayerIDs> GetUniqueIdByNameAsync (string username, long? at = null);

        /// <summary>
        /// Find the UUID by name
        /// </summary>
        /// <remarks>
        /// Find the current player name, UUID, demo status and migration flag by the current player name or at a given time.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="username">The username in a given time, or in present if \&quot;at\&quot; is not sent</param>
        /// <param name="at">Find the username in a given time, when 0 selects the original name however, it only works if the name was changed at least once, or if the account is legacy. The time is an UNIX timestamp (without milliseconds) (optional)</param>
        /// <returns>Task of ApiResponse (CurrentPlayerIDs)</returns>
        System.Threading.Tasks.Task<ApiResponse<CurrentPlayerIDs>> GetUniqueIdByNameAsyncWithHttpInfo (string username, long? at = null);
        #endregion Asynchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public partial class NameHistoryApi : INameHistoryApi
    {
        private Org.OpenAPITools.Client.ExceptionFactory _exceptionFactory = (name, response) => null;

        /// <summary>
        /// Initializes a new instance of the <see cref="NameHistoryApi"/> class.
        /// </summary>
        /// <returns></returns>
        public NameHistoryApi(String basePath)
        {
            this.Configuration = new Org.OpenAPITools.Client.Configuration { BasePath = basePath };

            ExceptionFactory = Org.OpenAPITools.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="NameHistoryApi"/> class
        /// </summary>
        /// <returns></returns>
        public NameHistoryApi()
        {
            this.Configuration = Org.OpenAPITools.Client.Configuration.Default;

            ExceptionFactory = Org.OpenAPITools.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="NameHistoryApi"/> class
        /// using Configuration object
        /// </summary>
        /// <param name="configuration">An instance of Configuration</param>
        /// <returns></returns>
        public NameHistoryApi(Org.OpenAPITools.Client.Configuration configuration = null)
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
        /// Find the current UUID of multiple players at once Find the current players name, UUID, demo status and migration flag by the current players name. The \&quot;at\&quot; parameter is not supported. Players not found are not returned. If no players are found, an empty array is returned.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="requestBody">Array with the player names</param>
        /// <returns>List&lt;CurrentPlayerIDs&gt;</returns>
        public List<CurrentPlayerIDs> FindUniqueIdsByName (List<string> requestBody)
        {
             ApiResponse<List<CurrentPlayerIDs>> localVarResponse = FindUniqueIdsByNameWithHttpInfo(requestBody);
             return localVarResponse.Data;
        }

        /// <summary>
        /// Find the current UUID of multiple players at once Find the current players name, UUID, demo status and migration flag by the current players name. The \&quot;at\&quot; parameter is not supported. Players not found are not returned. If no players are found, an empty array is returned.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="requestBody">Array with the player names</param>
        /// <returns>ApiResponse of List&lt;CurrentPlayerIDs&gt;</returns>
        public ApiResponse< List<CurrentPlayerIDs> > FindUniqueIdsByNameWithHttpInfo (List<string> requestBody)
        {
            // verify the required parameter 'requestBody' is set
            if (requestBody == null)
                throw new ApiException(400, "Missing required parameter 'requestBody' when calling NameHistoryApi->FindUniqueIdsByName");

            var localVarPath = "/profiles/minecraft";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
                "application/json"
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (requestBody != null && requestBody.GetType() != typeof(byte[]))
            {
                localVarPostBody = this.Configuration.ApiClient.Serialize(requestBody); // http body (model) parameter
            }
            else
            {
                localVarPostBody = requestBody; // byte array
            }


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) this.Configuration.ApiClient.CallApi(localVarPath,
                Method.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("FindUniqueIdsByName", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<List<CurrentPlayerIDs>>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => x.Value.ToString()),
                (List<CurrentPlayerIDs>) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(List<CurrentPlayerIDs>)));
        }

        /// <summary>
        /// Find the current UUID of multiple players at once Find the current players name, UUID, demo status and migration flag by the current players name. The \&quot;at\&quot; parameter is not supported. Players not found are not returned. If no players are found, an empty array is returned.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="requestBody">Array with the player names</param>
        /// <returns>Task of List&lt;CurrentPlayerIDs&gt;</returns>
        public async System.Threading.Tasks.Task<List<CurrentPlayerIDs>> FindUniqueIdsByNameAsync (List<string> requestBody)
        {
             ApiResponse<List<CurrentPlayerIDs>> localVarResponse = await FindUniqueIdsByNameAsyncWithHttpInfo(requestBody);
             return localVarResponse.Data;

        }

        /// <summary>
        /// Find the current UUID of multiple players at once Find the current players name, UUID, demo status and migration flag by the current players name. The \&quot;at\&quot; parameter is not supported. Players not found are not returned. If no players are found, an empty array is returned.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="requestBody">Array with the player names</param>
        /// <returns>Task of ApiResponse (List&lt;CurrentPlayerIDs&gt;)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<List<CurrentPlayerIDs>>> FindUniqueIdsByNameAsyncWithHttpInfo (List<string> requestBody)
        {
            // verify the required parameter 'requestBody' is set
            if (requestBody == null)
                throw new ApiException(400, "Missing required parameter 'requestBody' when calling NameHistoryApi->FindUniqueIdsByName");

            var localVarPath = "/profiles/minecraft";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
                "application/json"
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (requestBody != null && requestBody.GetType() != typeof(byte[]))
            {
                localVarPostBody = this.Configuration.ApiClient.Serialize(requestBody); // http body (model) parameter
            }
            else
            {
                localVarPostBody = requestBody; // byte array
            }


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await this.Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("FindUniqueIdsByName", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<List<CurrentPlayerIDs>>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => x.Value.ToString()),
                (List<CurrentPlayerIDs>) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(List<CurrentPlayerIDs>)));
        }

        /// <summary>
        /// Gets the full player&#39;s name history 
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="strippedUuid">The player UUID without hyphens</param>
        /// <returns>List&lt;NameChange&gt;</returns>
        public List<NameChange> GetNameHistory (string strippedUuid)
        {
             ApiResponse<List<NameChange>> localVarResponse = GetNameHistoryWithHttpInfo(strippedUuid);
             return localVarResponse.Data;
        }

        /// <summary>
        /// Gets the full player&#39;s name history 
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="strippedUuid">The player UUID without hyphens</param>
        /// <returns>ApiResponse of List&lt;NameChange&gt;</returns>
        public ApiResponse< List<NameChange> > GetNameHistoryWithHttpInfo (string strippedUuid)
        {
            // verify the required parameter 'strippedUuid' is set
            if (strippedUuid == null)
                throw new ApiException(400, "Missing required parameter 'strippedUuid' when calling NameHistoryApi->GetNameHistory");

            var localVarPath = "/user/profiles/{stripped_uuid}/names";
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


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) this.Configuration.ApiClient.CallApi(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("GetNameHistory", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<List<NameChange>>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => x.Value.ToString()),
                (List<NameChange>) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(List<NameChange>)));
        }

        /// <summary>
        /// Gets the full player&#39;s name history 
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="strippedUuid">The player UUID without hyphens</param>
        /// <returns>Task of List&lt;NameChange&gt;</returns>
        public async System.Threading.Tasks.Task<List<NameChange>> GetNameHistoryAsync (string strippedUuid)
        {
             ApiResponse<List<NameChange>> localVarResponse = await GetNameHistoryAsyncWithHttpInfo(strippedUuid);
             return localVarResponse.Data;

        }

        /// <summary>
        /// Gets the full player&#39;s name history 
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="strippedUuid">The player UUID without hyphens</param>
        /// <returns>Task of ApiResponse (List&lt;NameChange&gt;)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<List<NameChange>>> GetNameHistoryAsyncWithHttpInfo (string strippedUuid)
        {
            // verify the required parameter 'strippedUuid' is set
            if (strippedUuid == null)
                throw new ApiException(400, "Missing required parameter 'strippedUuid' when calling NameHistoryApi->GetNameHistory");

            var localVarPath = "/user/profiles/{stripped_uuid}/names";
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


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await this.Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("GetNameHistory", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<List<NameChange>>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => x.Value.ToString()),
                (List<NameChange>) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(List<NameChange>)));
        }

        /// <summary>
        /// Find the UUID by name Find the current player name, UUID, demo status and migration flag by the current player name or at a given time.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="username">The username in a given time, or in present if \&quot;at\&quot; is not sent</param>
        /// <param name="at">Find the username in a given time, when 0 selects the original name however, it only works if the name was changed at least once, or if the account is legacy. The time is an UNIX timestamp (without milliseconds) (optional)</param>
        /// <returns>CurrentPlayerIDs</returns>
        public CurrentPlayerIDs GetUniqueIdByName (string username, long? at = null)
        {
             ApiResponse<CurrentPlayerIDs> localVarResponse = GetUniqueIdByNameWithHttpInfo(username, at);
             return localVarResponse.Data;
        }

        /// <summary>
        /// Find the UUID by name Find the current player name, UUID, demo status and migration flag by the current player name or at a given time.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="username">The username in a given time, or in present if \&quot;at\&quot; is not sent</param>
        /// <param name="at">Find the username in a given time, when 0 selects the original name however, it only works if the name was changed at least once, or if the account is legacy. The time is an UNIX timestamp (without milliseconds) (optional)</param>
        /// <returns>ApiResponse of CurrentPlayerIDs</returns>
        public ApiResponse< CurrentPlayerIDs > GetUniqueIdByNameWithHttpInfo (string username, long? at = null)
        {
            // verify the required parameter 'username' is set
            if (username == null)
                throw new ApiException(400, "Missing required parameter 'username' when calling NameHistoryApi->GetUniqueIdByName");

            var localVarPath = "/users/profiles/minecraft/{username}";
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

            if (username != null) localVarPathParams.Add("username", this.Configuration.ApiClient.ParameterToString(username)); // path parameter
            if (at != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "at", at)); // query parameter


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) this.Configuration.ApiClient.CallApi(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("GetUniqueIdByName", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<CurrentPlayerIDs>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => x.Value.ToString()),
                (CurrentPlayerIDs) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(CurrentPlayerIDs)));
        }

        /// <summary>
        /// Find the UUID by name Find the current player name, UUID, demo status and migration flag by the current player name or at a given time.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="username">The username in a given time, or in present if \&quot;at\&quot; is not sent</param>
        /// <param name="at">Find the username in a given time, when 0 selects the original name however, it only works if the name was changed at least once, or if the account is legacy. The time is an UNIX timestamp (without milliseconds) (optional)</param>
        /// <returns>Task of CurrentPlayerIDs</returns>
        public async System.Threading.Tasks.Task<CurrentPlayerIDs> GetUniqueIdByNameAsync (string username, long? at = null)
        {
             ApiResponse<CurrentPlayerIDs> localVarResponse = await GetUniqueIdByNameAsyncWithHttpInfo(username, at);
             return localVarResponse.Data;

        }

        /// <summary>
        /// Find the UUID by name Find the current player name, UUID, demo status and migration flag by the current player name or at a given time.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="username">The username in a given time, or in present if \&quot;at\&quot; is not sent</param>
        /// <param name="at">Find the username in a given time, when 0 selects the original name however, it only works if the name was changed at least once, or if the account is legacy. The time is an UNIX timestamp (without milliseconds) (optional)</param>
        /// <returns>Task of ApiResponse (CurrentPlayerIDs)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<CurrentPlayerIDs>> GetUniqueIdByNameAsyncWithHttpInfo (string username, long? at = null)
        {
            // verify the required parameter 'username' is set
            if (username == null)
                throw new ApiException(400, "Missing required parameter 'username' when calling NameHistoryApi->GetUniqueIdByName");

            var localVarPath = "/users/profiles/minecraft/{username}";
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

            if (username != null) localVarPathParams.Add("username", this.Configuration.ApiClient.ParameterToString(username)); // path parameter
            if (at != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "at", at)); // query parameter


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await this.Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("GetUniqueIdByName", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<CurrentPlayerIDs>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => x.Value.ToString()),
                (CurrentPlayerIDs) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(CurrentPlayerIDs)));
        }

    }
}
