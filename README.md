# MELEXIS BACKEND API APPLICATION

## AUTHENTICATION and AUTHORIZATION

Using Spring Security and Auth0 for Authentication and RBAC based Authorization. For reference be
used https://auth0.com/blog/spring-boot-authorization-tutorial-secure-an-api-java/#Configure-Role-Based-Access-Control--RBAC-

## JSON SERIALIZATION AND DESERIALIZATION

P.S : Generator Project and reportapp project should use the same Jackson Library version due a bug with in the library.
For reference : https://github.com/FasterXML/jackson-databind/issues/3164

# API documentation by spring-doc-openapi (Swagger)

The springdoc-openapi Java library helps to automate the generation of API documentation using Spring Boot projects.
springdoc-openapi works by examining an application at runtime to infer API semantics based on Spring configurations,
class structure and various annotations. You can see all the endpoints using the swagger UI.

To open Swagger (interactive) API documentation, navigate your browser
to [http://localhost:8080/api/swagger-ui/index.html#/]

# Stack

Persistence store: Postgresql  
Backend : Java- Springboot : The back-end server uses Spring Boot with Spring Web MVC for REST Controller and Spring
Data JPA,Hibernate ORM for interacting with PostgreSQL database Frontend : Angular : Consume REST APIs that are exposed
by Spring boot REST APIs, shows data on the components.

To start the default docker-compose configuration, run:

    $ docker-compose up
