plugins {
    // Apply the application plugin so we can run the main class
    application
    java
}

repositories {
    mavenCentral()
}

dependencies {
    // Use JUnit Jupiter for testing
    testImplementation("org.junit.jupiter:junit-jupiter:5.10.0")
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(25))
    }
}

application {
    // Specify the fully qualified main class
    mainClass.set("App") // If your App.java has a package, e.g., org.example, write "org.example.App"
}

tasks.named<Test>("test") {
    useJUnitPlatform()
}
