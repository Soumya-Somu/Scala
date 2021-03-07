name := "ShapeMaker"

version := "0.1"

scalaVersion := "2.13.5"


maintainer := "Soumya Dubey <soumya.dubey@knoldus.com>"

lazy val scalaTest="org.scalatest" %% "scalatest" % "3.2.5" % "test"


lazy val root = project.in(file(".")).settings(
  libraryDependencies += scalaTest,
  maintainer := "Soumya Dubey <soumya.dubey@knoldus.com>"
).aggregate(ParserFlags,CliParser)
  .enablePlugins(UniversalPlugin)
  .enablePlugins(JavaAppPackaging, GraalVMNativeImagePlugin)


lazy val CliParser = project.in(file("CliParser"))
  .settings(
    libraryDependencies += scalaTest,
    maintainer := "Soumya Dubey <soumya.dubey@knoldus.com>"
  ).dependsOn(ParserFlags)
  .enablePlugins(UniversalPlugin)
  .enablePlugins(JavaAppPackaging, GraalVMNativeImagePlugin)

lazy val ParserFlags = project.in(file("ParserFlags"))
  .settings(
    libraryDependencies += scalaTest,
    maintainer := "Soumya Dubey <soumya.dubey@knoldus.com>"
  )
  .enablePlugins(UniversalPlugin)
  .enablePlugins(JavaAppPackaging, GraalVMNativeImagePlugin)