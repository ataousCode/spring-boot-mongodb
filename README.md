# Spring Boot 3 & MongoDB Application

This is a simple Spring Boot application that demonstrates how to manage a relationship between `Book` and `Author` entities using MongoDB as the database. 
The application provides RESTful APIs to create, read, and delete books and authors.

## Features

- **Create, Retrieve, and Delete Authors**
- **Create, Retrieve, and Delete Books**
- **Relationship Management**: Each book is associated with one author.

## Technologies Used

- **Spring Boot**: Backend framework
- **MongoDB**: NoSQL database
- **Spring Data MongoDB**: Provides a repository layer for MongoDB
- **Spring Web**: To build RESTful web services
- **Lombok**: To reduce boilerplate code (optional)

## Prerequisites

- **Java 17** or later
- **Maven 3.6.0** or later
- **MongoDB**: Ensure MongoDB is installed and running on `localhost:27017` or customize the configuration

## Getting Started

1. **Clone the repository**

   ```bash
   git clone https://github.com/ataousCode/spring-boot-mongodb
   cd spring-boot-mongodb
