import java.util.Scanner;

public class LittleQuiz {
    public static void GradeQ1( int response ) {
	if ( response == 3 )
	    System.out.println( "That's right!" );
	else
	    System.out.println( "Sorry, that is wrong. The right answer is Juneau");
	System.out.println();
    }

    public static void GradeQ2( int response ) {
	if ( response == 2 )
	    System.out.println( "That's right!" );
	else 
	    System.out.println( "Sorry, \"cat\" is a string. ints can only store integers." );
	System.out.println();
    }

    public static void GradeQ3( int response ) {
	if (response == 2)
	    System.out.println( "That's right!" );
	else
	    System.out.println( "Sorry, that is wrong. The right answer is 11." );
	System.out.println();
    }

    public static void main( String[] args ) {
	Scanner keyboard = new Scanner(System.in);
	int score = 0;
	
	System.out.println();
	System.out.print( "Are you ready for a quiz? " );
	keyboard.next();
	System.out.println( "Okay, here it comes!" );
	System.out.println();

	System.out.println( "Q1) What is the capital of Alaska?" );
	System.out.println( "        1) Melbourne" );
	System.out.println( "        2) Anchorage" );
	System.out.println( "        3) Juneau");
	System.out.println();
	System.out.print( "> ");
	int Q1Response = keyboard.nextInt();
	System.out.println();
	
	GradeQ1( Q1Response );
	if ( Q1Response == 3 )
	    score++;

	System.out.println( "Q2) Can you store the value \"cat\" in a variable of type int?" );
	System.out.println( "        1) Yes" );
	System.out.println( "        2) No" );
	System.out.println();
	System.out.print( "> ");
	int Q2Response = keyboard.nextInt();
	System.out.println();
	
	GradeQ2( Q2Response );
	if ( Q2Response == 2 )
	    score++;

	System.out.println( "Q3) What is the result of 9+6/3?" );
	System.out.println( "        1) 5" );
	System.out.println( "        2) 11" );
	System.out.println( "        3) 15/3" );
	System.out.println();
	System.out.print( "> ");
	int Q3Response = keyboard.nextInt();
	System.out.println();
	
	GradeQ3( Q3Response );
	if ( Q3Response == 2 )
	    score++;
	
	System.out.println( "Overall, you got " + score + " out of 3 correct." );
	System.out.println( "Thank You for Playing!" );
     
    }
}
