# OpenWeatherMap-FL
Java Case Study – Weather forecast 

# Task
 1. The API should expose a ​“/data”​​ endpoint to retrieve the averages  
 2. The​ “/data” ​​endpoint should return a JSON object that gives the averages of the following metrics: 
    * Average of daily (06:00 – 18:00) and nightly (18:00 – 06:00) temperatures in Celsius for the next 3 days from today’s date.
    * Average of pressure for the next 3 days from today’s date. 
 3. The​ “/data” ​​endpoint must include a CITY parameter containing the city’s name as the input for the correct response.
 
# Tools Used

Spring Boot 2.

Java 8.

Lombook.

Swagger.

## 

Import into your IDE as existing Maving project and run.

or

Donwload the soruce code and navigate to the root folder where the pom.xml is located and run 

`mvn clean Install`

`mvn spring-boot:run`

# Documentation

Autogenerated Documentation can be found [here Swagger-UI](http://localhost:8080/swagger-ui.html) while the project is running 

# Example of usage 

[http://localhost:8080/v1.0/data?city=berlin](http://localhost:8080/v1.0/data?city=berlin)

Will generate a result like this: 

`{
  "dailyAverageTemperature" : -0.26,
  "nightlyAverageTemperature" : -0.59,
  "pressureAverage" : 1028.97
}`
