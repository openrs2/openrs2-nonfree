plugins {
    base
}

configure(subprojects) {
    plugins.withType<JavaPlugin> {
        dependencies {
            val annotationProcessor by configurations
            annotationProcessor(project(":deob-processor"))

            val compileOnly by configurations
            compileOnly(project(":deob-annotations"))
        }

        tasks.named<JavaCompile>("compileJava") {
            options.compilerArgs = listOf("-Amap=${project.rootDir}/share/deob-map/${project.name}.yaml")
        }
    }
}
