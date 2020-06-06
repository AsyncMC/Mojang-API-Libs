import 'package:jaguar_serializer/jaguar_serializer.dart';

import 'package:openapi/model/skin_model.dart';
part 'change_skin_request.jser.dart';

class ChangeSkinRequest {
  
  @Alias('model')
  final SkinModel model;
   /* The URL which Mojang servers will download and apply the skin */
  @Alias('url')
  final String url;
  

  ChangeSkinRequest(
    

{
     this.model = null,  
    
     this.url = null 
    }
  );

  @override
  String toString() {
    return 'ChangeSkinRequest[model=$model, url=$url, ]';
  }
}

@GenSerializer()
class ChangeSkinRequestSerializer extends Serializer<ChangeSkinRequest> with _$ChangeSkinRequestSerializer {

}
