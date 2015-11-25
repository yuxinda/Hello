package chess.pieces;

/**
 * Created by vmware on 11/16/2015.
 */
public class Pawn {
    static final String PawnColor1 = "White";
    static final String PawnColor2 = "Black";

    private String printFormat;
    private String color;

    public Pawn(String color, String printFormat) {
        this.color = color;
        this.printFormat = printFormat;
    }

    Pawn() {
        this.color = PawnColor1;
    }

    public String getColor() {
        return color;
    }
    public String getPrintFormat() {
        return printFormat;
    }

}
