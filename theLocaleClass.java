/*
* Isaac Mugomba
*e3540247
*Due Date: April, 27th, 2021
*Date Submitted: April, 25rd, 2021
*The purpose of this program is to help write code that can be used  - as-is - in multiple languages, countries and cultures.
*/



import java.util.Currency;
import java.util.Locale;

public class TheLocaleClass {
	
	public static void displayMyLocaleInfo(Locale America, Locale GreatBritain, Locale Mexico, Locale Panama) {
	
			Currency Americancurrency = Currency.getInstance(America);
		   Locale usa = new Locale(" United States ");
		   usa.getDisplayCountry();
		   Locale usalan = new Locale("English");
		   usalan.getDisplayLanguage();
		   
		   Currency GreatBritaincurrency1 = Currency.getInstance(GreatBritain);
		   Locale greabt = new Locale(" Great Britain ");
		   greabt.getDisplayCountry();

		   Locale greabtlan = new Locale("English");
		   greabtlan.getDisplayLanguage();
		   
			Currency Mexicocurrency2 = Currency.getInstance(Mexico);
		   Locale mexico = new Locale(" Mexico ");
		   mexico.getDisplayCountry();
		   Locale mexicolan = new Locale("Spanish ");
		   mexicolan.getDisplayLanguage();
		   
		   
			Currency Panamacurrency3 = Currency.getInstance(Panama);
		   Locale panama = new Locale(" Panama ");
		   panama.getDisplayCountry();
		   Locale panamalan = new Locale("Spanish ");
		   panamalan.getDisplayLanguage();
		   
		   
		   
		System.out.println("The country"+usa+"speaks "+usalan+ " and uses the currency " +Americancurrency+ ".");
		System.out.println("The country"+greabt+"speaks "+greabtlan+" and uses the currency "+GreatBritaincurrency1+ ".");
		System.out.println("The country"+mexico+"speaks "+mexicolan+" and uses the currency "+Mexicocurrency2+ ".");
		System.out.println("The country"+panama+"speaks "+panamalan+" and uses the currency "+Panamacurrency3+ ".");
	}

	public static void main(String[] args) {
		Locale America = new Locale("en","us");
		   Locale GreatBritain = new Locale("en", "gb");
		   Locale Mexico = new Locale("es", "mx");
		   Locale Panama = new Locale("es", "pa");
		 
		   displayMyLocaleInfo(America,GreatBritain, Mexico,  Panama);
		   
		
	}

}
