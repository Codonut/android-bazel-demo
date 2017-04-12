# Demo of an Android app built with Bazel

This is a minimalistic Android app with a single activity (aka screen) showing a popup message "Hello, World!".

Unlike most Android projects which use [Gradle](https://gradle.org/), it is built using [Bazel](https://bazel.build/) with two targets:
- `//android/java/com/codonut/android/example:DemoActivity` is an `android_library` target that defines the `DemoActivity`
- `//android:app` is an `android_binary` target that builds the final APK
