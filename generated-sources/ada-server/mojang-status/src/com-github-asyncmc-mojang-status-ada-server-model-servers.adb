--  Mojang API
--  No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
--  ------------ EDIT NOTE ------------
--  This file was generated with openapi-generator.  You can modify it to implement
--  the server.  After you modify this file, you should add the following line
--  to the .openapi-generator-ignore file:
--
--  src/com-github-asyncmc-mojang-status-ada-server-model-servers.adb
--
--  Then, you can drop this edit note comment.
--  ------------ EDIT NOTE ------------
package body com.github.asyncmc.mojang.status.ada.server.model.Servers is


   --  Checks the Mojang service statuses
   overriding
   procedure Check_Statuses
      (Server : in out Server_Type
       ;
       Result  : out Swagger.com.github.asyncmc.mojang.status.ada.server.model.Models.ApiStatus_Type_Map_Vectors.Vector;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Check_Statuses;

end com.github.asyncmc.mojang.status.ada.server.model.Servers;
