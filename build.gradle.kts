plugins {
    java
    `maven-publish`
}

version = "1.1.3"
group = "xyz.wasabicodes"
description = "Version-independent Material library for Bukkit 1.8+"

val targetJavaVersion = 8
java {
    val javaVersion = JavaVersion.toVersion(targetJavaVersion)
    sourceCompatibility = javaVersion
    targetCompatibility = javaVersion
}

tasks.compileJava.configure {
    options.encoding = "UTF-8"
    options.release.set(targetJavaVersion)
}

repositories {
    mavenCentral()
    maven {
        name = "spigotmc"
        url = uri("https://hub.spigotmc.org/nexus/content/repositories/snapshots")
    }
}

dependencies {
    compileOnly("org.jetbrains:annotations:24.0.0")
    compileOnly("org.spigotmc:spigot-api:1.19.4-R0.1-SNAPSHOT")
}

java {
    withSourcesJar()
    withJavadocJar()
}

tasks.javadoc {
    (options as CoreJavadocOptions)
        .addBooleanOption("Xdoclint:none", true)
}

publishing {
    publications {
        create<MavenPublication>(project.name) {
            from(components["java"])
        }
    }
}