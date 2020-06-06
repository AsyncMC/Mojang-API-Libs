/* 
 * Mojang Authentication API
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
using Org.OpenAPITools.com.github.asyncmc.mojang.authentication.csharp.refactor.model;

namespace Org.OpenAPITools.com.github.asyncmc.mojang.authentication.csharp.refactor.api
{

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IDefaultApiSync : IApiAccessor
    {
        #region Synchronous Operations
        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="authenticationRequest"></param>
        /// <returns>Authentication</returns>
        Authentication Authenticate (AuthenticationRequest authenticationRequest);

        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="authenticationRequest"></param>
        /// <returns>ApiResponse of Authentication</returns>
        ApiResponse<Authentication> AuthenticateWithHttpInfo (AuthenticationRequest authenticationRequest);
        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessKeys"></param>
        /// <returns></returns>
        void Invalidate (AccessKeys accessKeys);

        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessKeys"></param>
        /// <returns>ApiResponse of Object(void)</returns>
        ApiResponse<Object> InvalidateWithHttpInfo (AccessKeys accessKeys);
        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="refreshRequest"></param>
        /// <returns>RefreshResponse</returns>
        RefreshResponse Refresh (RefreshRequest refreshRequest);

        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="refreshRequest"></param>
        /// <returns>ApiResponse of RefreshResponse</returns>
        ApiResponse<RefreshResponse> RefreshWithHttpInfo (RefreshRequest refreshRequest);
        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="usernamePassword"></param>
        /// <returns></returns>
        void Siginout (UsernamePassword usernamePassword);

        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="usernamePassword"></param>
        /// <returns>ApiResponse of Object(void)</returns>
        ApiResponse<Object> SiginoutWithHttpInfo (UsernamePassword usernamePassword);
        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessKeys"></param>
        /// <returns></returns>
        void Validate (AccessKeys accessKeys);

        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessKeys"></param>
        /// <returns>ApiResponse of Object(void)</returns>
        ApiResponse<Object> ValidateWithHttpInfo (AccessKeys accessKeys);
        #endregion Synchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IDefaultApiAsync : IApiAccessor
    {
        #region Asynchronous Operations
        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="authenticationRequest"></param>
        /// <returns>Task of Authentication</returns>
        System.Threading.Tasks.Task<Authentication> AuthenticateAsync (AuthenticationRequest authenticationRequest);

        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="authenticationRequest"></param>
        /// <returns>Task of ApiResponse (Authentication)</returns>
        System.Threading.Tasks.Task<ApiResponse<Authentication>> AuthenticateAsyncWithHttpInfo (AuthenticationRequest authenticationRequest);
        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessKeys"></param>
        /// <returns>Task of void</returns>
        System.Threading.Tasks.Task InvalidateAsync (AccessKeys accessKeys);

        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessKeys"></param>
        /// <returns>Task of ApiResponse</returns>
        System.Threading.Tasks.Task<ApiResponse<Object>> InvalidateAsyncWithHttpInfo (AccessKeys accessKeys);
        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="refreshRequest"></param>
        /// <returns>Task of RefreshResponse</returns>
        System.Threading.Tasks.Task<RefreshResponse> RefreshAsync (RefreshRequest refreshRequest);

        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="refreshRequest"></param>
        /// <returns>Task of ApiResponse (RefreshResponse)</returns>
        System.Threading.Tasks.Task<ApiResponse<RefreshResponse>> RefreshAsyncWithHttpInfo (RefreshRequest refreshRequest);
        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="usernamePassword"></param>
        /// <returns>Task of void</returns>
        System.Threading.Tasks.Task SiginoutAsync (UsernamePassword usernamePassword);

        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="usernamePassword"></param>
        /// <returns>Task of ApiResponse</returns>
        System.Threading.Tasks.Task<ApiResponse<Object>> SiginoutAsyncWithHttpInfo (UsernamePassword usernamePassword);
        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessKeys"></param>
        /// <returns>Task of void</returns>
        System.Threading.Tasks.Task ValidateAsync (AccessKeys accessKeys);

        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessKeys"></param>
        /// <returns>Task of ApiResponse</returns>
        System.Threading.Tasks.Task<ApiResponse<Object>> ValidateAsyncWithHttpInfo (AccessKeys accessKeys);
        #endregion Asynchronous Operations
    }

    public interface IDefaultApi : IDefaultApiSync, IDefaultApiAsync
    {
        
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public partial class DefaultApi : IDefaultApi
    {
        private Org.OpenAPITools.Client.ExceptionFactory _exceptionFactory = (name, response) => null;
        
        /// <summary>
        /// Initializes a new instance of the <see cref="DefaultApi"/> class.
        /// </summary>
        /// <returns></returns>
        public DefaultApi() : this((string) null)
        {
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="DefaultApi"/> class.
        /// </summary>
        /// <returns></returns>
        public DefaultApi(String basePath)
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
        /// Initializes a new instance of the <see cref="DefaultApi"/> class
        /// using Configuration object
        /// </summary>
        /// <param name="configuration">An instance of Configuration</param>
        /// <returns></returns>
        public DefaultApi(Org.OpenAPITools.Client.Configuration configuration)
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
        public DefaultApi(Org.OpenAPITools.Client.ISynchronousClient client,Org.OpenAPITools.Client.IAsynchronousClient asyncClient, Org.OpenAPITools.Client.IReadableConfiguration configuration)
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
        ///  
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="authenticationRequest"></param>
        /// <returns>Authentication</returns>
        public Authentication Authenticate (AuthenticationRequest authenticationRequest)
        {
             Org.OpenAPITools.Client.ApiResponse<Authentication> localVarResponse = AuthenticateWithHttpInfo(authenticationRequest);
             return localVarResponse.Data;
        }

        /// <summary>
        ///  
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="authenticationRequest"></param>
        /// <returns>ApiResponse of Authentication</returns>
        public Org.OpenAPITools.Client.ApiResponse< Authentication > AuthenticateWithHttpInfo (AuthenticationRequest authenticationRequest)
        {
            // verify the required parameter 'authenticationRequest' is set
            if (authenticationRequest == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'authenticationRequest' when calling DefaultApi->Authenticate");

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
            
            requestOptions.Data = authenticationRequest;


            // make the HTTP request

            var response = this.Client.Post< Authentication >("/authenticate", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("Authenticate", response);
                if (exception != null) throw exception;
            }

            return response;
        }

        /// <summary>
        ///  
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="authenticationRequest"></param>
        /// <returns>Task of Authentication</returns>
        public async System.Threading.Tasks.Task<Authentication> AuthenticateAsync (AuthenticationRequest authenticationRequest)
        {
             Org.OpenAPITools.Client.ApiResponse<Authentication> localVarResponse = await AuthenticateAsyncWithHttpInfo(authenticationRequest);
             return localVarResponse.Data;

        }

        /// <summary>
        ///  
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="authenticationRequest"></param>
        /// <returns>Task of ApiResponse (Authentication)</returns>
        public async System.Threading.Tasks.Task<Org.OpenAPITools.Client.ApiResponse<Authentication>> AuthenticateAsyncWithHttpInfo (AuthenticationRequest authenticationRequest)
        {
            // verify the required parameter 'authenticationRequest' is set
            if (authenticationRequest == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'authenticationRequest' when calling DefaultApi->Authenticate");

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
            
            requestOptions.Data = authenticationRequest;


            // make the HTTP request

            var response = await this.AsynchronousClient.PostAsync<Authentication>("/authenticate", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("Authenticate", response);
                if (exception != null) throw exception;
            }

            return response;
        }

        /// <summary>
        ///  
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessKeys"></param>
        /// <returns></returns>
        public void Invalidate (AccessKeys accessKeys)
        {
             InvalidateWithHttpInfo(accessKeys);
        }

        /// <summary>
        ///  
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessKeys"></param>
        /// <returns>ApiResponse of Object(void)</returns>
        public Org.OpenAPITools.Client.ApiResponse<Object> InvalidateWithHttpInfo (AccessKeys accessKeys)
        {
            // verify the required parameter 'accessKeys' is set
            if (accessKeys == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'accessKeys' when calling DefaultApi->Invalidate");

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
            
            requestOptions.Data = accessKeys;


            // make the HTTP request

            var response = this.Client.Post<Object>("/invalidate", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("Invalidate", response);
                if (exception != null) throw exception;
            }

            return response;
        }

        /// <summary>
        ///  
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessKeys"></param>
        /// <returns>Task of void</returns>
        public async System.Threading.Tasks.Task InvalidateAsync (AccessKeys accessKeys)
        {
             await InvalidateAsyncWithHttpInfo(accessKeys);

        }

        /// <summary>
        ///  
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessKeys"></param>
        /// <returns>Task of ApiResponse</returns>
        public async System.Threading.Tasks.Task<Org.OpenAPITools.Client.ApiResponse<Object>> InvalidateAsyncWithHttpInfo (AccessKeys accessKeys)
        {
            // verify the required parameter 'accessKeys' is set
            if (accessKeys == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'accessKeys' when calling DefaultApi->Invalidate");

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
            
            requestOptions.Data = accessKeys;


            // make the HTTP request

            var response = await this.AsynchronousClient.PostAsync<Object>("/invalidate", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("Invalidate", response);
                if (exception != null) throw exception;
            }

            return response;
        }

        /// <summary>
        ///  
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="refreshRequest"></param>
        /// <returns>RefreshResponse</returns>
        public RefreshResponse Refresh (RefreshRequest refreshRequest)
        {
             Org.OpenAPITools.Client.ApiResponse<RefreshResponse> localVarResponse = RefreshWithHttpInfo(refreshRequest);
             return localVarResponse.Data;
        }

        /// <summary>
        ///  
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="refreshRequest"></param>
        /// <returns>ApiResponse of RefreshResponse</returns>
        public Org.OpenAPITools.Client.ApiResponse< RefreshResponse > RefreshWithHttpInfo (RefreshRequest refreshRequest)
        {
            // verify the required parameter 'refreshRequest' is set
            if (refreshRequest == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'refreshRequest' when calling DefaultApi->Refresh");

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
            
            requestOptions.Data = refreshRequest;


            // make the HTTP request

            var response = this.Client.Post< RefreshResponse >("/refresh", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("Refresh", response);
                if (exception != null) throw exception;
            }

            return response;
        }

        /// <summary>
        ///  
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="refreshRequest"></param>
        /// <returns>Task of RefreshResponse</returns>
        public async System.Threading.Tasks.Task<RefreshResponse> RefreshAsync (RefreshRequest refreshRequest)
        {
             Org.OpenAPITools.Client.ApiResponse<RefreshResponse> localVarResponse = await RefreshAsyncWithHttpInfo(refreshRequest);
             return localVarResponse.Data;

        }

        /// <summary>
        ///  
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="refreshRequest"></param>
        /// <returns>Task of ApiResponse (RefreshResponse)</returns>
        public async System.Threading.Tasks.Task<Org.OpenAPITools.Client.ApiResponse<RefreshResponse>> RefreshAsyncWithHttpInfo (RefreshRequest refreshRequest)
        {
            // verify the required parameter 'refreshRequest' is set
            if (refreshRequest == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'refreshRequest' when calling DefaultApi->Refresh");

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
            
            requestOptions.Data = refreshRequest;


            // make the HTTP request

            var response = await this.AsynchronousClient.PostAsync<RefreshResponse>("/refresh", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("Refresh", response);
                if (exception != null) throw exception;
            }

            return response;
        }

        /// <summary>
        ///  
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="usernamePassword"></param>
        /// <returns></returns>
        public void Siginout (UsernamePassword usernamePassword)
        {
             SiginoutWithHttpInfo(usernamePassword);
        }

        /// <summary>
        ///  
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="usernamePassword"></param>
        /// <returns>ApiResponse of Object(void)</returns>
        public Org.OpenAPITools.Client.ApiResponse<Object> SiginoutWithHttpInfo (UsernamePassword usernamePassword)
        {
            // verify the required parameter 'usernamePassword' is set
            if (usernamePassword == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'usernamePassword' when calling DefaultApi->Siginout");

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
            
            requestOptions.Data = usernamePassword;


            // make the HTTP request

            var response = this.Client.Post<Object>("/signout", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("Siginout", response);
                if (exception != null) throw exception;
            }

            return response;
        }

        /// <summary>
        ///  
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="usernamePassword"></param>
        /// <returns>Task of void</returns>
        public async System.Threading.Tasks.Task SiginoutAsync (UsernamePassword usernamePassword)
        {
             await SiginoutAsyncWithHttpInfo(usernamePassword);

        }

        /// <summary>
        ///  
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="usernamePassword"></param>
        /// <returns>Task of ApiResponse</returns>
        public async System.Threading.Tasks.Task<Org.OpenAPITools.Client.ApiResponse<Object>> SiginoutAsyncWithHttpInfo (UsernamePassword usernamePassword)
        {
            // verify the required parameter 'usernamePassword' is set
            if (usernamePassword == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'usernamePassword' when calling DefaultApi->Siginout");

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
            
            requestOptions.Data = usernamePassword;


            // make the HTTP request

            var response = await this.AsynchronousClient.PostAsync<Object>("/signout", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("Siginout", response);
                if (exception != null) throw exception;
            }

            return response;
        }

        /// <summary>
        ///  
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessKeys"></param>
        /// <returns></returns>
        public void Validate (AccessKeys accessKeys)
        {
             ValidateWithHttpInfo(accessKeys);
        }

        /// <summary>
        ///  
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessKeys"></param>
        /// <returns>ApiResponse of Object(void)</returns>
        public Org.OpenAPITools.Client.ApiResponse<Object> ValidateWithHttpInfo (AccessKeys accessKeys)
        {
            // verify the required parameter 'accessKeys' is set
            if (accessKeys == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'accessKeys' when calling DefaultApi->Validate");

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
            
            requestOptions.Data = accessKeys;


            // make the HTTP request

            var response = this.Client.Post<Object>("/validate", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("Validate", response);
                if (exception != null) throw exception;
            }

            return response;
        }

        /// <summary>
        ///  
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessKeys"></param>
        /// <returns>Task of void</returns>
        public async System.Threading.Tasks.Task ValidateAsync (AccessKeys accessKeys)
        {
             await ValidateAsyncWithHttpInfo(accessKeys);

        }

        /// <summary>
        ///  
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessKeys"></param>
        /// <returns>Task of ApiResponse</returns>
        public async System.Threading.Tasks.Task<Org.OpenAPITools.Client.ApiResponse<Object>> ValidateAsyncWithHttpInfo (AccessKeys accessKeys)
        {
            // verify the required parameter 'accessKeys' is set
            if (accessKeys == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'accessKeys' when calling DefaultApi->Validate");

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
            
            requestOptions.Data = accessKeys;


            // make the HTTP request

            var response = await this.AsynchronousClient.PostAsync<Object>("/validate", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("Validate", response);
                if (exception != null) throw exception;
            }

            return response;
        }

    }
}
