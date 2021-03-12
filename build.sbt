name := "Crazy8s-scala-2.13.5"

version := "0.1"

scalaVersion := "2.13.5"
libraryDependencies +=  "org.scala-lang.modules" %% "scala-parallel-collections" % "1.0.1"

mainClass in (Compile, run) := Some("Main")
mainClass in (Compile, packageBin) := Some("Main")