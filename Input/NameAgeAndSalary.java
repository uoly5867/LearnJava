import java.util.Scanner;

public class NameAgeAndSalary {
    public static void main( String[] args ) {
	Scanner keyboard = new Scanner(System.in);
	
	String name;
	int age;
	double salary;

	System.out.println( "Hello. What is your name?" );
	name = keyboard.next();
	
	System.out.println( "Hi, " + name + "! How old are you?" );
	age = keyboard.nextInt();

	System.out.println( "So you're " + age + ", eh? Damn, you're young!" );
	System.out.println( "How much do you make, " + name + "?" );
	salary = keyboard.nextDouble();
	
	System.out.println( salary + "! Good for you!" );
    }
}
