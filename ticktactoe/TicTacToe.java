/*
* Isaac Mugomba
*e3540247
*Due Date: May, 8th, 2021
*Date Submitted: May, 5th 2021
 * 
 */

import java.util.Scanner;

public class TicTacToe {

	public static void main(String[] args) {
		Long securityCode = 2024_8681_9257_3861L;
		
		TicTacToeBoard ticTacToeBoard = new TicTacToeBoard(TicTacToeBoard.PLAYER_2,securityCode);
		Scanner myKeyboard = new Scanner(System.in);
	   
		boolean kopper = false;
		
		do {
		int row;
		int column;
		System.out.println("Your turn");
		System.out.print("Enter a row number between 0 and 2 to place your tictactoe square: ");
		row = myKeyboard.nextInt();
		
		System.out.print("Enter a column number between 0 and 2 to place your tictactoe square: ");
		column = myKeyboard.nextInt();
		
		myKeyboard.close();
		
		if (ticTacToeBoard.hasSquaresAvailable()== false) {
			System.out.println("No Available spaces");
			continue;
		} 
		
		if (ticTacToeBoard.setValue(row, column) == false) {
			System.out.println("Try again");
			continue;
		} 
		
		
		if (ticTacToeBoard.hasWinner()) {
			System.out.print("The winner is " +ticTacToeBoard.theWinnerIs());
			break;
		}
		

		if (ticTacToeBoard.hasSquaresAvailable()== false) {
			System.out.println("No Available spaces");
			continue;
		} 

		if (ticTacToeBoard.theComputersTurn() == false ) {
			System.out.print("The computer has forfeited");  
			break;
		}
		
		System.out.println("Game over"); 
		
	
		}while(kopper == true);
		
	}


}


		

		
		
		
