--  Mojang API
--  No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
--
--  OpenAPI spec version: 2020_06_05
--  
--
--  NOTE: This package is auto generated by the swagger code generator 3.3.4.
--  https://openapi-generator.tech
--  Do not edit the class manually.
with Swagger.Streams;
with Ada.Containers.Vectors;
package .Models is



   type ApiStatus_Type is
     record
     end record;

   package ApiStatus_Type_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => ApiStatus_Type);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in ApiStatus_Type);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in ApiStatus_Type_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out ApiStatus_Type);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out ApiStatus_Type_Vectors.Vector);



end .Models;
