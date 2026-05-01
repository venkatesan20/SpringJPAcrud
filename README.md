# Spring Boot JPA CRUD Project

## 📌 Description

This is a simple Spring Boot application that demonstrates CRUD (Create, Read, Update, Delete) operations using Spring Data JPA and MySQL database.

---

## 🚀 Features

* Add Student
* Get All Students
* Get Student by ID
* Update Student
* Delete Student
* Delete All Students
* Get Students by Department

---

## 🛠️ Technologies Used

* Java
* Spring Boot
* Spring Data JPA
* MySQL
* Maven

---

## 📂 Project Structure

* controller → Handles API requests
* service → Business logic
* repository → Database operations
* model → Entity classes

---

## ⚙️ API Endpoints

| Method | Endpoint              | Description         |
| ------ | --------------------- | ------------------- |
| POST   | /students             | Add student         |
| GET    | /students             | Get all students    |
| GET    | /students/{id}        | Get student by ID   |
| PUT    | /students/{id}        | Update student      |
| DELETE | /students/{id}        | Delete student      |
| DELETE | /students/clear       | Delete all students |
| GET    | /students/dept/{dept} | Get by department   |

---

## 🔧 How to Run

1. Clone the repository
2. Open in IntelliJ
3. Configure MySQL in application.properties
4. Run the project

---

## 📸 Sample Output

API tested using Postman.

---

## 👨‍💻 Author

Venkatesan R
