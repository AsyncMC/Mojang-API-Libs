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
    public interface INameHistoryApi
    {
        /// <summary>
        /// Find the current UUID of multiple players at once Find the current players name, UUID, demo status and migration flag by the current players name. The \&quot;at\&quot; parameter is not supported. Players not found are not returned. If no players are found, an empty array is returned.
        /// </summary>
        /// <param name="requestBody">Array with the player names</param>
        /// <returns>List&lt;CurrentPlayerIDs&gt;</returns>
        List<CurrentPlayerIDs> FindUniqueIdsByName (List<string> requestBody);
        /// <summary>
        /// Gets the full player&#39;s name history 
        /// </summary>
        /// <param name="strippedUuid">The player UUID without hyphens</param>
        /// <returns>List&lt;NameChange&gt;</returns>
        List<NameChange> GetNameHistory (string strippedUuid);
        /// <summary>
        /// Find the UUID by name Find the current player name, UUID, demo status and migration flag by the current player name or at a given time.
        /// </summary>
        /// <param name="username">The username in a given time, or in present if \&quot;at\&quot; is not sent</param>
        /// <param name="at">Find the username in a given time, when 0 selects the original name however, it only works if the name was changed at least once, or if the account is legacy. The time is an UNIX timestamp (without milliseconds)</param>
        /// <returns>CurrentPlayerIDs</returns>
        CurrentPlayerIDs GetUniqueIdByName (string username, long? at);
    }
  
    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public class NameHistoryApi : INameHistoryApi
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="NameHistoryApi"/> class.
        /// </summary>
        /// <param name="apiClient"> an instance of ApiClient (optional)</param>
        /// <returns></returns>
        public NameHistoryApi(ApiClient apiClient = null)
        {
            if (apiClient == null) // use the default one in Configuration
                this.ApiClient = Configuration.DefaultApiClient; 
            else
                this.ApiClient = apiClient;
        }
    
        /// <summary>
        /// Initializes a new instance of the <see cref="NameHistoryApi"/> class.
        /// </summary>
        /// <returns></returns>
        public NameHistoryApi(String basePath)
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
        /// Find the current UUID of multiple players at once Find the current players name, UUID, demo status and migration flag by the current players name. The \&quot;at\&quot; parameter is not supported. Players not found are not returned. If no players are found, an empty array is returned.
        /// </summary>
        /// <param name="requestBody">Array with the player names</param> 
        /// <returns>List&lt;CurrentPlayerIDs&gt;</returns>            
        public List<CurrentPlayerIDs> FindUniqueIdsByName (List<string> requestBody)
        {
            
            // verify the required parameter 'requestBody' is set
            if (requestBody == null) throw new ApiException(400, "Missing required parameter 'requestBody' when calling FindUniqueIdsByName");
            
    
            var path = "/profiles/minecraft";
            path = path.Replace("{format}", "json");
                
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
                                                postBody = ApiClient.Serialize(requestBody); // http body (model) parameter
    
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.POST, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling FindUniqueIdsByName: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling FindUniqueIdsByName: " + response.ErrorMessage, response.ErrorMessage);
    
            return (List<CurrentPlayerIDs>) ApiClient.Deserialize(response.Content, typeof(List<CurrentPlayerIDs>), response.Headers);
        }
    
        /// <summary>
        /// Gets the full player&#39;s name history 
        /// </summary>
        /// <param name="strippedUuid">The player UUID without hyphens</param> 
        /// <returns>List&lt;NameChange&gt;</returns>            
        public List<NameChange> GetNameHistory (string strippedUuid)
        {
            
            // verify the required parameter 'strippedUuid' is set
            if (strippedUuid == null) throw new ApiException(400, "Missing required parameter 'strippedUuid' when calling GetNameHistory");
            
    
            var path = "/user/profiles/{stripped_uuid}/names";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "stripped_uuid" + "}", ApiClient.ParameterToString(strippedUuid));
    
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
                                                    
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.GET, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling GetNameHistory: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling GetNameHistory: " + response.ErrorMessage, response.ErrorMessage);
    
            return (List<NameChange>) ApiClient.Deserialize(response.Content, typeof(List<NameChange>), response.Headers);
        }
    
        /// <summary>
        /// Find the UUID by name Find the current player name, UUID, demo status and migration flag by the current player name or at a given time.
        /// </summary>
        /// <param name="username">The username in a given time, or in present if \&quot;at\&quot; is not sent</param> 
        /// <param name="at">Find the username in a given time, when 0 selects the original name however, it only works if the name was changed at least once, or if the account is legacy. The time is an UNIX timestamp (without milliseconds)</param> 
        /// <returns>CurrentPlayerIDs</returns>            
        public CurrentPlayerIDs GetUniqueIdByName (string username, long? at)
        {
            
            // verify the required parameter 'username' is set
            if (username == null) throw new ApiException(400, "Missing required parameter 'username' when calling GetUniqueIdByName");
            
    
            var path = "/users/profiles/minecraft/{username}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "username" + "}", ApiClient.ParameterToString(username));
    
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
             if (at != null) queryParams.Add("at", ApiClient.ParameterToString(at)); // query parameter
                                        
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.GET, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling GetUniqueIdByName: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling GetUniqueIdByName: " + response.ErrorMessage, response.ErrorMessage);
    
            return (CurrentPlayerIDs) ApiClient.Deserialize(response.Content, typeof(CurrentPlayerIDs), response.Headers);
        }
    
    }
}
