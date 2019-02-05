
name := "SHowingoffScala"

version := "0.2"

scalaVersion := "2.11.12"

scalacOptions ++= Seq("-deprecation", "-feature", "-unchecked")

libraryDependencies ++= Seq(

  "org.apache.spark" %% "spark-core" % "2.4.0" % "provided",
  "org.apache.spark" %% "spark-mllib" % "2.4.0",
  "com.github.scopt" %% "scopt" % "3.6.0",
//  "edu.luc.cs" %% "blockperf" % "0.5.0",
  "org.json4s" %% "json4s-native" % "3.3.0",
  "com.novocode" % "junit-interface" % "latest.release" % Test,
  "org.scalatest" %% "scalatest" % "2.2.6" % Test,
  "org.scalanlp" %% "breeze" % "0.13.2", //% "provided",
  "org.scalanlp" %% "breeze-natives" % "0.13.1", //% "provided",
  "org.scalanlp" %% "breeze-viz" % "0.13.1", //% "provided",
  "com.lihaoyi" %% "ammonite-ops" % "1.0.0"
)
