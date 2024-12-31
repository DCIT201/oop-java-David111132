plugins {
    kotlin("jvm") version "1.9.0"
    application
}

group = "com.vehicle.rental"
version = "1.0.0"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test")) // Include Kotlin testing library
}

application {
    val mainClass = null
    mainClass.set(
        "com.vehicle.rental.MainKt",
        value = TODO()
    ) // Specify the main class
}

fun testImplementation(kotlin: Any) {

}
