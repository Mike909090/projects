/*
* Isaac Mugomba
*e3540247
*Due Date: April, 4th, 2021
*Date Submitted: March 31st, 2021
*The purpose of this program is to display steps to drive a car.
*/

public class DriveMyCar {
	public static void LookFortheCar() {
		System.out.println("Find your car");
	}
	
	public static void OpentheCar(){
		System.out.println("Unlock your car");
	}
	
	public static void StarttheCar() {
		System.out.println("Start car's engine");
	}

	public static void safety() {
		System.out.println("Strap seat belt, check mirrors");
	}

	public static void InputTheAddress() {
		System.out.println("Give address to GPS");
	}
	
	public static void startheJourney(){
		System.out.println("Drive to destination....");
	}

public static void main(String[] args) {
	LookFortheCar();
	OpentheCar();
	StarttheCar();
	safety();
	InputTheAddress();
	startheJourney();
}
}