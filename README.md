# GitHub Repository Searcher

This is a Spring Boot application that allows users to search for GitHub repositories using the GitHub REST API. The application stores search results in a PostgreSQL database and provides API endpoints to retrieve stored results based on filter criteria.

## Features
Search GitHub repositories by name, programming language, and sort criteria (stars, forks, or updated date).

Store repository details in a PostgreSQL database.

Retrieve stored repository details with optional filters (language, minimum stars, and sorting).

Handle edge cases such as invalid API responses, rate limits, and empty search results.

## Technologies Used
Spring Boot: Backend framework for building the application.

PostgreSQL: Database for storing repository details.

GitHub REST API: Used to fetch repository data.

JUnit: For unit and integration testing.

Swagger/OpenAPI: For API documentation.

## Prerequisites
Before running the application, ensure you have the following installed:

Java 17 or higher

Maven

PostgreSQL

Postman (for testing APIs)

## Setup Instructions
1. Clone the Repository
bash
Copy
git clone https://github.com/your-username/github-repo-searcher.git
cd github-repo-searcher
2. Configure PostgreSQL
Create a database named github_repo_db in PostgreSQL.

Update the application.properties file with your PostgreSQL credentials:

properties
Copy
spring.datasource.url=jdbc:postgresql://localhost:5432/github_repo_db
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
3. Build the Application
bash
Copy
mvn clean install
4. Run the Application
bash
Copy
mvn spring-boot:run
The application will start on http://localhost:8080.

## API Endpoints
1. Search GitHub Repositories
Endpoint: POST /api/github/search

Request Body:

json
Copy
{
  "query": "spring boot",
  "language": "Java",
  "sort": "stars"
}
Response:

json
Copy
{
  "message": "Repositories fetched and saved successfully",
  "repositories": [
    {
      "id": 123456,
      "name": "spring-boot-example",
      "description": "An example repository for Spring Boot",
      "owner": "user123",
      "language": "Java",
      "stars": 450,
      "forks": 120,
      "lastUpdated": "2024-01-01T12:00:00Z"
    }
  ]
}
2. Retrieve Stored Results
Endpoint: GET /api/github/repositories

Request Parameters:

language (optional): Filter by programming language.

minStars (optional): Minimum stars count.

sort (optional): Sort by stars, forks, or updated (default is stars).

Example Request:

Copy
GET /api/github/repositories?language=Java&minStars=100&sort=stars
Response:

json
Copy
{
  "repositories": [
    {
      "id": 123456,
      "name": "spring-boot-example",
      "description": "An example repository for Spring Boot",
      "owner": "user123",
      "language": "Java",
      "stars": 450,
      "forks": 120,
      "lastUpdated": "2024-01-01T12:00:00Z"
    }
  ]
}
## Testing the Application
1. Unit Tests
Run the unit tests using the following command:

bash
Copy
mvn test
2. Integration Tests
Use Postman to test the API endpoints.

Import the provided Postman collection (if available) and test the POST /api/github/search and GET /api/github/repositories endpoints.

## API Documentation
The application uses Swagger/OpenAPI for API documentation. After running the application, access the Swagger UI at:

Copy
http://localhost:8080/swagger-ui.html
## Error Handling
The application handles the following edge cases:

Invalid API responses from GitHub.

Rate limits (GitHub API allows 60 requests per hour for unauthenticated users).

Empty search results.

## Contributing
If you'd like to contribute to this project, please follow these steps:

Fork the repository.

Create a new branch for your feature or bugfix.

Submit a pull request with a detailed description of your changes.

## License
This project is licensed under the MIT License. See the LICENSE file for details.

## Contact
For any questions or feedback, please contact:

Shriyansh Verma

Email:shriyanshverma06@gmail.com


GitHub: Verma6373
