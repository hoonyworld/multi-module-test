import org.springframework.boot.gradle.tasks.bundling.BootJar

dependencies {
    implementation(project(":infra"))
    implementation(project(":domain"))
    implementation(project(":global-utlis"))
}

tasks {
    withType<Jar> { enabled = true }
    withType<BootJar> { enabled = false }
}
