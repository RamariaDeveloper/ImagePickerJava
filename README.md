# Image Picker Java

The Image Picker Java app serves as a foundational step for projects that will utilize image recognition in machine learning for detection, processing, and analysis of images. Capturing images via an application developed in Java is an essential stage for such projects.

This simple app has been created as an example of a starter project to demonstrate basic functionalities utilizing smartphone capabilities. These functionalities include selecting images from the device's gallery and capturing images using the live camera feature. Additionally, the app includes functions to convert images into bitmaps, which are better suited for processing in machine learning tools.

By providing a straightforward interface for image capture and selection, this app serves as a starting point for developers looking to incorporate image recognition capabilities into their projects. The app's modular design and clean code make it easy to understand and extend, making it an ideal choice for experimentation and learning in the field of image processing and machine learning.

## Technologies Used

- **Java**: Java is a widely used programming language, especially in the development of Android applications. It is known for its portability, performance, and vast ecosystem of libraries and tools.
- **Android**: Android is a mobile operating system developed by Google, based on the Linux kernel and designed primarily for touchscreen mobile devices such as smartphones and tablets.
- **Android Studio**: Android Studio is the official integrated development environment (IDE) for Android app development, based on IntelliJ IDEA. It provides tools for building, testing, and debugging Android apps.
- **Native Development**: Native app development refers to building applications using the platform-specific programming languages and tools provided by the operating system. In the case of Android, this involves using Java or Kotlin along with Android Studio.

## Description of Technologies

- **Java**: Java is a high-level, object-oriented programming language known for its platform independence, strong community support, and extensive libraries. It is widely used in Android app development due to its performance and familiarity.
- **Android**: Android is an open-source mobile operating system developed by Google. It powers billions of devices worldwide and provides developers with a flexible framework for building innovative mobile applications.
- **Android Studio**: Android Studio is the official IDE for Android app development. It offers features such as code editing, debugging, performance profiling, and a rich set of tools for building user interfaces.
- **Native Development**: Native app development involves writing code specifically for a particular platform, utilizing the native APIs and capabilities of the operating system. This approach enables developers to create high-performance apps with access to system-level features.

## MVP Architecture

The project follows the MVP (Model-View-Presenter) architecture pattern, which is a design pattern commonly used in Android development. MVP separates the concerns of an application into three main components:

- **Model**: The Model represents the data and business logic of the application. It encapsulates the data sources, such as databases or network services, and provides methods for manipulating the data.
  
- **View**: The View is responsible for displaying the user interface and capturing user input. It is typically implemented as an Activity or Fragment in Android and interacts with the Presenter to update the UI based on changes in the data.
  
- **Presenter**: The Presenter serves as an intermediary between the Model and the View. It contains the presentation logic of the application and orchestrates the communication between the Model and the View. The Presenter retrieves data from the Model, formats it, and updates the View accordingly. It also listens for user input from the View and reacts appropriately by updating the Model or triggering other actions.

![mvp](https://github.com/RamariaDeveloper/ImagePickerJava/assets/142702495/0b87181b-50c0-42f9-8f8f-10acf8a58d5a)



### Importance of MVP for Small Projects and Proof of Concepts

Using MVP architecture, even in small projects or proof of concepts, offers several benefits:

1. **Separation of Concerns**: MVP helps in keeping the codebase organized and maintainable by separating the concerns of data, presentation, and user interface.
  
2. **Testability**: MVP facilitates unit testing by decoupling the business logic from the Android framework components. This allows for easier testing of individual components in isolation, leading to more reliable and robust tests.

3. **Scalability**: MVP provides a scalable architecture that can accommodate the growth of the project over time. It enables developers to add new features or modify existing ones without significantly impacting other parts of the application.

4. **Flexibility**: MVP allows for flexibility in design and implementation choices. It provides clear boundaries between components, making it easier to replace or upgrade parts of the system without affecting the entire application.

## Screenshots

| Title | Screenshot |
| ----- | ---------- |
| Screenshot 1 | <img src="https://github.com/RamariaDeveloper/ImagePickerJava/assets/142702495/dc8710da-54a5-41e1-a342-25ce2a8e1e0f" width="200" height="380"> |
| Screenshot 2 | <img src="https://github.com/RamariaDeveloper/ImagePickerJava/assets/142702495/d159e973-a4f8-4520-8df4-512e9006b3aa" width="200" height="380"> |
| Screenshot 3 | <img src="https://github.com/RamariaDeveloper/ImagePickerJava/assets/142702495/a4f4b30b-9781-4c2c-9169-7a14a3138ba0" width="200" height="380"> |
| Screenshot 4 | <img src="https://github.com/RamariaDeveloper/ImagePickerJava/assets/142702495/6b9ab7b9-4dc5-494c-ac5b-cd72dd7071cb" width="200" height="380"> |


## Getting Started

To get started with this project, follow these steps:

1. Clone the repository to your local machine.
2. Open the project in Android Studio.
3. Build and run the project on an Android emulator or a physical device.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
