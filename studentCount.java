/*
* Isaac Mugomba
*e3540247
*Due Date: April, 4th, 2021
*Date Submitted: March 31st, 2021
*The purpose of this program is to find out the number of students.
*/

public class studentCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String myName = "Isaac Mugomba";
		final int TOTAL_NUMBER = 66;
		int classRooms = (TOTAL_NUMBER / 20);
		int remainingStudents = (TOTAL_NUMBER % 20);
		
		System.out.println(myName);
		System.out.print("The total number of students enrolled is ");
	    System.out.println(TOTAL_NUMBER);
	    System.out.print("The number of full classrooms is ");
	    System.out.println(classRooms);
		System.out.print("The number of remaining students is ");
		System.out.println(remainingStudents);
	}

}
