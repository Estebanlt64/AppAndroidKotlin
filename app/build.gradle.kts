plugins {
    alias(libs.plugins.androidApplication)
    alias(libs.plugins.jetbrainsKotlinAndroid)
}

android {
    namespace = "com.example.calculadoraapp"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.calculadoraapp"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
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
        viewBinding = true
    }
}

dependencies {
    val viewmodel_version="2.3.1"
    val livedata_version="2.3.1"
    val fragment_version="1.3.2"
    val activity_version="1.2.2."
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    //View Model
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:$viewmodel_version")
    //LifeData
    implementation("androidx.lifecycle:lifecycle-livedata-ktx:$livedata_version")
    //Fragment
    implementation("androidx.fragment:fragment-ktx:$fragment_version")
    //Activity
    implementation("androidx.activity:activity-ktx:$activity_version")
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}