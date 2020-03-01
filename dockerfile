FROM tomcat
USER root

ADD ./target/course-api-gui.war /usr/local/tomcat/webapps/

EXPOSE 8888
