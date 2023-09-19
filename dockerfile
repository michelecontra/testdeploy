# Usa un'immagine di base di OpenJDK
FROM openjdk:8-jre-slim

# Imposta la directory di lavoro all'interno del container
WORKDIR /app

# Copia il tuo JAR generato nella directory di lavoro del container
COPY target/Calcolatrice-1.0.0-jar-with-dependencies.jar app.jar

# Usa il comando "java -jar" per eseguire l'applicazione quando il container viene avviato
CMD ["java", "-jar", "app.jar"]
