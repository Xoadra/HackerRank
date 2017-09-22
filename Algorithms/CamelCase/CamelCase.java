



import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class CamelCase {
    
	static boolean isUppercase( String text ) {
		// Uppercase alphabet
		String[ ] upper = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z" };
		// Check for casing
		for ( String letter : upper ) {
			if ( text.equals( letter ) ) { return true; }
			else { continue; }
		}
		// Not capitalized character
		return false;
	}
	
	static int countWords( String words ) {
		// Lowercase alphabet
		/* String[] lower = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z" }; */
		// Word count
		int quant = 1;
		// Quantify words
		for ( int idx = 0; idx < words.length( ); idx++ ) {
			if ( words.substring( idx ) != null && isUppercase( words.substring( idx, idx + 1 ) ) ) {
				quant++;
			}
		}
		// Return statement
		return quant;
	}

	public static void main( String[ ] args ) {
		/* Scanner in = new Scanner( System.in ); */
		String s = "saveChangesInTheEditor";
		int w = countWords( s );
		System.out.println( w );
	}
    
}



