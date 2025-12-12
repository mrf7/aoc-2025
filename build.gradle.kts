plugins {
    kotlin("jvm") version "2.2.21"
}

sourceSets {
    main {
        kotlin.srcDir("src")
        dependencies {
            implementation("com.toldoven.aoc:aoc-kotlin-notebook:1.1.2")
            implementation("io.kotest.extensions:kotest-assertions-arrow:2.0.0")
            implementation("io.kotest:kotest-assertions-core:5.9.1")
            implementation("org.jetbrains.kotlinx:multik-core:0.2.3")
            implementation("org.jetbrains.kotlinx:multik-default:0.2.3")
        }
    }
}

tasks {
    wrapper {
        gradleVersion = "9.2.1"
    }
}
