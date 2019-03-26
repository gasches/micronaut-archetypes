Micronaut Service App Maven Archetype
======================================

Summary
-------
The project is a Maven archetype for Micronaut application based on service profile.

Prerequisites
-------------

- JDK 8 (or higher)
- Maven 3

Create a project
----------------

```bash
mvn archetype:generate \
    -DinteractiveMode=false \
    -DarchetypeGroupId=io.gasches.archetypes \
    -DarchetypeArtifactId=micronaut-service \
    -DarchetypeVersion=1.0.4 \
    -DgroupId=com.example \
    -DartifactId=micronaut-example \
    -Dpackage=com.example.micronaut
    -DbuildTool=maven
```

Note: Available `buildTool` options: _gradle_, _maven_ (default). This property is used only for _Dockerfile_ conditional templating.

Run the project
----------------

Maven:

```bash
./mvnw package exec:exec
```

Gradle:

```bash
./gradlew run
```
