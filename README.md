# LogiTrack: Enterprise Warehouse and Fleet Logistics System

LogiTrack is a distributed microservices-based enterprise system designed to manage internal warehouse inventories, transportation fleets, and delivery tracking without relying on a traditional e-commerce sales model. The core objective of this project is to implement and demonstrate essential microservice patterns, including service discovery, dynamic API routing, synchronous REST communication with resilience mechanisms, and asynchronous event-driven messaging.

## System Architecture

The architecture consists of a robust infrastructure core and isolated business microservices communicating through standard networking and message brokers:

* **Discovery Service (`discovery-service`)**: Acts as the central Eureka Server registry where all microservices dynamically register and resolve their logical names and network addresses.
* **API Gateway (`api-gateway`)**: Serves as the single entry point for external client requests, dynamically routing traffic to downstream microservices via the service registry.
* **Warehouse Service (`warehouse-service`)**: Manages internal warehouse inventories, cargo items, and stock availability, exposing REST endpoints for backend operations.
* **Fleet Service (`fleet-service`)**: Handles enterprise vehicles, drivers, and route scheduling. It performs synchronous calls to the warehouse service to verify cargo availability before approving routes, protected by circuit breakers.
* **Tracking Service (`tracking-service`)**: Operates asynchronously by listening to dispatch events via a message broker to update fleet tracking coordinates in real time.

## Key Technical Concepts Demonstrated

* **Service Discovery**: Dynamic registration and lookup using Spring Cloud Netflix Eureka.
* **API Routing**: Centralized entry routing and filtering with Spring Cloud Gateway.
* **Synchronous Communication**: Direct inter-service REST calls using Spring WebClient.
* **Fault Tolerance & Resilience**: Circuit breaker patterns implemented via Resilience4j to prevent cascading failures.
* **Asynchronous Messaging**: Event-driven architecture using message brokers for decoupled background processing.
