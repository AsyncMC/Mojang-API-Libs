part of openapi.api;

class UsernamePassword {
  /* The Mojang account e-mail or username. Never store it. */
  String username = null;
  /* The Mojang account password, never store it. */
  String password = null;
  UsernamePassword();

  @override
  String toString() {
    return 'UsernamePassword[username=$username, password=$password, ]';
  }

  UsernamePassword.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    username = json['username'];
    password = json['password'];
  }

  Map<String, dynamic> toJson() {
    return {
      'username': username,
      'password': password
    };
  }

  static List<UsernamePassword> listFromJson(List<dynamic> json) {
    return json == null ? new List<UsernamePassword>() : json.map((value) => new UsernamePassword.fromJson(value)).toList();
  }

  static Map<String, UsernamePassword> mapFromJson(Map<String, dynamic> json) {
    var map = new Map<String, UsernamePassword>();
    if (json != null && json.length > 0) {
      json.forEach((String key, dynamic value) => map[key] = new UsernamePassword.fromJson(value));
    }
    return map;
  }
}

