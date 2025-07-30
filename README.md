# User Service

This is a Spring Boot application for managing users.  
It uses H2 in-memory database and exposes REST APIs to create and list users.

## Features

- User entity with id, username, password, and email
{
  "username": "john_doe",
  "password": "pass123",
  "email": "john@example.com"
}
- REST endpoints to create and get users
- Runs with embedded H2 database for quick testing
- This application runs via docker, just clean build it in local and run it in docker.
  commands give as follows.

## How to run
docker build -t dockuser .
docker run -p 8080:8080 dockuser

## API Endpoints { add more end points if required }
GET /users/get — List all users
GET /users/get/{id}} — fetch users by ID
POST /users — Create a new user

