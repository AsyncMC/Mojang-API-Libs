part of openapi.api;

class RefreshRequest {
  
  String accessToken = null;
  
  String clientToken = null;
  RefreshRequest();

  @override
  String toString() {
    return 'RefreshRequest[accessToken=$accessToken, clientToken=$clientToken, ]';
  }

  RefreshRequest.fromJson(Map<String, dynamic> json) {
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

  static List<RefreshRequest> listFromJson(List<dynamic> json) {
    return json == null ? new List<RefreshRequest>() : json.map((value) => new RefreshRequest.fromJson(value)).toList();
  }

  static Map<String, RefreshRequest> mapFromJson(Map<String, dynamic> json) {
    var map = new Map<String, RefreshRequest>();
    if (json != null && json.length > 0) {
      json.forEach((String key, dynamic value) => map[key] = new RefreshRequest.fromJson(value));
    }
    return map;
  }
}

