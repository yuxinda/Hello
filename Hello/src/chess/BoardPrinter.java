package chess;

import chess.pieces.Pawn;

/**
 * Created by vmware on 15/11/24.
 */
public class BoardPrinter {
    private Board board;
    static final String NEWLINE = System.getProperty("line.separator");
    static final String Empty_Cell = "........";

    BoardPrinter(Board board) {
        this.board = board;
    }

    String getPrintFormat() {
        StringBuilder buffer = new StringBuilder();
        buffer.append(Empty_Cell);
        buffer.append(NEWLINE);
        for(Pawn pawn: board.getList2Pawn()) {
            buffer.append(pawn.getPrintFormat());
        }
        buffer.append(NEWLINE);
        buffer.append(Empty_Cell);
        buffer.append(NEWLINE);
        buffer.append(Empty_Cell);
        buffer.append(NEWLINE);
        buffer.append(Empty_Cell);
        buffer.append(NEWLINE);
        buffer.append(Empty_Cell);
        buffer.append(NEWLINE);
        for (Pawn pawn: board.getList7Pawn()) {
            buffer.append(pawn.getPrintFormat());
        }
        buffer.append(NEWLINE);
        buffer.append(Empty_Cell);
        return buffer.toString();
    }

}
