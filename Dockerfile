FROM java:8

ENV SERVER_PORT=8080 \
    SPRING_PROFILE=develop \

    DATABASE_HOST=localhost \
    DATABASE_PORT=5432 \
    DATABASE_NAME=edr-production \
    DATABASE_USERNAME=edr \
    DATABASE_PASSWORD=edr \

ENTRYPOINT java -jar /opt/edr-app.jar

EXPOSE $SERVER_PORT
COPY ./target/edr-app-0.0.1.jar /opt/edr-app.jar