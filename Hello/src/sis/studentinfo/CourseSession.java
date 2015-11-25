package sis.studentinfo;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.*;

public class CourseSession {
    private static int count;
    private ArrayList<Student> students = new ArrayList<>();


    private String department;
    private String number;
    private Date startDate;
    private int numberOfCredits;


    private CourseSession(String department, String number, Date startDate) {
        this.department = department;
        this.number = number;
        this.startDate = startDate;
    }
    public static CourseSession create(String department, String number, Date startDate) {
        CourseSession.incrementCount();
        return new CourseSession(department, number, startDate);
    }
    void setNumberOfCredits(int numberOfCredits) {
        this.numberOfCredits = numberOfCredits;
    }
    public Date getEndDate() {
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTime(startDate);
        final int sessionLength = 16;
        final int daysInWeek = 7;
        final int daysFromFridayToMonday = 3;
        int numberOfDays = sessionLength * daysInWeek - daysFromFridayToMonday;
        calendar.add(Calendar.DAY_OF_YEAR, numberOfDays);
        return calendar.getTime();
    }

    public ArrayList<Student> getAllStudents() {
        return students;
    }


    public String getDepartment() {
        return department;
    }

    public String getNumber() {
        return number;
    }

    public Student get(int index) {
        return students.get(index);
    }

    public int getNumberOfStudents() {
        return students.size();
    }

    public Date getStartDate() {
        return startDate;
    }

    public void enroll(Student student) {
        student.addCredits(numberOfCredits);
        students.add(student);
    }
    static int getCount() {
        return count;
    }
    static void resetCount() {
        CourseSession.count = 0;
    }
    static void incrementCount() {
        CourseSession.count++;
    }

}