import 'package:jaguar_serializer/jaguar_serializer.dart';

part 'player_texture_url.jser.dart';

class PlayerTextureURL {
   /* The URL to the texture, must be in Mojang's domains. */
  @Alias('url')
  final String url;
  

  PlayerTextureURL(
    

{
    
     this.url = null 
    }
  );

  @override
  String toString() {
    return 'PlayerTextureURL[url=$url, ]';
  }
}

@GenSerializer()
class PlayerTextureURLSerializer extends Serializer<PlayerTextureURL> with _$PlayerTextureURLSerializer {

}
