# HW week2 day4 classes

The Home Work has one part to be delievered before 9AM: 

----
## Part I
### Create a simple system for College. Create classes for Course, Professor and Student. 
Course can have only one professor and many student

### Course 
Attributes: CourseName, number_of_lectures, students, professor.
Methods:
int numberOfStudents()
boolean assignProfessor(Professor p) // assign professor to course. Course can have only one professor.
string professorName() // return professor full name
boolean enroll(Student s) // assign student to this course. Student can’t be enrolled to a course if the course is full.
string courseInfo() // return the course name number of lectures professor and students

### Professor 
Attributes: firstName, lastName, telephone,  courses. 
Methods: String fullName() // return “firstName lastName”

### Student
Attributes: firstName, lastName, courses.
Methods: String fullName() // return “firstName lastName”

