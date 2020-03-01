FROM tomcat
USER root

ADD ./webapp/target/*.war /usr/local/tomcat/webapps/
ADD ./target/course-api-gui.war /usr/local/tomcat/webapps/

EXPOSE 8888
