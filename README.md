# Car-Rental
[![Angular](https://img.shields.io/badge/Angular-DD0031?style=for-the-badge&logo=angular&logoColor=white)](https://angular.io/)
[![Spring Boot](https://img.shields.io/badge/Spring_Boot-6DB33F?style=for-the-badge&logo=spring-boot&logoColor=white)](https://spring.io/projects/spring-boot)
[![PostgreSQL](https://img.shields.io/badge/PostgreSQL-316192?style=for-the-badge&logo=postgresql&logoColor=white)](https://www.postgresql.org/)

A modern car rental platform with admin and customer interfaces built using:

**Frontend**: Angular 15+ with NgZorro UI  
**Backend**: Spring Boot 3+ with Hibernate  
**Database**: PostgreSQL (Managed pgAdmin)

## Features ✨
- User authentication/authorization
- Car inventory management
- Reservation system
- Admin dashboard
- Responsive UI

## Project Setup 🛠️

### Prerequisites
- Node.js v18+ & npm
- Angular CLI 15+
- Java 17+
- Maven/Gradle
- PostgreSQL 14+
- pgAdmin 4 

### Installation
1. Clone repository:
bash
```
git clone https://github.com/yourusername/Car-Rental.git
cd Car-Rental
```
Frontend (Angular):
```
cd angular-frontend
npm install
```

Backend (Spring Boot):
```
cd spring-boot-backend
mvn install
```

### Configuration ⚙️

Frontend (Angular):
Create a basic config file in *src/environments/environment.ts*:
```
export const environment = {
  production: false,
  apiUrl: 'http://localhost:8080/api',
  // Add other frontend configuration here
};
```
Backend (Spring Boot):
Create a basic config file in _src/main/resources/application.yml_:
```
server:
  port: port_number
spring:
  datasource:
    url: jdbc:postgresql://localhost:5432/your_db_name
    username: your_username
    password: your_password
    driver-class-name: org.postgresql.Driver
    hikari:
      maximum-pool-size: 10
      minimum-pool-size: 5
      idle-timeout: 30000
      connection-timeout: 30000
  jpa:
  hibernate:
    ddl-auto: update
    properties:
      hibernate:
        show-sql: true
        format-sql: true
        dialect: org.hibernate.dialect.PostgreSQLDialect
app:
  jwt:
    secret: your_jwt_secret_here
    expiration: 86400000  # 24 hours in milliseconds
```

Database Setup (via pgAdmin):
1. Open pgAdmin and create a new server:
    - Name: your_server_name
    - Host: localhost
    - Port: 5432
    - Maintenance database: postgres
    - Username: postgres
    - Password: your_db_password
2. Create your database:
    - Right-click "Databases" → Create → Database
    - Name: ***your_db_name***
3. Verify connection in Spring Boot:
    - The app will automatically create a table on the first run via Hibernate in pgAdmin.

### Running Locally 🖥️
1. Start pgAdmin PostgreSQL server
2. ### Backend:
```
cd spring-boot-backend
mvn spring-boot:run
```
- API will be available at http://localhost:8080
  
3. ### Frontend:
```
cd angular-frontend
ng serve
```
- Access UI at http://localhost:4200

### Development Workflow 🔄
1. Start PostgreSQL service
2. Run backend application
3. Run frontend application
4. Access endpoints:
  - API: http://localhost:8080/api
  - UI: http://localhost:4200
5. Use pgAdmin for:
  - Database monitoring
  - Query execution
  - Table structure verification

### Troubleshooting 🔧
Common issues:
- Connection refused: Verify PostgreSQL is running
- Authentication failed: Double-check credentials in application.yml
- Missing tables: Ensure spring.jpa.hibernate.ddl-auto is set to update
- CORS errors: Verify frontend's apiUrl matches backend port

Enjoy!
