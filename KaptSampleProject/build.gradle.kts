
plugins {
//    kotlin("jvm") version "2.2.0-dev-6560" // 17.03.25
//    kotlin("jvm") version "2.2.0-dev-9812" // 17.03.25
 //   kotlin("jvm") version "2.2.0-dev-8022" // 04.03.25
//    kotlin("jvm") version "2.2.0-dev-800" // 17.02.25
//    kotlin("jvm") version "2.2.0-dev-3533" // 05.02.25
//    id("org.jetbrains.kotlin.jvm") version "2.1.20-RC"
//    id("org.jetbrains.kotlin.jvm") version "2.1.20-RC2"
//    id("org.jetbrains.kotlin.jvm") version "2.1.20-Beta2"
//    kotlin("jvm") version "2.1.0"
//    kotlin("jvm") version "2.1.10"
//    kotlin("jvm") version "2.0.10"
    kotlin("jvm") version "1.9.25"
//    kotlin("jvm") version "1.9.25"
    kotlin("kapt") version "1.9.25"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven("https://maven.pkg.jetbrains.space/kotlin/p/kotlin/dev")
    maven("https://redirector.kotlinlang.org/maven/dev")
}

dependencies {
    implementation("jakarta.persistence:jakarta.persistence-api:3.1.0")
    implementation("org.jetbrains.kotlin:kotlin-stdlib:1.9.0")
    testImplementation(kotlin("test"))
    implementation("com.google.dagger:dagger:2.50")
    kapt("com.google.dagger:dagger-compiler:2.50")

}

tasks.test {
    useJUnitPlatform()
}
kotlin {
     compilerOptions {
//        extraWarnings.set(true)
    }
}
tasks.withType<Copy> {
    duplicatesStrategy = DuplicatesStrategy.EXCLUDE
}

tasks.jar {
    duplicatesStrategy = DuplicatesStrategy.EXCLUDE
}