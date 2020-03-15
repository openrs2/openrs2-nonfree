plugins {
    application
}

application {
    mainClassName = "client"
}

tasks.named<JavaExec>("run") {
    args("1", "live", "en", "game0")
}

dependencies {
    compileOnly(project(":deob-annotations"))

    implementation(project(":nonfree:gl"))
    implementation(project(":nonfree:signlink"))
}
