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
    public interface ISecurityQuestionAnswerApi
    {
        /// <summary>
        /// Check if security questions are needed 
        /// </summary>
        /// <returns></returns>
        void CheckSecurityStatus ();
        /// <summary>
        /// Get list of questions 
        /// </summary>
        /// <returns>List&lt;SecurityChallenge&gt;</returns>
        List<SecurityChallenge> ListPendingSecurityQuestions ();
        /// <summary>
        /// Send back the answers 
        /// </summary>
        /// <param name="securityAnswer">An array with all the answers</param>
        /// <returns></returns>
        void SendSecurityQuestionAnswers (List<SecurityAnswer> securityAnswer);
    }
  
    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public class SecurityQuestionAnswerApi : ISecurityQuestionAnswerApi
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="SecurityQuestionAnswerApi"/> class.
        /// </summary>
        /// <param name="apiClient"> an instance of ApiClient (optional)</param>
        /// <returns></returns>
        public SecurityQuestionAnswerApi(ApiClient apiClient = null)
        {
            if (apiClient == null) // use the default one in Configuration
                this.ApiClient = Configuration.DefaultApiClient; 
            else
                this.ApiClient = apiClient;
        }
    
        /// <summary>
        /// Initializes a new instance of the <see cref="SecurityQuestionAnswerApi"/> class.
        /// </summary>
        /// <returns></returns>
        public SecurityQuestionAnswerApi(String basePath)
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
        /// Check if security questions are needed 
        /// </summary>
        /// <returns></returns>            
        public void CheckSecurityStatus ()
        {
            
    
            var path = "/user/security/location";
            path = path.Replace("{format}", "json");
                
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
                                                    
            // authentication setting, if any
            String[] authSettings = new String[] { "PlayerAccessToken" };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.GET, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling CheckSecurityStatus: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling CheckSecurityStatus: " + response.ErrorMessage, response.ErrorMessage);
    
            return;
        }
    
        /// <summary>
        /// Get list of questions 
        /// </summary>
        /// <returns>List&lt;SecurityChallenge&gt;</returns>            
        public List<SecurityChallenge> ListPendingSecurityQuestions ()
        {
            
    
            var path = "/user/security/challenges";
            path = path.Replace("{format}", "json");
                
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
                                                    
            // authentication setting, if any
            String[] authSettings = new String[] { "PlayerAccessToken" };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.GET, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling ListPendingSecurityQuestions: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling ListPendingSecurityQuestions: " + response.ErrorMessage, response.ErrorMessage);
    
            return (List<SecurityChallenge>) ApiClient.Deserialize(response.Content, typeof(List<SecurityChallenge>), response.Headers);
        }
    
        /// <summary>
        /// Send back the answers 
        /// </summary>
        /// <param name="securityAnswer">An array with all the answers</param> 
        /// <returns></returns>            
        public void SendSecurityQuestionAnswers (List<SecurityAnswer> securityAnswer)
        {
            
            // verify the required parameter 'securityAnswer' is set
            if (securityAnswer == null) throw new ApiException(400, "Missing required parameter 'securityAnswer' when calling SendSecurityQuestionAnswers");
            
    
            var path = "/user/security/location";
            path = path.Replace("{format}", "json");
                
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
                                                postBody = ApiClient.Serialize(securityAnswer); // http body (model) parameter
    
            // authentication setting, if any
            String[] authSettings = new String[] { "PlayerAccessToken" };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.POST, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling SendSecurityQuestionAnswers: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling SendSecurityQuestionAnswers: " + response.ErrorMessage, response.ErrorMessage);
    
            return;
        }
    
    }
}
