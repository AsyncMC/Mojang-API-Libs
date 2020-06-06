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
    public interface IMiscellaneousApi
    {
        /// <summary>
        /// Get statistics on the sales of Minecraft. 
        /// </summary>
        /// <param name="orderStatisticsRequest">The payload is a json list of options under the metricKeys key. You will receive a single object corresponding to the sum of sales of the requested type(s). You must request at least one type of sale. Below is the default list used by https://minecraft.net/en/stats/</param>
        /// <returns>OrderStatisticsResponse</returns>
        OrderStatisticsResponse GetOrdersStatistics (OrderStatisticsRequest orderStatisticsRequest);
    }
  
    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public class MiscellaneousApi : IMiscellaneousApi
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="MiscellaneousApi"/> class.
        /// </summary>
        /// <param name="apiClient"> an instance of ApiClient (optional)</param>
        /// <returns></returns>
        public MiscellaneousApi(ApiClient apiClient = null)
        {
            if (apiClient == null) // use the default one in Configuration
                this.ApiClient = Configuration.DefaultApiClient; 
            else
                this.ApiClient = apiClient;
        }
    
        /// <summary>
        /// Initializes a new instance of the <see cref="MiscellaneousApi"/> class.
        /// </summary>
        /// <returns></returns>
        public MiscellaneousApi(String basePath)
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
        /// Get statistics on the sales of Minecraft. 
        /// </summary>
        /// <param name="orderStatisticsRequest">The payload is a json list of options under the metricKeys key. You will receive a single object corresponding to the sum of sales of the requested type(s). You must request at least one type of sale. Below is the default list used by https://minecraft.net/en/stats/</param> 
        /// <returns>OrderStatisticsResponse</returns>            
        public OrderStatisticsResponse GetOrdersStatistics (OrderStatisticsRequest orderStatisticsRequest)
        {
            
            // verify the required parameter 'orderStatisticsRequest' is set
            if (orderStatisticsRequest == null) throw new ApiException(400, "Missing required parameter 'orderStatisticsRequest' when calling GetOrdersStatistics");
            
    
            var path = "/orders/statistics";
            path = path.Replace("{format}", "json");
                
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
                                                postBody = ApiClient.Serialize(orderStatisticsRequest); // http body (model) parameter
    
            // authentication setting, if any
            String[] authSettings = new String[] { "MojangStatisticsToken" };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.POST, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling GetOrdersStatistics: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling GetOrdersStatistics: " + response.ErrorMessage, response.ErrorMessage);
    
            return (OrderStatisticsResponse) ApiClient.Deserialize(response.Content, typeof(OrderStatisticsResponse), response.Headers);
        }
    
    }
}
