plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.example.expensetracker.core.domain"
    compileSdk = 34
    defaultConfig {
        minSdk = 24
        targetSdk = 34
    }
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib:1.9.10")
} 