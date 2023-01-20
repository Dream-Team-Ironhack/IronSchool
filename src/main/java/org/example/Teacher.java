package org.example;

public class Teacher {
    private String teacherId;
    private String name;
    private double salary;
    int countTeacher=0;


    public Teacher(String name, double salary) {
        this.name = name;
        this.salary = salary;
        setTeacherId();
    }

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId() {
        this.teacherId = "T_" + String.valueOf(countTeacher++);
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
}
