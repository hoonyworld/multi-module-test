dependencies {
    implementation(project(":global-utils"))
    implementation(project(":domain"))
}

tasks {
    jar {
        enabled = true
    }
    bootJar {
        enabled = false
    }
}
