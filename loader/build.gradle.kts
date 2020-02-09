plugins {
    java
}

dependencies {
    compileOnly(project(":deob-annotations"))

    implementation(project(":nonfree:signlink"))
    implementation(project(":nonfree:unpack"))
}
