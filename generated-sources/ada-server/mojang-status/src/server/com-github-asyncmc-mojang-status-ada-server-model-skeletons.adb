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
with Swagger.Servers.Operation;
package body com.github.asyncmc.mojang.status.ada.server.model.Skeletons is

   package body Skeleton is


      package API_Check_Statuses is
         new Swagger.Servers.Operation (Handler => Check_Statuses,
                                        Method  => Swagger.Servers.GET,
                                        URI     => URI_Prefix & "/check");

      --  Checks the Mojang service statuses
      procedure Check_Statuses
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Impl : Implementation_Type;
         Result : Swagger.com.github.asyncmc.mojang.status.ada.server.model.Models.ApiStatus_Type_Map_Vectors.Vector;
      begin
         Impl.Check_Statuses (Result, Context);
         if Context.Get_Status = 200 then
            Stream.Start_Document;
            com.github.asyncmc.mojang.status.ada.server.model.Models.Serialize (Stream, "", Result);
            Stream.End_Document;
         end if;
      end Check_Statuses;

      procedure Register (Server : in out Swagger.Servers.Application_Type'Class) is
      begin
         Swagger.Servers.Register (Server, API_Check_Statuses.Definition);
      end Register;

   end Skeleton;

   package body Shared_Instance is


      --  Checks the Mojang service statuses
      procedure Check_Statuses
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Result : Swagger.com.github.asyncmc.mojang.status.ada.server.model.Models.ApiStatus_Type_Map_Vectors.Vector;
      begin
         Server.Check_Statuses (Result, Context);
         if Context.Get_Status = 200 then
            Stream.Start_Document;
            com.github.asyncmc.mojang.status.ada.server.model.Models.Serialize (Stream, "", Result);
            Stream.End_Document;
         end if;
      end Check_Statuses;

      package API_Check_Statuses is
         new Swagger.Servers.Operation (Handler => Check_Statuses,
                                        Method  => Swagger.Servers.GET,
                                        URI     => URI_Prefix & "/check");

      procedure Register (Server : in out Swagger.Servers.Application_Type'Class) is
      begin
         Swagger.Servers.Register (Server, API_Check_Statuses.Definition);
      end Register;

      protected body Server is
         --  Checks the Mojang service statuses
         procedure Check_Statuses (Result : out Swagger.com.github.asyncmc.mojang.status.ada.server.model.Models.ApiStatus_Type_Map_Vectors.Vector;
         Context : in out Swagger.Servers.Context_Type) is
         begin
            Impl.Check_Statuses (Result, Context);
         end Check_Statuses;

      end Server;

   end Shared_Instance;

end com.github.asyncmc.mojang.status.ada.server.model.Skeletons;