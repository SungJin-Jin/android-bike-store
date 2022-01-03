buildscript {
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        classpath("com.android.tools.build:gradle:7.0.2")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.5.21")
        classpath("org.jetbrains.kotlin:kotlin-serialization:${Libs.Kotlin.version}")
        classpath("com.google.dagger:hilt-android-gradle-plugin:${Libs.Dagger.version}")
    }
}

task("clean", Delete::class) {
    delete = setOf(rootProject.buildDir)
}