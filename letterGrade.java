/*
* Isaac Mugomba
*e3540247
*Due Date: April, 12th, 2021
*Date Submitted: April, 9th 2021
*The purpose of this program is to to display a letter grade based on an actual grade.
*/


import java.util.Scanner; 

public class letterGrade {

	public static void main(String[] args) {
		Scanner myKeyboard = new Scanner(System.in);
		
		short bestGrade;
		
		System.out.print("Enter Grade (1-100): ");
		bestGrade = myKeyboard.nextShort();
		myKeyboard.close();
		
		if (bestGrade < 1 | bestGrade > 100) {
			System.out.print("False input, please try again.");
		}
		
		if (bestGrade >= 90 && bestGrade <= 100) {
			System.out.print("Letter Grade is A ");
		}
		
			if (bestGrade >= 80 && bestGrade <= 89) {
				System.out.print("Letter Grade is B ");
			}
			
				if (bestGrade >= 70 && bestGrade <= 79) {
					System.out.print("Letter Grade is C ");
				}
				
					if (bestGrade >= 60 && bestGrade <= 69) {
						System.out.print("Letter Grade is D ");
					}
					
						if (bestGrade >= 1 && bestGrade < 60) {
							System.out.print("Letter Grade is F ");
						}	
		}

	}


