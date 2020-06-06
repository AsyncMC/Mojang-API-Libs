part of openapi.api;

class Authentication {
  
  String accessToken = null;
  
  String clientToken = null;
  Authentication();

  @override
  String toString() {
    return 'Authentication[accessToken=$accessToken, clientToken=$clientToken, ]';
  }

  Authentication.fromJson(Map<String, dynamic> json) {
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

  static List<Authentication> listFromJson(List<dynamic> json) {
    return json == null ? new List<Authentication>() : json.map((value) => new Authentication.fromJson(value)).toList();
  }

  static Map<String, Authentication> mapFromJson(Map<String, dynamic> json) {
    var map = new Map<String, Authentication>();
    if (json != null && json.length > 0) {
      json.forEach((String key, dynamic value) => map[key] = new Authentication.fromJson(value));
    }
    return map;
  }
}

