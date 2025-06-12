import org.springframework.boot.gradle.tasks.bundling.BootJar

dependencies {
    implementation(project(":global-utils"))
}

tasks {
    withType<Jar> { enabled = true }
    withType<BootJar> { enabled = false }
}
