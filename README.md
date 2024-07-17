# api-bank-domain-desafio Santander Java Bootcamp 2024
Java RESTful API criada no desafio do bootcamp Santander Java 2024

## Diagrama de Classes

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
