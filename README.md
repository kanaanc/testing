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

## Create and switch to a new branch

From the project root:

```powershell
# create and checkout a new branch
git checkout -b <branch-name>
```

Replace `<branch-name>` with a descriptive branch name, for example `feature/update-readme`.

## Update, commit, and push changes

After editing files such as `README.md`:

```powershell
# stage a single changed file
git add README.md

# commit with a useful message
git commit -m "Update README with GitHub setup and branch workflow"

# push the branch to GitHub
git push -u origin <branch-name>
```

If you are updating multiple files, you can stage them all at once instead of adding one by one:

```powershell
# stage every changed or new file in the repo
git add .

# stage all changes, including deletions
git add -A

# stage only modified or deleted tracked files
git add -u
```

Then commit and push as usual:

```powershell
git commit -m "Update README and other changes"
git push -u origin <branch-name>
```

Then confirm the remote branch is set up:

```powershell
git remote -v
```
