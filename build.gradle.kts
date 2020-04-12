plugins {
    base
}

configure(subprojects) {
    plugins.withType<JavaPlugin> {
        dependencies {
            val annotationProcessor by configurations
            annotationProcessor(project(":deob-processor"))
        }

        tasks.named<JavaCompile>("compileJava") {
            options.compilerArgs = listOf("-Amap=${project.rootDir}/data/deob-map/${project.name}.yaml")
        }
    }
}
