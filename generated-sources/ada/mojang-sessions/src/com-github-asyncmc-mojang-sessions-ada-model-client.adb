with com.github.asyncmc.mojang.sessions.ada.model.Clients;
with com.github.asyncmc.mojang.sessions.ada.model.Models;
with Swagger;
with Util.Http.Clients.Curl;
with Ada.Text_IO;
with Ada.Command_Line;
with Ada.Calendar.Formatting;
with Ada.Exceptions;
procedure com.github.asyncmc.mojang.sessions.ada.model.Client is

   use Ada.Text_IO;

   procedure Usage;

   Server    : constant Swagger.UString := Swagger.To_UString ("http://localhost:8080/v2");
   Arg_Count : constant Natural := Ada.Command_Line.Argument_Count;
   Arg       : Positive := 1;

   procedure Usage is
   begin
      Put_Line ("Usage: defaultPackage {params}...");
   end Usage;

begin
   if Arg_Count <= 1 then
      Usage;
      return;
   end if;
   Util.Http.Clients.Curl.Register;
   declare
      Command : constant String := Ada.Command_Line.Argument (Arg);
      Item    : constant String := Ada.Command_Line.Argument (Arg + 1);
      C       : com.github.asyncmc.mojang.sessions.ada.model.Clients.Client_Type;
   begin
      C.Set_Server (Server);
      Arg := Arg + 2;

   exception
      when E : Constraint_Error =>
         Put_Line ("Constraint error raised: " & Ada.Exceptions.Exception_Message (E));

   end;
end com.github.asyncmc.mojang.sessions.ada.model.Client;
