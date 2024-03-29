version := "1.0.0"
name := "mojang-sessions-scala-akka"
organization := "com.github.asyncmc"
scalaVersion := "2.11.12"

libraryDependencies ++= Seq(
  "com.typesafe" % "config" % "1.3.2",
  "com.typesafe.akka" %% "akka-actor" % "2.5.17",
  "io.spray" % "spray-client" % "1.3.1",
  "joda-time" % "joda-time" % "2.9.9",
  "org.json4s" %% "json4s-jackson" % "3.5.4",
  // test dependencies
  "org.scalatest" %% "scalatest" % "3.0.5" % "test",
  "junit" % "junit" % "4.12" % "test"
)

resolvers ++= Seq(Resolver.mavenLocal)

scalacOptions := Seq(
  "-unchecked",
  "-deprecation",
  "-feature"
)

publishArtifact in (Compile, packageDoc) := false
