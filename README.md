# LibrospodMaga

LibrospodMaga is an Android application developed using Jetpack Compose, Retrofit, Dagger-Hilt, Coil, Clean Architecture, and MVVM architecture. The application serves as a comprehensive platform for users to explore a diverse collection of books across various genres. It provides a user-friendly interface that allows users to seamlessly toggle between dark mode and light mode for a personalized viewing experience.

## Features

- Dynamic UI built using Jetpack Compose
- Dark mode and light mode toggling for enhanced user experience
- Integration with Retrofit for efficient network requests
- Dependency injection facilitated by Dagger-Hilt
- Efficient image loading with Coil
- Implemented using the principles of Clean Architecture and MVVM design 
pattern
## Technologies Used
- **Jetpack Compose**: Used for building the user interface, providing a modern and declarative approach to UI development.
- **ViewModel**: Manages UI-related data and communicates with the data layer.
- **Dagger/Hilt**: For dependency injection, ensuring a modular and maintainable codebase.
- **Coil**: Efficiently loads and displays images in the app.
- **Retrofit**: Handles network requests and data retrieval from a remote server.
- **MVVM Architecture**: Ensures separation of concerns and maintainability of the codebase.
- **Clean Architecture**: Promotes a clean separation of layers, making the app more testable and scalable.

## Architecture Overview
The project follows the principles of Clean Architecture, consisting of three main layers:

1. **Presentation Layer**: Jetpack Compose components and ViewModels reside here, responsible for rendering UI and handling user interactions.

2. **Domain Layer**: Contains business logic, use cases, and domain models. It's independent of the Android framework.

3. **Data Layer**: Manages data sources, repositories, and network communication. Retrofit is used to fetch data from a remote server.
## Architecture
The app is built using the Modular MVVM architectural pattern and makes heavy use of a couple of Android Jetpack components. MVVM allows for the separation of concern which also makes testing easier.
![Clean architecture](https://blog.cleancoder.com/uncle-bob/images/2012-08-13-the-clean-architecture/CleanArchitecture.jpg)
## Dependencies
- [Dagger/Hilt](https://dagger.dev/hilt/): For dependency injection.
- [Coil](https://coil-kt.github.io/coil/): For image loading.
- [Retrofit](https://square.github.io/retrofit/): For network requests.
- [Jetpack Compose](https://developer.android.com/jetpack/compose): For building the UI.
- [ViewModel](https://developer.android.com/topic/libraries/architecture/viewmodel): For managing UI-related data.
- [Kotlin Coroutines](https://developer.android.com/kotlin/coroutines): For handling asynchronous operations.


## Planned Features

- Search implementation for easy book discovery
- Payment integration for seamless book purchase
- UI improvements for an enhanced user interface
- Local caching for improved performance and offline access

## Installation

1. Clone the repository: `git clone https://github.com/essy16/LibrospodMaga.git`
2. Open the project using Android Studio.
3. Build and run the application on your preferred Android device or emulator.

## Contributing

Contributions to LibrospodMaga are welcome. If you encounter any issues or have suggestions for improvements, please feel free to open an issue or submit a pull request.


