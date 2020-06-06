part of openapi.api;

class AuthenticationRequest {
  /* The Mojang account e-mail or username. Never store it. */
  String username = null;
  /* The Mojang account password, never store it. */
  String password = null;
  AuthenticationRequest();

  @override
  String toString() {
    return 'AuthenticationRequest[username=$username, password=$password, ]';
  }

  AuthenticationRequest.fromJson(Map<String, dynamic> json) {
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

  static List<AuthenticationRequest> listFromJson(List<dynamic> json) {
    return json == null ? new List<AuthenticationRequest>() : json.map((value) => new AuthenticationRequest.fromJson(value)).toList();
  }

  static Map<String, AuthenticationRequest> mapFromJson(Map<String, dynamic> json) {
    var map = new Map<String, AuthenticationRequest>();
    if (json != null && json.length > 0) {
      json.forEach((String key, dynamic value) => map[key] = new AuthenticationRequest.fromJson(value));
    }
    return map;
  }
}

