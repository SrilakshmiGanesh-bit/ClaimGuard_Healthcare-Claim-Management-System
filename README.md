# ClaimGuard – Healthcare Claim Management System

ClaimGuard is a healthcare claim management application designed to help manage patient information, validate medical records, and reduce errors that may lead to insurance claim denials.

The project aims to streamline healthcare claim processing through structured patient data management, automated validation, and claim denial tracking.

## 🎯 Project Objectives

- Manage patient information efficiently.
- Validate medical and patient-related data.
- Identify potential errors before claim submission.
- Track claim denials and their resolution.
- Improve the accuracy and efficiency of healthcare claim processing.

## 🛠️ Technology Stack

| Technology | Purpose |
|---|---|
| Java 25 | Backend programming |
| Spring Boot 4.1.2 | Backend application framework |
| Spring MVC | REST API development |
| Spring Data JPA | Database operations |
| Hibernate | ORM |
| MySQL | Relational database |
| Jakarta Bean Validation | Input validation |
| Maven | Dependency management |
| Postman | API testing |
| Git & GitHub | Version control |

## 🏗️ Project Architecture

The application follows a layered architecture to separate responsibilities and improve maintainability.

```text
com.claimguard
│
├── controller
│
├── service
│
├── repository
│
├── entity
│
├── dto
│   ├── PatientRequest
│   └── PatientResponse
│
└── enums
    └── Gender
```

### Layer Responsibilities

- **Controller:** Handles incoming HTTP requests and sends responses.
- **Service:** Contains business logic and coordinates application operations.
- **Repository:** Handles database interactions using Spring Data JPA.
- **Entity:** Represents database tables.
- **DTO:** Transfers data between the client and backend.
- **Enums:** Defines predefined constant values.

## ✅ Implemented Features

### Patient Management

- Create patient records.
- Retrieve all patient records.
- Retrieve individual patient details using ID.
- Update existing patient information.
- Delete patient records.
- Validate patient input using Jakarta Bean Validation.
- Handle missing patient records using HTTP 404 exceptions.

### Validation

- Patient name is mandatory.
- Patient name must not exceed 100 characters.
- Date of birth is mandatory.
- Date of birth must be in the past.
- Gender is a required enum value.

## 🔮 Planned Features

- Healthcare provider management.
- Medical encounter and record management.
- Automated medical record validation.
- Insurance claim creation and submission tracking.
- Claim denial identification and tracking.
- Claim resolution and resubmission.
- Claim status reports and analytics.
- React frontend integration.
- User authentication and authorization.

## ⚙️ Getting Started

### Prerequisites

Make sure you have installed:

- JDK 25
- IntelliJ IDEA or another Java IDE
- MySQL Server
- Maven
- Postman

### 1. Clone the Repository

```bash
git clone https://github.com/YOUR_USERNAME/ClaimGuard.git
```

### 2. Open the Project

Open the cloned project in IntelliJ IDEA and allow Maven to download the dependencies.

### 3. Configure the Database

Create a MySQL database:

```sql
CREATE DATABASE claimguard;
```

Configure your `application.properties` file:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/claimguard
spring.datasource.username=root
spring.datasource.password=YOUR_PASSWORD

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

spring.jpa.properties.hibernate.format_sql=true
```

Replace `YOUR_PASSWORD` with your local MySQL password.

### 4. Run the Application

Run the main Spring Boot application class from IntelliJ IDEA.

The application will start on:

```text
http://localhost:8080
```

## 🧪 API Testing

Postman is used to test the backend API operations.

Patient management operations include:

- Create Patient
- Get All Patients
- Get Patient By ID
- Update Patient
- Delete Patient

Refer to the controller mappings in the source code for the exact API URLs and HTTP methods.

## 📚 Key Concepts Practiced

- Object-Oriented Programming (OOP)
- Spring Boot application development
- REST API development
- Layered architecture
- Dependency Injection
- Constructor Injection
- DTO and Entity mapping
- Spring Data JPA
- Hibernate ORM
- CRUD operations
- Exception handling
- Jakarta Bean Validation
- MySQL database integration

## 👩‍💻 Developer

**Srilakshmi G**

Java Backend Developer Aspirant

GitHub: https://github.com/SrilakshmiGanesh-bit

---

*ClaimGuard is an ongoing learning and development project focused on building a structured healthcare claim management application using Java and Spring Boot.*
