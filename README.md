# resource_allocation

How to Run
git clone <repository-url>
cd resource-allocation
mvn clean install
mvn spring-boot:run



API Endpoints to test in postman 

POST method: http://localhost:8080/api/resources

body:
{
    "skills": ["Mysql","Docker","Spring","React"],
    "experience": 10
}


GET method:  http://localhost:8080/api/resources
