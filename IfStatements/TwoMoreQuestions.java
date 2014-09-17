import java.util.Scanner;

public class TwoMoreQuestions {
    public static void main( String[] args ) {
	Scanner keyboard = new Scanner(System.in);

	System.out.println();
	System.out.println( "TWO MORE QUESTIONS!" );
	System.out.println();

	System.out.println( "Think of something and I'll try to guess it!" );
	System.out.println();

	System.out.print( "Question 1) Does it belong inside or outside or both? (inside, outside, or both) " );
	String ansOne = keyboard.next();

	System.out.print( "Question 2) Is it alive? (alive or notalive) " );
	String ansTwo = keyboard.next();
	System.out.println();
	
	if ( (ansOne.equals("inside")) && (ansTwo.equals("alive")) )
	    System.out.println( "Is it a houseplant?" );
	if ( (ansOne.equals("inside")) && (ansTwo.equals("notalive")) )
	    System.out.println( "Is it a shower curtain?" );
	if ( (ansOne.equals("outside")) && (ansTwo.equals("alive")) )
	    System.out.println( "Is it a bison?" );
	if ( (ansOne.equals("outside")) && (ansTwo.equals("notalive")) )
	    System.out.println( "Is it a billboard?" );
	if ( (ansOne.equals("both")) && (ansTwo.equals("alive")) )
	    System.out.println( "Is it a dog?" );
	if ( (ansOne.equals("both")) && (ansTwo.equals("notalive")) )
	    System.out.println( "Is it a cellphone?" );
    }
}
