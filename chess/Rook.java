package chess;
import static java.lang.Math.*;

public class Rook extends Piece{
  public Rook(PieceColour p){
    switch(p)
    {
      case WHITE: setSymbol("♖");
      break;
      case BLACK: setSymbol("♜");
    }
  }

  @Override

  public boolean isLegitMove(int i0, int j0, int i1, int j1) {
    if (i0 == i1) {
      if (Board.hasPiece(i1, j1)) {
        return (Board.getPiece(i1, j1).getColour() != c);
      }
      for (int i = min(j0, j1) + 1; i<max(j0, j1); i++) {
        if (Board.hasPiece(i0, i)){
          return false;
        }
      }
      return false;
    }
    else if (j0 == j1){
      if (Board.hasPiece(i1, j1)) {
        return (Board.getPiece(i1, j1).getColour() != c);
      }
      for (int i= min(i0, i1)+1; i<max(i0, i1); i++) {
        if(Board.hasPiece(i, j0)) {
          return false;
        }
      }
      return true;
    }
    return false;
  }

}
