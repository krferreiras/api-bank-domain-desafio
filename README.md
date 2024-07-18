# api-bank-domain-desafio Santander Java Bootcamp 2024
Java RESTful API criada no desafio do bootcamp Santander Java 2024

## Tecnologias usadas

* **Java 17**
* **Spring Boot 3**
* **Spring Web**
* **Spring Data JPA**
* **OpenAPI (Swagger)**
* **Railway**
* **H2 Database**
* **PostgreSQL Driver**

## Diagrama de Classes (Domínio da API)

``` mermaid
classDiagram
  class User {
    - name: String
    - account: Account
    - features: Feature[]
    - card: Card
    - news: News[]
  }

  class Account {
    - number: String
    - agency: String
    - balance: Number
    - limit: Number
  }

  class Feature {
    - icon: String
    - description: String
  }

  class Card {
    - number: String
    - limit: Number
  }

  class News {
    - icon: String
    - description: String
  }

  User "1" *-- "1" Account
  User "1" *-- "N"Feature
  User "1" *-- "1" Card
  User "1" *-- "N" News
```
