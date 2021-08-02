package chess;
import static java.lang.Math.*;

public class Bishop extends Piece{
  public Bishop(PieceColour p) {
    switch(p)
		{
			case WHITE: setSymbol("♗");
			break;
			case BLACK: setSymbol("♝");
		}
  }


  @Override
  public boolean isLegitMove(int i0, int j0, int i1, int j1)
  {
    boolean value;
    if (j1 > j0)
      {
        int a1 = j1 - j0;
        int b1 = i1 - i0;

        if (b1/a1 == 1)
        {
          value = true;

          if (Board.hasPiece(i1, j1))
          {
            if (Board.getPiece(i1, j1).getColour() == c)
            {
              return false;
            }
            else
            {return true;}
          }
          return value;
        }
      }

    else if (j0 > j1)
    {
      int a2 = j0 - j1;
      int b2 = i1 - i0;

      if (b2/a2 == 1)
      {
        value = true;
        if (Board.hasPiece(i1, j1))
        {
          if (Board.getPiece(i1, j1).getColour() == c)
          {
            return false;
          }
          else
          {return true;}
        }
        return value;
      }

    }
return false;
  }
}
