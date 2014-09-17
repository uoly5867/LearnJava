import java.util.Scanner;

public class SpaceBoxing {
    public static double PlanetsWeight( int WeightEarth, int planet ) {
	double result;
	
	if ( planet == 1 )
	    result = 0.78;
	else if ( planet == 2 )
	    result = 0.39;
	else if ( planet == 3 )
	    result = 2.65;
	else if ( planet == 4 )
	    result = 1.17;
	else if ( planet == 5 )
	    result = 1.05;
	else if ( planet == 6 )
	    result = 1.23;
	else 
	    result = 0.0;

	return (result*WeightEarth);
    }
    public static void main( String[] args ) {
	Scanner keyboard = new Scanner(System.in);

	System.out.print( "Please enter your current earth weight: " );
	int WeightEarth = keyboard.nextInt();
	System.out.println();
	
	System.out.println( "I have information for the following planets:" );
	System.out.println( "    1. Venus    2. Mars    3. Jupitor" );
	System.out.println( "    4. Saturn   5. Uranus  6. Neptune" );
	
	System.out.println();
	System.out.print( "Which planet are you visiting? " );
	int planet = keyboard.nextInt();

	System.out.println();
	System.out.println( "Your weight would be " + PlanetsWeight(WeightEarth, planet) + " pounds on that planet." );
    }
}
