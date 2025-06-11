import org.springframework.boot.gradle.tasks.bundling.BootJar

dependencies {
    implementation(project(":global-utlis"))
    implementation(project(":domain"))
}

tasks {
    withType<Jar> { enabled = true }
    withType<BootJar> { enabled = false }
}
