part of openapi.api;

class AccessKeys {
  
  String accessToken = null;
  
  String clientToken = null;
  AccessKeys();

  @override
  String toString() {
    return 'AccessKeys[accessToken=$accessToken, clientToken=$clientToken, ]';
  }

  AccessKeys.fromJson(Map<String, dynamic> json) {
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

  static List<AccessKeys> listFromJson(List<dynamic> json) {
    return json == null ? new List<AccessKeys>() : json.map((value) => new AccessKeys.fromJson(value)).toList();
  }

  static Map<String, AccessKeys> mapFromJson(Map<String, dynamic> json) {
    var map = new Map<String, AccessKeys>();
    if (json != null && json.length > 0) {
      json.forEach((String key, dynamic value) => map[key] = new AccessKeys.fromJson(value));
    }
    return map;
  }
}

