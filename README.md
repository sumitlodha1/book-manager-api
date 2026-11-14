# Book Manager API

A simple REST API to manage books, built with Spring Boot. Books are stored in memory (a `HashMap`), so data resets when the app restarts.

## Tech Stack
- Java
- Spring Boot (Spring Web)
- Maven

## Endpoints

| Method | Endpoint       | Description          |
|--------|----------------|----------------------|
| GET    | `/books`       | Get all books        |
| GET    | `/books/{id}`  | Get a book by id     |
| POST   | `/books`       | Add a new book       |
| PUT    | `/books/{id}`  | Update a book        |
| DELETE | `/books/{id}`  | Delete a book        |

## Sample Request Body (POST / PUT)

```json
{
  "id": 1,
  "name": "Clean Code",
  "author": "Robert C. Martin"
}
```

## Notes
- Practice project built while learning Spring Boot REST APIs
- Returns `404 Not Found` when a book id does not exist (GET and DELETE)
