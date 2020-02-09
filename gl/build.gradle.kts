plugins {
    `java-library`
}

dependencies {
    api(project(":nonfree:gl-dri"))

    compileOnly(project(":deob-annotations"))
}
