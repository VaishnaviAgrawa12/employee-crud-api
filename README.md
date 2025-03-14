## Employee Management CRUD API using Spring Boot

### 📌 Overview  
This is a simple **REST API** built using **Spring Boot** that allows performing **CRUD (Create, Read, Update, Delete) operations** on employee data. It uses an **in-memory HashMap** to store employee records.

### 🚀 Features  
- Retrieve all employees  
- Get employee details by ID  
- Add a new employee  
- Update an existing employee (PUT & PATCH)  
- Delete an employee  

### 🛠 Technologies Used  
- **Java 17+**  
- **Spring Boot**  
- **Spring Web**  
- **Postman** (for testing API requests)  

---

## ⚙️ API Endpoints  

### 🔹 Get All Employees  
**Request:**  
```http
GET /employee
```
**Response:**  
```json
[
  {
    "id": 1,
    "name": "John Doe",
    "age": 30
  }
]
```

### 🔹 Get Employee by ID  
**Request:**  
```http
GET /employee/id/{id}
```
**Example:**  
```http
GET /employee/id/1
```

### 🔹 Add New Employee  
**Request:**  
```http
POST /employee
Content-Type: application/json
```
**Body:**  
```json
{
  "id": 1,
  "name": "John Doe",
  "age": 30
}
```

### 🔹 Update Employee (PUT)  
**Request:**  
```http
PUT /employee/id/{id}
Content-Type: application/json
```
**Body:**  
```json
{
  "id": 1,
  "name": "Jane Doe",
  "age": 32
}
```

### 🔹 Partial Update Employee (PATCH)  
**Request:**  
```http
PATCH /employee/id/{id}
Content-Type: application/json
```
**Body:**  
```json
{
  "name": "Jane Smith"
}
```

### 🔹 Delete Employee  
**Request:**  
```http
DELETE /employee?id={id}
```
**Example:**  
```http
DELETE /employee?id=1
```

---

## 🛠 Setup & Run  

### 🔹 Prerequisites  
- Install **Java 17+**  
- Install **Maven**  

### 🔹 Clone Repository  
```sh
git clone https://github.com/yourusername/employee-crud-api.git
cd employee-crud-api
```

### 🔹 Run the Application  
```sh
mvn spring-boot:run
```

The application will start on `http://localhost:9090`. You can test the endpoints using **Postman** or any API testing tool.

---
