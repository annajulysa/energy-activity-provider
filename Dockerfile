# Use uma imagem leve do Java
FROM openjdk:21-jdk-alpine

# Diretório de trabalho dentro do container
WORKDIR /app

# Copia o JAR compilado para dentro do container
COPY target/energy-activity-provider-0.0.1-SNAPSHOT.jar app.jar

# Porta que o Spring Boot vai usar (Render passa automaticamente via PORT)
ENV PORT=8080

# Comando para rodar a aplicação
ENTRYPOINT ["java","-jar","/app.jar"]