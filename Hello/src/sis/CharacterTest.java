package sis;

import junit.framework.TestCase;

public class CharacterTest extends TestCase{

    static final String NEWLINE = System.getProperty("line.separator");
    public void testWhitespace() {
        assertEquals(true, Character.isWhitespace('\n'));
        assertEquals(true, Character.isWhitespace('\t'));
        assertEquals(true, Character.isWhitespace(' '));

    }
}
