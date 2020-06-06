import 'package:jaguar_serializer/jaguar_serializer.dart';

import 'package:openapi/model/player_texture_url.dart';
part 'player_skin_url.jser.dart';

class PlayerSkinURL {
   /* The URL to the texture, must be in Mojang's domains. */
  @Alias('url')
  final String url;
  

  PlayerSkinURL(
    

{
    
     this.url = null 
    }
  );

  @override
  String toString() {
    return 'PlayerSkinURL[url=$url, ]';
  }
}

@GenSerializer()
class PlayerSkinURLSerializer extends Serializer<PlayerSkinURL> with _$PlayerSkinURLSerializer {

}
