import java.time.LocalDateTime;

public class MyMoveTest {

	public static void main(String[] args) {
		LocalDateTime myTime = LocalDateTime.now() ;
	
		String movieTitle =null ;      
		int seatNbr = 0;   
	
		
		MovieTicket MyMoveTest1 = new MovieTicket();
		System.out.println( MyMoveTest1);

		MovieTicket MyMoveTest2 = new MovieTicket(movieTitle, myTime);
		System.out.println( MyMoveTest2);
		
		MovieTicket MyMoveTest3 = new MovieTicket(movieTitle, myTime, seatNbr);
		System.out.println( MyMoveTest3);
	
		
		


	}

}
//Object object = createInstance("mypackage.MyClass","MyAttributeValue");
//Object object = createInstance("mypackage.MyClass","MyAttributeValue");
//Where "MyAttributeValue" is an argument to the constructor of MyClass.

//Class<?> clazz = Class.forName(className);
//Constructor<?> ctor = clazz.getConstructor(String.class);
//Object object = ctor.newInstance(new Object[] { ctorArgument });