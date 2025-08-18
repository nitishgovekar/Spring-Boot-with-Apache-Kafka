# 🛠 Spring Boot with Apache Kafka

A minimal and practical project that demonstrates how to integrate **Spring Boot** with **Apache Kafka** for message-driven microservice communication.

---

## 🚀 Features

- Produce and consume messages using Kafka topics
- REST endpoints to trigger Kafka producers
- Basic configuration with KafkaTemplate and @KafkaListener

---

## 🔧 Tech Stack

- Java 17+
- Spring Boot
- Apache Kafka
- Maven

---

## 📦 Setup Instructions

### 🧪 Prerequisites

- Java 17+ installed
- Apache Kafka running locally (Zookeeper + Kafka broker)

### 📥 Clone the repo

```bash
git clone https://github.com/nitishgovekar/Spring-Boot-with-Apache-Kafka.git
cd Spring-Boot-with-Apache-Kafka

▶️ Run Kafka locally
# Start Zookeeper
bin/zookeeper-server-start.sh config/zookeeper.properties

# Start Kafka broker
bin/kafka-server-start.sh config/server.properties

▶️ Start the Spring Boot app
mvn spring-boot:run

📬 How to Use
▶️ Produce a message
POST http://localhost:8080/publish
Content-Type: application/json

{
  "message": "Hello Kafka from Spring Boot!"
}

📥 Kafka Consumer Output

The consumer listens on the same topic and logs messages:

Consumed message: Hello Kafka from Spring Boot!

🧠 Project Structure
src/
├── controller/
│   └── KafkaController.java
├── service/
│   └── KafkaProducerService.java
├── config/
│   └── KafkaConfiguration.java
└── listener/
    └── KafkaConsumerService.java

📈 Possible Enhancements

Add Docker support for Kafka setup

Use Avro or JSON Schema validation

Add retry logic and error handling

Integration with Kafka Streams
