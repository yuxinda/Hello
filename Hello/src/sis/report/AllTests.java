package sis.report;

import junit.framework.TestSuite;

/**
 * Created by vmware on 15/11/21.
 */
public class AllTests {
    public static TestSuite suite() {
        TestSuite suite = new junit.framework.TestSuite();
        suite.addTestSuite(RosterReporterTest.class);
        return suite;
    }
}
