FROM openjdk:8
MAINTAINER wangliang
LABEL name="docker-demo" version="1.0" author="wangliang"
ADD /usr/docker-test/test.jar /usr/docker-test/test.jar
ENV LANG en_GB.utf8
EXPOSE 9000
CMD ["cd /usr/docker-test","java","-jar","test.jar"]