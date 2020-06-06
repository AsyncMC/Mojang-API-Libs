part of openapi.api;



class SecurityQuestionAnswerApi {
  final ApiClient apiClient;

  SecurityQuestionAnswerApi([ApiClient apiClient]) : apiClient = apiClient ?? defaultApiClient;

  /// Check if security questions are needed
  ///
  /// 
  Future checkSecurityStatus() async {
    Object postBody;

    // verify required params are set

    // create path and map variables
    String path = "/user/security/location".replaceAll("{format}","json");

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
    } else {
      return;
    }
  }
  /// Get list of questions
  ///
  /// 
  Future<List<SecurityChallenge>> listPendingSecurityQuestions() async {
    Object postBody;

    // verify required params are set

    // create path and map variables
    String path = "/user/security/challenges".replaceAll("{format}","json");

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
      return (apiClient.deserialize(response.body, 'List<SecurityChallenge>') as List).map((item) => item as SecurityChallenge).toList();
    } else {
      return null;
    }
  }
  /// Send back the answers
  ///
  /// 
  Future sendSecurityQuestionAnswers(List<SecurityAnswer> securityAnswer) async {
    Object postBody = securityAnswer;

    // verify required params are set
    if(securityAnswer == null) {
     throw new ApiException(400, "Missing required param: securityAnswer");
    }

    // create path and map variables
    String path = "/user/security/location".replaceAll("{format}","json");

    // query params
    List<QueryParam> queryParams = [];
    Map<String, String> headerParams = {};
    Map<String, String> formParams = {};

    List<String> contentTypes = ["application/json"];

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
}
