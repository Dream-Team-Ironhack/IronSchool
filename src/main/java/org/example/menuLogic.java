package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class menuLogic {






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

        //Call Main Menu with Options
        mainMenu();


    }
    public static void createTeacher(){
        System.out.println("How many Teachers do you want to create?");
        int n = Integer.parseInt(scanner.nextLine());
        List<Teacher> teacherList = new ArrayList<>();
        int countTeacher = 1;
        for(int i = 0; i<n; i++){
            System.out.println("Enter Teacher " + (i+1) + " name");
            String teacherNameInput = scanner.nextLine();
            System.out.println("Enter " + teacherNameInput + "'s salary");
            double teacherSalaryInput = Double.parseDouble(scanner.nextLine());
            Teacher newTeacher = new Teacher(teacherNameInput, teacherSalaryInput);
            newTeacher.setTeacherId("T_" + String.valueOf(countTeacher));
            countTeacher++;

            teacherList.add(newTeacher);
        }
        for(int r = 0; r < teacherList.size(); r++){
            System.out.println("ID: " + teacherList.get(r).getTeacherId());
            System.out.println("Name: " + teacherList.get(r).getName());
            System.out.println("Salary: " + teacherList.get(r).getSalary());
        }

        System.out.println(teacherList.size());
    }
    public static void mainMenu(){
        System.out.println("What do you want to do today?");
        System.out.println("(1) Create Teachers");
        System.out.println("(2) Create Students");
        System.out.println("(3) Create Courses");
        System.out.println("(4) Enroll student");
        System.out.println(("(5) See Teacher List"));
        System.out.println(("(6) See Student List"));
        System.out.println(("(7) See Course List"));
        System.out.println(("(8) See Profit of a course"));
        int selectedMenu = Integer.parseInt(scanner.nextLine());
        //
        // if (1) {createTeacher().....METHODOS

    }

    // Methods

    //Enter number of Teachers you want to create (n)
    //LOOP - creating n teachers
//createTeacher
//add teachers to List<Teacher> teacherList


    //create Student
    //add student to List<Student> studentList




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