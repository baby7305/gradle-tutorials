import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    application
    kotlin("jvm") version "1.3.30"
}

application {
    mainClassName = "com.actia.vehicle.app.MainKt"
}
dependencies {
    compile(kotlin("stdlib-jdk8"))
    compile("commons-httpclient","commons-httpclient","3.1")
}
repositories {
    mavenCentral()
    jcenter()
}
val compileKotlin: KotlinCompile by tasks
compileKotlin.kotlinOptions {
    jvmTarget = "1.8"
}
val compileTestKotlin: KotlinCompile by tasks
compileTestKotlin.kotlinOptions {
    jvmTarget = "1.8"
}