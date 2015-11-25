package sis.report;

import junit.framework.TestCase;
import sis.studentinfo.CourseSession;
import sis.studentinfo.DateUtil;
import sis.studentinfo.Student;

public class RosterReporterTest extends TestCase {
    public void testRosterReport() {
        CourseSession session = CourseSession.create("ENGL", "101", DateUtil.createDate(2003, 1, 6));
        session.enroll(new Student("A"));
        session.enroll(new Student("B"));

        String rosterReport = new RosterReporter(session).getRosterReport();
        System.out.println(rosterReport);
        assertEquals(
                RosterReporter.Roster_Report_Header
                        + "A" + RosterReporter.NEWLINE
                        +"B" + RosterReporter.NEWLINE
                        + RosterReporter.Roster_Report_Footer
                        + "2" + RosterReporter.NEWLINE, rosterReport);
    }

}
