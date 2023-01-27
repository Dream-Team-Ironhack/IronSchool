# IronSchool

IronSchool is a School Management System, that will help manage your organization with managing students, teachers and courses with some basic functionalities.

by Alexis Frantz, Ester Pozo, Anastasiia Gorshantova and Raphaela Prammer.

## Tech Stack

- Java
- Maven
- JUnit

## How does the Application work?

The application runs locally in the terminal.

Within the application you can create your own organization of School. The app will help your school to create Courses, Teachers and Students and further on helps your organization with daily tasks like enrollment and keeping track of the profits both on courses level and schools level.

### Initial Setup:

Once you start the application by clicking the run button, you can create your organization of your school by entering your schools name.

    Welcome to IronSchool - School Management System
    Please enter the Name of your school
    Iron
    Welcome Iron!

In the next steps, you have the possibility to already create a number of instances of <mark>teachers</mark>, <mark>courses</mark> and <mark>students</mark> Also, you have the chance to create those instances later on or even add more teachers, students or courses later.

After the creation of each instance, you will see the summary of the instances created.

    How many Teachers do you want to create? 2
    Enter Teacher 1 name
    Steven Hawkings
    Enter Steven Hawkings's salary: 50000
    Enter Teacher 2 name
    Steve Jobs
    Enter Steve Jobs's salary: 50000
    Teacher ID: T-2. Name: Steve Jobs. Salary: 50000.0
    Teacher ID: T-1. Name: Steven Hawkings. Salary: 50000.0

After completing the first steps and creating your profile with the first instances, the menu with several options will show, and you can choose the task you want to execute by entering the number in the command line.

    What do you want to do?
    (1) Enroll the student in the course
    (2) Assign the teacher to the course
    (3) Show all courses
    (4) Look up the specific course
    (5) Add courses to the database
    (6) Show all students
    (7) Look up specific student
    (8) Add students to the database
    (9) Show all teachers
    (10) Look up specific teacher
    (11) Add teachers to the database
    (12) Show profit
    (13) Exit

TO START WITH A COMMAND, ENTER ONLY THE NUMBER FOR EXAMPLE <mark>1</mark> NEXT TO EACH FUNCTIONALITY IN THE CONSOLE AND THE MENU WILL START AND YOU WILL BE PROMPTED FOR FURTHER INFORMATION TO FINISH THE SELECTED PROCESS.

**(1) Enroll the student in the course**

This command will allow you to enroll a student to a specific course. You will be prompted for the student's ID and the course' ID to enter and the enrollment process automatically starts. At the end you will receive a confirmation that the selected student has been enrolled to the selected course and a summary of the courses incomes so far.
This process will update the Student List of the selected course.

    1
    Please, type ID of the student you want to enroll
    S-2
    Please, type ID of the course
    C-1
    The course has: 8000.0 euro
    Student lala enrolled in Java.

**(2) Assign the teacher to the course**

This command will allow you to assign teachers to a course. By selecting this menu you will be prompted for the teacher's ID and the courses' ID. The teacher will be automatically assigned to the course and the teacher List within the Course Information will be updated as well as the revenues for the course.
After entering the IDs you will see a summary of the process:

    2
    Please, type ID of the teacher you want to assign
    T-1
    Please, type ID of the course
    C-1
    Teacher Steven Hawkings is assigned to Java.

**(3) Show all courses**

This menu will give you a list of all so far existing courses:

    3
    Course ID: C-1. Name: Java. Price: 4000.0
    Course ID: C-2. Name: CSS. Price: 3000.0

**(4) Look up the specific course**

This command will show you all the course details of the selected course, like the teachers assigned and a list of all the students enrolled to it.:

    4
    Please, type ID of the course
    C-1
    ID: C-1
    Name: Java
    Price: 4000.0
    Teacher(s):
    1. Steven Hawkings
    Student(s):
    1. Marie Curie
    2. Marco Polo

**(5) Add courses to the database**

Within this menu you can add more courses to your database by following the menus instruction and entering the course details.

**(6) Show all students**

This command will show you a list of all so far existing students in your database:

    6
    --------------------
    ID: S-1
    Name: Marie Curie
    Address: New Road 1
    Email: mc@mc.com
    --------------------
    ID: S-2
    Name: Marco Polo
    Address: Old Road 1
    Email: mp@mp.com

**(7) Look up specific student**

This command prompts you for the ID of the student you want to see all the details and course in which they are enrolled:

    7
    Please, type ID of the student you want to enroll
    S-1
    ID: S-1
    Name: Marie Curie
    Address: New Road 1
    Email: mc@mc.com
    Course(s):
    1. Java
    2. Back

**(8) Add students to the database**

Within this menu you can add more students to your database by following the menus instruction and entering the student details.

**(9) Show all teachers**

This command will show you a list of all so far existing teachers in your database:

    9
    Teacher ID: T-2. Name: Steve Jobs. Salary: 50000.0
    Teacher ID: T-1. Name: Steven Hawkings. Salary: 50000.0

**(10) Look up specific teacher**

This command prompts you for the ID of the teacher you want look up and it will show all the details and course which they are assigned to:

    10
    Please, type ID of the teacher you want to assign
    T-1
    ID: T-1
    Name: Steven Hawkings
    Salary: 50000.0
    Course(s):
    1. Java
    2. Back

**(11) Add teachers to the database**

Within this menu you can add more teachers to your database by following the menus instruction and entering the teachers details.

**(12) Show profit**

This command will show you the profit/loss of your organization. It takes all the expenses (the sum of all teacher salaries) and subtracts all revenues (sum of revenues of each course, calculated by the courses price per student enrolled).
