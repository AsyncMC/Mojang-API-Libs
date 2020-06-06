part of openapi.api;



class SkinOperationsApi {
  final ApiClient apiClient;

  SkinOperationsApi([ApiClient apiClient]) : apiClient = apiClient ?? defaultApiClient;

  /// Changes the player skin by URL
  ///
  /// This will set the skin for the selected profile, but Mojang&#39;s servers will fetch the skin from a URL. This will also work for legacy accounts.
  Future changePlayerSkin(String strippedUuid, String url, { SkinModel model }) async {
    Object postBody;

    // verify required params are set
    if(strippedUuid == null) {
     throw new ApiException(400, "Missing required param: strippedUuid");
    }
    if(url == null) {
     throw new ApiException(400, "Missing required param: url");
    }

    // create path and map variables
    String path = "/user/profile/{stripped_uuid}/skin".replaceAll("{format}","json").replaceAll("{" + "stripped_uuid" + "}", strippedUuid.toString());

    // query params
    List<QueryParam> queryParams = [];
    Map<String, String> headerParams = {};
    Map<String, String> formParams = {};

    List<String> contentTypes = ["application/x-www-form-urlencoded"];

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";
    List<String> authNames = ["PlayerAccessToken"];

    if(contentType.startsWith("multipart/form-data")) {
      bool hasFields = false;
      MultipartRequest mp = new MultipartRequest(null, null);
      if (model != null) {
        hasFields = true;
        mp.fields['model'] = parameterToString(model);
      }
      if (url != null) {
        hasFields = true;
        mp.fields['url'] = parameterToString(url);
      }
      if(hasFields)
        postBody = mp;
    }
    else {
      if (model != null)
        formParams['model'] = parameterToString(model);
      if (url != null)
        formParams['url'] = parameterToString(url);
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
    } else {
      return;
    }
  }
  /// Resets the player skin to default
  ///
  /// 
  Future resetPlayerSkin(String strippedUuid) async {
    Object postBody;

    // verify required params are set
    if(strippedUuid == null) {
     throw new ApiException(400, "Missing required param: strippedUuid");
    }

    // create path and map variables
    String path = "/user/profile/{stripped_uuid}/skin".replaceAll("{format}","json").replaceAll("{" + "stripped_uuid" + "}", strippedUuid.toString());

    // query params
    List<QueryParam> queryParams = [];
    Map<String, String> headerParams = {};
    Map<String, String> formParams = {};

    List<String> contentTypes = [];

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";
    List<String> authNames = ["PlayerAccessToken"];

    if(contentType.startsWith("multipart/form-data")) {
      bool hasFields = false;
      MultipartRequest mp = new MultipartRequest(null, null);
      if(hasFields)
        postBody = mp;
    }
    else {
    }

    var response = await apiClient.invokeAPI(path,
                                             'DELETE',
                                             queryParams,
                                             postBody,
                                             headerParams,
                                             formParams,
                                             contentType,
                                             authNames);

    if(response.statusCode >= 400) {
      throw new ApiException(response.statusCode, response.body);
    } else if(response.body != null) {
    } else {
      return;
    }
  }
  /// Changes the player skin by upload
  ///
  /// This uploads a skin to Mojang&#39;s servers. It also sets the users skin. This works on legacy counts as well.
  Future uploadPlayerSkin(String strippedUuid, MultipartFile file, { SkinModel model }) async {
    Object postBody;

    // verify required params are set
    if(strippedUuid == null) {
     throw new ApiException(400, "Missing required param: strippedUuid");
    }
    if(file == null) {
     throw new ApiException(400, "Missing required param: file");
    }

    // create path and map variables
    String path = "/user/profile/{stripped_uuid}/skin".replaceAll("{format}","json").replaceAll("{" + "stripped_uuid" + "}", strippedUuid.toString());

    // query params
    List<QueryParam> queryParams = [];
    Map<String, String> headerParams = {};
    Map<String, String> formParams = {};

    List<String> contentTypes = ["multipart/form-data"];

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";
    List<String> authNames = ["PlayerAccessToken"];

    if(contentType.startsWith("multipart/form-data")) {
      bool hasFields = false;
      MultipartRequest mp = new MultipartRequest(null, null);
      if (model != null) {
        hasFields = true;
        mp.fields['model'] = parameterToString(model);
      }
      if (file != null) {
        hasFields = true;
        mp.fields['file'] = file.field;
        mp.files.add(file);
      }
      if(hasFields)
        postBody = mp;
    }
    else {
      if (model != null)
        formParams['model'] = parameterToString(model);
    }

    var response = await apiClient.invokeAPI(path,
                                             'PUT',
                                             queryParams,
                                             postBody,
                                             headerParams,
                                             formParams,
                                             contentType,
                                             authNames);

    if(response.statusCode >= 400) {
      throw new ApiException(response.statusCode, response.body);
    } else if(response.body != null) {
    } else {
      return;
    }
  }
}
