plugins {
    `java-library`
}

dependencies {
    compileOnly(project(":deob-annotations"))

    implementation(project(":nonfree:unpack"))
}
