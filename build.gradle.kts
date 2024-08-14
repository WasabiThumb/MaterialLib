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
        create<MavenPublication>("mavenJava") {
            from(components["java"])
            pom {
                name = "MaterialLib"
                description = project.description
                url = "https://github.com/WasabiThumb/MaterialLib"
                licenses {
                    license {
                        name = "The Apache License, Version 2.0"
                        url = "http://www.apache.org/licenses/LICENSE-2.0.txt"
                    }
                }
                developers {
                    developer {
                        id = "wasabithumb"
                        email = "wasabithumbs@gmail.com"
                        organization = "Wasabi Codes"
                        organizationUrl = "https://wasabithumb.github.io/"
                        timezone = "-5"
                    }
                }
                scm {
                    connection = "scm:git:git://github.com/WasabiThumb/MaterialLib.git"
                    url = "https://github.com/WasabiThumb/MaterialLib"
                }
            }
        }
    }
}