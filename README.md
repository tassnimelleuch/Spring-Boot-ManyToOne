# 🧾 Spring Boot ManyToOne CRUD: Client ↔️ Account

A Spring Boot (STS) application that performs **CRUD operations** on two entities: **Client** and **Compte (Account)** with a `@ManyToOne` relationship (Each account belongs to a client).

### 📦 Technologies

- Spring Boot
- Spring MVC
- Spring Data JPA (Hibernate)
- Maven
- MySQL (Dockerized)
- Thymeleaf
- SweetAlert
- Java 21

---


## 🧠 Features

- Create, Read, Update, Delete for:
  - Clients
  - Comptes (Accounts)
- `@ManyToOne` relationship (Each Compte is linked to one Client)
- SweetAlert prompts before deletion
- MySQL integration via Docker

---





## 🔍 Docker Inspect Data

docker exec -it spring-mysql mysql -uroot -proot springdb

Once inside MySQL:

SHOW TABLES;
DESCRIBE client;
SELECT * FROM client;
SELECT * FROM compte;


## ⚙️ Configuration
application.properties
properties
spring.datasource.url=jdbc:mysql://localhost:3306/springdb
spring.datasource.username=root
spring.datasource.password=root
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.thymeleaf.cache=false


## 🧾 pom.xml Dependencies
<dependencies>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-data-jpa</artifactId>
    </dependency>

    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web</artifactId>
    </dependency>

    <dependency>
        <groupId>mysql</groupId>
        <artifactId>mysql-connector-java</artifactId>
    </dependency>

    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-thymeleaf</artifactId>
    </dependency>

    <dependency>
        <groupId>org.webjars</groupId>
        <artifactId>sweetalert</artifactId>
        <version>2.1.2</version>
    </dependency>
</dependencies>



## 🗑 SweetAlert for Delete Confirmation


## 🚀 Run the App
Using Maven: ./mvnw spring-boot:run
Or from STS or IntelliJ, run the FirstSpringBootApplication class.


