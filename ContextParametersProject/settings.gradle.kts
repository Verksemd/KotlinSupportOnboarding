pluginManagement {
  repositories {
    maven("https://maven.pkg.jetbrains.space/kotlin/p/kotlin/dev/")
    mavenCentral()
    google()
    gradlePluginPortal()

    //maven("https://oss.sonatype.org/content/repositories/snapshots/")
    //maven("https://maven.scijava.org/content/groups/public")
    //        maven("https://oss.sonatype.org/content/repositories/snapshots/")
    //maven {
    //    url = uri("/Users/anton.mefodichev/.m2/repository")
    //}
    //mavenLocal()

  }
}


plugins {
  id("org.gradle.toolchains.foojay-resolver-convention") version "0.8.0"
}
rootProject.name = "untitled8"