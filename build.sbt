ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.9"

lazy val root = (project in file("."))
  .settings(name := "scalajs-tutorial")

enablePlugins(ScalaJSPlugin)

name := "Scala.js Tutorial"
scalaVersion := "2.13.1" // or any other Scala version >= 2.11.12

// This is an application with a main method
scalaJSUseMainModuleInitializer := true

jsEnv := new org.scalajs.jsenv.jsdomnodejs.JSDOMNodeJSEnv()

libraryDependencies ++= Seq("org.scala-js" %%% "scalajs-dom" % "2.1.0", "com.lihaoyi" %%% "utest" % "0.7.4" % "test")

testFrameworks += new TestFramework("utest.runner.Framework")
