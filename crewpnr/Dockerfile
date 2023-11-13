FROM amazoncorretto:17
COPY target/*.jar app.jar
ENTRYPOINT ["java", "-Dport=8080", "-Dspring.profiles.active=local-crewpnr", "-Dfile.encoding=UTF-8", "-jar", "/app.jar"]
