# MiniMAS Consultant Lab

MiniMAS Consultant Lab is a backend project inspired by IBM Maximo and enterprise asset management systems.

I built this project to practice backend development concepts such as REST APIs, PostgreSQL integration, layered architecture, and enterprise-style workflows using Spring Boot.

The project simulates a small asset and maintenance management system where assets can be created and linked to work orders.

---

# Technologies Used

- Java 21
- Spring Boot
- PostgreSQL
- Spring Data JPA
- Hibernate
- Maven
- Postman

---

# Features

## Asset Management
- Create assets
- Get all assets
- Update asset lifecycle status

## Work Orders
- Create work orders
- Link work orders to assets
- Update work order status

## REST API
- JSON request and response handling
- Layered backend architecture
- PostgreSQL database persistence

---

# Architecture

```text
Controller
   ↓
Service
   ↓
Repository
   ↓
PostgreSQL Database
```

---

# API Endpoints

## Assets

```http
GET /api/assets
POST /api/assets
PUT /api/assets/{id}/status
```

## Work Orders

```http
GET /api/work-orders
POST /api/work-orders/{assetId}
PUT /api/work-orders/{id}/status
```

---

# Example Asset JSON

```json
{
  "name": "Server A",
  "type": "Server",
  "status": "MAINTENANCE",
  "location": "Data Center"
}
```

---

# Example Work Order JSON

```json
{
  "title": "Replace server battery",
  "description": "Battery replacement required",
  "status": "COMPLETED",
  "technician": "Fabian"
}
```

---

# What I Learned

While building this project I practiced:

- REST API development
- PostgreSQL database integration
- Spring Boot layered architecture
- JPA and Hibernate relationships
- CRUD operations
- API testing with Postman
- Entity relationships using foreign keys
- Backend troubleshooting and debugging

---

# Future Improvements

- Authentication and authorization
- Docker support
- Swagger/OpenAPI documentation
- Validation and exception handling
- Frontend dashboard
- Predictive maintenance features

---

# Author

Fabian Umaña