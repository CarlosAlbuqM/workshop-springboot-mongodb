# Workshop MongoDB

![Java](https://img.shields.io/badge/Java-21-orange)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-4.1-brightgreen)
![MongoDB](https://img.shields.io/badge/MongoDB-database-green)
![License](https://img.shields.io/badge/license-MIT-blue)

Sobre o projeto

API REST desenvolvida em Java com Spring Boot e MongoDB para estudar as principais características de um banco de dados orientado a documentos.

O projeto foi construído com foco em:

- Compreender as diferenças entre bancos relacionais e bancos orientados a documentos.
- Implementar operações de CRUD.
- Modelar associações entre objetos em MongoDB.
- Trabalhar com objetos aninhados e referências entre documentos.
- Realizar consultas utilizando Spring Data MongoDB e MongoRepository.
- Estruturar uma API em camadas utilizando resource, service e repository.

O domínio da aplicação é formado por usuários, posts e comentários.




## Estratégia de modelagem no MongoDB

- User é armazenado como documento na coleção user.
- Post é armazenado como documento na coleção post.
- A lista de posts do usuário utiliza @DBRef, representando uma referência entre documentos.
- O autor de um post é armazenado como um objeto AuthorDTO dentro do documento do post.
- Os comentários são armazenados dentro do próprio post como uma lista de CommentDTO.
- O autor de cada comentário também é representado por um AuthorDTO embutido.
Essa combinação demonstra dois recursos comuns em bancos orientados a documentos: referências e documentos aninhados.

## Tecnologias utilizadas

- Java 21
- Spring Boot 4.1.0
- Spring Web MVC
- Spring Data MongoDB
- MongoDB
- Maven
- Spring Boot Actuator
- JUnit 5 e Spring Boot Test

## Arquitetura

O projeto foi organizado em camadas para separar as responsabilidades da aplicação:

**Resources:** expõem os endpoints HTTP da API.
**Services:** concentram as regras de negócio e intermediam o acesso aos repositórios.
**Repositories:** utilizam MongoRepository para realizar operações no MongoDB.
**Domain:** contém as entidades persistidas, como User e Post.
**DTOs:** representam estruturas específicas para autores, comentários e usuários.
**Config:** contém a carga inicial dos dados.
**Exception:** realiza o tratamento padronizado de erros da API.
**Util:** contém funções auxiliares para decodificação de parâmetros e conversão de datas.

# Funcionalidades

- Cadastro, consulta, atualização e exclusão de usuários.
- Consulta de posts por identificador.
- Busca de posts pelo título.
- Busca completa por texto no título, corpo do post ou comentários.
- Filtro de posts por intervalo de datas.
- Consulta dos posts associados a um usuário.
- Carga inicial de usuários, posts e comentários.
- Tratamento de objetos não encontrados com resposta HTTP 404.

 - Atualmente, os endpoints de posts estão voltados para consulta e pesquisa. A criação, alteração e exclusão de posts não possuem endpoints próprios e os dados iniciais são inseridos pela classe Instantiation.


# Aprendizados

- Este projeto permitiu praticar conceitos importantes de desenvolvimento de APIs e MongoDB.
- Diferenças entre persistência relacional e orientada a documentos.

- Uso do MongoDB com Spring Data.

- Criação de repositórios com MongoRepository.
- Operações de CRUD.
- Uso de @Document, @Id e @DBRef.
- Modelagem com documentos aninhados.
- Uso de DTOs para representar autores e comentários.
- Consultas com @Query e métodos derivados do Spring Data.
- Pesquisa textual com expressão regular.
- Filtros por intervalo de datas.
- Organização da aplicação em camadas.
- Tratamento global de exceções.
- Serialização e desserialização de objetos JSON.

# Status do projeto

Projeto concluído para fins de estudo.

Autor
Carlos Albuquerque