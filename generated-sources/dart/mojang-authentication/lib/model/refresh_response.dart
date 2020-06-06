part of openapi.api;

class RefreshResponse {
  
  String accessToken = null;
  
  String clientToken = null;
  RefreshResponse();

  @override
  String toString() {
    return 'RefreshResponse[accessToken=$accessToken, clientToken=$clientToken, ]';
  }

  RefreshResponse.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    accessToken = json['accessToken'];
    clientToken = json['clientToken'];
  }

  Map<String, dynamic> toJson() {
    return {
      'accessToken': accessToken,
      'clientToken': clientToken
    };
  }

  static List<RefreshResponse> listFromJson(List<dynamic> json) {
    return json == null ? new List<RefreshResponse>() : json.map((value) => new RefreshResponse.fromJson(value)).toList();
  }

  static Map<String, RefreshResponse> mapFromJson(Map<String, dynamic> json) {
    var map = new Map<String, RefreshResponse>();
    if (json != null && json.length > 0) {
      json.forEach((String key, dynamic value) => map[key] = new RefreshResponse.fromJson(value));
    }
    return map;
  }
}

