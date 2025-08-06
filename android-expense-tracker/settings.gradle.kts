pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "ExpenseTracker"
include(":app")
include(":core:ui")
include(":core:data")
include(":core:domain")
include(":core:network")
include(":feature:expenses")
include(":feature:categories")
include(":feature:reports")
include(":feature:settings") 