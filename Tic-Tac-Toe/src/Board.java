public class Board
	{
	static String board[][]= new String[3][3] ;
	static int valueTable[][]= new int [3][3];
	static String reasign[][]=new String[3 ][3];
	public static void fillBoardWithValue()
		{
		for (int i=0;i<3;i++)
			{
			for (int j=0;j<3;j++)
				{
				board[i][j]=" ";
				}
			}
		
		}
	public static void printBoard()
		{
		System.out.println("    A   B   C");
		System.out.println("  -------------");
		System.out.println("1 | "+board[0][0]+" | "+board[0][1]+" | "+board[0][2]+" | ");
		System.out.println("  -------------");
		System.out.println("2 | "+board[1][0]+" | "+board[1][1]+" | "+board[1][2]+" | ");
		System.out.println("  -------------");
		System.out.println("3 | "+board[2][0]+" | "+board[2][1]+" | "+board[2][2]+" | ");
		System.out.println("  -------------");
		}
	public static void reasign(){
	reasign[A][1]=board[0][0];
	}
	}
