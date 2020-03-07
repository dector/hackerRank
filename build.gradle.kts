import org.jetbrains.kotlin.gradle.plugin.KotlinSourceSet

plugins {
    kotlin("jvm") version "1.3.70"
}

repositories {
    jcenter()
}

dependencies {
    implementation(kotlin("stdlib"))
}

sourceSets.getByName("main").withConvention(KotlinSourceSet::class) {
    kotlin.srcDir("Algorithms")
}
