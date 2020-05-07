// Top-level build file where you can add configuration options common to all sub-projects/modules.

buildscript {
    repositories {
        google()
        jcenter()

    }
    dependencies {
        classpath("com.android.tools.build:gradle:3.6.3")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.3.72")
        classpath("com.vanniktech:gradle-android-junit-jacoco-plugin:0.16.0")
        classpath("de.mannodermaus.gradle.plugins:android-junit5:1.6.2.0")
        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle files
    }
}

allprojects {
    repositories {
        google()
        jcenter()
        maven("https://jitpack.io")
    }
}

task("clean", Delete::class) {
    delete = setOf(rootProject.buildDir)
}
