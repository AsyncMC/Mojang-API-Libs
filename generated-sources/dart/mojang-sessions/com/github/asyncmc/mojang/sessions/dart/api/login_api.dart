part of openapi.api;



class LoginApi {
  final ApiClient apiClient;

  LoginApi([ApiClient apiClient]) : apiClient = apiClient ?? defaultApiClient;

  /// Gets the player&#39;s game profile
  ///
  /// This will return the player&#39;s username plus any additional information about them (e.g. skins). This has a much stricter rate limit: You can request the same profile once per minute, however you can send as many unique requests as you like.
  Future<PlayerProfile> getPlayerProfile(String strippedUuid, { bool unsigned }) async {
    Object postBody;

    // verify required params are set
    if(strippedUuid == null) {
     throw new ApiException(400, "Missing required param: strippedUuid");
    }

    // create path and map variables
    String path = "/session/minecraft/profile/{stripped_uuid}".replaceAll("{format}","json").replaceAll("{" + "stripped_uuid" + "}", strippedUuid.toString());

    // query params
    List<QueryParam> queryParams = [];
    Map<String, String> headerParams = {};
    Map<String, String> formParams = {};
    if(unsigned != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "unsigned", unsigned));
    }

    List<String> contentTypes = [];

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";
    List<String> authNames = [];

    if(contentType.startsWith("multipart/form-data")) {
      bool hasFields = false;
      MultipartRequest mp = new MultipartRequest(null, null);
      if(hasFields)
        postBody = mp;
    }
    else {
    }

    var response = await apiClient.invokeAPI(path,
                                             'GET',
                                             queryParams,
                                             postBody,
                                             headerParams,
                                             formParams,
                                             contentType,
                                             authNames);

    if(response.statusCode >= 400) {
      throw new ApiException(response.statusCode, response.body);
    } else if(response.body != null) {
      return apiClient.deserialize(response.body, 'PlayerProfile') as PlayerProfile;
    } else {
      return null;
    }
  }
}
