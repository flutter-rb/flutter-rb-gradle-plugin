# flutter-rb-gradle-plugin

## About

Gradle plugin for [flutter_rb](https://github.com/flutter-rb/flutter-rb).

## How to use

This plugin needs for [flutter_rb](https://github.com/flutter-rb/flutter-rb). Just implement it to your library and use `flutter_rb`.

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
        classpath 'com.github.flutter-rb:flutter-rb-gradle-plugin:1.0.1'
    }
}

apply plugin: 'com.smlnskgmail.jaman.flutterrb'

dependencies {
    // Other dependencies
    implementation 'com.github.flutter-rb:flutter-rb-gradle-plugin:1.0.1'
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
$ ./gradlew clean
$ ./gradlew build
```

## Contributors

- [@fartem](https://github.com/fartem) as Artem Fomchenkov
