plugins {
    alias(libs.plugins.multiplatform)
    id("convention.publication")
}

group = "my.company.name"
version = "1.0.0"

kotlin {
    jvm {
        compilations.all {
            kotlinOptions {
//                freeCompilerArgs += listOf("-Xlambdas=indy")
                // Если нужно "class", замените на:
                 freeCompilerArgs += listOf("-Xlambdas=class")
            }
        }
    }

    sourceSets {
        commonMain {
            dependencies {
                // ...
            }
        }
        commonTest {
            dependencies {
                implementation(kotlin("test"))
            }
        }
    }
}

