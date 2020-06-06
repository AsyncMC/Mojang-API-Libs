import 'package:jaguar_serializer/jaguar_serializer.dart';

part 'error.jser.dart';

class Error {
  
  @Alias('error')
  final String error;
  
  @Alias('errorMessage')
  final String errorMessage;
  

  Error(
    

{
     this.error = null,  
     this.errorMessage = null 
    
    }
  );

  @override
  String toString() {
    return 'Error[error=$error, errorMessage=$errorMessage, ]';
  }
}

@GenSerializer()
class ErrorSerializer extends Serializer<Error> with _$ErrorSerializer {

}
