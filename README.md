# flutter-rb-gradle-plugin

## About

Gradle plugin for [flutter_rb](https://github.com/fartem/flutter_rb).

## How to use

This plugin needs for [flutter_rb](https://github.com/fartem/flutter_rb). Just implement it to your library and use `flutter_rb`.

### Implementation

Add this config to `build.gradle` at the root of the project:

```groovy
buildscript {
    repositories {
        // Other repositories
        maven { url "https://jitpack.io" }
    }

    dependencies {
        // Other dependencies
        classpath 'com.github.fartem:flutter-rb-gradle-plugin:1.0.0'
    }
}

apply plugin: 'com.smlnskgmail.jaman.flutterrb'

dependencies {
    // Other dependencies
    implementation 'com.github.fartem:flutter-rb-gradle-plugin:1.0.0'
}
```

### Test run

You can run plugin as Gradle task:

```shell
./gradlew -q prepareInfo
```

## How to contribute

Read [Commit Convention](https://github.com/fartem/repository-rules/blob/master/commit-convention/COMMIT_CONVENTION.md). Make sure your build is green before you contribute your pull request. Then:

```shell
./gradlew clean build
```

## Contributors

- [@fartem](https://github.com/fartem) as Artem Fomchenkov
