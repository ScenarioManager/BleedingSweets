name := "Bleeding Sweets"

version := "1.0.0"

scalaVersion := "2.12.6"

resolvers += "caleb" at "https://s3.amazonaws.com/caleb-maven/"
resolvers += "spigot" at "https://hub.spigotmc.org/nexus/content/repositories/snapshots/"
resolvers += "spigot-chat" at "https://hub.spigotmc.org/nexus/content/groups/public/"

libraryDependencies += "org.spigotmc" % "spigot-api" % "1.8-R0.1-SNAPSHOT" % "provided"
libraryDependencies += "me.calebbassham" % "ScenarioManager" % "0.4.0" % "provided"

assemblyJarName in assembly := "bleeding-sweets.jar"