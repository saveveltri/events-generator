import sbt.Keys._
import sbt._

object PublishSettings {

  lazy val settings: Seq[Def.Setting[_]] = Seq(
    publishArtifact := true,
    publishArtifact in (Compile, packageDoc) := false,
    publishMavenStyle := true
  )

  lazy val dontPublish: Seq[Def.Setting[_]] = Seq(
    publish := {}
  )
}
