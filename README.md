# ☕ API com Java e Spring Boot

Uma API para gerenciamento de tarefas (To-Do List) com Java e Spring Boot.
Criação de rotas HTTP, validação de parâmetros, integração com banco de dados,
autenticação JWT com Spring Security e deploy na plataforma Render.

[![Java](https://img.shields.io/badge/Java-17-ED8B00?logo=openjdk\&logoColor=white)](https://www.java.com/)
[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-4.1.0-6DB33F?logo=springboot\&logoColor=white)](https://spring.io/projects/spring-boot)
[![Maven](https://img.shields.io/badge/Maven-C71A36?logo=apachemaven\&logoColor=white)](https://maven.apache.org/)
[![Docker](https://img.shields.io/badge/Docker-2496ED?logo=docker\&logoColor=white)](https://www.docker.com/)
[![Render](https://img.shields.io/badge/Render-46E3B7?logo=render\&logoColor=black)](https://render.com/)

## ✨ Features

* 👤 Cadastro de usuários
* 🔐 Autenticação e autorização
* ✅ Criação, listagem e atualização de tarefas
* 🗄️ Persistência com Spring Data JPA e H2
* 🛡️ Validação de dados e tratamento de erros
* 🐳 Containerização com Docker
* ☁️ Deploy no Render

## 🛠️ Technologies

* Java 17
* Spring Boot
* Spring Data JPA
* Spring Security
* H2 Database
* Maven
* Docker
* Render

## ▶️ Rodando localmente

```bash
mvn spring-boot:run
```

A aplicação será iniciada em:

```text
http://localhost:8080
```

Para utilizar o Java no VSCode, é necessário instalar as extensões abaixo:

- **vscjava.vscode-java-pack**
  - vscjava.vscode-java-debug
  - vscjava.vscode-java-test
  - vscjava.vscode-java-dependency
  - vscjava.vscode-maven
  - redhat.java
- **vscjava.vscode-spring-initializr**
- **vmware.vscode-spring-boot**
- **vscjava.vscode-spring-boot-dashboard**

## ☁️ Deploy

A aplicação foi containerizada com Docker e publicada no Render.

> ⚠️ O H2 utilizado neste projeto é um banco em memória. Os dados são perdidos quando a aplicação é reiniciada.
