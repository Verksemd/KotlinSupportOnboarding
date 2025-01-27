rootProject.name = "KotlinProject"
include(":shared")

pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
        mavenCentral()
        maven { setUrl("https://maven.pkg.jetbrains.space/kotlin/p/kotlin/dev") }
    }
    plugins {
//        kotlin("multiplatform").version("2.0.0-dev-11478")
        kotlin("multiplatform").version("1.9.21")
//        kotlin("multiplatform").version("2.0.0-Beta2")
//        id("org.jetbrains.kotlinx.benchmark").version("0.4.9")
//        kotlin("plugin.serialization").version("1.9.20")
    }
}

dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
        maven { setUrl("https://maven.pkg.jetbrains.space/kotlin/p/kotlin/dev") }
    }
//    versionCatalogs {
//        create("libs") {
//            library("kotlinx-serialization-json", "org.jetbrains.kotlinx:kotlinx-serialization-json:1.6.0")
//        }
//    }
}
