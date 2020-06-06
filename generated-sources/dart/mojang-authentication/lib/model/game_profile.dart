part of openapi.api;

class GameProfile {
  
  String agent = null;
  
  String id = null;
  
  String name = null;
  
  MultipartFile userId = null;
  /* Unix timestamp in milliseconds */
  int createdAt = null;
  
  bool legacyProfile = null;
  
  bool suspended = null;
  
  bool paid = null;
  
  bool migrated = null;
  
  bool legacy = null;
  GameProfile();

  @override
  String toString() {
    return 'GameProfile[agent=$agent, id=$id, name=$name, userId=$userId, createdAt=$createdAt, legacyProfile=$legacyProfile, suspended=$suspended, paid=$paid, migrated=$migrated, legacy=$legacy, ]';
  }

  GameProfile.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    agent = json['agent'];
    id = json['id'];
    name = json['name'];
    userId = new File.fromJson(json['userId']);
    createdAt = json['createdAt'];
    legacyProfile = json['legacyProfile'];
    suspended = json['suspended'];
    paid = json['paid'];
    migrated = json['migrated'];
    legacy = json['legacy'];
  }

  Map<String, dynamic> toJson() {
    return {
      'agent': agent,
      'id': id,
      'name': name,
      'userId': userId,
      'createdAt': createdAt,
      'legacyProfile': legacyProfile,
      'suspended': suspended,
      'paid': paid,
      'migrated': migrated,
      'legacy': legacy
    };
  }

  static List<GameProfile> listFromJson(List<dynamic> json) {
    return json == null ? new List<GameProfile>() : json.map((value) => new GameProfile.fromJson(value)).toList();
  }

  static Map<String, GameProfile> mapFromJson(Map<String, dynamic> json) {
    var map = new Map<String, GameProfile>();
    if (json != null && json.length > 0) {
      json.forEach((String key, dynamic value) => map[key] = new GameProfile.fromJson(value));
    }
    return map;
  }
}

