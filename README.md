Micronaut Maven Archetypes
======================================

Summary
-------
Maven Archetypes For [Micronaut](http://micronaut.io) Framework.

To see available archetypes and pick one to instantiate:

```bash
mvn archetype:generate -Dfilter=cc.gasches.archetypes:micronaut
```

Prerequisites
-------------

- JDK 8 (or higher)
- Maven 3

Create Service
----------------

Java:

```bash
mvn archetype:generate \
    -DinteractiveMode=false \
    -DarchetypeGroupId=cc.gasches.archetypes \
    -DarchetypeArtifactId=micronaut-java-service \
    -DarchetypeVersion=1.1.0.M2-1 \
    -DgroupId=com.example \
    -DartifactId=micronaut-example \
    -Dpackage=com.example.micronaut \
    -DbuildTool=maven
```

Note: Available `buildTool` options: _gradle_, _maven_ (default). This property is used only for _Dockerfile_ conditional templating.

Kotlin:

```bash
mvn archetype:generate \
    -DinteractiveMode=false \
    -DarchetypeGroupId=cc.gasches.archetypes \
    -DarchetypeArtifactId=micronaut-kotlin-service \
    -DarchetypeVersion=1.1.0.M2-1 \
    -DgroupId=com.example \
    -DartifactId=micronaut-example \
    -Dpackage=com.example.micronaut \
    -DbuildTool=maven
```

Groovy:

```bash
mvn archetype:generate \
    -DinteractiveMode=false \
    -DarchetypeGroupId=cc.gasches.archetypes \
    -DarchetypeArtifactId=micronaut-groovy-service \
    -DarchetypeVersion=1.1.0.M2-1 \
    -DgroupId=com.example \
    -DartifactId=micronaut-example \
    -Dpackage=com.example.micronaut \
    -DbuildTool=maven
```

Create CLI Application
----------------

Java:

```bash
mvn archetype:generate \
    -DinteractiveMode=false \
    -DarchetypeGroupId=cc.gasches.archetypes \
    -DarchetypeArtifactId=micronaut-java-cli \
    -DarchetypeVersion=1.1.0.M2-1 \
    -DgroupId=com.example \
    -DartifactId=micronaut-example \
    -Dpackage=com.example.micronaut
```

Kotlin:

```bash
mvn archetype:generate \
    -DinteractiveMode=false \
    -DarchetypeGroupId=cc.gasches.archetypes \
    -DarchetypeArtifactId=micronaut-kotlin-cli \
    -DarchetypeVersion=1.1.0.M2-1 \
    -DgroupId=com.example \
    -DartifactId=micronaut-example \
    -Dpackage=com.example.micronaut
```

Groovy:

```bash
mvn archetype:generate \
    -DinteractiveMode=false \
    -DarchetypeGroupId=cc.gasches.archetypes \
    -DarchetypeArtifactId=micronaut-groovy-cli \
    -DarchetypeVersion=1.1.0.M2-1 \
    -DgroupId=com.example \
    -DartifactId=micronaut-example \
    -Dpackage=com.example.micronaut
```

Create AWS Function
----------------

Java:

```bash
mvn archetype:generate \
    -DinteractiveMode=false \
    -DarchetypeGroupId=cc.gasches.archetypes \
    -DarchetypeArtifactId=micronaut-java-function-aws \
    -DarchetypeVersion=1.1.0.M2-1 \
    -DgroupId=com.example \
    -DartifactId=micronaut-example \
    -Dpackage=com.example.micronaut
```

Run Created Application
----------------

Maven:

```bash
./mvnw package exec:exec
```

Gradle:

```bash
./gradlew run
```
