plugins {
    id("java")
}

group = "dev.themeinerlp"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven("https://repo.papermc.io/repository/maven-public/")
}

dependencies {
    compileOnly("io.papermc.paper:paper-api:1.21-R0.1-SNAPSHOT")

}

java {
    toolchain.languageVersion.set(JavaLanguageVersion.of(21))
}