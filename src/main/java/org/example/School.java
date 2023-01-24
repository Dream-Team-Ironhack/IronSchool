package org.example;

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
        } else {
            System.err.println(" The student is already enrolled in this course. Choose another command.");
            mainMenu();
        }
        System.out.println("Student " + studentsList.get(idStudent).getName() + " enrolled in " + studentsList.get(idStudent).getStudentCourses().get(0).getName());
        System.out.println("Course " + courseList.get(idCourse).getName() + " has student: " + courseList.get(idCourse).getStudentList().get(0).getName());

        mainMenu();
    }

    public void assignTeacher(String teacherId, String courseId){
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
        /*if(!courseList.get(idCourse).get){

        }*/
    }

    public static void showCourses(){
        for(String i : courseList.keySet()){
            System.out.println("Course ID: " + i + ". Name: " + courseList.get(i).getName() + ". Price: " + courseList.get(i).getPrice());
        }
        mainMenu();
    }

    public Course lookUpCourse(String courseId){

        return null;
    }

    public static void showStudents(){
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
