import java.util.Scanner;

public class HowOldAreYou2 {
    public static String message( int age ) {
	String result;

	if ( age < 16 )
	    result = "You can't drive, ";
	else if (( age >= 16 ) && ( age < 18 )) 
	    result = "You can drive but not vote, ";
	else if (( age >= 18 ) && ( age < 25 ))
	    result = "You can vote but not rent a car, ";
	else
	    result = "You can do pretty much anything, ";

	return result;
    }
    
    public static void main( String[] args ) {
	Scanner keyboard = new Scanner(System.in);
	
	System.out.print( "Hey, what's your name? (Sorry, I keep forgetting.) " );
	String name = keyboard.next();
	
	System.out.print( "Ok, " + name + ", how old are you? " );
	int age = keyboard.nextInt();

	System.out.println();
	
	System.out.println( message(age) + name + "." );
    }
}
