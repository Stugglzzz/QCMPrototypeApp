buildscript {
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        classpath(Dependencies.androidBuildTools)
        classpath(Dependencies.hiltAndroidGradlePlugin)
        classpath(Dependencies.kotlinGradlePlugin)
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.6.10")
    }

}

tasks {
    register("clean", Delete::class) {
        delete(rootProject.buildDir)
    }
}

