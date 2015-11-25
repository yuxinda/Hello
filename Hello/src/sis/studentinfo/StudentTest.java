package sis.studentinfo;

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

    public void testStudentStatus() {
        Student student = new Student("a");
        assertEquals(0, student.getCredits());
        assertFalse(student.isFullTime());

        student.addCredits(3);
        assertEquals(3, student.getCredits());
        assertFalse(student.isFullTime());

        student.addCredits(9);
        assertEquals(12, student.getCredits());
        assertTrue("Enough credit for Full time", student.isFullTime());
    }
    public void testInState() {
        Student student = new Student("a");
        assertFalse(student.isInState());
        student.setState(Student.IN_STATE);
        assertTrue(student.isInState());
        student.setState("JiangXi");
        assertFalse(student.isInState());
    }

}
