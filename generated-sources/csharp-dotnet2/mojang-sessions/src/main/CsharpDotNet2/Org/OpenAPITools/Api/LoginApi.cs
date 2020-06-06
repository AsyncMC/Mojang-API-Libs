using System;
using System.Collections.Generic;
using RestSharp;
using Org.OpenAPITools.Client;
using com.github.asyncmc.mojang.sessions.csharp.dotnet2.model;

namespace com.github.asyncmc.mojang.sessions.csharp.dotnet2.api
{
    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface ILoginApi
    {
        /// <summary>
        /// Gets the player&#39;s game profile This will return the player&#39;s username plus any additional information about them (e.g. skins). This has a much stricter rate limit: You can request the same profile once per minute, however you can send as many unique requests as you like.
        /// </summary>
        /// <param name="strippedUuid">The player UUID without hyphens</param>
        /// <param name="unsigned">When set to false, the signature data are sent</param>
        /// <returns>PlayerProfile</returns>
        PlayerProfile GetPlayerProfile (string strippedUuid, bool? unsigned);
    }
  
    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public class LoginApi : ILoginApi
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="LoginApi"/> class.
        /// </summary>
        /// <param name="apiClient"> an instance of ApiClient (optional)</param>
        /// <returns></returns>
        public LoginApi(ApiClient apiClient = null)
        {
            if (apiClient == null) // use the default one in Configuration
                this.ApiClient = Configuration.DefaultApiClient; 
            else
                this.ApiClient = apiClient;
        }
    
        /// <summary>
        /// Initializes a new instance of the <see cref="LoginApi"/> class.
        /// </summary>
        /// <returns></returns>
        public LoginApi(String basePath)
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
        /// Gets the player&#39;s game profile This will return the player&#39;s username plus any additional information about them (e.g. skins). This has a much stricter rate limit: You can request the same profile once per minute, however you can send as many unique requests as you like.
        /// </summary>
        /// <param name="strippedUuid">The player UUID without hyphens</param> 
        /// <param name="unsigned">When set to false, the signature data are sent</param> 
        /// <returns>PlayerProfile</returns>            
        public PlayerProfile GetPlayerProfile (string strippedUuid, bool? unsigned)
        {
            
            // verify the required parameter 'strippedUuid' is set
            if (strippedUuid == null) throw new ApiException(400, "Missing required parameter 'strippedUuid' when calling GetPlayerProfile");
            
    
            var path = "/session/minecraft/profile/{stripped_uuid}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "stripped_uuid" + "}", ApiClient.ParameterToString(strippedUuid));
    
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
             if (unsigned != null) queryParams.Add("unsigned", ApiClient.ParameterToString(unsigned)); // query parameter
                                        
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.GET, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling GetPlayerProfile: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling GetPlayerProfile: " + response.ErrorMessage, response.ErrorMessage);
    
            return (PlayerProfile) ApiClient.Deserialize(response.Content, typeof(PlayerProfile), response.Headers);
        }
    
    }
}
