package org.example;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String studentId;
    private String name;
    private String address;
    private String email;
    private static int studentCount = 1;
    private List<Course> studentCourses = new ArrayList<>();

    public Student(String name, String address, String email) {
        this.name = name;
        this.address = address;
        this.email = email;
        setStudentId();

    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId() {
        this.studentId = "S-" + String.valueOf(studentCount++);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Course> getStudentCourses() {
        return studentCourses;
    }

    public void setStudentCourses(Course course) {
        studentCourses.add(course);
    }
}
