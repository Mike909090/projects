import java.util.Scanner;

public class tripPlanner {
	
	public static double timeToTravel(double a, double b) {
	double result;
	result = ((a/b));
	return result;
	}
	
	public static double  fuelConsumption (double c, double d) {
		double result;
		result = ((c/d));
		return result;
		}
	
	public static void main(String[] args) {
		
	Scanner myKeyboard = new Scanner(System.in);
	double milesToTravel;
	System.out.print("Enter number of miles to travel: ");
	milesToTravel = myKeyboard.nextDouble();
	
	double travelSpeedMPH;
	System.out.print("Enter travel speed (MPH): ");
	travelSpeedMPH = myKeyboard.nextDouble();
	
	double travelMPG;
	System.out.print("Enter travel MPG: ");
	travelMPG = myKeyboard.nextDouble();
	myKeyboard.close();

	
	System.out.print("Time to travel is ");
	System.out.print(timeToTravel(milesToTravel, travelMPG));
	System.out.print(" hours.");
	
	System.out.print("Travel will take ");
	System.out.print(timeToTravel(milesToTravel, travelSpeedMPH));
	System.out.print(" gallons of gas.");

	}

}
