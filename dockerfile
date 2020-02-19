FROM tomcat:8.0
USER root

ADD ./webapp/target/*.war /usr/local/tomcat/webapps/

EXPOSE 8888

CMD ["catalina.sh", "run"]
