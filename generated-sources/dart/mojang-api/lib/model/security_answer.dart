part of openapi.api;

class SecurityAnswer {
  /* A number giver by Mojang to reply a question */
  int id = null;
  SecurityAnswer();

  @override
  String toString() {
    return 'SecurityAnswer[id=$id, ]';
  }

  SecurityAnswer.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    id = json['id'];
  }

  Map<String, dynamic> toJson() {
    return {
      'id': id
    };
  }

  static List<SecurityAnswer> listFromJson(List<dynamic> json) {
    return json == null ? new List<SecurityAnswer>() : json.map((value) => new SecurityAnswer.fromJson(value)).toList();
  }

  static Map<String, SecurityAnswer> mapFromJson(Map<String, dynamic> json) {
    var map = new Map<String, SecurityAnswer>();
    if (json != null && json.length > 0) {
      json.forEach((String key, dynamic value) => map[key] = new SecurityAnswer.fromJson(value));
    }
    return map;
  }
}

