FROM openjdk:8
MAINTAINER wangliang
LABEL name="docker-demo" version="1.0" author="wangliang"
COPY test.jar dockerdemo-image.jar
ENV LANG en_GB.utf8
EXPOSE 9000
CMD ["java","-jar","dockerdemo-image.jar"]