name := "shapeless-rules"

version := "1.0-SNAPSHOT"

//scalacOptions ++= Seq("-unchecked", "-deprecation", "-Xlog-implicits")

import sbt.Keys._

lazy val play = (project in file("."))
  .enablePlugins(PlayScala, DockerPlugin)
  .disablePlugins(PlayLayoutPlugin)
  .settings(
    libraryDependencies ++= Seq(
      "com.chuusai" %% "shapeless" % "2.3.2" cross CrossVersion.full,
      "org.scalaz" %% "scalaz-core" % "7.2.8"
   )
  )



