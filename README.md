# Mybatis-Spring-Boot

Demo applications illustrating Mybatis (forked from ibatis) library using latest version of Spring Boot. Mybatis is an alternative for ORM frameworks Hibernate and Spring Data JPA. We can leverage dynamic and reusable SQL queries and have more control over the SQL and can have clean Java code if necessary.

<h4>Test Results<h4>

**H2 Database Test Data**

http://localhost:8080/h2-console 

![image](https://github.com/user-attachments/assets/fbecf9ac-7655-458a-9ec5-05ea4284ae6e)



<h4>dynamic-sql-demo</h4>

***findBooksByTitle***:

Query 1: SELECT * FROM books WHERE title ILIKE CONCAT('%', ?, '%')
![image](https://github.com/user-attachments/assets/1bd5ebb6-9893-4b72-8d44-33897c55b356)

Query 2: SELECT * FROM books
![image](https://github.com/user-attachments/assets/f783afe2-c6d3-48c2-96ad-5a116d986e32)


***getSortedBooks***:

Query 1: SELECT * FROM books ORDER BY id
![image](https://github.com/user-attachments/assets/b5f2f67b-91c3-44a3-ba4f-39f18b705e99)

Query 2: SELECT * FROM books ORDER BY title
![image](https://github.com/user-attachments/assets/1d53e216-162f-48fb-867c-46c6f82a3b28)

Query 3: SELECT * FROM books ORDER BY author
![image](https://github.com/user-attachments/assets/8250421a-1a16-4c4c-9970-98684517f0d5)

Query 4: SELECT * FROM books ORDER BY publication_year
![image](https://github.com/user-attachments/assets/bfd97d07-768c-4c60-971d-e1acd97c0a07)


***findBooksByFilter***

Query 1: SELECT * FROM books WHERE title = ? OR author = ?
![image](https://github.com/user-attachments/assets/01536329-b6d7-41da-85d0-267c120ded4b)

Query 2: SELECT * FROM books WHERE title = ?
![image](https://github.com/user-attachments/assets/c2d0d954-ea16-46cf-93ca-7303b3500b04)


***updateBook***

Query 1: UPDATE books SET title = ?, author = ?, publication_year = ? WHERE id = ?
![image](https://github.com/user-attachments/assets/def223b8-100f-4286-802f-1d03cd0997d4)

Query 2: UPDATE books SET author = ? WHERE id = ?
![image](https://github.com/user-attachments/assets/5ac53cbb-194c-47b0-a459-a026b85173b1)


<h4>dynamic-sql-demo-2</h4>

***searchBook***

Query 1: SELECT * FROM books WHERE id=? OR publication_year in ( ? , ? )
![image](https://github.com/user-attachments/assets/060ffcdd-040a-49ec-bc0f-01cb9f245c8b)

Query 2: SELECT * FROM books WHERE id=?
![image](https://github.com/user-attachments/assets/b174392e-8a7d-4e80-ab98-6feb79a69c33)


<h4>sql-fragments-demo</h4>

***getBookById***

Query: SELECT * FROM books WHERE id = ?
![image](https://github.com/user-attachments/assets/8142647b-1527-425e-85a9-3aad266f30c9)

***updateBook***

Query: UPDATE books SET author = ? WHERE id = ?
![image](https://github.com/user-attachments/assets/27f4c615-c0b4-4bb7-8cab-65d2b2a0a4fd)


***deleteBook***

Query: DELETE from books WHERE id = ?
![image](https://github.com/user-attachments/assets/4e3346a8-6139-4bd7-aea7-7386ecda58c8)
