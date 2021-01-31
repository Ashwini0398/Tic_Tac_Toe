public class TicTakToe {

    char[][] board = new char[3][3];

    public static void display(char board[][])
    {
        for (int i=0; i<3; i++)
        {
            for(int j=0; j<3; j++){
				
            System.out.println(board[i][j] +"  ");
			}
			System.out.println();
        }
		
    }


    public static void main(String args[])
    {
        TicTakToe game= new TicTakToe();
        int counter=0;
        for (int i=0; i<3; i++)
        {
            for(int j=0; j<3; j++){
                game.board[i][j]=Character.forDigit(counter++,10);
            }

        }
        display(game.board);
    }
}
