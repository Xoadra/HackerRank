



import java.io.*;
import java.util.*;


public class CaesarCipher {
    
    static String encryptToCipher( String encrypt, int rotate ) {
        // Key characters for encryption
        String[ ] upper = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z" };
        String[ ] lower = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z" };
        String cipher = "";
        // Convert unencrypted string to cipher
        for ( int idx = 0; idx < encrypt.length( ); idx++ ) {
            // Iteration variable placeholders 
            String text = encrypt.substring( idx );
            int shift = 0;
            // Verify character conversion method if necessary
            if ( upper.contains( text ) ) {
                int original = upper.indexOf( text );
                if ( original + rotate > 25 ) { shift = Math.addExact( original, rotate ) - 25; }
                else { shift = original + rotate; }
                cipher = cipher + upper[ shift ];
            }
            else if ( lower.contains( text ) ) {
                int original = lower.indexOf( text );
                if ( original + rotate > 25 ) { shift = Math.addExact( original, rotate ) - 25; }
                else { shift = original + rotate; }
                cipher = cipher + lower[ shift ];
            }
            else { continue; }
        }
        // Return statement
        return cipher;
    }

    public static void main( String[ ] args ) {
        //Scanner in = new Scanner( System.in );
		int n = 11;
		String s = "middle-Outz";
		int k = 2;
		/* StringBuffer sb = new StringBuffer(str); */
        String result = encryptToCipher( s, k );
        System.out.println( result );
    }
    
}



