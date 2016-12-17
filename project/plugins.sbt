// Comment to get more information during initialization
logLevel := Level.Warn

// The Typesafe repository
//resolvers ++= Seq(
//  "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/",
//  Resolver.file("local-play", file("/Users/pvo/zenexity/workspaces/workspace_tools/jto/Play20/repository/local"))(Resolver.ivyStylePatterns)
//)

resolvers ++= Seq(
  Resolver.file("local-play", file("/Users/pvo/zenexity/workspaces/workspace_tools/jto/Play20/repository/local"))(Resolver.ivyStylePatterns),
  "Sonatype OSS Releases"  at "http://oss.sonatype.org/content/repositories/releases/",
  "Sonatype OSS Snapshots" at "http://oss.sonatype.org/content/repositories/snapshots/"
)


// Use the Play sbt plugin for Play projects
addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.5.4")
