part of openapi.api;

class PlayerSkinMetadata {
  /* The player model, currently only \"slim\" (Alex) is valid, for Steve's model this property must be absent. */
  String model = null;
  //enum modelEnum {  slim,  };{
  PlayerSkinMetadata();

  @override
  String toString() {
    return 'PlayerSkinMetadata[model=$model, ]';
  }

  PlayerSkinMetadata.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    model = json['model'];
  }

  Map<String, dynamic> toJson() {
    return {
      'model': model
    };
  }

  static List<PlayerSkinMetadata> listFromJson(List<dynamic> json) {
    return json == null ? new List<PlayerSkinMetadata>() : json.map((value) => new PlayerSkinMetadata.fromJson(value)).toList();
  }

  static Map<String, PlayerSkinMetadata> mapFromJson(Map<String, dynamic> json) {
    var map = new Map<String, PlayerSkinMetadata>();
    if (json != null && json.length > 0) {
      json.forEach((String key, dynamic value) => map[key] = new PlayerSkinMetadata.fromJson(value));
    }
    return map;
  }
}

