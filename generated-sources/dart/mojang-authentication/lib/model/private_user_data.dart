part of openapi.api;

class PrivateUserData {
  
  MultipartFile id = null;
  
  List<GameProfileProperty> properties = [];
  PrivateUserData();

  @override
  String toString() {
    return 'PrivateUserData[id=$id, properties=$properties, ]';
  }

  PrivateUserData.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    id = new File.fromJson(json['id']);
    properties = GameProfileProperty.listFromJson(json['properties']);
  }

  Map<String, dynamic> toJson() {
    return {
      'id': id,
      'properties': properties
    };
  }

  static List<PrivateUserData> listFromJson(List<dynamic> json) {
    return json == null ? new List<PrivateUserData>() : json.map((value) => new PrivateUserData.fromJson(value)).toList();
  }

  static Map<String, PrivateUserData> mapFromJson(Map<String, dynamic> json) {
    var map = new Map<String, PrivateUserData>();
    if (json != null && json.length > 0) {
      json.forEach((String key, dynamic value) => map[key] = new PrivateUserData.fromJson(value));
    }
    return map;
  }
}

