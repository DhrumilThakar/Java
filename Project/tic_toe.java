import java.util.*;
public class tic_toe 
{
 public static void main(String[] args) 
 {
    char[][] board = new char[3][3];
    char player = 'X';
    char opponent = 'O';
    int count = 0;
    boolean gameover = false;
    for(int row = 0;row<board.length;row++)
    {
        for(int col = 0;col<board[row].length;col++)
        {
            board[row][col]=' ';
        }
    }
    Scanner s = new Scanner(System.in);
    while(!gameover)
    {
        
    }
    s.close();
 }   
}
