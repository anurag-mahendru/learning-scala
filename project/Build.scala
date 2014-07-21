import sbt._
import sbt.Keys._
import sbtassembly.Plugin._
import AssemblyKeys._

object ProjectBuild extends Build {

  lazy val root = Project(
    id = "root",
    base = file("."),
    settings = Project.defaultSettings ++ Seq(
      name := "Learning-Scala",
      organization := "code.hawk",
      version := "1.0",
      scalaVersion := "2.10.2",
      resolvers += "Typesafe Releases" at "http://repo.typesafe.com/typesafe/releases/",
      resolvers += "restlet" at "http://maven.restlet.org"
		       		    	      )
			 )
}
