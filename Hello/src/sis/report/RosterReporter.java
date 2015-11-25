package sis.report;

import sis.studentinfo.CourseSession;
import sis.studentinfo.Student;

/**
 * Created by vmware on 15/11/21.
 */
public class RosterReporter {
    private CourseSession session;
    static final String NEWLINE = System.getProperty("line.separator");
    static final String Roster_Report_Header = "Student" + NEWLINE + "-" + NEWLINE;
    static final String Roster_Report_Footer = NEWLINE + "#students = ";
    RosterReporter(CourseSession session) {
        this.session = session;
    }

    public String getRosterReport() {
        StringBuilder buffer = new StringBuilder();
        writeHeader(buffer);
        writeBody(buffer);
        writeFoot(buffer);
        return buffer.toString();
    }

    public void writeHeader(StringBuilder buffer) {
        buffer.append(Roster_Report_Header);
    }

    public void writeBody(StringBuilder buffer) {
        for(Student student: session.getAllStudents()) {
            buffer.append(student.getName());
            buffer.append(NEWLINE);
        }
    }
    public void writeFoot(StringBuilder buffer) {
        buffer.append(Roster_Report_Footer).append(session.getAllStudents().size()).append(NEWLINE);
    }
    {}
}

