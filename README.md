# DaggerAndroidInjection

This project is about using the Dagger-Android framework to manage dependencies.
I wrote this in Kotlin to help me understand Dagger and dependency injection.

After reading Elye's article on dagger-android, I created my own implemetation
https://levelup.gitconnected.com/dagger-android-behind-the-scene-d6c9aa97c451

There are two branches: DaggerApplication and DaggerSetup.

DaggerApplication branch uses DaggerApplication, DaggerAppCompatActivity, and DaggerFragment to manage dependencies.

DaggerSetup branch uses a AndroidInjection and DispatchingAndroidInjector to manage dependencies.

I personally favored using the DaggerApplication approach since it allowed me to write less code.

Unfortunately, this approach is being disregarded by Google since DaggerAndroid is complex and Google wants to simplify dependency injection.

Google's standard of using Dagger is by creating their own Component, Subcomponents, Modules, manually injecting the dependencies, and managing the dependency graph.

https://developer.android.com/training/dependency-injection/dagger-android#kotlin
