/*
* Isaac Mugomba
*e3540247
*Due Date: April, 15th, 2021
*Date Submitted: April, 18th, 2021
*The purpose of this program is to show a savings account balance.
*/

/**


Add the amountToSaveEachMonth to the current balance.
Display the currentSavingsMonth and the current balance
Add 1 to the currentSavingsMonth
 */

import java.util.Scanner;

public class savingsAccountBalance {


	public static void main(String[] args) {
		int currentBalance;
		int amountToSaveEachMonth; 
		int numberOfMonthsToSave;
		int currentSavingsMonth;
		
		currentBalance = 0;
		currentSavingsMonth = 1;
		Scanner myKeyboard= new Scanner(System.in);
		
		
		System.out.print("Enter amount to save each month:  ");
		amountToSaveEachMonth = myKeyboard.nextInt();
		
		System.out.print("Enter the number of months to save: ");
		numberOfMonthsToSave = myKeyboard.nextInt();
		
		myKeyboard.close();
		
		while(currentSavingsMonth <= numberOfMonthsToSave) {
			currentBalance +=amountToSaveEachMonth;
			System.out.println("For the month " + currentSavingsMonth + " the balance is " +currentBalance);
			currentSavingsMonth += 1;
			
			
			
		}

	}

}
