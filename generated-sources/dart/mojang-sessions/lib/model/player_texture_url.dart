part of openapi.api;

class PlayerTextureURL {
  /* The URL to the texture, must be in Mojang's domains. */
  String url = null;
  PlayerTextureURL();

  @override
  String toString() {
    return 'PlayerTextureURL[url=$url, ]';
  }

  PlayerTextureURL.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    url = json['url'];
  }

  Map<String, dynamic> toJson() {
    return {
      'url': url
    };
  }

  static List<PlayerTextureURL> listFromJson(List<dynamic> json) {
    return json == null ? new List<PlayerTextureURL>() : json.map((value) => new PlayerTextureURL.fromJson(value)).toList();
  }

  static Map<String, PlayerTextureURL> mapFromJson(Map<String, dynamic> json) {
    var map = new Map<String, PlayerTextureURL>();
    if (json != null && json.length > 0) {
      json.forEach((String key, dynamic value) => map[key] = new PlayerTextureURL.fromJson(value));
    }
    return map;
  }
}

