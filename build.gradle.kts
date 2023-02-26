buildscript {
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        classpath(Dependencies.androidBuildTools)
        classpath(Dependencies.hiltAndroidGradlePlugin)
        classpath(Dependencies.kotlinGradlePlugin)
    }

}

tasks {
    register("clean", Delete::class) {
        delete(rootProject.buildDir)
    }
}

