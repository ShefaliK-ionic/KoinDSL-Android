import org.jetbrains.kotlin.kapt3.base.Kapt.kapt

plugins {
    alias(libs.plugins.androidApplication)
    alias(libs.plugins.jetbrainsKotlinAndroid)
    id("com.google.devtools.ksp").version("1.6.10-1.0.4") // Or latest version of KSP
    kotlin("kapt")
}

android {
    namespace = "com.koindsl"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.koindsl"
        minSdk = 24
        targetSdk = 35
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
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures{
        viewBinding = true
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
//    implementation ("org.koin:koin-android:3.2.0")
//    implementation ("org.koin:koin-androidx-viewmodel:3.2.0")
//    implementation ("org.koin:koin-androidx-scope:3.2.0")

    implementation("io.insert-koin:koin-android:3.4.0")
    implementation("io.insert-koin:koin-core:3.4.0")
   implementation("com.squareup.retrofit2:retrofit:2.9.0")
//    ksp("com.squareup.moshi:moshi-kotlin-codegen:1.15.2")
    implementation ("com.squareup.moshi:moshi:1.12.0")
    implementation("com.squareup.moshi:moshi-kotlin:1.14.0")

    implementation ("com.squareup.retrofit2:converter-moshi:2.9.0")

    val room_version = "2.6.1"

//    implementation("androidx.room:room-runtime:$room_version")

//    implementation ("android.arch.persistence.room:runtime:1.1.1")
//    annotationProcessor("androidx.room:room-compiler:$room_version")

    implementation("androidx.room:room-runtime:$room_version")
    // optional - Kotlin Extensions and Coroutines support for Room
    implementation("androidx.room:room-ktx:$room_version")
    kapt("androidx.room:room-compiler:$room_version")

}


