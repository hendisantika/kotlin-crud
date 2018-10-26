# Kotlin CRUD

A Sample Kotlin CRUD with Spring Boot

Install jq from [here](https://stedolan.github.io/jq/download/)

Run this project by this command :

`mvn clean spring-boot:run`

Get All Persons :

`curl "http://localhost:8080/api/persons" | jq '.'`

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

Get a specific Persons :

`curl "http://localhost:8080/api/persons/1" | jq '.'`

```
{
  "id": 1,
  "name": "Naruto",
  "level": "Hokage"
}
```

POST a Person :

`curl -d '{"name":"Aburame", "level":"Jounin"}' -H "Content-Type: application/json" -X POST http://localhost:8080/api/persons`

Result : `{"id":6,"name":"Aburame","level":"Jounin"}`

PUT / UPDATE a Person :

`curl -d '{"name":"Aburame Shino", "level":"Jounin"}' -H "Content-Type: application/json" -X PUT http://localhost:8080/api/persons/6`

Result :
```
{
  "id": 6,
  "name": "Aburame Shino",
  "level": "Jounin"
}
```
DELETE a Person :

`curl -H "Content-Type: application/json" -X DELETE http://localhost:8080/api/persons/6`

