import org.gradle.kotlin.dsl.extra
import org.jetbrains.kotlin.gradle.plugin.KotlinPluginWrapper

plugins {
    kotlin("kapt") version "1.2.40"
    kotlin("jvm") version "1.2.40"
    idea
}
repositories {
    jcenter()
}
description = "${name.replace("-", " ").toUpperCase()} of JPA Modelgen Project for JDK 9 & JDK 10 support"
val kotlinVersion = plugins.getPlugin(KotlinPluginWrapper::class.java).kotlinPluginVersion
dependencies {
    kapt(group="javax.xml.bind",   name="jaxb-api",                version="2.3.0") {
        because("MetaModel and some other components require this to be on annotationProcessor classpath") }
    kapt(group="javax.annotation", name="javax.annotation-api",    version="1.3.2") {
        because("Annotation Processors require this to be on annotationProcessor classpath") }
    kapt(group="org.hibernate",    name="hibernate-jpamodelgen",   version="5.3.0.CR1")
    kapt(group="javax.persistence", name="javax.persistence-api",  version="2.2")

    // No Luck including this in classpath in 9th and 10th
    compileOnly(group="javax.persistence", name="javax.persistence-api",    version="2.2")
    implementation(group="javax.persistence", name="javax.persistence-api", version="2.2")

    implementation(kotlin("stdlib-jdk8", kotlinVersion))
}
