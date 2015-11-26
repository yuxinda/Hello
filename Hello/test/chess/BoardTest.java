package chess;

import junit.framework.TestCase;
import chess.pieces.Pawn;
import util.StringUtil;


public class BoardTest extends TestCase {
    private Board board;

    protected void setUp() {
        board = new Board();
    }
    public void testCreate() {
        board.initialize();
        assertEquals(32, board.pieceCount());
        String blankRank = StringUtil.appendNewLine("........");
        assertEquals(
                StringUtil.appendNewLine("RNBQKBNR") +
                StringUtil.appendNewLine("PPPPPPPP") +
                blankRank + blankRank + blankRank + blankRank +
                StringUtil.appendNewLine("pppppppp") +
                StringUtil.appendNewLine("rnbqkbnr"),
                board.print()
        );
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
