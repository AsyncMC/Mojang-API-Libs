part of openapi.api;

class SessionApiError {
  /* A message describing the error */
  String error = null;
  /* The request path */
  String path = null;
  SessionApiError();

  @override
  String toString() {
    return 'SessionApiError[error=$error, path=$path, ]';
  }

  SessionApiError.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    error = json['error'];
    path = json['path'];
  }

  Map<String, dynamic> toJson() {
    return {
      'error': error,
      'path': path
    };
  }

  static List<SessionApiError> listFromJson(List<dynamic> json) {
    return json == null ? new List<SessionApiError>() : json.map((value) => new SessionApiError.fromJson(value)).toList();
  }

  static Map<String, SessionApiError> mapFromJson(Map<String, dynamic> json) {
    var map = new Map<String, SessionApiError>();
    if (json != null && json.length > 0) {
      json.forEach((String key, dynamic value) => map[key] = new SessionApiError.fromJson(value));
    }
    return map;
  }
}

