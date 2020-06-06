part of openapi.api;

class SecurityAnswerId {
  /* A number giver by Mojang to reply a question */
  int id = null;
  SecurityAnswerId();

  @override
  String toString() {
    return 'SecurityAnswerId[id=$id, ]';
  }

  SecurityAnswerId.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    id = json['id'];
  }

  Map<String, dynamic> toJson() {
    return {
      'id': id
    };
  }

  static List<SecurityAnswerId> listFromJson(List<dynamic> json) {
    return json == null ? new List<SecurityAnswerId>() : json.map((value) => new SecurityAnswerId.fromJson(value)).toList();
  }

  static Map<String, SecurityAnswerId> mapFromJson(Map<String, dynamic> json) {
    var map = new Map<String, SecurityAnswerId>();
    if (json != null && json.length > 0) {
      json.forEach((String key, dynamic value) => map[key] = new SecurityAnswerId.fromJson(value));
    }
    return map;
  }
}

