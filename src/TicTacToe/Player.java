package TicTacToe;

import java.util.Scanner;

public class Player{
	private char currentPlayer;
	private int size;
	private char[][] board;
	
	public Player(char currentPlayer, int size, char[][] board) {
		this.currentPlayer = currentPlayer;
		this.size = size;
		this.board = board;
	}
    public char[][] playerMove() {
        Scanner input = new Scanner(System.in);
        int row, col;
        while (true) {
            System.out.println("Player " + currentPlayer + ", enter your move (row and column): ");
            row = input.nextInt();
            col = input.nextInt();
            if (placeMove(row, col, currentPlayer)) return board;
            else System.out.println("This move is not valid");
        }
    }
    
    public boolean placeMove(int row, int col, char player) {
        if (row >= 0 && row < size && col >= 0 && col < size && board[row][col] == '-') {
            board[row][col] = player;
            return true;
        }
        return false;
    }

    public void setCurrentPlayer(char currentPlayer) {
    	this.currentPlayer = currentPlayer;
    }

}
