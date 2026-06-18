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

## Create and work on a new branch

From the project root:

```powershell
# create and checkout a new branch
git checkout -b <branch-name>
```

Replace `<branch-name>` with a descriptive branch name, for example `feature/update-readme`.

## Stage, commit, and push changes

After editing files:

```powershell
# stage one file
git add README.md

# or stage all changed files
git add .

# commit with a useful message
git commit -m "Update README with GitHub setup and branch workflow"

# push the branch to GitHub
git push -u origin <branch-name>
```

If you want to stage all changes including deletions, use:

```powershell
git add -A
```

To confirm the remote branch is set up:

```powershell
git remote -v
```

## Merge your branch into main

When your branch is ready and pushed, switch to the main branch and merge:

```powershell
# switch to main (or master if your repo uses master)
git checkout main

# update main from GitHub
git pull origin main

# merge your branch into main
git merge <branch-name>

# push the merged main branch
git push origin main
```

If your repository uses `master` instead of `main`, replace `main` with `master`.

### Optional: delete the branch after merge

```powershell
git branch -d <branch-name>
git push origin --delete <branch-name>
```
