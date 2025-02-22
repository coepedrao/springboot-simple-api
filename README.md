# Spring Boot Simple API

Este é um projeto simples de API REST desenvolvido com Java e Spring Boot. Ele permite adicionar, listar e buscar usuários por ID.

## Tecnologias Utilizadas
- Java 17+
- Spring Boot
- Maven

## Como Rodar o Projeto

### Pré-requisitos
- Java 17+ instalado
- Maven instalado

### Passos
1. Clone este repositório:
   ```sh
   git clone https://github.com/seu-usuario/springboot-simple-api.git
   ```
2. Navegue até a pasta do projeto:
   ```sh
   cd springboot-simple-api
   ```
3. Compile e execute o projeto com Maven:
   ```sh
   mvn spring-boot:run
   ```
4. A API estará disponível em `http://localhost:8080/users`

## Endpoints

### Adicionar um usuário
**POST** `/users`
- Parâmetros: `name` (String)
- Exemplo de requisição:
  ```sh
  curl -X POST "http://localhost:8080/users?name=Joao"
  ```

### Listar todos os usuários
**GET** `/users`
- Exemplo de requisição:
  ```sh
  curl -X GET "http://localhost:8080/users"
  ```

### Buscar um usuário por ID
**GET** `/users/{id}`
- Exemplo de requisição:
  ```sh
  curl -X GET "http://localhost:8080/users/1"
  ```

