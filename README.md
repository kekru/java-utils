# Java utils

a few java helper classes, for personal projects

## Get via Jitpack

build.gradle

```groovy
repositories {
  maven { url 'https://jitpack.io' }
}

dependencies {
  implementation "com.github.kekru:java-utils:<git hash or tag>"
}
```

## Build locally

in this project

```
./gradlew build publishToMavenLocal
```

then reference in another build.gradle

```groovy
dependencies {
  implementation "de.kekru.java-utils:java-utils:0.0.1-SNAPSHOT"
}
```
