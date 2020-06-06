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
using System.Net;
using System.Net.Mime;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.com.github.asyncmc.mojang.api.csharp.refactor.model;

namespace Org.OpenAPITools.com.github.asyncmc.mojang.api.csharp.refactor.api
{

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface INameHistoryApiSync : IApiAccessor
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
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface INameHistoryApiAsync : IApiAccessor
    {
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

    public interface INameHistoryApi : INameHistoryApiSync, INameHistoryApiAsync
    {
        
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
        public NameHistoryApi() : this((string) null)
        {
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="NameHistoryApi"/> class.
        /// </summary>
        /// <returns></returns>
        public NameHistoryApi(String basePath)
        {
            this.Configuration = Org.OpenAPITools.Client.Configuration.MergeConfigurations(
                Org.OpenAPITools.Client.GlobalConfiguration.Instance,
                new Org.OpenAPITools.Client.Configuration { BasePath = basePath }
            );
            this.Client = new Org.OpenAPITools.Client.ApiClient(this.Configuration.BasePath);
            this.AsynchronousClient = new Org.OpenAPITools.Client.ApiClient(this.Configuration.BasePath);
            this.ExceptionFactory = Org.OpenAPITools.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="NameHistoryApi"/> class
        /// using Configuration object
        /// </summary>
        /// <param name="configuration">An instance of Configuration</param>
        /// <returns></returns>
        public NameHistoryApi(Org.OpenAPITools.Client.Configuration configuration)
        {
            if (configuration == null) throw new ArgumentNullException("configuration");

            this.Configuration = Org.OpenAPITools.Client.Configuration.MergeConfigurations(
                Org.OpenAPITools.Client.GlobalConfiguration.Instance,
                configuration
            );
            this.Client = new Org.OpenAPITools.Client.ApiClient(this.Configuration.BasePath);
            this.AsynchronousClient = new Org.OpenAPITools.Client.ApiClient(this.Configuration.BasePath);
            ExceptionFactory = Org.OpenAPITools.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="PetApi"/> class
        /// using a Configuration object and client instance.
        /// </summary>
        /// <param name="client">The client interface for synchronous API access.</param>
        /// <param name="asyncClient">The client interface for asynchronous API access.</param>
        /// <param name="configuration">The configuration object.</param>
        public NameHistoryApi(Org.OpenAPITools.Client.ISynchronousClient client,Org.OpenAPITools.Client.IAsynchronousClient asyncClient, Org.OpenAPITools.Client.IReadableConfiguration configuration)
        {
            if(client == null) throw new ArgumentNullException("client");
            if(asyncClient == null) throw new ArgumentNullException("asyncClient");
            if(configuration == null) throw new ArgumentNullException("configuration");
            
            this.Client = client;
            this.AsynchronousClient = asyncClient;
            this.Configuration = configuration;
            this.ExceptionFactory = Org.OpenAPITools.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// The client for accessing this underlying API asynchronously.
        /// </summary>
        public Org.OpenAPITools.Client.IAsynchronousClient AsynchronousClient { get; set; }

        /// <summary>
        /// The client for accessing this underlying API synchronously.
        /// </summary>
        public Org.OpenAPITools.Client.ISynchronousClient Client { get; set; }

        /// <summary>
        /// Gets the base path of the API client.
        /// </summary>
        /// <value>The base path</value>
        public String GetBasePath()
        {
            return this.Configuration.BasePath;
        }

        /// <summary>
        /// Gets or sets the configuration object
        /// </summary>
        /// <value>An instance of the Configuration</value>
        public Org.OpenAPITools.Client.IReadableConfiguration Configuration {get; set;}

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
        /// Find the current UUID of multiple players at once Find the current players name, UUID, demo status and migration flag by the current players name. The \&quot;at\&quot; parameter is not supported. Players not found are not returned. If no players are found, an empty array is returned.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="requestBody">Array with the player names</param>
        /// <returns>List&lt;CurrentPlayerIDs&gt;</returns>
        public List<CurrentPlayerIDs> FindUniqueIdsByName (List<string> requestBody)
        {
             Org.OpenAPITools.Client.ApiResponse<List<CurrentPlayerIDs>> localVarResponse = FindUniqueIdsByNameWithHttpInfo(requestBody);
             return localVarResponse.Data;
        }

        /// <summary>
        /// Find the current UUID of multiple players at once Find the current players name, UUID, demo status and migration flag by the current players name. The \&quot;at\&quot; parameter is not supported. Players not found are not returned. If no players are found, an empty array is returned.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="requestBody">Array with the player names</param>
        /// <returns>ApiResponse of List&lt;CurrentPlayerIDs&gt;</returns>
        public Org.OpenAPITools.Client.ApiResponse< List<CurrentPlayerIDs> > FindUniqueIdsByNameWithHttpInfo (List<string> requestBody)
        {
            // verify the required parameter 'requestBody' is set
            if (requestBody == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'requestBody' when calling NameHistoryApi->FindUniqueIdsByName");

            Org.OpenAPITools.Client.RequestOptions requestOptions = new Org.OpenAPITools.Client.RequestOptions();

            String[] @contentTypes = new String[] {
                "application/json"
            };

            // to determine the Accept header
            String[] @accepts = new String[] {
                "application/json"
            };
            
            foreach (var contentType in @contentTypes)
                requestOptions.HeaderParameters.Add("Content-Type", contentType);
            
            foreach (var accept in @accepts)
                requestOptions.HeaderParameters.Add("Accept", accept);
            
            requestOptions.Data = requestBody;


            // make the HTTP request

            var response = this.Client.Post< List<CurrentPlayerIDs> >("/profiles/minecraft", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("FindUniqueIdsByName", response);
                if (exception != null) throw exception;
            }

            return response;
        }

        /// <summary>
        /// Find the current UUID of multiple players at once Find the current players name, UUID, demo status and migration flag by the current players name. The \&quot;at\&quot; parameter is not supported. Players not found are not returned. If no players are found, an empty array is returned.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="requestBody">Array with the player names</param>
        /// <returns>Task of List&lt;CurrentPlayerIDs&gt;</returns>
        public async System.Threading.Tasks.Task<List<CurrentPlayerIDs>> FindUniqueIdsByNameAsync (List<string> requestBody)
        {
             Org.OpenAPITools.Client.ApiResponse<List<CurrentPlayerIDs>> localVarResponse = await FindUniqueIdsByNameAsyncWithHttpInfo(requestBody);
             return localVarResponse.Data;

        }

        /// <summary>
        /// Find the current UUID of multiple players at once Find the current players name, UUID, demo status and migration flag by the current players name. The \&quot;at\&quot; parameter is not supported. Players not found are not returned. If no players are found, an empty array is returned.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="requestBody">Array with the player names</param>
        /// <returns>Task of ApiResponse (List&lt;CurrentPlayerIDs&gt;)</returns>
        public async System.Threading.Tasks.Task<Org.OpenAPITools.Client.ApiResponse<List<CurrentPlayerIDs>>> FindUniqueIdsByNameAsyncWithHttpInfo (List<string> requestBody)
        {
            // verify the required parameter 'requestBody' is set
            if (requestBody == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'requestBody' when calling NameHistoryApi->FindUniqueIdsByName");

            Org.OpenAPITools.Client.RequestOptions requestOptions = new Org.OpenAPITools.Client.RequestOptions();

            String[] @contentTypes = new String[] {
                "application/json"
            };

            // to determine the Accept header
            String[] @accepts = new String[] {
                "application/json"
            };
            
            foreach (var contentType in @contentTypes)
                requestOptions.HeaderParameters.Add("Content-Type", contentType);
            
            foreach (var accept in @accepts)
                requestOptions.HeaderParameters.Add("Accept", accept);
            
            requestOptions.Data = requestBody;


            // make the HTTP request

            var response = await this.AsynchronousClient.PostAsync<List<CurrentPlayerIDs>>("/profiles/minecraft", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("FindUniqueIdsByName", response);
                if (exception != null) throw exception;
            }

            return response;
        }

        /// <summary>
        /// Gets the full player&#39;s name history 
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="strippedUuid">The player UUID without hyphens</param>
        /// <returns>List&lt;NameChange&gt;</returns>
        public List<NameChange> GetNameHistory (string strippedUuid)
        {
             Org.OpenAPITools.Client.ApiResponse<List<NameChange>> localVarResponse = GetNameHistoryWithHttpInfo(strippedUuid);
             return localVarResponse.Data;
        }

        /// <summary>
        /// Gets the full player&#39;s name history 
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="strippedUuid">The player UUID without hyphens</param>
        /// <returns>ApiResponse of List&lt;NameChange&gt;</returns>
        public Org.OpenAPITools.Client.ApiResponse< List<NameChange> > GetNameHistoryWithHttpInfo (string strippedUuid)
        {
            // verify the required parameter 'strippedUuid' is set
            if (strippedUuid == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'strippedUuid' when calling NameHistoryApi->GetNameHistory");

            Org.OpenAPITools.Client.RequestOptions requestOptions = new Org.OpenAPITools.Client.RequestOptions();

            String[] @contentTypes = new String[] {
            };

            // to determine the Accept header
            String[] @accepts = new String[] {
                "application/json"
            };
            
            foreach (var contentType in @contentTypes)
                requestOptions.HeaderParameters.Add("Content-Type", contentType);
            
            foreach (var accept in @accepts)
                requestOptions.HeaderParameters.Add("Accept", accept);
            
            if (strippedUuid != null)
                requestOptions.PathParameters.Add("stripped_uuid", Org.OpenAPITools.Client.ClientUtils.ParameterToString(strippedUuid)); // path parameter


            // make the HTTP request

            var response = this.Client.Get< List<NameChange> >("/user/profiles/{stripped_uuid}/names", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("GetNameHistory", response);
                if (exception != null) throw exception;
            }

            return response;
        }

        /// <summary>
        /// Gets the full player&#39;s name history 
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="strippedUuid">The player UUID without hyphens</param>
        /// <returns>Task of List&lt;NameChange&gt;</returns>
        public async System.Threading.Tasks.Task<List<NameChange>> GetNameHistoryAsync (string strippedUuid)
        {
             Org.OpenAPITools.Client.ApiResponse<List<NameChange>> localVarResponse = await GetNameHistoryAsyncWithHttpInfo(strippedUuid);
             return localVarResponse.Data;

        }

        /// <summary>
        /// Gets the full player&#39;s name history 
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="strippedUuid">The player UUID without hyphens</param>
        /// <returns>Task of ApiResponse (List&lt;NameChange&gt;)</returns>
        public async System.Threading.Tasks.Task<Org.OpenAPITools.Client.ApiResponse<List<NameChange>>> GetNameHistoryAsyncWithHttpInfo (string strippedUuid)
        {
            // verify the required parameter 'strippedUuid' is set
            if (strippedUuid == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'strippedUuid' when calling NameHistoryApi->GetNameHistory");

            Org.OpenAPITools.Client.RequestOptions requestOptions = new Org.OpenAPITools.Client.RequestOptions();

            String[] @contentTypes = new String[] {
            };

            // to determine the Accept header
            String[] @accepts = new String[] {
                "application/json"
            };
            
            foreach (var contentType in @contentTypes)
                requestOptions.HeaderParameters.Add("Content-Type", contentType);
            
            foreach (var accept in @accepts)
                requestOptions.HeaderParameters.Add("Accept", accept);
            
            if (strippedUuid != null)
                requestOptions.PathParameters.Add("stripped_uuid", Org.OpenAPITools.Client.ClientUtils.ParameterToString(strippedUuid)); // path parameter


            // make the HTTP request

            var response = await this.AsynchronousClient.GetAsync<List<NameChange>>("/user/profiles/{stripped_uuid}/names", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("GetNameHistory", response);
                if (exception != null) throw exception;
            }

            return response;
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
             Org.OpenAPITools.Client.ApiResponse<CurrentPlayerIDs> localVarResponse = GetUniqueIdByNameWithHttpInfo(username, at);
             return localVarResponse.Data;
        }

        /// <summary>
        /// Find the UUID by name Find the current player name, UUID, demo status and migration flag by the current player name or at a given time.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="username">The username in a given time, or in present if \&quot;at\&quot; is not sent</param>
        /// <param name="at">Find the username in a given time, when 0 selects the original name however, it only works if the name was changed at least once, or if the account is legacy. The time is an UNIX timestamp (without milliseconds) (optional)</param>
        /// <returns>ApiResponse of CurrentPlayerIDs</returns>
        public Org.OpenAPITools.Client.ApiResponse< CurrentPlayerIDs > GetUniqueIdByNameWithHttpInfo (string username, long? at = null)
        {
            // verify the required parameter 'username' is set
            if (username == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'username' when calling NameHistoryApi->GetUniqueIdByName");

            Org.OpenAPITools.Client.RequestOptions requestOptions = new Org.OpenAPITools.Client.RequestOptions();

            String[] @contentTypes = new String[] {
            };

            // to determine the Accept header
            String[] @accepts = new String[] {
                "application/json"
            };
            
            foreach (var contentType in @contentTypes)
                requestOptions.HeaderParameters.Add("Content-Type", contentType);
            
            foreach (var accept in @accepts)
                requestOptions.HeaderParameters.Add("Accept", accept);
            
            if (username != null)
                requestOptions.PathParameters.Add("username", Org.OpenAPITools.Client.ClientUtils.ParameterToString(username)); // path parameter
            if (at != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "at", at))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }


            // make the HTTP request

            var response = this.Client.Get< CurrentPlayerIDs >("/users/profiles/minecraft/{username}", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("GetUniqueIdByName", response);
                if (exception != null) throw exception;
            }

            return response;
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
             Org.OpenAPITools.Client.ApiResponse<CurrentPlayerIDs> localVarResponse = await GetUniqueIdByNameAsyncWithHttpInfo(username, at);
             return localVarResponse.Data;

        }

        /// <summary>
        /// Find the UUID by name Find the current player name, UUID, demo status and migration flag by the current player name or at a given time.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="username">The username in a given time, or in present if \&quot;at\&quot; is not sent</param>
        /// <param name="at">Find the username in a given time, when 0 selects the original name however, it only works if the name was changed at least once, or if the account is legacy. The time is an UNIX timestamp (without milliseconds) (optional)</param>
        /// <returns>Task of ApiResponse (CurrentPlayerIDs)</returns>
        public async System.Threading.Tasks.Task<Org.OpenAPITools.Client.ApiResponse<CurrentPlayerIDs>> GetUniqueIdByNameAsyncWithHttpInfo (string username, long? at = null)
        {
            // verify the required parameter 'username' is set
            if (username == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'username' when calling NameHistoryApi->GetUniqueIdByName");

            Org.OpenAPITools.Client.RequestOptions requestOptions = new Org.OpenAPITools.Client.RequestOptions();

            String[] @contentTypes = new String[] {
            };

            // to determine the Accept header
            String[] @accepts = new String[] {
                "application/json"
            };
            
            foreach (var contentType in @contentTypes)
                requestOptions.HeaderParameters.Add("Content-Type", contentType);
            
            foreach (var accept in @accepts)
                requestOptions.HeaderParameters.Add("Accept", accept);
            
            if (username != null)
                requestOptions.PathParameters.Add("username", Org.OpenAPITools.Client.ClientUtils.ParameterToString(username)); // path parameter
            if (at != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "at", at))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }


            // make the HTTP request

            var response = await this.AsynchronousClient.GetAsync<CurrentPlayerIDs>("/users/profiles/minecraft/{username}", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("GetUniqueIdByName", response);
                if (exception != null) throw exception;
            }

            return response;
        }

    }
}
