CREATE DATABASE studentdb;

USE studentdb;

CREATE TABLE students (
    prn VARCHAR(20) PRIMARY KEY,   
    name VARCHAR(100),             
    dob DATE,                      
    marks DOUBLE                 
);

INSERT INTO students (prn, name, dob, marks) VALUES 
('SIT12345601', 'Pankaj Yadav', '2005-07-10', 87.5),
('SIT12345602', 'Raj Mehta', '2004-11-22', 76.0),
('SIT12345603', 'Inesh Shah', '2005-01-15', 91.2),
('SIT12345604', 'Lucy Thomas', '2005-03-09', 88.3),
('SIT12345605', 'Ananya Sharma', '2004-09-27', 94.8),
('SIT12345606', 'Rahul Kapoor', '2005-12-03', 65.5),
('SIT12345607', 'Neha Jain', '2005-08-18', 72.0),
('SIT12345608', 'Aman Verma', '2004-06-05', 79.5),
('SIT12345609', 'Sara Khan', '2005-05-12', 85.0),
('SIT12345610', 'Kunal Deshmukh', '2004-10-30', 90.4);

DESCRIBE students;

SELECT * FROM students;
