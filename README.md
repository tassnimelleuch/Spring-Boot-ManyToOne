# Client-Account Management App (Spring Boot + Docker + MySQL)

This is a Spring Boot Maven application built using Spring Tool Suite (STS) for managing clients and their associated accounts. The app supports full CRUD operations on both entities and uses Docker for running the MySQL database.

---

## 📌 Features

- Add, update, delete, and list **clients**.
- Add, update, delete, and list **accounts (comptes)**.
- Each **Compte** (Account) is linked to a **Client** via a `@ManyToOne` relationship.
- SweetAlert integration for confirmation before deletions.
- Backend built with **Spring Boot**, **Spring Data JPA**, and **MySQL**.
- Dockerized MySQL container for development/testing.

---

## 📁 Project Structure

