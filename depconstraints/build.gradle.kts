plugins {
    id("java-platform")
    id("maven-publish")
}
val appcompat = "1.3.1"
val activity = "1.3.1"
val constraintLayout = "2.0.4"
val core = "1.6.0"
val coroutines = "1.5.1"
val espresso = "3.4.0"
val glide = "4.12.0"
val junit = "4.13"
val junitExt = "1.1.1"
val material = "1.4.0"
val moshi = "2.4.0"
val okhttpLoggingInterceptor = "4.9.0"
val retrofit = "2.9.0"
val timber = "4.7.1"




dependencies {
    constraints {
        api("${Libs.APPCOMPAT}:$appcompat")
        api("${Libs.ACTIVITY_KTX}:$activity")
        api("${Libs.CONSTRAINT_LAYOUT}:$constraintLayout")
        api("${Libs.CORE_KTX}:$core")
        api("${Libs.COROUTINES}:$coroutines")
        api("${Libs.ESPRESSO_CORE}:$espresso")
        api("${Libs.JUNIT}:$junit")
        api("${Libs.EXT_JUNIT}:$junitExt")
        api("${Libs.GLIDE}:$glide")
        api("${Libs.KOTLIN_STDLIB}:${Versions.KOTLIN}")
        api("${Libs.MATERIAL}:$material")
        api("${Libs.MOSHI}:$moshi")
        api("${Libs.RETROFIT}:$retrofit")
        api("${Libs.NAVIGATION_FRAGMENT_KTX}:${Versions.NAVIGATION}")
        api("${Libs.NAVIGATION_UI_KTX}:${Versions.NAVIGATION}")
        api("${Libs.OKHTTP_LOGGING_INTERCEPTOR}:$okhttpLoggingInterceptor")
        api("${Libs.TIMBER}:$timber")



    }
}

publishing {
    publications {
        create<MavenPublication>("myPlatform") {
            from(components["javaPlatform"])
        }
    }
}
