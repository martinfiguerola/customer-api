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
