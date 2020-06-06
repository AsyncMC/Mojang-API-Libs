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
using System.Net;
using System.Net.Mime;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Org.OpenAPITools.Api
{

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface ILoginApiSync : IApiAccessor
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
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface ILoginApiAsync : IApiAccessor
    {
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

    public interface ILoginApi : ILoginApiSync, ILoginApiAsync
    {
        
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
        public LoginApi() : this((string) null)
        {
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="LoginApi"/> class.
        /// </summary>
        /// <returns></returns>
        public LoginApi(String basePath)
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
        /// Initializes a new instance of the <see cref="LoginApi"/> class
        /// using Configuration object
        /// </summary>
        /// <param name="configuration">An instance of Configuration</param>
        /// <returns></returns>
        public LoginApi(Org.OpenAPITools.Client.Configuration configuration)
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
        public LoginApi(Org.OpenAPITools.Client.ISynchronousClient client,Org.OpenAPITools.Client.IAsynchronousClient asyncClient, Org.OpenAPITools.Client.IReadableConfiguration configuration)
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
        /// Gets the player&#39;s game profile This will return the player&#39;s username plus any additional information about them (e.g. skins). This has a much stricter rate limit: You can request the same profile once per minute, however you can send as many unique requests as you like.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="strippedUuid">The player UUID without hyphens</param>
        /// <param name="unsigned">When set to false, the signature data are sent (optional)</param>
        /// <returns>PlayerProfile</returns>
        public PlayerProfile GetPlayerProfile (string strippedUuid, bool? unsigned = null)
        {
             Org.OpenAPITools.Client.ApiResponse<PlayerProfile> localVarResponse = GetPlayerProfileWithHttpInfo(strippedUuid, unsigned);
             return localVarResponse.Data;
        }

        /// <summary>
        /// Gets the player&#39;s game profile This will return the player&#39;s username plus any additional information about them (e.g. skins). This has a much stricter rate limit: You can request the same profile once per minute, however you can send as many unique requests as you like.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="strippedUuid">The player UUID without hyphens</param>
        /// <param name="unsigned">When set to false, the signature data are sent (optional)</param>
        /// <returns>ApiResponse of PlayerProfile</returns>
        public Org.OpenAPITools.Client.ApiResponse< PlayerProfile > GetPlayerProfileWithHttpInfo (string strippedUuid, bool? unsigned = null)
        {
            // verify the required parameter 'strippedUuid' is set
            if (strippedUuid == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'strippedUuid' when calling LoginApi->GetPlayerProfile");

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
            if (unsigned != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "unsigned", unsigned))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }


            // make the HTTP request

            var response = this.Client.Get< PlayerProfile >("/session/minecraft/profile/{stripped_uuid}", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("GetPlayerProfile", response);
                if (exception != null) throw exception;
            }

            return response;
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
             Org.OpenAPITools.Client.ApiResponse<PlayerProfile> localVarResponse = await GetPlayerProfileAsyncWithHttpInfo(strippedUuid, unsigned);
             return localVarResponse.Data;

        }

        /// <summary>
        /// Gets the player&#39;s game profile This will return the player&#39;s username plus any additional information about them (e.g. skins). This has a much stricter rate limit: You can request the same profile once per minute, however you can send as many unique requests as you like.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="strippedUuid">The player UUID without hyphens</param>
        /// <param name="unsigned">When set to false, the signature data are sent (optional)</param>
        /// <returns>Task of ApiResponse (PlayerProfile)</returns>
        public async System.Threading.Tasks.Task<Org.OpenAPITools.Client.ApiResponse<PlayerProfile>> GetPlayerProfileAsyncWithHttpInfo (string strippedUuid, bool? unsigned = null)
        {
            // verify the required parameter 'strippedUuid' is set
            if (strippedUuid == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'strippedUuid' when calling LoginApi->GetPlayerProfile");

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
            if (unsigned != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "unsigned", unsigned))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }


            // make the HTTP request

            var response = await this.AsynchronousClient.GetAsync<PlayerProfile>("/session/minecraft/profile/{stripped_uuid}", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("GetPlayerProfile", response);
                if (exception != null) throw exception;
            }

            return response;
        }

    }
}
