public class runner
	{
	static String board[][] = new String[3][3];

	
	public static boolean hasWon(){
		{
		
   if((board[0][0].equals(board[0][1])&& board[0][1].equals(board[0][2])||
	   board[1][0].equals(board[1][1])&& board[1][1].equals(board[1][2])||
	   board[2][0].equals(board[2][1])&& board[2][1].equals(board[2][2])||
	   board[0][0].equals(board[1][0])&& board[1][0].equals(board[2][0])||
	   board[0][1].equals(board[1][1])&& board[1][1].equals(board[2][1])||
	   board[0][2].equals(board[1][2])&& board[1][2].equals(board[2][2])||
	   board[0][0].equals(board[1][1])&& board[1][1].equals(board[2][2])||
	   board[2][0].equals(board[1][1])&& board[1][1].equals(board[0][2])))
		return true;
		}
		
		{
		return false;
		}
	}
	

	
	
	}