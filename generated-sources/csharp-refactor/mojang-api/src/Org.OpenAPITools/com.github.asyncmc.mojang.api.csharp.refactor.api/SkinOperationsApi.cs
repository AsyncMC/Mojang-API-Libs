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
    public interface ISkinOperationsApiSync : IApiAccessor
    {
        #region Synchronous Operations
        /// <summary>
        /// Changes the player skin by URL
        /// </summary>
        /// <remarks>
        /// This will set the skin for the selected profile, but Mojang&#39;s servers will fetch the skin from a URL. This will also work for legacy accounts.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="strippedUuid">The player UUID without hyphens</param>
        /// <param name="url">The URL which Mojang servers will download and apply the skin</param>
        /// <param name="model"> (optional)</param>
        /// <returns></returns>
        void ChangePlayerSkin (string strippedUuid, string url, SkinModel model = null);

        /// <summary>
        /// Changes the player skin by URL
        /// </summary>
        /// <remarks>
        /// This will set the skin for the selected profile, but Mojang&#39;s servers will fetch the skin from a URL. This will also work for legacy accounts.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="strippedUuid">The player UUID without hyphens</param>
        /// <param name="url">The URL which Mojang servers will download and apply the skin</param>
        /// <param name="model"> (optional)</param>
        /// <returns>ApiResponse of Object(void)</returns>
        ApiResponse<Object> ChangePlayerSkinWithHttpInfo (string strippedUuid, string url, SkinModel model = null);
        /// <summary>
        /// Resets the player skin to default
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="strippedUuid">The player UUID without hyphens</param>
        /// <returns></returns>
        void ResetPlayerSkin (string strippedUuid);

        /// <summary>
        /// Resets the player skin to default
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="strippedUuid">The player UUID without hyphens</param>
        /// <returns>ApiResponse of Object(void)</returns>
        ApiResponse<Object> ResetPlayerSkinWithHttpInfo (string strippedUuid);
        /// <summary>
        /// Changes the player skin by upload
        /// </summary>
        /// <remarks>
        /// This uploads a skin to Mojang&#39;s servers. It also sets the users skin. This works on legacy counts as well.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="strippedUuid">The player UUID without hyphens</param>
        /// <param name="file">The skin image in PNG format</param>
        /// <param name="model"> (optional)</param>
        /// <returns></returns>
        void UploadPlayerSkin (string strippedUuid, System.IO.Stream file, SkinModel model = null);

        /// <summary>
        /// Changes the player skin by upload
        /// </summary>
        /// <remarks>
        /// This uploads a skin to Mojang&#39;s servers. It also sets the users skin. This works on legacy counts as well.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="strippedUuid">The player UUID without hyphens</param>
        /// <param name="file">The skin image in PNG format</param>
        /// <param name="model"> (optional)</param>
        /// <returns>ApiResponse of Object(void)</returns>
        ApiResponse<Object> UploadPlayerSkinWithHttpInfo (string strippedUuid, System.IO.Stream file, SkinModel model = null);
        #endregion Synchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface ISkinOperationsApiAsync : IApiAccessor
    {
        #region Asynchronous Operations
        /// <summary>
        /// Changes the player skin by URL
        /// </summary>
        /// <remarks>
        /// This will set the skin for the selected profile, but Mojang&#39;s servers will fetch the skin from a URL. This will also work for legacy accounts.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="strippedUuid">The player UUID without hyphens</param>
        /// <param name="url">The URL which Mojang servers will download and apply the skin</param>
        /// <param name="model"> (optional)</param>
        /// <returns>Task of void</returns>
        System.Threading.Tasks.Task ChangePlayerSkinAsync (string strippedUuid, string url, SkinModel model = null);

        /// <summary>
        /// Changes the player skin by URL
        /// </summary>
        /// <remarks>
        /// This will set the skin for the selected profile, but Mojang&#39;s servers will fetch the skin from a URL. This will also work for legacy accounts.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="strippedUuid">The player UUID without hyphens</param>
        /// <param name="url">The URL which Mojang servers will download and apply the skin</param>
        /// <param name="model"> (optional)</param>
        /// <returns>Task of ApiResponse</returns>
        System.Threading.Tasks.Task<ApiResponse<Object>> ChangePlayerSkinAsyncWithHttpInfo (string strippedUuid, string url, SkinModel model = null);
        /// <summary>
        /// Resets the player skin to default
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="strippedUuid">The player UUID without hyphens</param>
        /// <returns>Task of void</returns>
        System.Threading.Tasks.Task ResetPlayerSkinAsync (string strippedUuid);

        /// <summary>
        /// Resets the player skin to default
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="strippedUuid">The player UUID without hyphens</param>
        /// <returns>Task of ApiResponse</returns>
        System.Threading.Tasks.Task<ApiResponse<Object>> ResetPlayerSkinAsyncWithHttpInfo (string strippedUuid);
        /// <summary>
        /// Changes the player skin by upload
        /// </summary>
        /// <remarks>
        /// This uploads a skin to Mojang&#39;s servers. It also sets the users skin. This works on legacy counts as well.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="strippedUuid">The player UUID without hyphens</param>
        /// <param name="file">The skin image in PNG format</param>
        /// <param name="model"> (optional)</param>
        /// <returns>Task of void</returns>
        System.Threading.Tasks.Task UploadPlayerSkinAsync (string strippedUuid, System.IO.Stream file, SkinModel model = null);

        /// <summary>
        /// Changes the player skin by upload
        /// </summary>
        /// <remarks>
        /// This uploads a skin to Mojang&#39;s servers. It also sets the users skin. This works on legacy counts as well.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="strippedUuid">The player UUID without hyphens</param>
        /// <param name="file">The skin image in PNG format</param>
        /// <param name="model"> (optional)</param>
        /// <returns>Task of ApiResponse</returns>
        System.Threading.Tasks.Task<ApiResponse<Object>> UploadPlayerSkinAsyncWithHttpInfo (string strippedUuid, System.IO.Stream file, SkinModel model = null);
        #endregion Asynchronous Operations
    }

    public interface ISkinOperationsApi : ISkinOperationsApiSync, ISkinOperationsApiAsync
    {
        
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public partial class SkinOperationsApi : ISkinOperationsApi
    {
        private Org.OpenAPITools.Client.ExceptionFactory _exceptionFactory = (name, response) => null;
        
        /// <summary>
        /// Initializes a new instance of the <see cref="SkinOperationsApi"/> class.
        /// </summary>
        /// <returns></returns>
        public SkinOperationsApi() : this((string) null)
        {
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="SkinOperationsApi"/> class.
        /// </summary>
        /// <returns></returns>
        public SkinOperationsApi(String basePath)
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
        /// Initializes a new instance of the <see cref="SkinOperationsApi"/> class
        /// using Configuration object
        /// </summary>
        /// <param name="configuration">An instance of Configuration</param>
        /// <returns></returns>
        public SkinOperationsApi(Org.OpenAPITools.Client.Configuration configuration)
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
        public SkinOperationsApi(Org.OpenAPITools.Client.ISynchronousClient client,Org.OpenAPITools.Client.IAsynchronousClient asyncClient, Org.OpenAPITools.Client.IReadableConfiguration configuration)
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
        /// Changes the player skin by URL This will set the skin for the selected profile, but Mojang&#39;s servers will fetch the skin from a URL. This will also work for legacy accounts.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="strippedUuid">The player UUID without hyphens</param>
        /// <param name="url">The URL which Mojang servers will download and apply the skin</param>
        /// <param name="model"> (optional)</param>
        /// <returns></returns>
        public void ChangePlayerSkin (string strippedUuid, string url, SkinModel model = null)
        {
             ChangePlayerSkinWithHttpInfo(strippedUuid, url, model);
        }

        /// <summary>
        /// Changes the player skin by URL This will set the skin for the selected profile, but Mojang&#39;s servers will fetch the skin from a URL. This will also work for legacy accounts.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="strippedUuid">The player UUID without hyphens</param>
        /// <param name="url">The URL which Mojang servers will download and apply the skin</param>
        /// <param name="model"> (optional)</param>
        /// <returns>ApiResponse of Object(void)</returns>
        public Org.OpenAPITools.Client.ApiResponse<Object> ChangePlayerSkinWithHttpInfo (string strippedUuid, string url, SkinModel model = null)
        {
            // verify the required parameter 'strippedUuid' is set
            if (strippedUuid == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'strippedUuid' when calling SkinOperationsApi->ChangePlayerSkin");
            // verify the required parameter 'url' is set
            if (url == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'url' when calling SkinOperationsApi->ChangePlayerSkin");

            Org.OpenAPITools.Client.RequestOptions requestOptions = new Org.OpenAPITools.Client.RequestOptions();

            String[] @contentTypes = new String[] {
                "application/x-www-form-urlencoded"
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
            if (model != null)
            {
                requestOptions.FormParameters.Add("model", Org.OpenAPITools.Client.ClientUtils.ParameterToString(model)); // form parameter
            }
            if (url != null)
            {
                requestOptions.FormParameters.Add("url", Org.OpenAPITools.Client.ClientUtils.ParameterToString(url)); // form parameter
            }

            // authentication (PlayerAccessToken) required
            // http basic authentication required
            if (!String.IsNullOrEmpty(this.Configuration.Username) || !String.IsNullOrEmpty(this.Configuration.Password))
            {
                requestOptions.HeaderParameters.Add("Authorization", "Basic " + Org.OpenAPITools.Client.ClientUtils.Base64Encode(this.Configuration.Username + ":" + this.Configuration.Password));
            }

            // make the HTTP request

            var response = this.Client.Post<Object>("/user/profile/{stripped_uuid}/skin", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("ChangePlayerSkin", response);
                if (exception != null) throw exception;
            }

            return response;
        }

        /// <summary>
        /// Changes the player skin by URL This will set the skin for the selected profile, but Mojang&#39;s servers will fetch the skin from a URL. This will also work for legacy accounts.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="strippedUuid">The player UUID without hyphens</param>
        /// <param name="url">The URL which Mojang servers will download and apply the skin</param>
        /// <param name="model"> (optional)</param>
        /// <returns>Task of void</returns>
        public async System.Threading.Tasks.Task ChangePlayerSkinAsync (string strippedUuid, string url, SkinModel model = null)
        {
             await ChangePlayerSkinAsyncWithHttpInfo(strippedUuid, url, model);

        }

        /// <summary>
        /// Changes the player skin by URL This will set the skin for the selected profile, but Mojang&#39;s servers will fetch the skin from a URL. This will also work for legacy accounts.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="strippedUuid">The player UUID without hyphens</param>
        /// <param name="url">The URL which Mojang servers will download and apply the skin</param>
        /// <param name="model"> (optional)</param>
        /// <returns>Task of ApiResponse</returns>
        public async System.Threading.Tasks.Task<Org.OpenAPITools.Client.ApiResponse<Object>> ChangePlayerSkinAsyncWithHttpInfo (string strippedUuid, string url, SkinModel model = null)
        {
            // verify the required parameter 'strippedUuid' is set
            if (strippedUuid == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'strippedUuid' when calling SkinOperationsApi->ChangePlayerSkin");
            // verify the required parameter 'url' is set
            if (url == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'url' when calling SkinOperationsApi->ChangePlayerSkin");

            Org.OpenAPITools.Client.RequestOptions requestOptions = new Org.OpenAPITools.Client.RequestOptions();

            String[] @contentTypes = new String[] {
                "application/x-www-form-urlencoded"
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
            if (model != null)
            {
                requestOptions.FormParameters.Add("model", Org.OpenAPITools.Client.ClientUtils.ParameterToString(model)); // form parameter
            }
            if (url != null)
            {
                requestOptions.FormParameters.Add("url", Org.OpenAPITools.Client.ClientUtils.ParameterToString(url)); // form parameter
            }

            // authentication (PlayerAccessToken) required
            // http basic authentication required
            if (!String.IsNullOrEmpty(this.Configuration.Username) || !String.IsNullOrEmpty(this.Configuration.Password))
            {
                requestOptions.HeaderParameters.Add("Authorization", "Basic " + Org.OpenAPITools.Client.ClientUtils.Base64Encode(this.Configuration.Username + ":" + this.Configuration.Password));
            }

            // make the HTTP request

            var response = await this.AsynchronousClient.PostAsync<Object>("/user/profile/{stripped_uuid}/skin", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("ChangePlayerSkin", response);
                if (exception != null) throw exception;
            }

            return response;
        }

        /// <summary>
        /// Resets the player skin to default 
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="strippedUuid">The player UUID without hyphens</param>
        /// <returns></returns>
        public void ResetPlayerSkin (string strippedUuid)
        {
             ResetPlayerSkinWithHttpInfo(strippedUuid);
        }

        /// <summary>
        /// Resets the player skin to default 
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="strippedUuid">The player UUID without hyphens</param>
        /// <returns>ApiResponse of Object(void)</returns>
        public Org.OpenAPITools.Client.ApiResponse<Object> ResetPlayerSkinWithHttpInfo (string strippedUuid)
        {
            // verify the required parameter 'strippedUuid' is set
            if (strippedUuid == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'strippedUuid' when calling SkinOperationsApi->ResetPlayerSkin");

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

            // authentication (PlayerAccessToken) required
            // http basic authentication required
            if (!String.IsNullOrEmpty(this.Configuration.Username) || !String.IsNullOrEmpty(this.Configuration.Password))
            {
                requestOptions.HeaderParameters.Add("Authorization", "Basic " + Org.OpenAPITools.Client.ClientUtils.Base64Encode(this.Configuration.Username + ":" + this.Configuration.Password));
            }

            // make the HTTP request

            var response = this.Client.Delete<Object>("/user/profile/{stripped_uuid}/skin", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("ResetPlayerSkin", response);
                if (exception != null) throw exception;
            }

            return response;
        }

        /// <summary>
        /// Resets the player skin to default 
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="strippedUuid">The player UUID without hyphens</param>
        /// <returns>Task of void</returns>
        public async System.Threading.Tasks.Task ResetPlayerSkinAsync (string strippedUuid)
        {
             await ResetPlayerSkinAsyncWithHttpInfo(strippedUuid);

        }

        /// <summary>
        /// Resets the player skin to default 
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="strippedUuid">The player UUID without hyphens</param>
        /// <returns>Task of ApiResponse</returns>
        public async System.Threading.Tasks.Task<Org.OpenAPITools.Client.ApiResponse<Object>> ResetPlayerSkinAsyncWithHttpInfo (string strippedUuid)
        {
            // verify the required parameter 'strippedUuid' is set
            if (strippedUuid == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'strippedUuid' when calling SkinOperationsApi->ResetPlayerSkin");

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

            // authentication (PlayerAccessToken) required
            // http basic authentication required
            if (!String.IsNullOrEmpty(this.Configuration.Username) || !String.IsNullOrEmpty(this.Configuration.Password))
            {
                requestOptions.HeaderParameters.Add("Authorization", "Basic " + Org.OpenAPITools.Client.ClientUtils.Base64Encode(this.Configuration.Username + ":" + this.Configuration.Password));
            }

            // make the HTTP request

            var response = await this.AsynchronousClient.DeleteAsync<Object>("/user/profile/{stripped_uuid}/skin", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("ResetPlayerSkin", response);
                if (exception != null) throw exception;
            }

            return response;
        }

        /// <summary>
        /// Changes the player skin by upload This uploads a skin to Mojang&#39;s servers. It also sets the users skin. This works on legacy counts as well.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="strippedUuid">The player UUID without hyphens</param>
        /// <param name="file">The skin image in PNG format</param>
        /// <param name="model"> (optional)</param>
        /// <returns></returns>
        public void UploadPlayerSkin (string strippedUuid, System.IO.Stream file, SkinModel model = null)
        {
             UploadPlayerSkinWithHttpInfo(strippedUuid, file, model);
        }

        /// <summary>
        /// Changes the player skin by upload This uploads a skin to Mojang&#39;s servers. It also sets the users skin. This works on legacy counts as well.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="strippedUuid">The player UUID without hyphens</param>
        /// <param name="file">The skin image in PNG format</param>
        /// <param name="model"> (optional)</param>
        /// <returns>ApiResponse of Object(void)</returns>
        public Org.OpenAPITools.Client.ApiResponse<Object> UploadPlayerSkinWithHttpInfo (string strippedUuid, System.IO.Stream file, SkinModel model = null)
        {
            // verify the required parameter 'strippedUuid' is set
            if (strippedUuid == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'strippedUuid' when calling SkinOperationsApi->UploadPlayerSkin");
            // verify the required parameter 'file' is set
            if (file == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'file' when calling SkinOperationsApi->UploadPlayerSkin");

            Org.OpenAPITools.Client.RequestOptions requestOptions = new Org.OpenAPITools.Client.RequestOptions();

            String[] @contentTypes = new String[] {
                "multipart/form-data"
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
            if (model != null)
            {
                requestOptions.FormParameters.Add("model", Org.OpenAPITools.Client.ClientUtils.ParameterToString(model)); // form parameter
            }
            if (file != null)
            {
                requestOptions.FileParameters.Add("file", file);
            }

            // authentication (PlayerAccessToken) required
            // http basic authentication required
            if (!String.IsNullOrEmpty(this.Configuration.Username) || !String.IsNullOrEmpty(this.Configuration.Password))
            {
                requestOptions.HeaderParameters.Add("Authorization", "Basic " + Org.OpenAPITools.Client.ClientUtils.Base64Encode(this.Configuration.Username + ":" + this.Configuration.Password));
            }

            // make the HTTP request

            var response = this.Client.Put<Object>("/user/profile/{stripped_uuid}/skin", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("UploadPlayerSkin", response);
                if (exception != null) throw exception;
            }

            return response;
        }

        /// <summary>
        /// Changes the player skin by upload This uploads a skin to Mojang&#39;s servers. It also sets the users skin. This works on legacy counts as well.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="strippedUuid">The player UUID without hyphens</param>
        /// <param name="file">The skin image in PNG format</param>
        /// <param name="model"> (optional)</param>
        /// <returns>Task of void</returns>
        public async System.Threading.Tasks.Task UploadPlayerSkinAsync (string strippedUuid, System.IO.Stream file, SkinModel model = null)
        {
             await UploadPlayerSkinAsyncWithHttpInfo(strippedUuid, file, model);

        }

        /// <summary>
        /// Changes the player skin by upload This uploads a skin to Mojang&#39;s servers. It also sets the users skin. This works on legacy counts as well.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="strippedUuid">The player UUID without hyphens</param>
        /// <param name="file">The skin image in PNG format</param>
        /// <param name="model"> (optional)</param>
        /// <returns>Task of ApiResponse</returns>
        public async System.Threading.Tasks.Task<Org.OpenAPITools.Client.ApiResponse<Object>> UploadPlayerSkinAsyncWithHttpInfo (string strippedUuid, System.IO.Stream file, SkinModel model = null)
        {
            // verify the required parameter 'strippedUuid' is set
            if (strippedUuid == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'strippedUuid' when calling SkinOperationsApi->UploadPlayerSkin");
            // verify the required parameter 'file' is set
            if (file == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'file' when calling SkinOperationsApi->UploadPlayerSkin");

            Org.OpenAPITools.Client.RequestOptions requestOptions = new Org.OpenAPITools.Client.RequestOptions();

            String[] @contentTypes = new String[] {
                "multipart/form-data"
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
            if (model != null)
            {
                requestOptions.FormParameters.Add("model", Org.OpenAPITools.Client.ClientUtils.ParameterToString(model)); // form parameter
            }
            if (file != null)
            {
                requestOptions.FileParameters.Add("file", file);
            }

            // authentication (PlayerAccessToken) required
            // http basic authentication required
            if (!String.IsNullOrEmpty(this.Configuration.Username) || !String.IsNullOrEmpty(this.Configuration.Password))
            {
                requestOptions.HeaderParameters.Add("Authorization", "Basic " + Org.OpenAPITools.Client.ClientUtils.Base64Encode(this.Configuration.Username + ":" + this.Configuration.Password));
            }

            // make the HTTP request

            var response = await this.AsynchronousClient.PutAsync<Object>("/user/profile/{stripped_uuid}/skin", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("UploadPlayerSkin", response);
                if (exception != null) throw exception;
            }

            return response;
        }

    }
}
