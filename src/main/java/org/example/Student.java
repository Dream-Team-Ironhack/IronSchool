package org.example;

public class Student {
    private String studentId;
    private String name;
    private String address;
    private String email;
    private Course course=null;
    int countStudent=0;

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
        this.studentId = "S_" + String.valueOf(countStudent++);
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

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
}