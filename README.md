# SB-ProductManagementSystem

The Product Management System is a Spring Boot and Hibernate-based project that provides a REST API for managing product-related data. It supports CRUD operations, filtering, and sorting products using Hibernate ORM and MySQL as the database.


## Structure
com.pro
│── controller
│   ├── Controller.java       # REST Controller for handling API requests
│
│── service
│   ├── ProductService.java   # Business logic layer
│
│── dao
│   ├── ProductDAO.java       # Database access layer (Hibernate operations)
│
│── entity
│   ├── Product.java          # Entity class mapped to the database table
│
│── main
│   ├── Application.java      # Main class to run the Spring Boot application
│
├── resources
│   ├── application.properties  # Database configurations
│   ├── hibernate.cfg.xml       # Hibernate configuration
│
├── pom.xml                     # Maven dependencies


## Features
CRUD Operations

Add, update, delete, and retrieve products.
Bulk Operations

Insert multiple products in a single request.
Filtering & Sorting

Fetch products by category.
Sort products by price (ascending/descending).
RESTful API

Exposes endpoints for seamless interaction with the database.


## Technologies Used
Spring Boot - For building RESTful APIs.
Spring MVC - For handling HTTP requests.
Spring Dependency Injection - For managing beans.
Hibernate ORM - For interacting with MySQL.
JPA (Java Persistence API) - For database entity mapping.
MySQL - As the relational database.
Spring Boot Annotations - @RestController, @Service, @Repository, @Autowired, @Entity, etc.
Postman/Swagger - For API testing (if used).
