part of openapi.api;

class SecurityChallenge {
  
  SecurityQuestion question = null;
  
  SecurityAnswerId answer = null;
  SecurityChallenge();

  @override
  String toString() {
    return 'SecurityChallenge[question=$question, answer=$answer, ]';
  }

  SecurityChallenge.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    question = new SecurityQuestion.fromJson(json['question']);
    answer = new SecurityAnswerId.fromJson(json['answer']);
  }

  Map<String, dynamic> toJson() {
    return {
      'question': question,
      'answer': answer
    };
  }

  static List<SecurityChallenge> listFromJson(List<dynamic> json) {
    return json == null ? new List<SecurityChallenge>() : json.map((value) => new SecurityChallenge.fromJson(value)).toList();
  }

  static Map<String, SecurityChallenge> mapFromJson(Map<String, dynamic> json) {
    var map = new Map<String, SecurityChallenge>();
    if (json != null && json.length > 0) {
      json.forEach((String key, dynamic value) => map[key] = new SecurityChallenge.fromJson(value));
    }
    return map;
  }
}

