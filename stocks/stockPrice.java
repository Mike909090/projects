//TODO Add Student Information
/******************************
	Student Name:
	Student ID:
	Semester:

	COSC-1436
	El Centro College
	Professor Parker

	Topic:Arrays of Objects
	*******************************/


import java.util.concurrent.ThreadLocalRandom;


public class StockPrice {

	static final int MAX_STOCK_COUNT = 24;
	static final int MIN_STOCK_PRICE = 10;
	static final int MAX_STOCK_PRICE = 100;

	// Create the array of Stock Objects
	Stock[] myStocks = new Stock[MAX_STOCK_COUNT];

	/**
	 * This constructor will load the values of the stock array.
	 * Nothing to change here.
	 */

	public StockPrice() {
		char startChar = 'A';
		String tmpSymbol = null;
		int startPrice = 0;
		int priceRightNow = 0;

		for (int idx = 0; idx < MAX_STOCK_COUNT; ++idx) {
			// Generate stock symbol for testing
			tmpSymbol = "" + (char) (startChar + idx) + (char) (startChar + idx + 1) + (char) (startChar + idx + 2);
			// Generate random data for pricing
			startPrice = ThreadLocalRandom.current().nextInt(MIN_STOCK_PRICE, MAX_STOCK_PRICE + 1);
			priceRightNow = ThreadLocalRandom.current().nextInt(MIN_STOCK_PRICE, MAX_STOCK_PRICE + 1);
			myStocks[idx] = new Stock(tmpSymbol, startPrice, priceRightNow);
			System.out.println(myStocks[idx]);
		}
	}
	
	public void demoMethod() {
		System.out.println("You can call this method if you want");
		System.out.println("First Stock price = "+myStocks[0].getCurrentPrice());
	}
	
	
	public void lowestPrice() {
		int myLowestIndex = 0;
		for (int id = 0; id < myStocks.length; ++id) {
		      if ( myStocks[id].getCurrentPrice() < myStocks[myLowestIndex].getCurrentPrice() ) {
		             myLowestIndex = id;
		      }  
		}
		          	System.out.print("The current lowest stock price is ");
					System.out.print(myStocks[ myLowestIndex].getStockSymbol());
					System.out.print(" at ");
					System.out.println(myStocks[myLowestIndex].getCurrentPrice());
		        }

	

public void highestPrice() {
	int highestPrice = 0;
	for (int id = 0; id < myStocks.length; ++id) {
	      if ( myStocks[id].getCurrentPrice() > myStocks[highestPrice].getCurrentPrice() ) {
	    	  highestPrice = id;
	      }  
	}
	          	System.out.print("The current highest stock price is ");
				System.out.print(myStocks[ highestPrice].getStockSymbol());
				System.out.print(" at ");
				System.out.println(myStocks[highestPrice].getCurrentPrice());
	        }



public void biggestIncrease() {	    	  
	int  Increase =0;
	for (int ido = 0; ido < myStocks.length; ++ido) {
	      if ( ((myStocks[ido].getCurrentPrice() - myStocks[ido].getOpeningPrice()))> ((myStocks[ Increase].getCurrentPrice() - myStocks[ Increase].getOpeningPrice()))) {
	    	  Increase = ido;
	  
	    	  
	      }  
	}
	          	System.out.print("The current biggest Increase in stock price is ");
				System.out.print(myStocks[ Increase].getStockSymbol());
				System.out.print(" at ");
				System.out.println(myStocks[Increase].getCurrentPrice());
	        
	      }
	
}


			
		

	

	//TODO
	/**************************************************
	 * Assignment:

	 * Extra Credit - Create a method that will report the stock
	 * with the biggest increase.
	 *************************************************/
