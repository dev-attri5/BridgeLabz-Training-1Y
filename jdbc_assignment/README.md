# JDBC Assignment Project

This folder contains the complete solution set for `JDBC Assignment.pdf`.

## Contents

- `src`: integrated runnable project for all JDBC problems
- `standalone`: separate Java files for each solved problem
- `lib\sqlite-jdbc.jar`: local JDBC driver used for execution
- `data`: placeholder folder kept with the submission; runtime databases are created in the local temp directory

## Coverage

- 13 JDBC CRUD scenarios

## How to Run

```powershell
javac -cp "lib\sqlite-jdbc.jar" -d out src\*.java
java -cp "out;lib\sqlite-jdbc.jar" JdbcAssignmentProject
```

## Notes

- Each scenario uses its own SQLite database file in the local temp directory so the examples stay isolated.
- Every run recreates the database for that scenario and demonstrates create, read, update, and delete operations.
