import java.util.Scanner;

public class BMICalc {
    public static void main( String[] args ) {
	Scanner keyboard = new Scanner(System.in);
	
	double HeightFeet, HeightInch, WeightPound;
	
	System.out.println( "Welcome to BMi Calculator!" );
	System.out.println();
	
	System.out.print( "Your height (feet only): " );
	HeightFeet = keyboard.nextDouble();
	
	System.out.print( "Your height (inches only): " );
	HeightInch = keyboard.nextDouble();
	
	System.out.print( "Your weight (pounds): " );
	WeightPound = keyboard.nextDouble();
	
	double HeightMeter = ((HeightFeet*12) + HeightInch) * 0.0254;
	double WeightKg = WeightPound * 0.453592;
	double BMI = WeightKg/(HeightMeter*HeightMeter);
	
	System.out.println();
	System.out.println( "Your BMI is " + BMI);

	if (BMI < 15.0)
	    System.out.println( "BMI Category: Very Severly Underweight" );
	if ((BMI >= 15.0) && (BMI < 16.1))
	    System.out.println( "BMI Category: Severely Underweight" );
	if ((BMI >= 16.1) && (BMI < 18.5))
	    System.out.println( "BMI Category: UnderWeight" );
	if ((BMI >= 18.5) && (BMI < 25.0))
	    System.out.println( "BMI Category: Normal Weight" );
	if ((BMI >= 25.0) && (BMI < 30.0))
	    System.out.println( "BMI Category: OverWeight" );
	if ((BMI >= 30.0) && (BMI < 35.0))
	    System.out.println( "BMI Category: Moderately Obese" );
	if ((BMI >= 35.0) && (BMI < 40.0))
	    System.out.println( "BMI Category: Severely Obese" );
	if (BMI >= 40.0)
	    System.out.println( "BMI Category: Very Severely (or morbidly) obese" );
    }
}
