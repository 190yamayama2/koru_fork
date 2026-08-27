plugins {
    `kotlin-dsl`
    id("maven-publish")
    id("com.gradle.plugin-publish") version "1.3.1"
    id("com.futuremind.koru.publish")
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("gradle-plugin"))
}

gradlePlugin {
    plugins {
        create("compilerPlugin") {
            id = "com.futuremind.koru"
            displayName = "Koru - Gradle Plugin"
            description = "Wrappers for suspend functions / Flow in Kotlin Native - gradle plugin"
            implementationClass = "com.futuremind.koru.gradle.CompilerPlugin"
        }
    }
}

koruPublishing {
    pomName = "Koru - Gradle Plugin"
    pomDescription = "Wrappers for suspend functions / Flow in Kotlin Native - gradle plugin."
}