import java.util.Scanner;

public class AskingQuestions {
    public static void main( String[] args ) {
	Scanner keyboard = new Scanner(System.in);
	
	int age,  heightFeet, heightInch;
	double weight;
	
	System.out.print( "How old are you? " );
	age = keyboard.nextInt();
	
	System.out.print( "How many feet tall are you? " );
	heightFeet = keyboard.nextInt();

	System.out.print( "How many inches tall are you? " );
	heightInch = keyboard.nextInt();

	System.out.print( "How much do you weight? " );
	weight = keyboard.nextDouble();

	System.out.println( "So you're " + age + " old, " + heightFeet + "'" + heightInch + "\"" + " tall and " + weight + " heavy." );
    }
}
