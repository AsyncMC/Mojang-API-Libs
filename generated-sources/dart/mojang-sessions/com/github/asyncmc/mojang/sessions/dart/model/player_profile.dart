part of openapi.api;

class PlayerProfile {
  /* The player UUID without hyphens */
  String id = null;
  
  String name = null;
  /* Will appear in the response if the user has not migrated their minecraft.net account to Mojang. */
  bool legacy = false;
  /* An array with all player properties, like skin and cape */
  List<PlayerProfileProperty> properties = [];
  PlayerProfile();

  @override
  String toString() {
    return 'PlayerProfile[id=$id, name=$name, legacy=$legacy, properties=$properties, ]';
  }

  PlayerProfile.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    id = json['id'];
    name = json['name'];
    legacy = json['legacy'];
    properties = PlayerProfileProperty.listFromJson(json['properties']);
  }

  Map<String, dynamic> toJson() {
    return {
      'id': id,
      'name': name,
      'legacy': legacy,
      'properties': properties
    };
  }

  static List<PlayerProfile> listFromJson(List<dynamic> json) {
    return json == null ? new List<PlayerProfile>() : json.map((value) => new PlayerProfile.fromJson(value)).toList();
  }

  static Map<String, PlayerProfile> mapFromJson(Map<String, dynamic> json) {
    var map = new Map<String, PlayerProfile>();
    if (json != null && json.length > 0) {
      json.forEach((String key, dynamic value) => map[key] = new PlayerProfile.fromJson(value));
    }
    return map;
  }
}

