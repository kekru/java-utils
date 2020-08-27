# Java utils

a few java helper classes, for personal projects

## Get via Jitpack

build.gradle

```groovy
repositories {
  maven { url 'https://jitpack.io' }
}

dependencies {
  implementation "com.github.kekru.java-utils:java-utils:<git hash or tag>"
  testImplementation "com.github.kekru.java-utils:test-utils:<git hash or tag>"
}
```

See also [jitpack.io/#kekru/java-utils](https://jitpack.io/#kekru/java-utils)

## Build locally

in this project

```
./gradlew build publishToMavenLocal
```

then reference in another build.gradle

```groovy
dependencies {
  implementation "de.kekru.java-utils:java-utils:0.0.1-SNAPSHOT"
  testImplementation "de.kekru.java-utils:test-utils:0.0.1-SNAPSHOT"
}
```
