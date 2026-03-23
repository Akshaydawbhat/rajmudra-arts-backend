# 🛕 Rajmudra Arts – Backend (Spring Boot)

Rajmudra Arts is a professional e-commerce platform designed to sell premium statues such as Shivaji Maharaj idols, spiritual murtis, and decorative art pieces.

This repository contains the **backend service** built using Spring Boot, designed with scalable architecture and production-ready practices.

---

## 🚀 Tech Stack

* **Backend Framework:** Spring Boot
* **Language:** Java
* **Database:** (Planned) PostgreSQL / Firebase Firestore
* **Authentication:** Firebase Auth / JWT (Planned)
* **Build Tool:** Maven
* **Version Control:** Git + GitHub

---

## 📦 Features (Planned & In Progress)

### 🔐 Authentication

* User registration & login
* Secure authentication (JWT / Firebase)
* Role-based access (Admin / User)

### 🛍️ Product Management

* Add / Update / Delete products
* Product categories (e.g., Shivaji Maharaj idols, spiritual statues)
* Image handling
* Pricing & stock management

### 🛒 Cart System

* Add to cart
* Remove from cart
* Update quantity

### 📦 Order Management

* Place orders
* Track order status
* Order history

### 💳 Payment Integration (Future)

* Razorpay / Stripe integration
* Secure payment handling

### 📊 Admin Panel APIs

* Manage products
* Manage orders
* View users

---

## 🧱 Project Structure

rajmudra-arts-backend/
│
├── src/main/java/com/rajmudraarts/
│   ├── controller/      # REST Controllers
│   ├── service/         # Business logic
│   ├── repository/      # Database layer
│   ├── model/           # Entities
│   ├── dto/             # Data Transfer Objects
│   ├── config/          # Security & App Config
│   └── RajmudraArtsApplication.java
│
├── src/main/resources/
│   ├── application.properties
│   └── firebase-service-account.json (ignored)
│
├── .gitignore
├── pom.xml
└── README.md

---

## ⚙️ Setup & Run Locally

### 1️⃣ Clone the Repository

git clone https://github.com/YOUR_USERNAME/rajmudra-arts-backend.git
cd rajmudra-arts-backend

---

### 2️⃣ Configure Environment

Create a file:

application-local.properties

Add your configs (DB, Firebase, etc.)

---

### 3️⃣ Run the Application

Using Maven:

mvn spring-boot:run

Or from IDE:
Run `RajmudraArtsApplication.java`

---

## 🔗 API Design (Example)

| Method | Endpoint           | Description            |
| ------ | ------------------ | ---------------------- |
| GET    | /api/products      | Get all products       |
| GET    | /api/products/{id} | Get product by ID      |
| POST   | /api/products      | Create product (Admin) |
| PUT    | /api/products/{id} | Update product         |
| DELETE | /api/products/{id} | Delete product         |

---

## 🔐 Security Best Practices

* Do not commit:

  * `.env`
  * Firebase service keys
  * Database credentials
* Use environment-based configuration
* Enable authentication before production

---

## 🌿 Git Workflow

* `main` → Production-ready code
* `develop` → Active development
* `feature/*` → New features

Example:
feature/product-api
feature/auth-system

---

## 📈 Future Enhancements

* Microservices architecture
* API Gateway
* Docker containerization
* CI/CD pipeline (GitHub Actions)
* Caching with Redis

---

## 👨‍💻 Author

**Akshay Dawbhat**
Aspiring Java Full Stack Developer

---

## ⭐ Project Vision

To build a scalable and professional e-commerce platform for selling high-quality statues across India, starting with Rajmudra Arts.

---
