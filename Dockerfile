FROM openjdk:17
EXPOSE 8088
ADD /target/project_cicd.jar myproject.jar
ENTRYPOINT [ "java","-jar", "myproject.jar" ]