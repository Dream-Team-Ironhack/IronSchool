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
        System.out.println("Please, type ID of the course");
        String idCourse = scanner.nextLine();
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

    }

    public List<Course> showCourses(){
       return null;
    }

    public Course lookUpCourse(String courseId){
        return null;
    }

    public List<Student> showStudents(){
        return null;
    }

    public Student lookUpStudent(String studentId){
        return null;
    }

    public List<Teacher> showTeachers(){
        return null;
    }

    public Teacher lookUpTeacher(String teacherId){
        return null;
    }

    public double showProfit(){
        return 0.0;
    }

}
