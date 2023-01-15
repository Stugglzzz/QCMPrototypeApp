plugins {
    id("com.android.application")
    kotlin("android")
    id("dagger.hilt.android.plugin")
    id("kotlin-kapt")
}

android {
    namespace = ProjectConf.appId
    compileSdk = ProjectConf.compileSdk

    defaultConfig {
        applicationId = ProjectConf.appId
        minSdk = ProjectConf.minSdk
        targetSdk = ProjectConf.targetSdk
        versionCode = ProjectConf.versionCode
        versionName = ProjectConf.versionName

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = true
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = Dependencies.composeVersion
    }
    packagingOptions {
        resources {
            excludes.add("/META-INF/{AL2.0,LGPL2.1}")
        }
    }
}

dependencies {
    implementation(Dependencies.compiler)
    implementation(Dependencies.ui)
    implementation(Dependencies.uiToolingPreview)
    implementation(Dependencies.hiltNavigationCompose)
    implementation(Dependencies.material)
    implementation(Dependencies.runtime)
    implementation(Dependencies.navigation)
    implementation(Dependencies.viewModelCompose)
    implementation(Dependencies.activityCompose)

    implementation(Dependencies.hiltAndroid)
    kapt(Dependencies.hiltCompiler)

    implementation(Dependencies.roomKtx)
    implementation(Dependencies.roomRuntime)
    kapt(Dependencies.roomCompiler)

    implementation(Dependencies.googleMaterial)

    implementation(Dependencies.coroutines)

    implementation(Dependencies.okHttp)
    implementation(Dependencies.retrofit)
    implementation(Dependencies.okHttpLoggingInterceptor)
    implementation(Dependencies.moshiConverter)

    implementation(Dependencies.glide)
    kapt(Dependencies.glideCompiler)
}