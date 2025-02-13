package TicTacToe;

public class Board {
    private char[][] board;
    private int size = 3;

    public Board() {
        board = new char[size][size];
        initializeBoard();
    }
    
    public int getSize() {
    	return size;
    }
    
    public char[][] getBoard(){
    	return board;
    }
    
    public void setNewBoard(char[][] board){
    	this.board = board;
    }
    
    private void initializeBoard() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++)board[i][j] = '-';
        }
    }

    public void printBoard() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) System.out.print(board[i][j] + " ");
            System.out.println();
        }
    }

    public boolean checkWin(char player) {
        // Check rows, columns, and diagonals
        for (int i = 0; i < size; i++) {
            if (board[i][0] == player && board[i][1] == player && board[i][2] == player) return true;
            if (board[0][i] == player && board[1][i] == player && board[2][i] == player) return true;
        }
        if (board[0][0] == player && board[1][1] == player && board[2][2] == player) return true;
        if (board[0][2] == player && board[1][1] == player && board[2][0] == player) return true;
        return false;
    }

    public boolean isBoardFull() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (board[i][j] == '-') return false;
            }
        }
        return true;
    }
}

