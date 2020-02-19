FROM tomcat:8.0
USER root

ADD ./target/course-api-0.0.1-SNAPSHOT.war /usr/local/tomcat/webapps/

EXPOSE 8888

CMD ["catalina.sh", "run"]
