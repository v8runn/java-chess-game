package chess;
import static java.lang.Math.*;

public class Pawn extends Piece{
	public Pawn(PieceColour p){
		switch(p)
    {
      case WHITE: setSymbol("♙");
      break;
      case BLACK: setSymbol("♟︎");
    }
	}

@Override

public boolean isLegitMove(int i0, int j0, int i1, int j1)
{
	int a,b;
	a = abs(i1 - i0);
	b = abs(j1 - j0);
	if((a==1) && (b==0))
	{
		if (Board.hasPiece(i1, j1))
		{
			if (Board.getPiece(i1, j1).getColour() == c)
			{
				return false;
			}
			else
			{return true;}
		}
		return true;
	}
	else if((a==1) && (b==1))
	{
		if (Board.hasPiece(i1, j1))
		{
			if (Board.getPiece(i1, j1).getColour() == c)
			{
				return false;
			}
			else if (Board.getPiece(i1, j1).getColour() != c)
		  {
				return true;
			}
		}
		return false;
	}
	else if((i0==1) || (i0==6))
	{
		if(((a==1) || (a==2)) && (b==0))
		{
			if (Board.hasPiece(i1, j1))
			{
				if (Board.getPiece(i1, j1).getColour() == c)
				{
					return false;
				}
				else
				{return true;}
		}
		return true;
	}
}
return false;
}
}
