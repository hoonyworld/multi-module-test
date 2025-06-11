dependencies {
    implementation(project(":global-utils"))
}

tasks {
    jar {
        enabled = true
    }
    bootJar {
        enabled = false
    }
}
