/*
* Isaac Mugomba
*e3540247
*Due Date: April, 4th, 2021
*Date Submitted: March 31st, 2021
*The purpose of this program is to figure out how much it would be to buy a car.
*/

import java.util.Scanner; 

public class BuyAcar {
	
	public static void thefinalprice() {
		
Scanner myKeyboard = new Scanner(System.in);
	
	String carModel;
	System.out.print("What car model are you looking for: ");
	carModel = myKeyboard.nextLine();
	
	double PaymentPerMonth;
	System.out.print("What do you expect to pay per month: ");
	PaymentPerMonth = myKeyboard.nextDouble();
	
	int numberOfMonths;
	System.out.print("How long do you plan to pay for them: ");
	numberOfMonths = myKeyboard.nextInt();
	
	double totalCost = (PaymentPerMonth* numberOfMonths);
	
	System.out.print("I am looking for a ") ;
	System.out.print(carModel);
	System.out.print(" car that I can pay ");
	System.out.printf("%.2f" , PaymentPerMonth);
	System.out.print(" per month for ");
	System.out.print(numberOfMonths);
	System.out.print(" months.");
	System.out.print(" My total cost would be ");
	System.out.printf("%.2f", totalCost);
	
	
	
	
	myKeyboard.close();
}
	
public static void main(String[] args) {
	 thefinalprice();
}
}



