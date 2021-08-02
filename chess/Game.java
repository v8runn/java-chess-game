package chess;
import java.io.Console;

public class Game {
	private static boolean gameEnd=false;

	public static void play(){
		int i0, i1, j0, j1;
		String source, dest;
		PieceColour turn = PieceColour.BLACK;
		Console con = System.console();
		CheckInput validInput = new CheckInput();
		while (!gameEnd){

			if (turn == PieceColour.BLACK)
			{
				turn = PieceColour.WHITE;
			}
			else if (turn == PieceColour.WHITE)
			{
				turn = PieceColour.BLACK;
			}

			while (true)
			{
				System.out.println("-----" + turn + " moves ------");
				source = con.readLine("> Enter Origin (eg: 7a): ");
				dest = con.readLine("> Enter Destination (eg: 5a): ");

				if((source==null) && (dest==null))
				{
					System.out.println("Oopsie, try again!");
					continue;
				}
				else if(source.equals(dest))
				{
					System.out.println("Origin and destination can't be the same, try again!");
					continue;
				}
				else if((source.equals("END")) || (dest.equals("END")))
				{
					System.out.println("Thanks for playing, see ya next time!");
					System.exit(0);
				}
				else if((!validInput.checkCoordinateValidity(source)) || (!validInput.checkCoordinateValidity(dest)))
				{
				System.out.println("Invalid inputs, try again!");
				continue;
				}
				else
				{
					i0 = (int) source.charAt(0) - '0' - 1;
					j0 = (int) Character.toLowerCase(source.charAt(1)) - 'a';
					i1 = (int) dest.charAt(0) - '0' - 1;
					j1 = (int) Character.toLowerCase(dest.charAt(1)) - 'a';
					if (Board.hasPiece(i0, j0))
					{
						if(Board.getPiece(i0, j0).isLegitMove(i0, j0, i1, j1))
						{
							Board.movePiece(i0, j0, i1, j1, Board.getPiece(i0, j0));
							Board.printBoard();
							break;
						}
						else
						{
							System.out.println("Invalid move, try again!");
							continue;
						}
					}

					if((Board.getPiece(i1, j1).getSymbol().equals("♚")) && (turn==PieceColour.WHITE))
					{
						System.out.println("WHITE WINS! GAME OVER LADS");
						gameEnd = true;
					}
					else if((Board.getPiece(i1, j1).getSymbol().equals("♔")) && (turn==PieceColour.WHITE))
					{
						System.out.println("BLACK WINS! GAME OVER LADS");
						gameEnd = true;
					}
				}





		}
	}
}

	//This method should not be edited
	public static void main (String args[]){
		Board.initialiseBoard();
		Board.initialisePieces();
		Board.printBoard();
		Game.play();	}
}
