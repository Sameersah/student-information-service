# student-information-service
This java application provides CRUD APIs for student information stored on PostgreSQL DB


## How to run and test this service on local

1. install and start docker on your local.
2. Clone this repository.
3. Build the image- 
docker build -t student-information-service:latest .
4. Run the image-
docker run -d -p 8083:8083 --name student-information-service student-information-service:latest
5. Import following curl command onto your postman - 
curl --location 'localhost:8083/api/v1/search/student/sameer'
6. Expect to see a 404 Not found response.
7. This confirms the service is up and running.
8. To receive 200 OK resposne for the API, you need to start postGresql contanier on your local and have the respective data fed it.
9. You can create new student entries using tis curl-
    
curl --location 'localhost:8083/api/v1/students/create/018176263' \
--header 'Content-Type: application/json' \
--data-raw '{
"name":"Sameer",
"email":"sameer.sameer@sjsu.edu",
"phone":"+1-669-325-0827"
}'
   
