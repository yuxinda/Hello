package sis.studentinfo;

import junit.framework.TestCase;

import java.util.Date;


public class CourseSessionTest extends TestCase {

    private CourseSession session;
    private Date startDate;
    private static final int CREDITS = 3;

    public void setUp() {
        startDate = DateUtil.createDate(2003, 1, 6);
        session = createCourseSession();
    }

    public void testCreate() {

        assertEquals("ENGL", session.getDepartment());
        assertEquals("101", session.getNumber());
        assertEquals(0, session.getNumberOfStudents());
        assertEquals(startDate, session.getStartDate());
    }

    public void testEnrollStudents() {

        Student student1 = new Student("Xinda");
        session.enroll(student1);
        assertEquals(1, session.getNumberOfStudents());
        assertEquals(student1, session.get(0));
        assertEquals(CREDITS, student1.getCredits());

        Student student2 = new Student("Ada");
        session.enroll(student2);
        assertEquals(2, session.getNumberOfStudents());
        assertEquals(student1, session.get(0));
        assertEquals(student2, session.get(1));
        assertEquals(CREDITS, student1.getCredits());

    }

    public void testCourseDates() {
        Date sixteenWeekOut = DateUtil.createDate(2003, 4, 26);
        assertEquals(sixteenWeekOut, session.getEndDate());
    }

    public void testCount() {
        CourseSession.resetCount();
        createCourseSession();
        assertEquals(1, CourseSession.getCount());
        createCourseSession();
        assertEquals(2, CourseSession.getCount());
    }
    private CourseSession createCourseSession() {
        CourseSession session = CourseSession.create("ENGL", "101", startDate);
        session.setNumberOfCredits(CourseSessionTest.CREDITS);
        return session;
    }
}
