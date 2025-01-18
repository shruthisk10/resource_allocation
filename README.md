# resource_allocation

How to Run:
1) git clone <repository-url>
2) cd resource-allocation
3) mvn clean install
4) mvn spring-boot:run



API Endpoints to test in postman 

POST method: http://localhost:8080/api/resources

body:
{
    "skills": ["Mysql","Docker","Spring","React"],
    "experience": 10
}


GET method:  http://localhost:8080/api/resources
