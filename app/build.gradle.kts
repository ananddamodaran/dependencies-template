import kotlin.reflect.full.memberFunctions

plugins {
    id("com.android.application")
    kotlin("android")
    kotlin("kapt")
}


android {
    compileSdkVersion(Versions.COMPILE_SDK)
    defaultConfig {
        applicationId = "dev.damodaran.anand.androidnav"
        minSdkVersion(Versions.MIN_SDK)
        targetSdkVersion(Versions.TARGET_SDK)
        versionCode = Versions.versionCode
        versionName = Versions.versionName

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"),
                    "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }

}

dependencies {
    api(platform(project(":depconstraints")))
    kapt(platform(project(":depconstraints")))
    androidTestApi(platform(project(":depconstraints")))

    implementation (Libs.APPCOMPAT)
    implementation (Libs.MATERIAL)
    implementation (Libs.CONSTRAINT_LAYOUT)
    implementation (Libs.CORE_KTX)

    implementation (Libs.NAVIGATION_FRAGMENT_KTX)
    implementation (Libs.NAVIGATION_UI_KTX)
    testImplementation (Libs.JUNIT)
    androidTestImplementation(Libs.EXT_JUNIT)
    androidTestImplementation(Libs.ESPRESSO_CORE)
    implementation(Libs.ACTIVITY_KTX)
    implementation(Libs.GLIDE)

    implementation(Libs.MOSHI)
    implementation(Libs.RETROFIT)
    implementation(Libs.OKHTTP_LOGGING_INTERCEPTOR)
    implementation(Libs.TIMBER)
    implementation(Libs.COROUTINES)
    implementation(Libs.KOTLIN_STDLIB)


}
repositories {
    mavenCentral()
}