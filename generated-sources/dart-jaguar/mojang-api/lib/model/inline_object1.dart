import 'package:jaguar_serializer/jaguar_serializer.dart';

import 'package:openapi/model/skin_model.dart';
part 'inline_object1.jser.dart';

class InlineObject1 {
  
  @Alias('model')
  final SkinModel model;
   /* The URL which Mojang servers will download and apply the skin */
  @Alias('url')
  final String url;
  

  InlineObject1(
    

{
     this.model = null,  
    
     this.url = null 
    }
  );

  @override
  String toString() {
    return 'InlineObject1[model=$model, url=$url, ]';
  }
}

@GenSerializer()
class InlineObject1Serializer extends Serializer<InlineObject1> with _$InlineObject1Serializer {

}
