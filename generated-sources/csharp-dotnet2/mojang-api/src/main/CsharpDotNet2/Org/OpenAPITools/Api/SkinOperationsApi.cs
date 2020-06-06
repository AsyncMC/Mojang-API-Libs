using System;
using System.Collections.Generic;
using RestSharp;
using Org.OpenAPITools.Client;
using com.github.asyncmc.mojang.api.csharp.dotnet2.model;

namespace com.github.asyncmc.mojang.api.csharp.dotnet2.api
{
    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface ISkinOperationsApi
    {
        /// <summary>
        /// Changes the player skin by URL This will set the skin for the selected profile, but Mojang&#39;s servers will fetch the skin from a URL. This will also work for legacy accounts.
        /// </summary>
        /// <param name="strippedUuid">The player UUID without hyphens</param>
        /// <param name="url">The URL which Mojang servers will download and apply the skin</param>
        /// <param name="model"></param>
        /// <returns></returns>
        void ChangePlayerSkin (string strippedUuid, string url, SkinModel model);
        /// <summary>
        /// Resets the player skin to default 
        /// </summary>
        /// <param name="strippedUuid">The player UUID without hyphens</param>
        /// <returns></returns>
        void ResetPlayerSkin (string strippedUuid);
        /// <summary>
        /// Changes the player skin by upload This uploads a skin to Mojang&#39;s servers. It also sets the users skin. This works on legacy counts as well.
        /// </summary>
        /// <param name="strippedUuid">The player UUID without hyphens</param>
        /// <param name="file">The skin image in PNG format</param>
        /// <param name="model"></param>
        /// <returns></returns>
        void UploadPlayerSkin (string strippedUuid, System.IO.Stream file, SkinModel model);
    }
  
    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public class SkinOperationsApi : ISkinOperationsApi
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="SkinOperationsApi"/> class.
        /// </summary>
        /// <param name="apiClient"> an instance of ApiClient (optional)</param>
        /// <returns></returns>
        public SkinOperationsApi(ApiClient apiClient = null)
        {
            if (apiClient == null) // use the default one in Configuration
                this.ApiClient = Configuration.DefaultApiClient; 
            else
                this.ApiClient = apiClient;
        }
    
        /// <summary>
        /// Initializes a new instance of the <see cref="SkinOperationsApi"/> class.
        /// </summary>
        /// <returns></returns>
        public SkinOperationsApi(String basePath)
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
        /// Changes the player skin by URL This will set the skin for the selected profile, but Mojang&#39;s servers will fetch the skin from a URL. This will also work for legacy accounts.
        /// </summary>
        /// <param name="strippedUuid">The player UUID without hyphens</param> 
        /// <param name="url">The URL which Mojang servers will download and apply the skin</param> 
        /// <param name="model"></param> 
        /// <returns></returns>            
        public void ChangePlayerSkin (string strippedUuid, string url, SkinModel model)
        {
            
            // verify the required parameter 'strippedUuid' is set
            if (strippedUuid == null) throw new ApiException(400, "Missing required parameter 'strippedUuid' when calling ChangePlayerSkin");
            
            // verify the required parameter 'url' is set
            if (url == null) throw new ApiException(400, "Missing required parameter 'url' when calling ChangePlayerSkin");
            
    
            var path = "/user/profile/{stripped_uuid}/skin";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "stripped_uuid" + "}", ApiClient.ParameterToString(strippedUuid));
    
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
                                    if (model != null) formParams.Add("model", ApiClient.ParameterToString(model)); // form parameter
if (url != null) formParams.Add("url", ApiClient.ParameterToString(url)); // form parameter
                
            // authentication setting, if any
            String[] authSettings = new String[] { "PlayerAccessToken" };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.POST, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling ChangePlayerSkin: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling ChangePlayerSkin: " + response.ErrorMessage, response.ErrorMessage);
    
            return;
        }
    
        /// <summary>
        /// Resets the player skin to default 
        /// </summary>
        /// <param name="strippedUuid">The player UUID without hyphens</param> 
        /// <returns></returns>            
        public void ResetPlayerSkin (string strippedUuid)
        {
            
            // verify the required parameter 'strippedUuid' is set
            if (strippedUuid == null) throw new ApiException(400, "Missing required parameter 'strippedUuid' when calling ResetPlayerSkin");
            
    
            var path = "/user/profile/{stripped_uuid}/skin";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "stripped_uuid" + "}", ApiClient.ParameterToString(strippedUuid));
    
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
                                                    
            // authentication setting, if any
            String[] authSettings = new String[] { "PlayerAccessToken" };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.DELETE, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling ResetPlayerSkin: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling ResetPlayerSkin: " + response.ErrorMessage, response.ErrorMessage);
    
            return;
        }
    
        /// <summary>
        /// Changes the player skin by upload This uploads a skin to Mojang&#39;s servers. It also sets the users skin. This works on legacy counts as well.
        /// </summary>
        /// <param name="strippedUuid">The player UUID without hyphens</param> 
        /// <param name="file">The skin image in PNG format</param> 
        /// <param name="model"></param> 
        /// <returns></returns>            
        public void UploadPlayerSkin (string strippedUuid, System.IO.Stream file, SkinModel model)
        {
            
            // verify the required parameter 'strippedUuid' is set
            if (strippedUuid == null) throw new ApiException(400, "Missing required parameter 'strippedUuid' when calling UploadPlayerSkin");
            
            // verify the required parameter 'file' is set
            if (file == null) throw new ApiException(400, "Missing required parameter 'file' when calling UploadPlayerSkin");
            
    
            var path = "/user/profile/{stripped_uuid}/skin";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "stripped_uuid" + "}", ApiClient.ParameterToString(strippedUuid));
    
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
                                    if (model != null) formParams.Add("model", ApiClient.ParameterToString(model)); // form parameter
if (file != null) fileParams.Add("file", ApiClient.ParameterToFile("file", file));
                
            // authentication setting, if any
            String[] authSettings = new String[] { "PlayerAccessToken" };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.PUT, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling UploadPlayerSkin: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling UploadPlayerSkin: " + response.ErrorMessage, response.ErrorMessage);
    
            return;
        }
    
    }
}
