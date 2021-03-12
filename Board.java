public class Board{
    private char[][] board;
    private Point playerPos;
    public Board(int width, int height, Point playerPos){
        board = new char[height][width];
        this.playerPos = playerPos;
        for(int row = 0; row < height; row++){
            for(int col = 0; col < width; col++){
                board[row][col] = '.';
            }
        }
        board[playerPos.row][playerPos.col] = 'p';
    }
    
    
    public void printBoard(){
        for(int row = 0; row < board.length; row++){
            for(int col = 0; col < board[0].length; col++){
                System.out.print(board[row][col]);
            }
        
            System.out.print('\n');
        }
    }
    public Point movePlayer(Point newPlayerPos){
        if(newPlayerPos.row >= board.length || newPlayerPos.row < 0 || newPlayerPos.col >= board[0].length || newPlayerPos.col < 0){
            return playerPos;
        }
        board[playerPos.row][playerPos.col] = '.';
        playerPos = newPlayerPos;
        board[playerPos.row][playerPos.col] = 'p';
        return playerPos;
    }
}