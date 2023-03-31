
rootProject.name = "bond-analytics"

pluginManagement {
    val kotlinVersion: String by settings

    plugins {
        kotlin("jvm") version kotlinVersion
    }
}

include("common")

