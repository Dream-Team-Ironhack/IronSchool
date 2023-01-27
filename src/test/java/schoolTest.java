import org.example.Course;
import org.example.School;
import org.example.Student;
import org.example.Teacher;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class schoolTest {

    public static Map<String, Teacher> teacherList = new HashMap<>();
    public static Map<String, Course> courseList = new HashMap<>();
    public static Map<String, Student> studentsList = new HashMap<>();
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

        studentsList.put()
        //studentsList.put(student1.getStudentId(), student1);
    }

    @Test
    public void shouldEnrollStudent_whenEnrollStudentIsCalled() {
        school.enrollStudent("S-1","C-1");
        assertEquals(1, School.courseList.get(0).getStudentList().size());
    }

}