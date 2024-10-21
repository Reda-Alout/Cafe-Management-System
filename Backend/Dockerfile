#FROM openjdk:17-jdk-alpine
#VOLUME /tmp
#ADD target/backend*.jar /app.jar
#CMD ["java", "-jar", "/app.jar", "--spring.profiles.active=prod"]
#EXPOSE 8080


# Étape 1 : Utiliser une image de base JDK pour construire le projet
FROM maven:3.8.5-openjdk-17 AS builder
WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests

# Étape 2 : Utiliser une image JRE pour exécuter l'application
FROM openjdk:17-jdk-slim
WORKDIR /app
COPY --from=builder /app/target/*.jar app.jar

# Exposer le port sur lequel l'application écoute
EXPOSE 8080

# Commande pour exécuter l'application
ENTRYPOINT ["java", "-jar", "app.jar"]
