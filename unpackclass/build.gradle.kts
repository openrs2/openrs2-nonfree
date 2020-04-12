evaluationDependsOn(":nonfree")

plugins {
    `java-library`
}

dependencies {
    implementation(project(":nonfree:unpack"))
}
