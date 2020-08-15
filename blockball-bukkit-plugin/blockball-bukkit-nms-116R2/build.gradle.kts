dependencies {
    implementation(project(":blockball-api"))
    implementation(project(":blockball-core"))
    implementation(project(":blockball-bukkit-api"))

    compileOnly("org.spigotmc:spigot116R2:1.16.2-R2.0")
    compileOnly("com.google.inject:guice:4.1.0")

    testCompile("org.spigotmc:spigot116R2:1.16.2-R2.0")
}