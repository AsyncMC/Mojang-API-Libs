part of openapi.api;

class PlayerSkinURL {
  /* The URL to the texture, must be in Mojang's domains. */
  String url = null;
  PlayerSkinURL();

  @override
  String toString() {
    return 'PlayerSkinURL[url=$url, ]';
  }

  PlayerSkinURL.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    url = json['url'];
  }

  Map<String, dynamic> toJson() {
    return {
      'url': url
    };
  }

  static List<PlayerSkinURL> listFromJson(List<dynamic> json) {
    return json == null ? new List<PlayerSkinURL>() : json.map((value) => new PlayerSkinURL.fromJson(value)).toList();
  }

  static Map<String, PlayerSkinURL> mapFromJson(Map<String, dynamic> json) {
    var map = new Map<String, PlayerSkinURL>();
    if (json != null && json.length > 0) {
      json.forEach((String key, dynamic value) => map[key] = new PlayerSkinURL.fromJson(value));
    }
    return map;
  }
}

