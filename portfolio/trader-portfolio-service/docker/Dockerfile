FROM openjdk:8-jdk-alpine
MAINTAINER seyijava@gmail.com
COPY target/trader-portfolio-service.jar /opt/trader-portfolio-service/lib/
ENTRYPOINT ["/usr/bin/java"]
CMD ["-jar", "/opt/trader-portfolio-service/lib/trader-portfolio-service.jar"]
EXPOSE 9010


