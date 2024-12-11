# Online Book Store
Backend service for Online book store

### Requirements
- Java 21
- Mysql 8.4.3
- Gradle 8.11.1
- Spring Boot 3.4

### Starting up the project on local
- Install Mysql on local machine either via docker or directly on local machine
- Create a database called `bookstore`
- In the environmental variables set the following properties 
  - DATASOURCE_URL - `jdbc:mysql://localhost:3306/bookstore`
  - DATASOURCE_USERNAME - `username` _replace with your database username_
  - DATASOURCE_PASS - `password` _replace with your database password_
- Start the application to allow the migration to run for populating the inventory of books and creating the default user
