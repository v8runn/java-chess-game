package chess;

public class King extends Piece{
	public King(PieceColour p) {
		switch(p)
		{
			case WHITE: setSymbol("♔");
			break;
			case BLACK: setSymbol("♚");
		}
	}

	@Override

	public boolean isLegitMove(int i0, int j0, int i1, int j1)
	{

		boolean value;

		if((i1 == (i0 + 1)) && ((j1 == (j0 + 1)) || (j1 == (j0 - 1)) || (j1 == j0)))
		{
			value = true;
			if (Board.hasPiece(i1, j1))
	    {
	      if(Board.getPiece(i1, j1).getColour() == c)
	      {
	        return false;
	      }
				else
				{return true;}
	    }
			return value;
		}
		else if((i1 == i0) && ((j1 == (j0 + 1)) || (j1 == (j0 - 1))))
		{
			value = true;
			if (Board.hasPiece(i1, j1))
	    {
	      if(Board.getPiece(i1, j1).getColour() == c)
	      {
	        return false;
	      }
				else
				{return true;}
	    }
			return value;
		}
		else if((i1 == (i0 - 1)) && ((j1 == (j0 + 1)) || (j1 == (j0 - 1)) || (j1 == j0)))
		{
			value = true;
			if (Board.hasPiece(i1, j1))
	    {
	      if(Board.getPiece(i1, j1).getColour() == c)
	      {
	        value = false;
	      }
				else
				{return true;}
	    }
			return value;
		}
		else
		{
			return false;
		}
	}


}
