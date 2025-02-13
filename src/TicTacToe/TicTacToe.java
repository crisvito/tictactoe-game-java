package TicTacToe;


public class TicTacToe {
    private Board board;
    private Player player;
    private char currentPlayer = 'X';

    public static void main(String[] args) {
    	TicTacToe game = new TicTacToe();
    	game.initializeGame();
    	game.playGame();
    }
    
    public void initializeGame() {
    	board = new Board();
    	player = new Player(currentPlayer, board.getSize(), board.getBoard());
    }
    
    public void playGame() {
        board = new Board();	
        board.printBoard();
        while (true) {
            char[][] newBoard = player.playerMove();
            board.setNewBoard(newBoard);
            board.printBoard();
            if (board.checkWin(currentPlayer)) {
                System.out.println("Player " + currentPlayer + " wins!");
                break;
            }
            if (board.isBoardFull()) {
                System.out.println("The game is a tie!");
                break;
            }
            switchPlayer();
        }
    }
    
    private void switchPlayer() {
        currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
        player.setCurrentPlayer(currentPlayer);
    }
}
