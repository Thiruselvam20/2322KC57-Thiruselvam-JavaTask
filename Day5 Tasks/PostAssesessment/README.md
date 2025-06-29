# Mini Student Management App

##  Project Objective
This is a simple console-based Java application that allows users to manage students and their enrolled courses using Java Collections. It provides functionality to add, search, delete, and display student records.



##  Class Design

### Class: `PostAssesessment_StudentApp`

 **Data Structures Used:**
  - `ArrayList<String> studentNames` — to store student names.
  - `HashMap<String, ArrayList<String>> studentCourses` — to map each student to a list of their enrolled courses.

 **Functionalities:**
  - Add a student with one or more courses.
  - Search for a student and view their courses.
  - Delete a student and their associated courses.
  - Display all students and their enrolled courses.



##  Features

- Prevents duplicate student entries.
- Allows each student to have multiple courses.
- Uses iterators and enhanced for-loops for data traversal.
- Clean, menu-driven command-line interface.



## Sample Output


--- Student Management Menu ---
1. Add Student and Course
2. Search Student
3. Delete Student
4. Display All Students
5. Exit
Enter your choice: 1
Enter student name: Anika
Enter number of courses: 2
Enter course 1: Java
Enter course 2: Python
Student and courses added.



Enter your choice: 4

Student List:
Name: Anika
Courses:
  - Java
  - Python




## How to Run

## Using Terminal / Command Prompt

1. Save the code as `PostAssesessment_StudentApp.java`.
2. Compile the code:
   bash
   javac PostAssesessment_StudentApp.java
   
3. Run the program:
   bash
   java PostAssesessment_StudentApp
   


