package chess.pieces;

public class PawnTest extends junit.framework.TestCase{
    static final String firstPawnColor = "White";
    static final String secondPawnColor = "Black";

    public void testCreate() {
        Pawn pawn = new Pawn(firstPawnColor, "p");
        assertEquals(pawn.getColor(), firstPawnColor);

        Pawn secondPawn = new Pawn(secondPawnColor, "P");
        assertEquals(secondPawn.getColor(), secondPawnColor);
    }
    public void testCreateEmpty() {
        Pawn pawn = new Pawn();
        assertEquals(pawn.getColor(), firstPawnColor);
    }
}

