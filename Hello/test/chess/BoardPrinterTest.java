package chess;

import junit.framework.TestCase;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

/**
 * Created by vmware on 15/11/25.
 */
public class BoardPrinterTest extends TestCase{

    public void testGetPrintFormat() throws Exception {
        Board board = new Board();
        board.initialize();
        String printFormat = new BoardPrinter(board).getPrintFormat();
        System.out.print(printFormat);
    }
}