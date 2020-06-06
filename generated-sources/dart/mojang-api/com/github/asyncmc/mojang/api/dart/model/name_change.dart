part of openapi.api;

class NameChange {
  /* The new player name */
  String name = null;
  /* Time which the name was changed in UNIX Timestamp without milliseconds. Usually absent for the first entry. */
  int changedToAt = null;
  NameChange();

  @override
  String toString() {
    return 'NameChange[name=$name, changedToAt=$changedToAt, ]';
  }

  NameChange.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    name = json['name'];
    changedToAt = json['changedToAt'];
  }

  Map<String, dynamic> toJson() {
    return {
      'name': name,
      'changedToAt': changedToAt
    };
  }

  static List<NameChange> listFromJson(List<dynamic> json) {
    return json == null ? new List<NameChange>() : json.map((value) => new NameChange.fromJson(value)).toList();
  }

  static Map<String, NameChange> mapFromJson(Map<String, dynamic> json) {
    var map = new Map<String, NameChange>();
    if (json != null && json.length > 0) {
      json.forEach((String key, dynamic value) => map[key] = new NameChange.fromJson(value));
    }
    return map;
  }
}

