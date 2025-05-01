# Product Category API

This Spring Boot project provides REST APIs to manage **Categories** and **Products** with the following features:

- Annotation-based configuration
- Relational DB integration (not in-memory)
- JPA & Hibernate
- One-to-many relationship (Category -> Products)
- Server-side pagination
---
## 🛠 Tech Stack

- Java
- Spring Boot
- Spring Data JPA
- Hibernate
- MySQL 
- Maven
---

## ⚙️ Setup Instructions

1. **Clone the Repository**
   ```bash
   git clone https://github.com/yourusername/product-category-api.git
   cd product-category-api
Configure Database Update the application.properties file:
properties
spring.datasource.url=jdbc:mysql://localhost:3306/yourdbname
spring.datasource.username=yourusername
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
Run the Application

mvn spring-boot:run
📁 Category APIs
Method	Endpoint	Description
GET	/api/categories?page=3	Get all categories (paginated)
POST	/api/categories	Create a new category
GET	/api/categories/{id}	Get category by ID
PUT	/api/categories/{id}	Update category by ID
DELETE	/api/categories/{id}	Delete category by ID

📦 Product APIs
Method	Endpoint	Description
GET	/api/products?page=2	Get all products (paginated)
POST	/api/products	Create a new product
GET	/api/products/{id}	Get product by ID (with category)
PUT	/api/products/{id}	Update product by ID
DELETE	/api/products/{id}	Delete product by ID

🔗 Relationships
One Category can have many Products (One-to-Many).

While fetching a single product, category details are included in the response.

📤 Deployment
Localhost: http://localhost:8089

All endpoints are RESTful and ready for frontend integration.

📚 License
This project is licensed under the MIT License.










