import java.util.Scanner;
public class Game
	{

	public static void main(String[] args)
		{
		Scanner question= new Scanner(System.in);
		int period;
		
		System.out.println("Welcome to Tic Tac Toe");
		System.out.println("Would you like to play? 1 for yes, 2 for no: ");
		period = question.nextInt();
		
		if (period == 1)
		System.out.println("Welcome");
		Board.fillBoardWithValue();
		Board.printBoard();
		
		
		if (period==2)
		System.out.println("Well then get out.");
		
		}

	}
