package org.example;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private String courseId;
    private String name;
    private double price;
    private double money_earned;
    private static int courseCount = 1;
    private Teacher teacher=null;
    private List<Student> studentList = new ArrayList<>();
    private List<Teacher> teacherList = new ArrayList<>();


    public Course(String name, double price) {
        this.name = name;
        this.price = price;
        setCourseId();
    }

    public static int getCourseCount() {
        return courseCount;
    }

    public static void setCourseCount(int courseCount) {
        Course.courseCount = courseCount;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId() {
        this.courseId = "C-" + String.valueOf(courseCount++);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getMoney_earned() {
        return money_earned;
    }

    public void setMoney_earned(double money_earned) {
        this.money_earned += money_earned;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(Student student) {
        this.studentList.add(student);
    }

    public List<Teacher> getTeacherList() {
        return teacherList;
    }

    public void setTeacherList(Teacher teacher) {
        this.teacherList.add(teacher);
    }
}
