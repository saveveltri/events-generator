import sbt._

object Dependencies {

  object scalaLang {
    lazy val version   = "2.12.4"
    lazy val namespace = "org.scala-lang"
    lazy val compiler  = namespace % "scala-compiler" % version
  }

  object scalaModules {
    lazy val version           = "1.0.6"
    lazy val namespace         = "org.scala-lang.modules"
    lazy val parserCombinators = namespace %% "scala-parser-combinators" % version
  }

  object scopt {
    lazy val version   = "3.7.0"
    lazy val namespace = "com.github.scopt"
    val scopt          = namespace %% "scopt" % version
  }

  object akka {
    lazy val version   = "2.5.6"
    lazy val namespace = "com.typesafe.akka"

    lazy val actor           = namespace %% "akka-actor"              % version
    lazy val testkit         = namespace %% "akka-testkit"            % version
    lazy val stream          = namespace %% "akka-stream"             % version
    lazy val distributedData = namespace %% "akka-distributed-data"   % version
    lazy val cluster         = namespace %% "akka-cluster"            % version
    lazy val sharding        = namespace %% "akka-sharding"           % version
    lazy val slf4j           = namespace %% "akka-slf4j"              % version
    lazy val clusterTools    = namespace %% "akka-cluster-tools"      % version
    lazy val multiNode       = namespace %% "akka-multi-node-testkit" % version
  }

  object scala_logging {
    val scala_logging = "com.typesafe.scala-logging" %% "scala-logging" % "3.7.2"
  }

  object logback {
    val logback = "ch.qos.logback" % "logback-classic" % "1.2.3"
  }

  object json4s {
    val version = "3.5.2"
    val jackson = "org.json4s" %% "json4s-jackson" % version
  }

  object scalatest {
    lazy val version   = "3.0.0"
    lazy val namespace = "org.scalatest"
    lazy val core      = namespace %% "scalatest" % version
  }

  object junit {
    lazy val version   = "4.12"
    lazy val namespace = "junit"
    lazy val junit     = namespace % "junit" % version
  }

  object junitInterface {
    lazy val version        = "0.11"
    lazy val namespace      = "com.novocode"
    lazy val junitInterface = namespace % "junit-interface" % version
  }

  object flink {
    lazy val version        = "1.3.2"
    lazy val namespace      = "org.apache.flink"
    lazy val core           = namespace % "flink-core" % version
    lazy val streamingScala = namespace % "flink-streaming-scala_2.11" % version
  }

  lazy val asm = "asm" % "asm" % "3.3.1" % Test //import to use ClosureCleaner in test

  object slf4j {
    lazy val version   = "1.7.25"
    lazy val namespace = "org.slf4j"
    lazy val api       = namespace % "slf4j-api" % version
  }

  object config {
    lazy val version   = "1.3.1"
    lazy val namespace = "com.typesafe"
    lazy val core      = namespace % "config" % version
  }

  object Common {
    val libraries = Seq(
      scala_logging.scala_logging
    )
  }

  object FlinkConnector {
    lazy val libraries = Seq(
      flink.streamingScala % Provided
    )
  }

}
