import org.springframework.boot.gradle.tasks.bundling.BootJar

dependencies {
	implementation(project(":infra"))
	implementation(project(":domain"))
	implementation(project(":global-utlis"))


	implementation("org.springframework.boot:spring-boot-starter-web")
	implementation("org.springframework.boot:spring-boot-starter-data-jpa")
	implementation("org.springframework.boot:spring-boot-starter-security")
	implementation("org.springframework.boot:spring-boot-starter-validation")
	implementation("org.springframework.boot:spring-boot-starter-actuator")
	implementation("com.mysql:mysql-connector-j")

	testImplementation("org.springframework.boot:spring-boot-starter-test")
}

tasks {
	withType<Jar> { enabled = false }
	withType<BootJar> { enabled = true }
}
