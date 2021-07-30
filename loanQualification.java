import java.util.Scanner;

/*
* Isaac Mugomba
*e3540247
*Due Date: April, 12th, 2021
*Date Submitted: April, 9th 2021
*The purpose of this program is to determine if a candidate qualifies for a FHA Mortgage.
*/


public class loanQualification {

	public static void main(String[] args) {
	Scanner myKeyboard = new Scanner(System.in);
	
		boolean residenceRequirement=false;
		byte typeOfResidence;
		int creditScore;
		
		System.out.print("Enter 1 if the Home will be the primary residence, or 0 if not the primary residence: ");
		typeOfResidence = myKeyboard.nextByte();
		
		System.out.print("Enter the credit score: ");
		creditScore = myKeyboard.nextInt();
		
		myKeyboard.close();
	
			if (typeOfResidence == 1 ) {
				residenceRequirement = true;
			}
			else if (typeOfResidence == 0) {
				residenceRequirement = false;
			}
			
	
		if (residenceRequirement == true && creditScore >=580) {
			System.out.print("Qualifies for the loan.");
		}
		else {
				System.out.print("Does not qualify for the loan.");
				}
		}
}

		
	
		
		

