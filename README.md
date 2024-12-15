# Live Scoring Golf Application

## Table of Contents

- [Overview](#overview)
- [Features](#features)
- [Prerequisites](#prerequisites)
- [Installation](#installation)
- [Usage](#usage)
- [API Documentation](#api-documentation)
- [License](#license)

## Overview

The **Live Scoring Golf Application** is a platform for golf enthusiasts to view tournaments, check live leaderboards, manage player scores, and more.

## Features

- **Tournaments:** View details of current and upcoming tournaments.
- **Leaderboards:** Receive real-time updates on player rankings.
- **Player Profiles:** Admins can add, edit, and organize player profiles and assign them to tournament groups.
- **Score Management:** Players can enter scores for each hole during tournaments.

## Prerequisites

Before installing the application, ensure you have the following installed:
- Java 17 or higher
- Maven 3.8.0 or higher
- MySQL 8.x server

## Installation

To set up the Live Scoring Golf Application locally, follow these steps:

1. **Clone the Repository:** Clone the repository from GitHub:
   ```bash
   git clone https://github.com/your-repo/live-scoring-golf-app-backend.git
   cd live-scoring-golf-app-backend
   ```

2. **MySQL Setup:** Install and start your MySQL server if it is not already running.

3. **Database Creation:** Create a new database for the application:
   ```sql
   CREATE DATABASE golf;
   ```

4. **Configuration:** Update the database configuration in `src/main/resources/application.properties` to match your database credentials:
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/golf
   spring.datasource.username=your_username
   spring.datasource.password=your_password
   ```

5. **Build the Application:** Use Maven to build the application:
   ```bash
   mvn clean install
   ```

## Usage

To run the application:

1. **Start the Application:** Navigate to the main directory and execute the main class:
   ```bash
   mvn spring-boot:run
   ```

   Alternatively, execute the `GolfAppLiveScoring` class directly if using an IDE:
    - Locate `src/main/java/com/golf/app/live/scoring/GolfAppLiveScoring.java`.
    - Run the `main` method in your IDE.

## API Documentation

The application provides API documentation through Swagger UI:
- [Swagger UI](http://localhost:8082/swagger-ui/index.html)

## License

This project is licensed under the [BSD 3-Clause License](LICENSE).