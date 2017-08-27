FROM openjdk:8

RUN mkdir /opt/braulio
RUN mkdir /opt/braulio/downloads

ADD target/braulio-swarm.jar /opt/braulio/braulio-swarm.jar
ADD braulio.properties /opt/braulio/braulio.properties

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "/opt/braulio/braulio-swarm.jar", "-P", "/opt/braulio/braulio.properties"]

