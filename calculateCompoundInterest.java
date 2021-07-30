/*
* Isaac Mugomba
*e3540247
*Due Date: April, 15th, 2021
*Date Submitted: April, 18th, 2021
*The purpose of this program is to calculate compound interest.
*/

import java.util.Scanner; 

public class calculateCompoundInterest {

	public static void main(String[] args) {
	Scanner myKeyboard= new Scanner(System.in);

	double currentBalance;
	double newBalance;
	final double INTEREST_RATE;
	int yearCount;
	INTEREST_RATE = 1.05;


	
		System.out.print("Number of years to invest: ");
		yearCount = myKeyboard.nextInt();
		
		System.out.print("Amount to Invest: ");
		currentBalance = myKeyboard.nextDouble();
		newBalance = currentBalance;
		
		myKeyboard.close();
		
		for (yearCount = 1; yearCount <= 5; yearCount++) {
			newBalance= newBalance * INTEREST_RATE;		
			System.out.print("Year ");
			System.out.print(yearCount);
			System.out.print(" balance= ");
			System.out.printf("%.2f\n", newBalance);

			
			if (newBalance >= currentBalance*2) {
				System.out.print("You have doubled your investment");
				break;
				
				}

			}
		}
	
}


		

