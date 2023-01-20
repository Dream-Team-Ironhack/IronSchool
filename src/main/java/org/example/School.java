package org.example;

import java.util.List;

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
    public void enroll(String studentId, String courseId){

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
