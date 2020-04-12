evaluationDependsOn(":nonfree")

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
    implementation(project(":nonfree:gl"))
    implementation(project(":nonfree:signlink"))
}
