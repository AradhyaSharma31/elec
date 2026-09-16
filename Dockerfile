FROM bellsoft/liberica-openjre-debian:25-cds AS builder

WORKDIR /app

COPY target/elec-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 9900

ENTRYPOINT ["java", "-jar", "app.jar"]
