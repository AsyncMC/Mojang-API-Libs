part of openapi.api;

class PlayerTexture {
  
  PlayerSkinURL SKIN = null;
  
  PlayerTextureURL CAPE = null;
  PlayerTexture();

  @override
  String toString() {
    return 'PlayerTexture[SKIN=$SKIN, CAPE=$CAPE, ]';
  }

  PlayerTexture.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    SKIN = new PlayerSkinURL.fromJson(json['SKIN']);
    CAPE = new PlayerTextureURL.fromJson(json['CAPE']);
  }

  Map<String, dynamic> toJson() {
    return {
      'SKIN': SKIN,
      'CAPE': CAPE
    };
  }

  static List<PlayerTexture> listFromJson(List<dynamic> json) {
    return json == null ? new List<PlayerTexture>() : json.map((value) => new PlayerTexture.fromJson(value)).toList();
  }

  static Map<String, PlayerTexture> mapFromJson(Map<String, dynamic> json) {
    var map = new Map<String, PlayerTexture>();
    if (json != null && json.length > 0) {
      json.forEach((String key, dynamic value) => map[key] = new PlayerTexture.fromJson(value));
    }
    return map;
  }
}

