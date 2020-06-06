part of openapi.api;

class Agent {
  /* The name of the game */
  String name = "Minecraft";
  //enum nameEnum {  Minecraft,  Scrolls,  };{
  /* The agent version, usually 1. */
  int version = 1;
  Agent();

  @override
  String toString() {
    return 'Agent[name=$name, version=$version, ]';
  }

  Agent.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    name = json['name'];
    version = json['version'];
  }

  Map<String, dynamic> toJson() {
    return {
      'name': name,
      'version': version
    };
  }

  static List<Agent> listFromJson(List<dynamic> json) {
    return json == null ? new List<Agent>() : json.map((value) => new Agent.fromJson(value)).toList();
  }

  static Map<String, Agent> mapFromJson(Map<String, dynamic> json) {
    var map = new Map<String, Agent>();
    if (json != null && json.length > 0) {
      json.forEach((String key, dynamic value) => map[key] = new Agent.fromJson(value));
    }
    return map;
  }
}

