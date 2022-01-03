plugins {
    `kotlin-dsl`
}

repositories {
    google()
    mavenCentral()
    maven("https://naver.jfrog.io/artifactory/maven/")
}

dependencies {
    implementation("com.android.tools.build:gradle:7.0.4")
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:1.5.31")
}
