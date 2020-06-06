using System;
using System.Collections.Generic;
using RestSharp;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Org.OpenAPITools.Api
{
    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IDefaultApi
    {
        /// <summary>
        ///  
        /// </summary>
        /// <param name="authenticationRequest"></param>
        /// <returns>Authentication</returns>
        Authentication Authenticate (AuthenticationRequest authenticationRequest);
        /// <summary>
        ///  
        /// </summary>
        /// <param name="accessKeys"></param>
        /// <returns></returns>
        void Invalidate (AccessKeys accessKeys);
        /// <summary>
        ///  
        /// </summary>
        /// <param name="refreshRequest"></param>
        /// <returns>RefreshResponse</returns>
        RefreshResponse Refresh (RefreshRequest refreshRequest);
        /// <summary>
        ///  
        /// </summary>
        /// <param name="usernamePassword"></param>
        /// <returns></returns>
        void Siginout (UsernamePassword usernamePassword);
        /// <summary>
        ///  
        /// </summary>
        /// <param name="accessKeys"></param>
        /// <returns></returns>
        void Validate (AccessKeys accessKeys);
    }
  
    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public class DefaultApi : IDefaultApi
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="DefaultApi"/> class.
        /// </summary>
        /// <param name="apiClient"> an instance of ApiClient (optional)</param>
        /// <returns></returns>
        public DefaultApi(ApiClient apiClient = null)
        {
            if (apiClient == null) // use the default one in Configuration
                this.ApiClient = Configuration.DefaultApiClient; 
            else
                this.ApiClient = apiClient;
        }
    
        /// <summary>
        /// Initializes a new instance of the <see cref="DefaultApi"/> class.
        /// </summary>
        /// <returns></returns>
        public DefaultApi(String basePath)
        {
            this.ApiClient = new ApiClient(basePath);
        }
    
        /// <summary>
        /// Sets the base path of the API client.
        /// </summary>
        /// <param name="basePath">The base path</param>
        /// <value>The base path</value>
        public void SetBasePath(String basePath)
        {
            this.ApiClient.BasePath = basePath;
        }
    
        /// <summary>
        /// Gets the base path of the API client.
        /// </summary>
        /// <param name="basePath">The base path</param>
        /// <value>The base path</value>
        public String GetBasePath(String basePath)
        {
            return this.ApiClient.BasePath;
        }
    
        /// <summary>
        /// Gets or sets the API client.
        /// </summary>
        /// <value>An instance of the ApiClient</value>
        public ApiClient ApiClient {get; set;}
    
        /// <summary>
        ///  
        /// </summary>
        /// <param name="authenticationRequest"></param> 
        /// <returns>Authentication</returns>            
        public Authentication Authenticate (AuthenticationRequest authenticationRequest)
        {
            
            // verify the required parameter 'authenticationRequest' is set
            if (authenticationRequest == null) throw new ApiException(400, "Missing required parameter 'authenticationRequest' when calling Authenticate");
            
    
            var path = "/authenticate";
            path = path.Replace("{format}", "json");
                
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
                                                postBody = ApiClient.Serialize(authenticationRequest); // http body (model) parameter
    
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.POST, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling Authenticate: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling Authenticate: " + response.ErrorMessage, response.ErrorMessage);
    
            return (Authentication) ApiClient.Deserialize(response.Content, typeof(Authentication), response.Headers);
        }
    
        /// <summary>
        ///  
        /// </summary>
        /// <param name="accessKeys"></param> 
        /// <returns></returns>            
        public void Invalidate (AccessKeys accessKeys)
        {
            
            // verify the required parameter 'accessKeys' is set
            if (accessKeys == null) throw new ApiException(400, "Missing required parameter 'accessKeys' when calling Invalidate");
            
    
            var path = "/invalidate";
            path = path.Replace("{format}", "json");
                
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
                                                postBody = ApiClient.Serialize(accessKeys); // http body (model) parameter
    
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.POST, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling Invalidate: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling Invalidate: " + response.ErrorMessage, response.ErrorMessage);
    
            return;
        }
    
        /// <summary>
        ///  
        /// </summary>
        /// <param name="refreshRequest"></param> 
        /// <returns>RefreshResponse</returns>            
        public RefreshResponse Refresh (RefreshRequest refreshRequest)
        {
            
            // verify the required parameter 'refreshRequest' is set
            if (refreshRequest == null) throw new ApiException(400, "Missing required parameter 'refreshRequest' when calling Refresh");
            
    
            var path = "/refresh";
            path = path.Replace("{format}", "json");
                
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
                                                postBody = ApiClient.Serialize(refreshRequest); // http body (model) parameter
    
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.POST, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling Refresh: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling Refresh: " + response.ErrorMessage, response.ErrorMessage);
    
            return (RefreshResponse) ApiClient.Deserialize(response.Content, typeof(RefreshResponse), response.Headers);
        }
    
        /// <summary>
        ///  
        /// </summary>
        /// <param name="usernamePassword"></param> 
        /// <returns></returns>            
        public void Siginout (UsernamePassword usernamePassword)
        {
            
            // verify the required parameter 'usernamePassword' is set
            if (usernamePassword == null) throw new ApiException(400, "Missing required parameter 'usernamePassword' when calling Siginout");
            
    
            var path = "/signout";
            path = path.Replace("{format}", "json");
                
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
                                                postBody = ApiClient.Serialize(usernamePassword); // http body (model) parameter
    
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.POST, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling Siginout: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling Siginout: " + response.ErrorMessage, response.ErrorMessage);
    
            return;
        }
    
        /// <summary>
        ///  
        /// </summary>
        /// <param name="accessKeys"></param> 
        /// <returns></returns>            
        public void Validate (AccessKeys accessKeys)
        {
            
            // verify the required parameter 'accessKeys' is set
            if (accessKeys == null) throw new ApiException(400, "Missing required parameter 'accessKeys' when calling Validate");
            
    
            var path = "/validate";
            path = path.Replace("{format}", "json");
                
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
                                                postBody = ApiClient.Serialize(accessKeys); // http body (model) parameter
    
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.POST, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling Validate: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling Validate: " + response.ErrorMessage, response.ErrorMessage);
    
            return;
        }
    
    }
}
