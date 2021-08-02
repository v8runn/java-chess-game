package chess;
import java.util.regex.*;

public class CheckInput {

	//This method requires your input
	public boolean checkCoordinateValidity(String input)
	{
     String regex = "[1-8][a-h]";

		 if (input.matches(regex))
		 {
			 return true;
		 }
		 else
		 {
			 return false;
		 }
	}

}
