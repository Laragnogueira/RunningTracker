plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("kotlin-kapt")
    id("androidx.navigation.safeargs.kotlin")
    id("dagger.hilt.android.plugin")
}

android {
    namespace = "com.example.runningtracker"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.runningtracker"
        minSdk = 26
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
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
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
    buildFeatures {
        viewBinding = true
        dataBinding = true
    }

}

dependencies {
    implementation("androidx.core:core-ktx:1.12.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.9.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")

    // Material Design
    implementation("com.google.android.material:material:1.11.0-alpha03")

    // Architectural Components
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.6.2")

    // Room
    implementation("androidx.room:room-runtime:2.5.2")
    kapt("androidx.room:room-compiler:2.5.2")

    // Kotlin Extensions and Coroutines support for Room
    implementation("androidx.room:room-ktx:2.5.2")

    // Coroutines
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.7.1")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.7.1")

    // Coroutine Lifecycle Scopes
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.6.2")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.6.2")

    // Navigation Components
    implementation("androidx.navigation:navigation-fragment-ktx:2.7.4")
    implementation("androidx.navigation:navigation-ui-ktx:2.7.4")

    // Glide
    implementation("com.github.bumptech.glide:glide:4.13.2")
    kapt("com.github.bumptech.glide:compiler:4.13.2")

    // Google Maps Location Services
    implementation("com.google.android.gms:play-services-location:21.0.1")
    implementation("com.google.android.gms:play-services-maps:18.1.0")

    // Dagger Core
    implementation("com.google.dagger:dagger:2.45")
    kapt("com.google.dagger:dagger-compiler:2.45")

    // Dagger Android
    api("com.google.dagger:dagger-android:2.28.1")
    api("com.google.dagger:dagger-android-support:2.28.1")
    kapt("com.google.dagger:dagger-android-processor:2.23.2")

    //Activity KTX for viewModels()
    implementation("androidx.activity:activity-ktx:1.8.0")

    // Dagger Hilt -
    implementation("com.google.dagger:hilt-android:2.45")
    kapt("com.google.dagger:hilt-android-compiler:2.45")
    kapt("androidx.hilt:hilt-compiler:1.0.0")
   // implementation("androidx.hilt:hilt-lifecycle-viewmodel:1.0.0-alpha03")


    // Easy Permissions
    implementation("pub.devrel:easypermissions:3.0.0")

    // Timber
    implementation("com.jakewharton.timber:timber:4.7.1")

    // MPAndroidChart
    implementation("com.github.PhilJay:MPAndroidChart:v3.1.0")

    implementation("android.arch.lifecycle:extensions:1.1.1")
}