part of openapi.api;

class CurrentPlayerIDs {
  /* The player UUID without hyphens */
  String id = null;
  /* The current name being used by this player */
  String name = null;
  /* If account has not been converted */
  bool legacy = false;
  /* If the player has not puchased the game */
  bool demo = false;
  CurrentPlayerIDs();

  @override
  String toString() {
    return 'CurrentPlayerIDs[id=$id, name=$name, legacy=$legacy, demo=$demo, ]';
  }

  CurrentPlayerIDs.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    id = json['id'];
    name = json['name'];
    legacy = json['legacy'];
    demo = json['demo'];
  }

  Map<String, dynamic> toJson() {
    return {
      'id': id,
      'name': name,
      'legacy': legacy,
      'demo': demo
    };
  }

  static List<CurrentPlayerIDs> listFromJson(List<dynamic> json) {
    return json == null ? new List<CurrentPlayerIDs>() : json.map((value) => new CurrentPlayerIDs.fromJson(value)).toList();
  }

  static Map<String, CurrentPlayerIDs> mapFromJson(Map<String, dynamic> json) {
    var map = new Map<String, CurrentPlayerIDs>();
    if (json != null && json.length > 0) {
      json.forEach((String key, dynamic value) => map[key] = new CurrentPlayerIDs.fromJson(value));
    }
    return map;
  }
}

