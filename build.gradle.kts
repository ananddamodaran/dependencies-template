// Top-level build file where you can add configuration options common to all sub-projects/modules.

buildscript {

    repositories {
        google()
        mavenCentral()
        maven { url = uri("../androidnav-prebuilts/m2repository") }

    }
    dependencies {
        classpath("com.android.tools.build:gradle:${Versions.ANDROID_GRADLE_PLUGIN}")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.KOTLIN}")

    }
}
allprojects{
  repositories{
      google()
      mavenCentral()
      // For Android Build Server
      // - Material Design Components
      maven { url = uri("${project.rootDir}/../androidnav-prebuilts/repository") }
      // - Other dependencies
      maven { url = uri("${project.rootDir}/../androidnav-prebuilts/m2repository") }
      // - Support Libraries, etc
      maven {
          url = uri("${project.rootDir}/../../../prebuilts/fullsdk/linux/extras/support/m2repository")
      }

  }
}

tasks{
    val clean by registering(Delete::class){
        delete(buildDir)
    }
}


