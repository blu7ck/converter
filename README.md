# Unit Converter Application

## Overview
The **Unit Converter Application** is a web-based tool that allows users to convert units of length and temperature effortlessly. The application provides a clean user interface and logs previous conversion operations for easy reference.

This project showcases my back-end development skills using **Java** and **Spring Boot**, alongside front-end technologies like **HTML/CSS**, **Tailwind CSS**, and **DaisyUI**. Additionally, the project is containerized with **Docker** for easy deployment.

## Features
- Convert between various **length units** (e.g., meters, kilometers, miles).
- Convert between **temperature units** (e.g., Celsius, Fahrenheit).
- View and manage conversion history.
- Stylish UI using **Tailwind CSS** and **DaisyUI**.
- Containerized using **Docker**.

## Technologies Used
- **Java**: Backend logic and REST APIs.
- **Spring Boot**: Web framework.
- **HTML5/CSS3**: Frontend design.
- **Tailwind CSS** & **DaisyUI**: Responsive UI components and styling.
- **Docker**: Application containerization for portability.
- **JUnit**: Unit testing framework.

## Installation

### Prerequisites
- **Java 17** or later
- **Maven**
- **Docker** (optional for containerization)

### Steps

1. **Clone the repository**:
   ```bash
   git clone https://github.com/blu7ck/converter.git
   cd converter
2. **Build the project**:
    ```bash
    mvn clean install
    ```
3. **Run the application**:
    ```bash
    mvn spring-boot:run
    ```
4. **Access the app in your browser at**:
    ```bash
    http://localhost:8080
    ```

## Docker Setup

To containerize and run the application with Docker:

### Build the Docker image:
```bash
docker build -t yourusername/unit-converter-app .
```
### Run the Docker container:
```bash
docker run -p 8080:8080 yourusername/unit-converter-app
```

### Access the app in your browser at:
```bash
http://localhost:8080
```
# Pull the Docker Image

### To pull the image from Docker Hub:

```bash
docker pull blu7ck/converter-web-app:latest
```
### Run the Docker Container

After pulling the image, you can run it with the following command:

```bash
docker run -p 8080:8080 blu7ck/converter-web-app:latest
```
This will map the container's port 8080 to your local machine's port 8080. You can then access the application in your browser at:

```bash
http://localhost:8080
```
If you'd like to customize the ports or other settings, you can modify the -p option.
## Usage

    On the home page, select the type of conversion (Length or Temperature).
    Input the value and select the units for conversion.
    The result will be displayed, and the conversion will be added to the history.**
    View the History page to see past conversions.**


## **UPCOMING**

    View your past conversions in the history page. (adding PostgreSQL & MongoDB)
    Render or Heroku

## **The Main Purpose**
- This is my exercise project to apply newly learned backend and frontend technologies and tools.
- So, please enjoy it! 

## [All My Links](https://linktr.ee/blu4ck)