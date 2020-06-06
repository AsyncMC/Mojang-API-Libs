part of openapi.api;

class PlayerProfileProperty {
  /* The property name */
  String name = null;
  /* The serialized property value in base64. */
  String value = null;
  /* signed data using Yggdrasil's private key */
  String signature = null;
  PlayerProfileProperty();

  @override
  String toString() {
    return 'PlayerProfileProperty[name=$name, value=$value, signature=$signature, ]';
  }

  PlayerProfileProperty.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    name = json['name'];
    value = json['value'];
    signature = json['signature'];
  }

  Map<String, dynamic> toJson() {
    return {
      'name': name,
      'value': value,
      'signature': signature
    };
  }

  static List<PlayerProfileProperty> listFromJson(List<dynamic> json) {
    return json == null ? new List<PlayerProfileProperty>() : json.map((value) => new PlayerProfileProperty.fromJson(value)).toList();
  }

  static Map<String, PlayerProfileProperty> mapFromJson(Map<String, dynamic> json) {
    var map = new Map<String, PlayerProfileProperty>();
    if (json != null && json.length > 0) {
      json.forEach((String key, dynamic value) => map[key] = new PlayerProfileProperty.fromJson(value));
    }
    return map;
  }
}

