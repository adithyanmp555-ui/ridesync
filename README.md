# RideSync

**Ride Together. Stay Connected.**

RideSync is being developed as a native Android motorcycle group riding app. The current checkout is an early Kotlin Multiplatform starter with an Android app and a small shared Compose module. It does not yet include RideSync product features or backend integrations.

## Current project

- Android application module: `androidApp`
- Shared Compose module: `shared`
- Android application ID and Kotlin package: `ridesync.map` (preserved)
- Minimum Android SDK: 26
- Gradle wrapper: 9.5.1
- Android Gradle Plugin: 9.1.1
- Kotlin: 2.4.21
- Compose Multiplatform: 1.12.2

The app currently displays the generated Compose starter screen. Firebase, Maps, Routes, location tracking, LiveKit, chat, groups, and ride history have not been implemented or configured.

## Build the Android app

1. Install Android Studio and its bundled JDK and Android SDK.
2. Open this folder in Android Studio and let Gradle sync.
3. Connect an Android phone with USB debugging enabled, or select an emulator.
4. Select the `androidApp` run configuration and press **Run**.

From a terminal with Java and the Android SDK configured, build the debug APK with:

```powershell
.\gradlew.bat :androidApp:assembleDebug
```

The APK is written to `androidApp/build/outputs/apk/debug/androidApp-debug.apk` after a successful build.

## Project layout

```text
androidApp/      Android application entry point, manifest and resources
shared/          Compose Multiplatform shared starter code
iosApp/          Existing iOS host project; retained from the starter
gradle/          Version catalog and Gradle wrapper configuration
docs/            Project inspection and setup notes
```

See [docs/PROJECT_STATUS.md](docs/PROJECT_STATUS.md) for the initial repository inspection and known setup limitations.

## Planned development order

1. Repository and project setup
2. UI foundation and navigation
3. Firebase authentication
4. Group management
5. Foreground GPS tracking
6. Shared map
7. Shared destinations and routes
8. LiveKit push-to-talk with server authorization
9. Group chat
10. Emergency alerts and ride history
11. Security review and device testing
12. APK release preparation

External services will be marked unconfigured until their required project files, keys, and backend are set up. Secrets must not be committed or embedded in the APK.