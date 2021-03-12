import java.util.Scanner;

public class Main{
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] arg){
        Point playerPos = new Point(2, 4);
        Point newPlayerPos = null;
        Board board = new Board(6, 10, playerPos);
        board.printBoard();
        while(true){
            char direction = getMove();
            switch(direction){
                case 'w':
                    newPlayerPos = new Point(playerPos.col, playerPos.row - 1);
                    break;
                case 'a':
                    newPlayerPos = new Point(playerPos.col - 1, playerPos.row);
                    break;
                case 's':
                    newPlayerPos = new Point(playerPos.col, playerPos.row + 1);
                    break;
                case 'd':
                    newPlayerPos = new Point(playerPos.col + 1, playerPos.row);
                    break;
            }
            
            playerPos = board.movePlayer(newPlayerPos);
            board.printBoard();
            
        }
        
    }
    private static char getMove(){
        char direction = sc.next().charAt(0);
        return direction;
    }
}
'bacon'