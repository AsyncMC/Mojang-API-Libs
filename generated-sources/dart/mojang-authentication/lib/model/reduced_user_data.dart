part of openapi.api;

class ReducedUserData {
  
  MultipartFile id = null;
  
  List<GameProfileProperty> properties = [];
  ReducedUserData();

  @override
  String toString() {
    return 'ReducedUserData[id=$id, properties=$properties, ]';
  }

  ReducedUserData.fromJson(Map<String, dynamic> json) {
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

  static List<ReducedUserData> listFromJson(List<dynamic> json) {
    return json == null ? new List<ReducedUserData>() : json.map((value) => new ReducedUserData.fromJson(value)).toList();
  }

  static Map<String, ReducedUserData> mapFromJson(Map<String, dynamic> json) {
    var map = new Map<String, ReducedUserData>();
    if (json != null && json.length > 0) {
      json.forEach((String key, dynamic value) => map[key] = new ReducedUserData.fromJson(value));
    }
    return map;
  }
}

