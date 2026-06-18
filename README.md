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

## Create a GitHub repository from this project

From the project root (`c:\work\testing`), use GitHub CLI to create and push the repo:

```powershell
# login once if needed
gh auth login

# commit local files
git add .
git commit -m "Initial commit"

# create the GitHub repository and push
gh repo create <repo-name> --public --source=. --remote=origin --push
```

Replace `<repo-name>` with the desired GitHub repository name.

If you want a private repository, change `--public` to `--private`.

Verify the remote after creation:

```powershell
git remote -v
```
