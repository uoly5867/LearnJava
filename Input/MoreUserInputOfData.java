import java.util.Scanner;

public class MoreUserInputOfData {
    public static void main( String[] args ) {
	Scanner keyboard = new Scanner(System.in);
	
	String FirstName, LastName, StudentID, login;
	int grade;
	double gpa;

	System.out.println( "Please enter the following information so I can sell it for a profit!" );
	
	System.out.println();
	System.out.print( "First Name: " );
	FirstName = keyboard.next();
	
	
	System.out.print( "Last Name: " );
	LastName = keyboard.next();

	
	System.out.print( "Grade (9-12): " );
	grade = keyboard.nextInt();

	
	System.out.print( "Student ID: " );
	StudentID = keyboard.next();

	
	System.out.print( "Login: " );
	login = keyboard.next();
	
	
	System.out.print( "GPA (0.0-4.0): " );
	gpa = keyboard.nextDouble();

	System.out.println();
	System.out.println( "Your Information: " );
	System.out.println( "      Login: " + login );
	System.out.println( "      ID:    " + StudentID );
	System.out.println( "      Name:  " + LastName + ", " + FirstName );
	System.out.println( "      GPA:   " + gpa );
	System.out.println( "      Grade: " + grade );
    }
}
