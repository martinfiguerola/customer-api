# Step 3 of Learning - Customer REST API
This project implements an API to manage customers, with extended CRUD functionality and additional features such as custom queries, paging and sorting.

---

## Topics Learned

1. **@Transactional**  
   Using `@Transactional` to manage transactions, ensuring that all operations on the database are executed atomically.

2. **@Query**  
   Query customization with `@Query` to write custom SQL or JPQL queries. Used in conjunction with `@Param` to pass dynamic parameters.

3. **@Modifying**  
   El uso de `@Modifying` es imprescindible para todas aquellas queries que van a modificar nuestra Base de Datos y sean con `@Query`

4. **Pagination and Sorting**  
   Implementation of pagination and sorting with Pageable and Sort to optimize query performance on large volumes of data.

---

## **Practice Proposal: Customer Management System**

The goal is to create a simple Spring Boot module that enables basic operations with customers while practicing advanced queries, pagination, and sorting.

---

### **1. Functional Requirements**

1. **Basic CRUD** for the `Customer` entity:
   - Create, retrieve (by ID or list), update, and delete customers.
2. **Specific Queries**:
   - Filter customers by active/inactive status.
   - Search customers by partial name match (`firstName` or `lastName`).
   - Retrieve customers registered before a specific date.
3. **Bulk Operations with Transactions**:
   - Deactivate customers in bulk who were registered before a given date.
4. **Pagination and Sorting**:
   - List customers with support for pagination (page size and page number) and dynamic sorting (by name, date, etc.).
5. **Initial Data**:
   - Automatically load a basic dataset of customers for testing purposes.

---

### **2. Project Structure**

1. **Main Layers**:
   - **Entity:** `Customer` class.
   - **Repository:** Methods for database operations (including native and custom queries using `@Query`).
   - **Service:** Contains business logic and manages transactions (`@Transactional`).
   - **Controller:** Provides RESTful endpoints for interacting with the system.
   - **Data Initialization:** `data.sql` files or programmatic initialization.

---

### **3. RESTful Endpoints**

| HTTP Method | URI                     | Description                                   |
|-------------|-------------------------|-----------------------------------------------|
| `POST`      | `/customers`            | Create a new customer.                       |
| `GET`       | `/customers`            | List customers (with optional filters).      |
| `GET`       | `/customers/{id}`       | Retrieve a customer by ID.                   |
| `PUT`       | `/customers/{id}`       | Update customer details.                     |
| `DELETE`    | `/customers/{id}`       | Delete a customer by ID.                     |
| `GET`       | `/customers/active`     | List active/inactive customers.              |
| `PUT`       | `/customers/deactivate` | Bulk deactivate customers (based on a date). |

---

### **4. Practice Test Cases**

1. **Basic CRUD**:
   - Create a new customer and verify it appears in the database.
   - Edit and delete a customer by ID.
2. **Filtering**:
   - Retrieve only active or inactive customers.
   - Search for customers by partial name or last name match.
3. **Pagination and Sorting**:
   - List active customers sorted by registration date.
   - Retrieve the first page of results with a size of 2.
4. **Bulk Operations**:
   - Deactivate all customers registered before `2023-01-01`.
   - Validate the status change in the database.

---

### **5. Additional Challenges**

- Configure validations with `@Valid` for create/update operations.
- Use `ResponseEntity` to properly handle HTTP status codes in responses.
- Implement an exception handler using `@ControllerAdvice`.
