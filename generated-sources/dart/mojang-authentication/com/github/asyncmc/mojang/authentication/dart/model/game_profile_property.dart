part of openapi.api;

class GameProfileProperty {
  
  String name = null;
  
  String value = null;
  GameProfileProperty();

  @override
  String toString() {
    return 'GameProfileProperty[name=$name, value=$value, ]';
  }

  GameProfileProperty.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    name = json['name'];
    value = json['value'];
  }

  Map<String, dynamic> toJson() {
    return {
      'name': name,
      'value': value
    };
  }

  static List<GameProfileProperty> listFromJson(List<dynamic> json) {
    return json == null ? new List<GameProfileProperty>() : json.map((value) => new GameProfileProperty.fromJson(value)).toList();
  }

  static Map<String, GameProfileProperty> mapFromJson(Map<String, dynamic> json) {
    var map = new Map<String, GameProfileProperty>();
    if (json != null && json.length > 0) {
      json.forEach((String key, dynamic value) => map[key] = new GameProfileProperty.fromJson(value));
    }
    return map;
  }
}

