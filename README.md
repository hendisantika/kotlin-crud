# Kotlin CRUD

A Sample Kotlin CRUD with Spring Boot

Install jq from [here](https://stedolan.github.io/jq/download/)

Run this project by this command :

`mvn clean spring-boot:run`

Get All Persons :

`curl "http://localhost:8080//api/persons" | jq '.'`

```
[
  {
    "id": 1,
    "name": "Naruto",
    "level": "Hokage"
  },
  {
    "id": 2,
    "name": "Kakashi",
    "level": "Hokage"
  },
  {
    "id": 3,
    "name": "Sakura",
    "level": "Jounin"
  },
  {
    "id": 4,
    "name": "Sasuke",
    "level": "Jounin"
  },
  {
    "id": 5,
    "name": "Jiraiya",
    "level": "Sannin"
  }
]
```