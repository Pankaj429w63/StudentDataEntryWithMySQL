# StudentDataEntryWithMySQL

A Java-based JDBC application for managing student records using MySQL.

## Author
- **Name:** Pankaj Yadav
- **PRN:** 23070126166
- **Batch:** AIML 2023–2027

## Features

- Add Student
- Display All Students
- Search Student (by PRN or Name)
- Update Student
- Delete Student

## Files and Responsibilities

| File                       | Functionality                 |
|---------------------------|-------------------------------|
| `Main.java`               | Menu-driven main logic        |
| `AddStudent.java`         | Logic to insert student       |
| `DisplayStudents.java`    | Logic to view all students    |
| `SearchStudent.java`      | Search by PRN or name         |
| `UpdateStudent.java`      | Update student details        |
| `DeleteStudent.java`      | Delete student by PRN         |
| `studentdb_init.sql`      | MySQL schema + sample data    |

## Database Schema

Database: `studentdb`

Table: `students`

| Field | Type      |
|-------|-----------|
| PRN   | VARCHAR   |
| Name  | VARCHAR   |
| DOB   | DATE      |
| Marks | DOUBLE    |

## Run Instructions

1. Run `studentdb_init.sql` in MySQL Workbench to set up database.
2. Compile and run using:
   ```bash
   javac operations/*.java Main.java
   java Main
