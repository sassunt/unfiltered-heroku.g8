import com.typesafe.startscript.StartScriptPlugin

seq(StartScriptPlugin.startScriptForClassesSettings: _*)

organization := "$organization$"

name := "$name$"

scalaVersion := "$scalaVersion$"

version := "$version$"

libraryDependencies ++= Seq(
   "net.databinder" %% "unfiltered-filter" % "$unfilteredVersion$",
   "net.databinder" %% "unfiltered-jetty" % "$unfilteredVersion$"
)

resolvers ++= Nil
