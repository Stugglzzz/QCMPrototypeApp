object Dependencies {
    //Kotlin
    private const val kotlinVersion = "1.6.10"

    // AndroidX
    private const val coreKtxVersion = "1.9.0"
    const val coreKtx = "androidx.core:core-ktx:$coreKtxVersion"

    private const val appCompatVersion = "1.4.0"
    const val appCompat = "androidx.appcompat:appcompat:$appCompatVersion"

    // Compose
    private const val activityComposeVersion = "1.6.1"
    private const val composeCompilerVersion = "1.3.2"
    const val activityCompose = "androidx.activity:activity-compose:$activityComposeVersion"
    const val compiler = "androidx.compose.compiler:compiler:$composeCompilerVersion"

    const val composeVersion = "1.3.3"
    const val material = "androidx.compose.material:material:$composeVersion"
    const val ui = "androidx.compose.ui:ui:$composeVersion"
    const val uiToolingPreview = "androidx.compose.ui:ui-tooling-preview:$composeVersion"
    const val runtime = "androidx.compose.runtime:runtime:$composeVersion"

    private const val hiltNavigationComposeVersion = "1.0.0"
    const val hiltNavigationCompose =
        "androidx.hilt:hilt-navigation-compose:$hiltNavigationComposeVersion"

    private const val navigationVersion = "2.5.3"
    const val navigation = "androidx.navigation:navigation-compose:$navigationVersion"

    private const val lifecycleVersion = "2.5.1"
    const val viewModelCompose = "androidx.lifecycle:lifecycle-viewmodel-compose:$lifecycleVersion"

    // DaggerHilt
    const val daggerHiltVersion = "2.44"
    const val hiltAndroid = "com.google.dagger:hilt-android:$daggerHiltVersion"
    const val hiltCompiler = "com.google.dagger:hilt-android-compiler:$daggerHiltVersion"

    // Room
    private const val roomVersion = "2.5.0"
    const val roomRuntime = "androidx.room:room-runtime:$roomVersion"
    const val roomCompiler = "androidx.room:room-compiler:$roomVersion"
    const val roomKtx = "androidx.room:room-ktx:$roomVersion"


    // Google
    private const val materialVersion = "1.7.0"
    const val googleMaterial = "com.google.android.material:material:$materialVersion"

    // Coroutines
    private const val coroutinesVersion = "1.6.4"
    const val coroutines = "org.jetbrains.kotlinx:kotlinx-coroutines-core:$coroutinesVersion"

    // Retrofit
    private const val retrofitVersion = "2.9.0"
    const val retrofit = "com.squareup.retrofit2:retrofit:$retrofitVersion"
    const val moshiConverter = "com.squareup.retrofit2:converter-moshi:$retrofitVersion"

    private const val okHttpVersion = "5.0.0-alpha.2"
    const val okHttp = "com.squareup.okhttp3:okhttp:$okHttpVersion"
    const val okHttpLoggingInterceptor = "com.squareup.okhttp3:logging-interceptor:$okHttpVersion"

    // Glide
    private const val glideVersion = "4.14.2"
    const val glide = "com.github.bumptech.glide:glide:$glideVersion"
    const val glideCompiler = "com.github.bumptech.glide:compiler:$glideVersion"

    // Build
    private const val androidBuildToolsVersion = "7.0.4"
    const val androidBuildTools = "com.android.tools.build:gradle:$androidBuildToolsVersion"

    const val kotlinGradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion"

    private const val hiltAndroidGradlePluginVersion = "2.42"
    const val hiltAndroidGradlePlugin =
        "com.google.dagger:hilt-android-gradle-plugin:$hiltAndroidGradlePluginVersion"

}