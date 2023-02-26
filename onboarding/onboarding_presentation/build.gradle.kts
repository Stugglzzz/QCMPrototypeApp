plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "fr.abrsra.onboarding_presentation"
    compileSdk = 32

    defaultConfig {
        minSdk = 21
        targetSdk = 32

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

    buildFeatures{
        compose = true
    }

    buildTypes {
        release {
            isMinifyEnabled = false
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
    composeOptions {
        kotlinCompilerExtensionVersion = Dependencies.composeCompilerVersion
    }
}

dependencies {

    implementation(project(Modules.onboardingDomain))
    implementation(project(Modules.core))
    implementation("androidx.core:core-ktx:1.7.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.6.0")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")

    implementation(Dependencies.composeCompiler)
    implementation(Dependencies.ui)
    implementation(Dependencies.uiToolingPreview)
    implementation(Dependencies.hiltNavigationCompose)
    implementation(Dependencies.composeMaterial)
    implementation(Dependencies.runtime)
    implementation(Dependencies.navigation)
    implementation(Dependencies.viewModelCompose)
    implementation(Dependencies.activityCompose)
}