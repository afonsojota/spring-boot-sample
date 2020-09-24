
# Welcome to NinjaDojo!  
  
~~https://afonso-jota.azurewebsites.net/swagger-ui.html#/dojo-controller~~
  
## Install Project  
  
You can keep the configuration on application.properties or set with your own mysql host.
  
Create database named **dojo** in your mysql server or use a docker container.  

The script SQL will be executed automatically when you execute the application.  
  
**Docker**  
  

    docker run -d -p 3306:3306 -e MYSQL_ROOT_PASSWORD=admin -e MYSQL_DATABASE=dojo -e MYSQL_USER=root -e MYSQL_PASSWORD=admin mysql
    docker start your_container_id  

  
## Run The Application  

**Requirements**

 - MAVEN
 - JDK 1.8

  Command on terminal on the project folder:
  

    mvn spring-boot:run  

Your app will run on: http://localhost:8080/

  
# Api  Documentation  

 - Swagger:
   [http://localhost:8080/swagger-ui.html#/dojo-controller](http://localhost:8080/swagger-ui.html#/dojo-controller)
 - Postman: *src/main/resources/DOJO.postman_collection.json*
 - POST: [http://localhost:8080/ninja](http://localhost:8080/ninja)
