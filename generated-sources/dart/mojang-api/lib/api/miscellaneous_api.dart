part of openapi.api;



class MiscellaneousApi {
  final ApiClient apiClient;

  MiscellaneousApi([ApiClient apiClient]) : apiClient = apiClient ?? defaultApiClient;

  /// Get statistics on the sales of Minecraft.
  ///
  /// 
  Future<OrderStatisticsResponse> getOrdersStatistics(OrderStatisticsRequest orderStatisticsRequest) async {
    Object postBody = orderStatisticsRequest;

    // verify required params are set
    if(orderStatisticsRequest == null) {
     throw new ApiException(400, "Missing required param: orderStatisticsRequest");
    }

    // create path and map variables
    String path = "/orders/statistics".replaceAll("{format}","json");

    // query params
    List<QueryParam> queryParams = [];
    Map<String, String> headerParams = {};
    Map<String, String> formParams = {};

    List<String> contentTypes = ["application/json"];

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";
    List<String> authNames = ["MojangStatisticsToken"];

    if(contentType.startsWith("multipart/form-data")) {
      bool hasFields = false;
      MultipartRequest mp = new MultipartRequest(null, null);
      if(hasFields)
        postBody = mp;
    }
    else {
    }

    var response = await apiClient.invokeAPI(path,
                                             'POST',
                                             queryParams,
                                             postBody,
                                             headerParams,
                                             formParams,
                                             contentType,
                                             authNames);

    if(response.statusCode >= 400) {
      throw new ApiException(response.statusCode, response.body);
    } else if(response.body != null) {
      return apiClient.deserialize(response.body, 'OrderStatisticsResponse') as OrderStatisticsResponse;
    } else {
      return null;
    }
  }
}
