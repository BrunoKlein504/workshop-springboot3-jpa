# Projeto de Integração de Sistema de Loja:
[![BrunoKlein504](https://img.shields.io/github/license/BrunoKlein504/workshop-springboot3-jpa)](https://github.com/BrunoKlein504/workshop-springboot3-jpa/blob/fc5ef0290f7ff7c4af70a77ad53f7a8d3eca990e/LICENSE)

# **Sobre o projeto** :
É um repositório dedicado a um workshop interativo que explora os fundamentos do desenvolvimento web services. O Projeto se consiste num sistema de um estabelecimento onde há clientes que fazem pedidos e armazenam/atualizam/cancelam as requisições no servidor.

O projeto inclui _entidades de relacionamentos com UML_, a _instanciação de objetos_ e as _camadas lógicas_. Os tópicos abordados incluem configuração do Spring Boot, criação de entidades JPA, consultas de banco de dados, e muito mais.

## Domain model:
![img1](https://github.com/BrunoKlein504/workshop-springboot3-jpa/blob/2e5324eb928d62fd94d99f2b6854e0a1d67c59f9/assets/domain_model.png)

## Domain Instance:
![img2](https://github.com/BrunoKlein504/workshop-springboot3-jpa/blob/8315247cf1743da01d05d3505edb02433628987c/assets/domain_instance.png)

## Logical Layers:
![img3](https://github.com/BrunoKlein504/workshop-springboot3-jpa/blob/8315247cf1743da01d05d3505edb02433628987c/assets/logical_layers.png
)

# Tecnologias utilizadas:
## Back-end:
- Java
- Spring Boot
- JPA / Hibernate
- Maven
- Postman
- H2 Database
- Apache Tomcat

### Pré requisitos: Java 17

```bash
# clonar repositório
git clone https://github.com/BrunoKlein504/workshop-springboot3-jpa.git

# entrar na pasta principal
cd workshop-springboot3-jpa

# executar o projeto
./mvnw spring-boot:run
```
### Como utilizar:

```bash
# Depois de executar, acesse o camiho URL:
http://localhost:8080/h2-console

# Caso queira fazer demonstração de requisção web, use tais comandos do Postman:
GET http://localhost:8080/users
GET http://localhost:8080/orders
e etc.
```

# Visualização no banco de dados:
![img4](https://github.com/BrunoKlein504/workshop-springboot3-jpa/blob/2571d194a85220433c10aeb6fa1ac0c3ce9b7de5/assets/image.png)

# Requisição com Postman:
![img5](https://github.com/BrunoKlein504/workshop-springboot3-jpa/blob/2571d194a85220433c10aeb6fa1ac0c3ce9b7de5/assets/image3333.png)


# Autor:
Bruno Klein Gomes: 
[![linkedin](https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/bruno-klein-gomes-a83187234/)
