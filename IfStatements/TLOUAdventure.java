import java.util.Scanner;

public class TLOUAdventure {
    public static void main( String[] args ) {
	Scanner keyboard = new Scanner(System.in);

	System.out.println();
	System.out.println( "The Last of Us Choice Adventure! Which Character Are You?" );
	System.out.println();

	System.out.println( "You are in a journey to join the firefly. Suddenly, you saw poeple getting attacked by gangs, will you \"help\" or \"avoid\" the situation?" );
	System.out.print( "> " );
	String r1 = keyboard.next();
	LevelOne( r1 );
    }

    public static void LevelOne( String r1 ) {
	Scanner keyboard = new Scanner(System.in);
	
	String OneResponse;
	if ( r1.equals("help") ) {
	    System.out.println();
	    System.out.println( "After helping, you have the gangs tied up, will you \"kill\" them or \"spare\" them?" );
	    System.out.print("> ");
	    OneResponse = keyboard.next();
	    LevelTwo_help( OneResponse );
	}
	if ( r1.equals("avoid") ) {
	    System.out.println();
	    System.out.println( "You came across a grovery market, will you \"go in\" or \"move on\"? Note that there are clickers in the market." );
	    System.out.print("> ");
	    OneResponse = keyboard.next();
	    LevelTwo_avoid( OneResponse );
	}
    }

    public static void LevelTwo_help( String r2 ) {
	Scanner keyboard = new Scanner(System.in);
	
	String TwoResponse;
	if ( r2.equals("kill") ) {
	    System.out.println();
	    System.out.println( "You decide to kill them. You slitted each one of them throat. However, there were people who disagree with your decision and action. Are you \"regret\" by your decision or \"ignore\" them?" );
	    System.out.print( "> " );
	    TwoResponse = keyboard.next();
	    LevelThree_kill( TwoResponse );
	}
	
	if ( r2. equals("spare") ) {
	    System.out.println();
	    System.out.println( "After sparing the gangs, would you take in the people that you save? (yes or no)" );
	    System.out.print( "> ");
	    TwoResponse = keyboard.next();
	    LevelThree_spare( TwoResponse );
	}
	
	
    } 
    
    public static void LevelTwo_avoid( String r2 ) {
	Scanner keyboard = new Scanner(System.in);
	
	String TwoResponse;
	if ( r2.equals("go in") ) {
	    System.out.println();
	    System.out.println( "After you go in, will you \"take out\" the clickers first or \"risk\" getting the foods without killing the clickers?" );
	    System.out.print( "> ");
	    TwoResponse = keyboard.next();
	    LevelThree_goin( TwoResponse );
	}

	if ( r2.equals("move on") ) {
	    System.out.println();
	    System.out.println( "On the road, one of you group member is tired. But hte group that you avoid is after you. Will you \"wait\" or \"abandon\" him?" );
	    System.out.print( "> " );
	    TwoResponse = keyboard.next();
	    LevelThree_moveon( TwoResponse );
	}
    }

    public static void LevelThree_kill( String r3 ) {
	if ( r3.equals("regret") ) {
	    System.out.println();
	    System.out.println( "You are Marlene!" );
	}
	if ( r3.equals("ignore") ) {
	    System.out.println();
	    System.out.println( "You are David!" );
	}
    }
    
    public static void LevelThree_spare( String r3 ) {
	if ( r3.equals("yes") ) {
	    System.out.println();
	    System.out.println( "You are Ellie!" );
	}
	if ( r3.equals("no") ) {
	    System.out.println();
	    System.out.println( "Yu are Joey!" );
	}
    }
    
    public static void LevelThree_goin( String r3 ) {
	if ( r3.equals("take out") ) {
	    System.out.println();
	    System.out.println( "You are Bill!" );
	}
	if ( r3.equals("risk") ) {
	    System.out.println();
	    System.out.println( "You are Mariah!" );
	}
    }

    public static void LevelThree_moveon( String r3 ) {
	if ( r3.equals("") ) {
	    System.out.println();
	    System.out.println( "You are Tess!" );
	}
	if (r3.equals("") ) {
	    System.out.println();
	    System.out.println( "You are Robert!" );
	}
    }
}
