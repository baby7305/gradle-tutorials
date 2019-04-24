plugins {
    java
    kotlin("jvm") version "1.3.30"
    application
}

repositories {
    jcenter()
}

dependencies {
    implementation(kotlin("stdlib"))
}

application {
    mainClassName = "com.actia.vehicle.app.App"
}