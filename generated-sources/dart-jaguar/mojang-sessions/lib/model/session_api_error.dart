import 'package:jaguar_serializer/jaguar_serializer.dart';

part 'session_api_error.jser.dart';

class SessionApiError {
   /* A message describing the error */
  @Alias('error')
  final String error;
   /* The request path */
  @Alias('path')
  final String path;
  

  SessionApiError(
    

{
     this.error = null,  
     this.path = null 
    
    }
  );

  @override
  String toString() {
    return 'SessionApiError[error=$error, path=$path, ]';
  }
}

@GenSerializer()
class SessionApiErrorSerializer extends Serializer<SessionApiError> with _$SessionApiErrorSerializer {

}
