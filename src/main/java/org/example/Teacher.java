package org.example;

import java.util.ArrayList;
import java.util.List;

public class Teacher {
    private String teacherId;
    private String name;
    private double salary;

    private List<Course> teacherCourses = new ArrayList<>();



    public Teacher(String name, double salary) {
        this.name = name;
        this.salary = salary;

    }

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String str) {
        this.teacherId = str;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public List<Course> getTeacherCourses() {
        return teacherCourses;
    }

    public void setTeacherCourses(Course course) {
        this.teacherCourses.add(course);
    }
}
