FROM maven:3.8.2-ibmjava-8-alpine AS MAVEN_TOOL_CHAIN
COPY pom.xml /tmp/
RUN mvn -B dependency:go-offline -f /tmp/pom.xml -s /usr/share/maven/ref/settings-docker.xml
COPY src /tmp/src/
WORKDIR /tmp/
#RUN mvn -f pom.xml clean package
RUN mvn -B -s /usr/share/maven/ref/settings-docker.xml package

FROM java:8

EXPOSE 8080

RUN mkdir /app
COPY --from=MAVEN_TOOL_CHAIN /tmp/target/*.jar /app/spring-boot-application.jar

#RUN apk add --update openssl		
#RUN wget -O dd-java-agent.jar 'https://dtdg.co/latest-java-tracer'
		
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app/spring-boot-application.jar"]

# HEALTHCHECK --interval=1m --timeout=3s CMD wget -q -T 3 -s http://localhost:8080/actuator/health/ || exit 1