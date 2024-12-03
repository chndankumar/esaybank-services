# Banking Microservices Project

## Overview
This project is a microservices-based architecture for managing **Bank Cards**, **Accounts**, and **Loans**. It demonstrates the integration of modern technologies and tools to build a scalable, resilient, and distributed banking platform.

### Features
- **Bank Card Service**: Manages credit/debit card details and operations.
- **Account Service**: Handles user account creation, updates, and balance management.
- **Loan Service**: Facilitates loan processing and repayment tracking.

---

## Key Learnings and Technologies

### 1. **Centralized Configuration**
- Implemented using **Spring Cloud Config** for managing externalized configurations across microservices.
- Simplifies configuration changes and ensures consistency across environments.

### 2. **API Gateway with Load Balancing**
- Built with **Spring Cloud Gateway** for routing requests to the appropriate microservice.
- Integrated **load balancing** for distributing traffic across multiple service instances, improving reliability and performance.

### 3. **Resilience with Resilience4j**
- Implemented circuit breakers, retries, and rate-limiting mechanisms to enhance service reliability.
- Ensured graceful handling of failures in downstream services.

### 4. **Docker and Docker Compose**
- Each service is containerized using **Docker** for consistent deployments.
- **Docker Compose** is used to orchestrate and run multiple services locally, ensuring seamless integration.

### 5. **Kubernetes**
- Deployed the services on a **Kubernetes** cluster for production-grade scalability and management.
- Leveraged features like pods, services, and deployments for efficient resource utilization and monitoring.

---

## Architecture

### System Diagram
```plaintext
[Client]
   |
   v
[API Gateway]
   |---------|
   v         v
[Card]    [Account]    [Loan]
 Service    Service    Service
   |         |           |
[Database][Database][Database]
