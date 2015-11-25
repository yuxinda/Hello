package sis.studentinfo;

/**
 * Created by vmware on 11/14/2015.
 */
import junit.framework.TestCase;

public class StudentTest extends TestCase{

    final String firstStudentName = "Jane Doe";
    final String secondStudentName = "Kitty";
    public void testCreate() throws Exception {
        Student student = new Student(firstStudentName);
        assertEquals(firstStudentName, student.getName());

        Student secondStudent = new Student(secondStudentName);
        assertEquals(secondStudentName, secondStudent.getName());
    }
    public void testLanguage() {
        assertEquals("abcd", "ab" + "cd");
        String a = "abcd";
    }

}
