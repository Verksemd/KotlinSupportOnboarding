import org.jetbrains.kotlin.gradle.dsl.KotlinJsCompile


plugins {
    kotlin("multiplatform")
//    kotlin("plugin.serialization")
//    id("org.jetbrains.kotlinx.benchmark")
}

kotlin {
    js(IR) {
        browser {
            binaries.executable()
            generateTypeScriptDefinitions()
        }
//        nodejs()
//        useEsModules()
//        binaries.executable()
    }


    sourceSets {
        /* Main source sets */
        val commonMain by getting {
            dependencies {
//                implementation(libs.kotlinx.serialization.json)
                implementation("org.jetbrains.kotlinx:kotlinx-html:0.9.1")

            }
        }
        val jsMain by getting {

        }

        /* Test source sets */
        val commonTest by getting {
            dependencies {
                implementation(kotlin("test"))
            }
        }
        val jsTest by getting {
            dependencies {
//                implementation("ch.tutteli.kbox:kbox:1.0.0")
            }
        }

    }
}

tasks.withType<KotlinJsCompile>().configureEach {
    kotlinOptions {
        moduleKind = "es"
        useEsClasses = true
    }
}
//
//benchmark {
//    // Setup configurations
//    targets {
//        register("js")
//    }
//}
