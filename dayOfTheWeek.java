/*
* Isaac Mugomba
*e3540247
*Due Date: April, 15th, 2021
*Date Submitted: April, 18th, 2021
*The purpose of this program is to tell what day it is.
*/

import java.util.Scanner; 
public class dayOfTheWeek {

	public static void  askForInput() {
		Scanner Keyboard= new Scanner(System.in);	
		String makeChoice;
		System.out.print("Try again (Y/N): ");
		makeChoice = Keyboard.nextLine();
		makeChoice = makeChoice.toUpperCase();
		
		if (makeChoice.equals("Y")) {
			dayOfTheWeek1();
		}
			else if (makeChoice.equals("N")) {
					//break;
				Keyboard.close();
			}
	}
	

	
	public static void  dayOfTheWeek1() {
		Scanner myKeyboard= new Scanner(System.in);	
		int enterVariable;
		String makeChoice;
		
		String[] DAY_OF_WEEKS = { 
			    "Sunday", "Monday", "Tuesday",
			    "Wednesday", "Thursday", "Friday", 
			    "Saturday" };
		

		for (int i = 0; i < DAY_OF_WEEKS.length+1 ; ++ i ) {

		}
		System.out.print("Enter the day of the Week : ");
		enterVariable = myKeyboard.nextInt();

			if (enterVariable == 1) {
			System.out.println("The day of the week is " + DAY_OF_WEEKS[0]);
			}
				else if (enterVariable == 2) {
				System.out.println("The day of the week is " + DAY_OF_WEEKS[1]);
				}
					else if (enterVariable == 3) {
					System.out.println("The day of the week is " + DAY_OF_WEEKS[2]);
					}
						else if (enterVariable == 4) {
						System.out.println("The day of the week is " + DAY_OF_WEEKS[3]);
						}
						else if (enterVariable == 5) {
						System.out.println("The day of the week is " + DAY_OF_WEEKS[4]);
						}
							else if (enterVariable == 6) {
							System.out.println("The day of the week is " + DAY_OF_WEEKS[5]);
							}
								else if (enterVariable == 7) {
								System.out.println("The day of the week is " + DAY_OF_WEEKS[6]);
								}
			
						else {
						System.out.println("Invalid Entry.");
						}
			
			System.out.print("Try again (Y/N): ");
			makeChoice = myKeyboard.next();
			makeChoice = makeChoice.toUpperCase();
			if ((makeChoice.equals("Y"))) {
				dayOfTheWeek1();
			}
			else if ((makeChoice.equals("N"))); {
				do {
					break;
					
				}while((makeChoice.equals("N")));}
			myKeyboard.close();
			}
			

	public static void main(String[] args) {
		dayOfTheWeek1();
}
}

 
 
