package chess;

import chess.pieces.Pawn;

import java.util.ArrayList;


public class Board {
    private int pieceNumber;
    private ArrayList<Pawn> pawnList2;
    private ArrayList<Pawn> pawnList7;



    Board() {
        pieceNumber = 0;
    }

    public void initialize(){

        Pawn whitePawn = new Pawn("White", "p");
        Pawn blackPawn = new Pawn("Black", "P");
        pawnList2 = new ArrayList<>();
        pawnList7 = new ArrayList<>();

        pawnList2.add(whitePawn);
        pawnList2.add(whitePawn);
        pawnList2.add(whitePawn);
        pawnList2.add(whitePawn);
        pawnList2.add(whitePawn);
        pawnList2.add(whitePawn);
        pawnList2.add(whitePawn);
        pawnList2.add(whitePawn);


        pawnList7.add(blackPawn);
        pawnList7.add(blackPawn);
        pawnList7.add(blackPawn);
        pawnList7.add(blackPawn);
        pawnList7.add(blackPawn);
        pawnList7.add(blackPawn);
        pawnList7.add(blackPawn);
        pawnList7.add(blackPawn);
        pawnNumber+= 16;

    }

    public int pieceCount() {
        return this.pieceNumber;
    }
    public ArrayList<Pawn> getList2Pawn() {
        return pawnList2;
    }
    public ArrayList<Pawn> getList7Pawn() {
        return pawnList7;
    }

    /*public void addPawn(Pawn pawn) {
        pawnList.add(pawn);
        pawnNumber++;
    }*/

    /*public Pawn get(int index) {
        return pawnList.get(index);
    }*/
}
