# Internet Banking Concept With Java Spring Boot Microservices

This source code was developed for Java based microservices tutorial series from [javatodev.com](https://javatodev.com).

In this article series I’m going to explain using internet banking API concept with spring boot based microserices architecture. Initially I’ll develop the core API which will evolve as a full fledged REST API collection until deployments.

### Microservices Inside This Project

Here this project consist of mainly 6 microservices and those are,

- User service (banking-core-user-service) – This service includes all the operations under the User such as registrations and retrieval. Additionally, this API consumes keycloak REST API to register and manage the user base while using the local PostgreSQL database as well.
- Fund transfer service (banking-core-fund-transfer-service) – This is the service that handles all the fund transfers between accounts and this API will push messages to a centralized RabbitMQ queue to use from the Notification service.
- Payment service (banking-core-payments-service) – This service will include all the API endpoints to process Utility payments in this project and that will push notification messages to RabbitMQ as well.
- Notification service – This API is registered under the service registry but consumes all the messages from RabbitMQ and pushes necessary notifications to the end users.
- Banking core service – This is the banking core service that acts as a dummy banking core with accounts, users, transaction details, and processors for banking transactions.

### Base Project Architecture

<a href="#" target="blank">
    <img align="center" src="https://javatodev.com/content/images/wordpress/2021/05/Microservices-Article-Banking-Core-Concept-1024x870.png" 
alt="Spring Boot Microservices Project Architecture By Javatodev.com"/></a>

### Technology Stack

1. Java 11
2. Spring Boot 2.4.5
3. Netflix Eureka Service Registry
4. Netflix Eureka Service Client
5. Spring Cloud API Gateway
6. Spring Cloud Config Server
7. Zipkin
8. Spring Cloud Sleuth
9. Open Feign
10. RabbitMQ
11. Prometheus
12. Jitpack
13. MySQL
14. Keycloak
15. Docker / Docker Compose
16. Kubernetes
17. Keycloak

Article series 

[1. Building Microservices With Spring Boot – Free Course With Practical Project](https://javatodev.com/building-microservices-with-spring-boot-free-course-with-practical-project/)

[2. Microservices – Service Registration and Discovery With Spring Cloud Netflix Eureka](https://javatodev.com/microservices-service-registration-and-discovery-with-spring-cloud-netflix-eureka/)

[3. Microservices – Setup API Gateway Using Spring Cloud Gateway](https://javatodev.com/microservices-setup-api-gateway-using-spring-cloud-gateway/)

[4. Microservices – Authentication, and Authorization With Keycloak](https://javatodev.com/microservices-authentication-and-authorization-with-keycloak/)

[5. Microservices – Core Banking Service Implementation](https://javatodev.com/microservices-core-banking-service-implementation/)

[6. Microservices – User Service Implementation](https://javatodev.com/microservices-user-service-implementation/)

[7. Microservices – Fund Transfer Service Implementation](https://javatodev.com/microservices-fund-transfer-service-implementation/)

[8. Microservices – Utility Payment Service Implementation](https://javatodev.com/microservices-utility-payment-service-implementation/)

[9. Microservices – Communication With Spring Cloud OpenFeign](https://javatodev.com/microservices-communication-with-spring-cloud-openfeign/)

[10. Microservices – Exception Handling](https://javatodev.com/microservices-exception-handling/)

[11. Microservices – Centralized Configurations With Spring Cloud Config](https://javatodev.com/microservices-centralized-configurations-with-spring-cloud-config/)
