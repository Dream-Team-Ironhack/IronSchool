package org.example;

import java.sql.SQLOutput;
import java.util.List;

import static org.example.menuLogic.*;

public class School {

    private String schoolName;

    public School(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    //-----------------------------------
    //Admin Methods:
    public static void enrollStudent(){
        if (studentsList.size() == 0) {
            System.out.println("There are no students to enroll. Please restart your program to create students.");
            mainMenu();
        } else if (courseList.size() == 0) {
            System.out.println("There are no courses in our database. Please restart your program create one.");
            mainMenu();
        }
        System.out.println("Please, type ID of the student you want to enroll");
        String idStudent = scanner.nextLine();

        while( !studentsList.containsKey(idStudent) ){
            System.err.println("Student not found, please enter an existing ID");
            idStudent = scanner.nextLine();
        }

        System.out.println("Please, type ID of the course");
        String idCourse = scanner.nextLine();
        while(!courseList.containsKey(idCourse)){
            System.err.println("Course not found, please enter an existing ID");
            idCourse = scanner.nextLine();
        }
        if(!courseList.get(idCourse).getStudentList().contains(studentsList.get(idStudent))){
            courseList.get(idCourse).setStudentList(studentsList.get(idStudent));
            studentsList.get(idStudent).setStudentCourses(courseList.get(idCourse));
            courseList.get(idCourse).setMoney_earned(courseList.get(idCourse).getPrice());
            System.out.println("The course has: " + courseList.get(idCourse).getMoney_earned() + " euro");
            System.out.println("Student " + studentsList.get(idStudent).getName() + " enrolled in " + courseList.get(idCourse).getName() + ".");
        } else {
            System.err.println(" Student " +  studentsList.get(idStudent).getName() + "is already enrolled in " + courseList.get(idCourse).getName() + " course.");
            System.out.println("Please choose another command.");

        }


        mainMenu();
    }

    public static void assignTeacher(){
        if (teacherList.size() == 0) {
            System.out.println("There are no teachers in our school. Please restart your program to add them.");
            mainMenu();
        } else if (courseList.size() == 0) {
            System.out.println("There are no courses in our database. Please restart your program create one.");
            mainMenu();
        }
        System.out.println("Please, type ID of the teacher you want to assign");
        String idTeacher = scanner.nextLine();
        while(!teacherList.containsKey(idTeacher)){
            System.err.println("Teacher not found, please enter an existing ID");
            idTeacher = scanner.nextLine();
        }
        System.out.println("Please, type ID of the course");
        String idCourse = scanner.nextLine();
        while(!courseList.containsKey(idCourse)){
            System.err.println("Course not found, please enter an existing ID");
            idCourse = scanner.nextLine();
        }

        if(!courseList.get(idCourse).getTeacherList().contains(teacherList.get(idTeacher))){
            courseList.get(idCourse).setTeacherList(teacherList.get(idTeacher));
            teacherList.get(idTeacher).setTeacherCourses(courseList.get(idCourse));
            System.out.println("Teacher " + teacherList.get(idTeacher).getName() + " is assigned to " + courseList.get(idCourse).getName() + ".");
        } else {
            System.err.println("Teacher " + teacherList.get(idTeacher).getName() + " is already assigned to " + courseList.get(idCourse).getName() + " course.");
            System.out.println(" Choose another command.");
        }


        mainMenu();

    }

    public static void showCourses(){
        if (courseList.size() == 0) {
            System.out.println("There are no courses in our database. Please restart your program create one.");
            mainMenu();
        }

        for(String i : courseList.keySet()){
            System.out.println("Course ID: " + i + ". Name: " + courseList.get(i).getName() + ". Price: " + courseList.get(i).getPrice());
        }
        mainMenu();
    }

    public static void lookUpCourse(){
        int countT = 1;
        int countS = 1;

       if (courseList.size() == 0) {
           System.out.println("There are no courses in our database. Please restart your program create one.");
           mainMenu();
       }

        System.out.println("Please, type ID of the course you want to display");
        String idCourse = scanner.nextLine();

        while( !courseList.containsKey(idCourse) && courseList.size()>0 ){
            System.err.println("Course not found, please enter an existing ID");
            idCourse = scanner.nextLine();
        }
        System.out.println("ID: " + courseList.get(idCourse).getCourseId());
        System.out.println("Name: " + courseList.get(idCourse).getName());
        System.out.println("Price: " + courseList.get(idCourse).getPrice());

        if (courseList.get(idCourse).getTeacherList() == null) {
            System.out.println("No teacher has been assigned to this course yet.");

        } else {
            System.out.println("Teacher(s): ");
            for (Teacher t : courseList.get(idCourse).getTeacherList()) {
                System.out.println(countT++ + ". " + t.getName());
            }
        }

        if (courseList.get(idCourse).getStudentList() == null) {
            System.out.println("No students enrolled in this course yet.");
        } else {
            System.out.println("Student(s): ");
            for (Student s : courseList.get(idCourse).getStudentList()) {
                System.out.println(countS++ + ". " + s.getName());
            }
        }

        mainMenu();
    }

    public static void showStudents(){

        if (studentsList.size() == 0) {
            System.out.println("There are no students in our database. Please restart your program to create students.");
            mainMenu();
        }

        for(String r : studentsList.keySet()){
            System.out.println("--------------------");
            System.out.println("ID: " + r);
            System.out.println("Name: " + studentsList.get(r).getName());
            System.out.println("Address: " + studentsList.get(r).getAddress());
            System.out.println("Email: " + studentsList.get(r).getEmail());
        }
        mainMenu();
    }

    public Student lookUpStudent(String studentId){
        return null;
    }

    public static void showTeachers(){

        if (teacherList.size() == 0) {
            System.out.println("There are no teachers in our school. Please restart your program to add them.");
            mainMenu();
        }

        for(String r : teacherList.keySet()) {
            System.out.println("Teacher ID: " + r + ". Name: " + teacherList.get(r).getName() + ". Salary: " + teacherList.get(r).getSalary());
        }
        mainMenu();
    }

    public Teacher lookUpTeacher(String teacherId){
        return null;
    }

    public static void showProfit(){
        double totalMoneyEarned = 0;
        double totalSalary = 0;
        for(String c : courseList.keySet()){
            totalMoneyEarned += courseList.get(c).getMoney_earned();
        }
        for (String s : teacherList.keySet() ){
            totalSalary += teacherList.get(s).getSalary();
        }
        double profit = totalMoneyEarned - totalSalary;
        if(profit < 0){
            System.out.println("Loses: ");
            System.out.println(profit);
        }else{
            System.out.println("Profit: ");
            System.out.println(profit);
        }

        mainMenu();
    }

}
