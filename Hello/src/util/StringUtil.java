package util;

/**
 * Created by vmware on 15/11/26.
 */
public class StringUtil {
    private StringUtil() {}
    public static final String NEWLINE = System.getProperty("line.separator");
    public static String appendNewLine(String str) {
        return str + NEWLINE;
    }
}
