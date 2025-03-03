plugins {
  //kotlin("jvm") version "2.1.10"
  kotlin("jvm") version "2.2.0-dev-6560" // 21.02.25

}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
  maven("https://maven.pkg.jetbrains.space/kotlin/p/kotlin/dev/")
  mavenCentral()
}

dependencies {
  testImplementation(kotlin("test"))
}

tasks.test {
  useJUnitPlatform()
}
kotlin {
  jvmToolchain(21)

  compilerOptions.freeCompilerArgs.add("-Xcontext-parameters")
}