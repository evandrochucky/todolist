# 📝 ToDoList API

Uma aplicação Java com **Spring Boot** para gerenciamento de tarefas (ToDoList), com documentação automática via **SpringDoc OpenAPI/Swagger**.

---

## 🚀 Tecnologias utilizadas
- Java 17+
- Spring Boot 4.0.4
- Spring Web
- Spring Data JPA
- H2 Database (para ambiente de desenvolvimento)
- SpringDoc OpenAPI 3.0.2
- Mokito
- JUnit
- Spring Test

---

## 📦 Como executar o projeto

### Pré-requisitos
- JDK 17 ou superior instalado
- Maven ou Gradle configurado

### Passos
1. Clone este repositório:
   ```bash
   git clone https://github.com/seu-usuario/todolist.git


2. Acesse a pasta do projeto::
   ```bash
   cd todolist

3. Compile e execute:
   ```bash
   mvn spring-boot:run

3. ou:
   ```bash
   ./gradlew bootRun

4. A aplicação estará disponível em:
   ```bash
   http://localhost:8080

## 📖 Documentação da API

A documentação interativa está disponível via Swagger UI:

👉 [http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html)

O contrato OpenAPI (JSON) pode ser acessado em:

👉 [http://localhost:8080/v3/api-docs](http://localhost:8080/v3/api-docs)


## 🗂 Estrutura básica da API

- **GET /tasks** → Lista todas as tarefas
- **POST /tasks** → Cria uma nova tarefa
- **GET /tasks/{id}** → Busca uma tarefa pelo ID
- **PUT /tasks/{id}** → Atualiza uma tarefa existente
- **DELETE /tasks/{id}** → Remove uma tarefa

## 📌 Exemplos de requisições com `curl`

- **Criar uma nova tarefa:**
  ```bash
  curl -X POST http://localhost:8080/tasks \
       -H "Content-Type: application/json" \
       -d '{"title":"Estudar Spring Boot","completed":false}'

- **Listar todas as tarefas:**
  ```bash
  curl -X GET http://localhost:8080/tasks


- **- Atualizar uma tarefa:**
  ```bash
  curl -X PUT http://localhost:8080/tasks/1 \
     -H "Content-Type: application/json" \
     -d '{"title":"Estudar Spring Boot","completed":true}'


- **- Deletar uma tarefa:**
  ```bash
  curl -X DELETE http://localhost:8080/tasks/1

## ⚙️ Configuração de porta

Por padrão, a aplicação roda na porta `8080`.  
Se a porta já estiver em uso, você pode alterar no arquivo `application.properties`.

  ```properties
  server.port=8081
  ```

## 📌 Próximos passos

- Implementar autenticação JWT
- Criar testes unitários e de integração
- Configurar perfis (`dev`, `test`, `prod`) com diferentes bancos de dados


## 📄 Licença

Este projeto está sob a licença MIT.  
Sinta-se livre para usar e modificar.
