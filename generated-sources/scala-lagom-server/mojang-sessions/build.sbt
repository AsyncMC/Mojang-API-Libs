version       := "1.0.0"

name          := "mojang-sessions-scala-lagom-server"

organization  := "com.github.asyncmc"

scalaVersion  := "2.11.8"

val playJsonDerivedCodecs = "org.julienrf" %% "play-json-derived-codecs" % "3.3"

libraryDependencies ++= Seq(
lagomScaladslApi,
playJsonDerivedCodecs
)


