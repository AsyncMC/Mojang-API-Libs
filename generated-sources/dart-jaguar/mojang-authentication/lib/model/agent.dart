import 'package:jaguar_serializer/jaguar_serializer.dart';

part 'agent.jser.dart';

class Agent {
   /* The name of the game */
  @Alias('name')
  final String name;
  //enum nameEnum {  Minecraft,  Scrolls,  }; /* The agent version, usually 1. */
  @Alias('version')
  final int version;
  

  Agent(
    

{
     this.name = "Minecraft",  
     this.version = 1 
    
    }
  );

  @override
  String toString() {
    return 'Agent[name=$name, version=$version, ]';
  }
}

@GenSerializer()
class AgentSerializer extends Serializer<Agent> with _$AgentSerializer {

}
