package chess;

//This class requires your input
public abstract class Piece {
	private String symbol;
	protected PieceColour c;

	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String s)
	{
		symbol = s;

	}
	public PieceColour getColour()
	{
		return c;
	}

public abstract boolean isLegitMove(int a1, int b1, int a2, int b2);

}
