# Stage 1: Repository inspection and project setup

## Inspection findings

The connected GitHub repository `adithyanmp555-ui/ridesync` is public and has size 0 on its `main` branch. It contains no committed files to inspect. The separate GitHub repository `adithyanmp555-ui/RideConnect` is private and also reports size 0. Neither repository name was changed.

The local folder `Documents/ridesync` contains a Kotlin Multiplatform starter project, but it is not connected to either GitHub repository in this environment. The local project was treated as the source to preserve while making the initial app identity changes.

## Existing local project

- Structure: `androidApp` Android application, `shared` Compose Multiplatform module, and an existing `iosApp` host.
- Android application ID and source package: `ridesync.map`.
- Kotlin: 2.4.21.
- Gradle wrapper: 9.5.1.
- Android Gradle Plugin: 9.1.1.
- Compose Multiplatform: 1.12.2; Material 3: 1.12.0-alpha03.
- SDK values before Stage 1: compile SDK 37, target SDK 37, minimum SDK 24.
- Existing screen: generated Compose starter screen with a “Click me!” button and greeting image/text.
- Existing functionality: Android/iOS starter launch paths and a small shared greeting helper. No RideSync-specific functionality or Firebase, Google Maps, Routes API, Fused Location, foreground service, FCM, or LiveKit integration exists.

## Stage 1 changes

- Changed the root project display name from `MyApplication` to `RideSync`.
- Changed the Android launcher label from `MyApplication` to `RideSync`.
- Raised minimum SDK from 24 to 26, as requested.
- Updated the Compose resource imports affected by the root project name change; the generated resources package is now `ridesync.shared.generated.resources`.
- Replaced the generated README with project status, layout, build instructions, and the staged roadmap.
- Kept the application ID, Kotlin package, modules, and existing source files unchanged.

## Build status and limitations

The debug build has not passed yet. The first attempt could not find Java in the shell. Android Studio's bundled JDK was then selected and Gradle 9.5.1 started. The offline build stopped because `com.android.tools.build:aapt2:9.1.1-14792394` was missing from the local cache. With network access, Gradle downloaded/resolved the missing dependency; the first compile then caught the outdated generated Compose resource imports, which were fixed. A second build successfully compiled the shared and Android Kotlin modules, then remained at `:androidApp:mergeExtDexDebug` for several minutes. It was stopped due to the limited-RAM laptop and no reported progress. No successful APK build is confirmed.

The build also emitted a warning that the installed Android SDK tooling encountered SDK XML version 4 while it supports up to version 3.

The shell's Android Gradle Plugin also attempted to write analytics settings under `C:\.android`; Android Studio's normal per-user Android configuration is under the Windows user profile. The iOS simulator test target is disabled on Windows, as expected.

The local folder is not linked to GitHub and the `git` executable is unavailable in this shell. Therefore, these local Stage 1 changes have not been committed or synchronized to `adithyanmp555-ui/ridesync`. Do not start later stages against an assumed GitHub copy until this repository/source mismatch is resolved.

## Next setup actions

1. Open the local `Documents\ridesync` folder in Android Studio.
2. Confirm **Settings → Build, Execution, Deployment → Build Tools → Gradle → Gradle JDK** points to the bundled JDK.
3. Allow Android Studio to sync and download required Gradle and Android build components.
4. Run **Build → Make Project** and resolve any SDK or dependency setup prompts.
5. Decide how to connect or import this local starter into the intended GitHub repository without overwriting any existing work.
