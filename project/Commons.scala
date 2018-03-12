import sbt.Keys._
import sbt._
import sbtassembly.AssemblyKeys._

object Commons {

  val scalaVer = "2.12.4"

  val settings: Seq[Def.Setting[_]] = Seq(
    scalaVersion := scalaVer,
    organization := "io.radicalbit",
    parallelExecution in Test := false,
    test in assembly := {}
  )
}
