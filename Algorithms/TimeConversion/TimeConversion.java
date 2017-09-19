



import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;



public class TimeConversion {

    static String timeConversion( String s ) {
        // Parse argument for key figures
        int hours = Integer.parseInt( s.substring( 0, 2 ) );
        String minutes = s.substring( 3, 5 );
        String seconds = s.substring( 6, 8 );
        String meridiem = s.substring( 8, 10 );
        // Convert to military time
        if ( hours != 12 && meridiem.equals( "PM" )  ) { hours += 12; }
        if ( hours == 12 && meridiem.equals( "AM" ) ) { hours = 0; }
        // Return statement
        return Integer.toString( hours ) + ":" + minutes + ":" + seconds;
    }

    public static void main( String[] args ) {
		Scanner in = new Scanner( System.in );
		
		String s = "12:40:22AM" /* in.next( ) */;

        String result = timeConversion( s );
        System.out.println( result );
    }
}



