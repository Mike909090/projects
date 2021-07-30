/*
* Isaac Mugomba
*e3540247
*Due Date: April, 25th, 2021
*Date Submitted: April, 23rd, 2021
*The purpose of this program is to generate text for an email.
*/


import java.util.Scanner;
import java.util.Calendar;
import java.util.Locale;
public class MessageBuilder {
	public static String shipDOW() {
	      Calendar in3days = Calendar.getInstance(); 
	       in3days.add(Calendar.DAY_OF_YEAR, 3); 
	      return in3days.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG_FORMAT, Locale.getDefault()); 
	 }


	public static String referenceNumber() {
	      return Long.toString(System.currentTimeMillis());
	 }

	public static void main(String[] args) {
	Scanner myKeyboard= new Scanner(System.in);
	
		String contactName;
		String ItemToOrder;
		String NumberOfItemsToOrder;
		String emailMsg;
	
		System.out.print("Enter the contact name: ");
		contactName = myKeyboard.nextLine();
		
		System.out.print("Enter the item you want to order: ");
		ItemToOrder = myKeyboard.nextLine();
		
		System.out.print("Enter Number of items you eant to order: ");
		NumberOfItemsToOrder = myKeyboard.nextLine();
		
		  String salutation = "Dear $CONTACT$,\n";
		  salutation = salutation.replace("$CONTACT$", contactName);
		  
		  String customerInfo = "Your order for $COUNT$ $ITEM$ will be shipped $DOW$. \n";
		  customerInfo = customerInfo.replace("$COUNT$", ItemToOrder);
		  customerInfo = customerInfo.replace("$ITEM$", NumberOfItemsToOrder);
		  customerInfo = customerInfo.replace("$DOW$", shipDOW());
		  
		  String orderNumber = "The reference number is $REF$\n";
		  orderNumber = orderNumber.replace("$REF$", referenceNumber());
		
		  emailMsg = salutation;
		  emailMsg = emailMsg.concat(customerInfo).concat(orderNumber); 
		  
		  System.out.print(emailMsg);
		  
			myKeyboard.close();
	}

}


