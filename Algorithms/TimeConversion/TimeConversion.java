



import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;



public class TimeConversion {

    static String timeConversion( String s ) {
        // Parse argument for key figures
        Integer hours = Integer.parseInt( s.substring( 0, 2 ) );
        String minutes = s.substring( 3, 5 );
        String seconds = s.substring( 6, 8 );
        String meridiem = s.substring( 8, 10 );
        // Convert to military time
        if ( !hours.equals( 12 ) && meridiem.equals( "PM" )  ) { hours += 12; }
		if ( hours.equals( 12 ) && meridiem.equals( "AM" ) ) { hours = 0; }
		// Build final hour value as a string
        String result = Integer.toString( hours ) + ":" + minutes + ":" + seconds;
        if ( hours < 10 ) { result = "0" + result; }
		// Return statement
        return result;
    }

    public static void main( String[] args ) {
		/* Scanner in = new Scanner( System.in ); */
		String s = "12:40:22AM" /* in.next( ) */;
		// "07:05:45PM"
		// "12:40:22AM"
        String result = timeConversion( s );
        System.out.println( result );
    }
}


