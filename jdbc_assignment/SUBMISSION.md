# Java JDBC Assignment Submission

This submission covers all 13 problems from `JDBC Assignment.pdf`.

## Included Work

- `src\JdbcAssignmentProject.java`: single entry point for the full assignment
- `src\JdbcScenarios.java`: integrated solutions for all 13 JDBC scenarios
- `src\JdbcUtils.java`: shared JDBC helpers for SQLite setup and query printing
- `standalone\`: 13 separate Java files for individual problem submission
- `lib\sqlite-jdbc.jar`: JDBC driver used by the solutions

## Verification

The integrated source project was compiled and executed successfully after creation.

## Run Commands

```powershell
javac -cp "lib\sqlite-jdbc.jar" -d out src\*.java
java -cp "out;lib\sqlite-jdbc.jar" JdbcAssignmentProject
```

## Submission Folder

`C:\Users\devat\OneDrive\Documents\New project\assignments\jdbc_assignment`
