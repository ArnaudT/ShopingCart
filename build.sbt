name := "ShoppingCart"

version := "1.0"

scalaVersion := "2.12.1"

libraryDependencies ++= Seq("org.specs2" %% "specs2-core" % "3.8.8" % "test")

scalacOptions in Test ++= Seq("-Yrangepos")