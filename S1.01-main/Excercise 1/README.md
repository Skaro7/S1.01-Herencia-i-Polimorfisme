# Musical Instruments – Object-Oriented Programming Exercise

## 📄 Description

This exercise focuses on practicing **inheritance** and **polymorphism**, two core concepts of Object-Oriented Programming (OOP) in Java. Additionally, it explores how **class loading** works in Java and demonstrates the use of **static blocks** and **initialization blocks** during runtime.

The goal is to understand how different objects can share common attributes and behavior through inheritance, while still providing their own specific implementations.

### Exercise Statement

We are designing a program to manage musical instruments in a music band. The band includes three types of instruments:

- Wind instruments
- String instruments
- Percussion instruments

All instruments share two common characteristics:

- A **name**
- A **price**

Additionally, all instruments can be played, but each type produces sound in a different way.

The exercise also demonstrates Java class loading behavior by using **static blocks** and analyzing when they are executed.

---

## 💻 Technologies Used

- Java (JDK 8 or higher)
- Object-Oriented Programming (OOP)
- Git & Conventional Commits
- Console-based application

---

## 📋 Requirements

To run this project, you will need:

- Java Development Kit (JDK) 8 or later
- A code editor or IDE (IntelliJ IDEA, Eclipse, VS Code, etc.)
- Git (optional, for version control)

---

## 🛠️ Installation

Follow these steps to install the project locally:

1. Clone the repository:
   ```bash
   git clone <repository-url>
   ```
2. Navigate to the project directory:
   ```bash
   cd musical-instruments
   ```
3. Open the project in your preferred IDE.

---

## ▶️ Execution

To execute the project:

1. Compile the Java files:
   ```bash
   javac Main.java
   ```
2. Run the application:
   ```bash
   java Main
   ```

The console output will display messages showing how each instrument is played, demonstrating polymorphism. It will also show when static blocks are executed, proving how class loading works in Java.

---

## 🌐 Deployment

This is a console-based educational project and does not require deployment to a production environment.

If needed, it can be executed on any system with a compatible Java Runtime Environment (JRE).

---

## 🧱 Class Loading and Initialization Blocks

### Static Block

- Executed **once** when the class is loaded into memory.
- Triggered when:
  - The first instance of the class is created, or
  - A static member of the class is accessed.

### Initialization Block (Non-static)

- Executed **every time an object is created**.
- Runs **before** the constructor.

### Key Differences

| Static Block | Initialization Block |
|-------------|----------------------|
| Runs once per class | Runs once per object |
| Belongs to the class | Belongs to the instance |
| Used for static initialization | Used for common object initialization |
