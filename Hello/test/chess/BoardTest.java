package chess;

import junit.framework.TestCase;
import chess.pieces.Pawn;

/**
 * Created by vmware on 15/11/19.
 */
public class BoardTest extends TestCase {
    private Board board;
    final String pawnColor1 = "White";
    final String pawnColor2 = "Black";

    public void setUp() {
        board = new Board();
    }
    public void testCreate() {
        board.initialize();
        assertEquals(16, board.getPawnNumber());

    }

    /*
    public void testAddPawn() {
        Pawn pawn1 = new Pawn(pawnColor1);
        board.addPawn(pawn1);
        assertEquals(1, board.getPawnNumber());
        assertEquals(pawn1, board.get(0));

        Pawn pawn2 = new Pawn(pawnColor2);
        board.addPawn(pawn2);
        assertEquals(2, board.getPawnNumber());
        assertEquals(pawn2, board.get(1));
    }
*/

}
