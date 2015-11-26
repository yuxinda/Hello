package chess;

import chess.pieces.Pawn;
import util.StringUtil;

public class BoardPrinter {
    private Board board;

    static final String Empty_Cell = "........";

    BoardPrinter(Board board) {
        this.board = board;
    }

    String getPrintFormat() {
        StringBuilder buffer = new StringBuilder();
        buffer.append(Empty_Cell);
        buffer.append(StringUtil.NEWLINE);
        for(Pawn pawn: board.getList2Pawn()) {
            buffer.append(pawn.getPrintFormat());
        }
        buffer.append(StringUtil.NEWLINE);
        buffer.append(Empty_Cell);
        buffer.append(StringUtil.NEWLINE);
        buffer.append(Empty_Cell);
        buffer.append(StringUtil.NEWLINE);
        buffer.append(Empty_Cell);
        buffer.append(StringUtil.NEWLINE);
        buffer.append(Empty_Cell);
        buffer.append(StringUtil.NEWLINE);
        for (Pawn pawn: board.getList7Pawn()) {
            buffer.append(pawn.getPrintFormat());
        }
        buffer.append(StringUtil.NEWLINE);
        buffer.append(Empty_Cell);
        return buffer.toString();
    }

}
