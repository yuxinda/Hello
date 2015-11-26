package chess.pieces;

/**
 * Created by vmware on 15/11/27.
 */
public class Piece {
    private String color;
    private String name;
    private Piece(String color, String name) {
        this.color = color;
        this.name = name;
    }
    public Piece createPiece(String color, String name) {
        return new Piece(color, name);
    }
}
