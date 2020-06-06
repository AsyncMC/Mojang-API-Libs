part of openapi.api;



class NameHistoryApi {
  final ApiClient apiClient;

  NameHistoryApi([ApiClient apiClient]) : apiClient = apiClient ?? defaultApiClient;

  /// Find the current UUID of multiple players at once
  ///
  /// Find the current players name, UUID, demo status and migration flag by the current players name. The \&quot;at\&quot; parameter is not supported. Players not found are not returned. If no players are found, an empty array is returned.
  Future<List<CurrentPlayerIDs>> findUniqueIdsByName(List<String> requestBody) async {
    Object postBody = requestBody;

    // verify required params are set
    if(requestBody == null) {
     throw new ApiException(400, "Missing required param: requestBody");
    }

    // create path and map variables
    String path = "/profiles/minecraft".replaceAll("{format}","json");

    // query params
    List<QueryParam> queryParams = [];
    Map<String, String> headerParams = {};
    Map<String, String> formParams = {};

    List<String> contentTypes = ["application/json"];

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
      return (apiClient.deserialize(response.body, 'List<CurrentPlayerIDs>') as List).map((item) => item as CurrentPlayerIDs).toList();
    } else {
      return null;
    }
  }
  /// Gets the full player&#39;s name history
  ///
  /// 
  Future<List<NameChange>> getNameHistory(String strippedUuid) async {
    Object postBody;

    // verify required params are set
    if(strippedUuid == null) {
     throw new ApiException(400, "Missing required param: strippedUuid");
    }

    // create path and map variables
    String path = "/user/profiles/{stripped_uuid}/names".replaceAll("{format}","json").replaceAll("{" + "stripped_uuid" + "}", strippedUuid.toString());

    // query params
    List<QueryParam> queryParams = [];
    Map<String, String> headerParams = {};
    Map<String, String> formParams = {};

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
      return (apiClient.deserialize(response.body, 'List<NameChange>') as List).map((item) => item as NameChange).toList();
    } else {
      return null;
    }
  }
  /// Find the UUID by name
  ///
  /// Find the current player name, UUID, demo status and migration flag by the current player name or at a given time.
  Future<CurrentPlayerIDs> getUniqueIdByName(String username, { int at }) async {
    Object postBody;

    // verify required params are set
    if(username == null) {
     throw new ApiException(400, "Missing required param: username");
    }

    // create path and map variables
    String path = "/users/profiles/minecraft/{username}".replaceAll("{format}","json").replaceAll("{" + "username" + "}", username.toString());

    // query params
    List<QueryParam> queryParams = [];
    Map<String, String> headerParams = {};
    Map<String, String> formParams = {};
    if(at != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "at", at));
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
      return apiClient.deserialize(response.body, 'CurrentPlayerIDs') as CurrentPlayerIDs;
    } else {
      return null;
    }
  }
}
