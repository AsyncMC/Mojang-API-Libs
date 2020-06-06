part of openapi.api;

class ProfileId {
  
  String id = null;
  /* The player name */
  String name = null;
  ProfileId();

  @override
  String toString() {
    return 'ProfileId[id=$id, name=$name, ]';
  }

  ProfileId.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    id = json['id'];
    name = json['name'];
  }

  Map<String, dynamic> toJson() {
    return {
      'id': id,
      'name': name
    };
  }

  static List<ProfileId> listFromJson(List<dynamic> json) {
    return json == null ? new List<ProfileId>() : json.map((value) => new ProfileId.fromJson(value)).toList();
  }

  static Map<String, ProfileId> mapFromJson(Map<String, dynamic> json) {
    var map = new Map<String, ProfileId>();
    if (json != null && json.length > 0) {
      json.forEach((String key, dynamic value) => map[key] = new ProfileId.fromJson(value));
    }
    return map;
  }
}

