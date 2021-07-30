/*
* Isaac Mugomba
*e3540247
*Due Date: April, 15th, 2021
*Date Submitted: April, 18th, 2021
*The purpose of this program is to present options for you to select.
*/

import java.util.Scanner;
public class menuChoice {
	public static void DepositCash() {
		System.out.println("Deposit Cash.");
	}
	
	public static void WithdrawCash() {
		System.out.println("Withdraw Cash.");
	}

	public static void main(String[] args) {
	Scanner myKeyboard= new Scanner(System.in);
		String menuChoice;
		
		do {
			System.out.println("A. Deposit Cash.");
			System.out.println("B. Withdraw Cash.");
			System.out.println("X. Exit. ");
			System.out.print("\n");
			System.out.print("Enter your selection: ");
			menuChoice = myKeyboard.nextLine();
			menuChoice = menuChoice.toUpperCase();
			
			if (menuChoice.equals("A")){
				DepositCash();
			}
			
			else if (menuChoice.equals("B")){
				WithdrawCash();
				}
			
			else if (menuChoice.equals("X")){
				break;
			}
			
			else {
				 System.out.println("Invalid Selection");
			}
		}while (menuChoice != "A"||menuChoice != "B"||menuChoice != "X");
		myKeyboard.close();


	}

}
