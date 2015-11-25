package sis;

import junit.framework.TestSuite;
import sis.studentinfo.StudentTest;

/**
 * Created by vmware on 15/11/21.
 */
public class AllTests {
    public static TestSuite suite() {
        TestSuite suite = new junit.framework.TestSuite();
        suite.addTest(sis.report.AllTests.suite());
        suite.addTest(sis.studentinfo.AllTests.suite());
        suite.addTestSuite(sis.CharacterTest.class);
        return suite;
    }
}
