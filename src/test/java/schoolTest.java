

import org.example.Course;
import org.example.School;
import org.example.Student;
import org.example.Teacher;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class schoolTest {
    Map<String, Teacher> teacherList1 = new HashMap<>();
    Map<String, Course> courseList1 = new HashMap<>();
    Map<String, Student> studentsList1 = new HashMap<>();
    School school;

    Teacher teacher1;
    Teacher teacher2;

    Student student1;
    Student student2;
    Student student3;

    Course course1;
    Course course2;


    @BeforeEach
    void setUp(){

        school = new School("ClonSchool");

        teacher1 = new Teacher("Jaume", 2000);
        teacher2 = new Teacher("Ester", 5000);

        student1 = new Student("Lídia", "SuCasa", "SuMail");
        student2 = new Student("Raphaela", "Austria", "SuMail");
        student3 = new Student("Anastasiia", "Sucasa", "SuMail");

        course1 = new Course("Front", 300);
        course2 = new Course("Back", 500);

        Map<String, Course> courseList1 = new HashMap<>();
        courseList1.put(course1.getCourseId(), course1);
        courseList1.put(course2.getCourseId(), course2);
        school.setCourseList(courseList1);

        Map<String, Teacher> teacherList1 = new HashMap<>();
        teacherList1.put(teacher1.getTeacherId(), teacher1);
        teacherList1.put(teacher2.getTeacherId(), teacher2);
        school.setTeacherList(teacherList1);

        Map<String, Student> studentsList1 = new HashMap<>();
        studentsList1.put(student1.getStudentId(), student1);
        studentsList1.put(student2.getStudentId(), student2);
        studentsList1.put(student3.getStudentId(), student3);
        school.setStudentsList(studentsList1);

    }

    @Test
    public void shouldEnrollStudent_whenEnrollStudentIsCalled() {

        school.enrollStudent("S-1", "C-1");
        assertEquals(1,school.getStudentsList().get("S-1").getStudentCourses().size());
    }


}
