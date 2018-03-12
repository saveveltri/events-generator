lazy val root = project
  .in(file("."))
  .settings(
    name := "events-simulator",
    publish := {},
    publishLocal := {}
  )
  .aggregate(
    `events-generator-common`,
    `events-generator-standalone`
  )

lazy val `events-generator-common` = project
  .settings(Commons.settings: _*)
  .settings(PublishSettings.dontPublish: _*)
  .settings(libraryDependencies ++= Dependencies.Common.libraries)

lazy val `events-generator-standalone` = project
  .settings(Commons.settings: _*)
  .settings(PublishSettings.dontPublish: _*)
  //.settings(libraryDependencies ++= Dependencies.Standalone.libraries)
  .dependsOn(`events-generator-common`)

onLoad in Global := (Command.process("scalafmt", _: State)) compose (onLoad in Global).value

// make run command include the provided dependencies
run in Compile := Defaults.runTask(fullClasspath in Compile, mainClass in (Compile, run), runner in (Compile, run))

fork in test := false
