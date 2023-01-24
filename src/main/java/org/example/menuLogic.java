package org.example;

import java.util.*;

public class menuLogic {

    public static Map<String, Teacher> teacherList = new HashMap<>();
    public static Map<String, Course> courseList = new HashMap<>();
    public static Map<String, Student> studentsList = new HashMap<>();




     static Scanner scanner = new Scanner(System.in);

     public static int readInt(String prompt, int userChoices){
        int input;
        do {
            System.out.println(prompt);
            try {
                input = Integer.parseInt(scanner.next());
            } catch(Exception e) {
                input = -1;
                System.out.println("Please enter a valid option!");
            }
        } while (input < 1 || input > userChoices);

        return input;
    }


    public static void initialSetUp(){
        System.out.println("Welcome to IronSchool - School Management System");
        System.out.println("Please enter the Name of your school");

        //Create School Class with the prompted School name!
        String schoolName = scanner.nextLine();
        School currentSchool = new School(schoolName);
        System.out.println("Welcome "+schoolName +"!");

        //Create teachers
        createTeacher();

        //Create courses
        createCourses();

        //Create students
        createStudents();

        //Call Main Menu with Options
        mainMenu();


    }

    public static void createTeacher(){
        System.out.println("How many Teachers do you want to create?");
        int n = Integer.parseInt(scanner.nextLine());
        // Map<String, Teacher> teacherList = new HashMap<>();
        int countTeacher = 1;
        for(int i = 0; i<n; i++){
            System.out.println("Enter Teacher " + (i+1) + " name");
            String teacherNameInput = scanner.nextLine();
            System.out.println("Enter " + teacherNameInput + "'s salary");
            double teacherSalaryInput = Double.parseDouble(scanner.nextLine());
            Teacher newTeacher = new Teacher(teacherNameInput, teacherSalaryInput);
            newTeacher.setTeacherId("T_" + String.valueOf(countTeacher));
            countTeacher++;

            teacherList.put(newTeacher.getTeacherId(), newTeacher);
        }
        for(String r : teacherList.keySet()){
            System.out.println("Teacher ID: " + r + ". Name: " + teacherList.get(r).getName() + ". Salary: " + teacherList.get(r).getSalary());
        }

        System.out.println(teacherList.size());
    }

    public static void createCourses(){
        System.out.println("How many courses do you want to create?");
        int n = Integer.parseInt(scanner.nextLine());
        //Map<String, Course> courseList = new HashMap<>();
        int countCourses = 1;
        for(int i = 0; i<n; i++){
            System.out.println("Enter Course's " + (i+1) + " name");
            String courseNameInput = scanner.nextLine();
            System.out.println("Enter " + courseNameInput + " course's price, please: ");
            Double coursePriceInput = Double.parseDouble(scanner.nextLine());
            Course newCourse = new Course(courseNameInput, coursePriceInput);
            newCourse.setCourseId("C-" + String.valueOf(countCourses));
            countCourses++;
            courseList.put(newCourse.getCourseId(), newCourse);
        }

        for(String i : courseList.keySet()){
            System.out.println("Course ID: " + i + ". Name: " + courseList.get(i).getName() + ". Price: " + courseList.get(i).getPrice());
        }
    }

    public static void createStudents(){
        System.out.println("How many students do you want to create?");
        int n = Integer.parseInt(scanner.nextLine());
        //Map<String, Student> studentsList = new HashMap<>();
        int countStudents = 1;

        for(int i = 0; i<n; i++){
            System.out.println("Enter Student's " + (i+1) + " name");
            String studentNameInput = scanner.nextLine();
            System.out.println("Enter " + studentNameInput + " student's address, please: ");
            String studentAddressInput = scanner.nextLine();
            System.out.println("Enter " + studentNameInput + " student's email, please: ");
            String studentEmailInput = scanner.nextLine();
            Student newStudent = new Student(studentNameInput, studentAddressInput, studentEmailInput);
            newStudent.setStudentId("S-" + String.valueOf(countStudents));
            countStudents++;
            studentsList.put(newStudent.getStudentId(), newStudent);
        }
        for(String r : studentsList.keySet()){
            System.out.println("--------------------");
            System.out.println("ID: " + r);
            System.out.println("Name: " + studentsList.get(r).getName());
            System.out.println("Address: " + studentsList.get(r).getAddress());
            System.out.println("Email: " + studentsList.get(r).getEmail());
        }

    }
    public static void mainMenu(){
        printSeparator(30);
        System.out.println("What do you want to do?");
        System.out.println("(1) Enroll the student in the course");
        System.out.println("(2) Assign the teacher to the course");
        System.out.println("(3) Show all courses");
        System.out.println("(4) Look up the specific course");
        System.out.println(("(5) Show all students"));
        System.out.println(("(6) Look up specific student"));
        System.out.println(("(7) Show all teachers"));
        System.out.println(("(8) Look up specific teacher"));
        System.out.println(("(9) Show profit"));

        int selectedMenu = Integer.parseInt(scanner.nextLine());

        if (selectedMenu == 1){
            School.enrollStudent();
        }
        if (selectedMenu == 2){

        }if (selectedMenu == 3){
            School.showCourses();
        }
        if (selectedMenu == 4){

        }
        if (selectedMenu == 5){
            School.showStudents();
        }
        if (selectedMenu == 6){

        }
        if (selectedMenu == 7){
            School.showTeachers();
        }
        if (selectedMenu == 8){

        }
        if (selectedMenu == 9){
            School.showProfit();
        }
    }

    public static void printSeparator(int n){
        for (int i = 0; i < n; i++){
            System.out.print("=");
        }
        System.out.println();
    }


}

/*
The application starts by asking the user for a name for the school
Next, the user is asked for a number of how many teachers should be created
Next, the user is prompted to enter the details of each teacher (based on the number chosen above)
Next, the user is asked for the number of courses to be created (Do not specify the teacher yet, there is a command for it)
Next, the user is prompted to enter details of each course based on the number chosen above
Next, the user is asked for the number of students to be created (Do not specify the course yet, there is a command for it)
Next, the user is prompted to enter details of each student based on the number chosen above
Next, the user is now prompted to enter any command of the list below to execute a specified action in the system.
The IDs should be automatically generated.


 */