part of openapi.api;

class PlayerProfileTexturePropertyValue {
  /* UNIX timestamp in milliseconds */
  int timestamp = null;
  /* The player UUID without hyphens */
  String profileId = null;
  /* The player's name */
  String profileName = null;
  /* Only present if unsigned was set to false in the request */
  bool signatureRequired = false;
  
  PlayerTexture textures = null;
  PlayerProfileTexturePropertyValue();

  @override
  String toString() {
    return 'PlayerProfileTexturePropertyValue[timestamp=$timestamp, profileId=$profileId, profileName=$profileName, signatureRequired=$signatureRequired, textures=$textures, ]';
  }

  PlayerProfileTexturePropertyValue.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    timestamp = json['timestamp'];
    profileId = json['profileId'];
    profileName = json['profileName'];
    signatureRequired = json['signatureRequired'];
    textures = new PlayerTexture.fromJson(json['textures']);
  }

  Map<String, dynamic> toJson() {
    return {
      'timestamp': timestamp,
      'profileId': profileId,
      'profileName': profileName,
      'signatureRequired': signatureRequired,
      'textures': textures
    };
  }

  static List<PlayerProfileTexturePropertyValue> listFromJson(List<dynamic> json) {
    return json == null ? new List<PlayerProfileTexturePropertyValue>() : json.map((value) => new PlayerProfileTexturePropertyValue.fromJson(value)).toList();
  }

  static Map<String, PlayerProfileTexturePropertyValue> mapFromJson(Map<String, dynamic> json) {
    var map = new Map<String, PlayerProfileTexturePropertyValue>();
    if (json != null && json.length > 0) {
      json.forEach((String key, dynamic value) => map[key] = new PlayerProfileTexturePropertyValue.fromJson(value));
    }
    return map;
  }
}

