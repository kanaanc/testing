# Testing Spring Boot Application

A simple Spring Boot backend application with a health check and a ping endpoint.

## Run the application

From the project root (`c:\work\testing`):

```powershell
.\mvnw.cmd spring-boot:run
```

Or build and run the jar:

```powershell
.\mvnw.cmd clean package
java -jar target\testing-0.0.1-SNAPSHOT.jar
```

## Endpoints

- `GET /ping` - returns a JSON ping response
- `GET /actuator/health` - returns Spring Boot actuator health status

## Curl examples

Ping endpoint:

```bash
curl http://localhost:8080/ping
```

Health check endpoint:

```bash
curl http://localhost:8080/actuator/health
```

## Notes

- The app runs on port `8080` by default.
- `application.properties` sets the application name to `testing`.
