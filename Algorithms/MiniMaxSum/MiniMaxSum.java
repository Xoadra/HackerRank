



import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;



public class MiniMaxSum {

	public static void main( String[] args ) {
		Scanner in = new Scanner(System.in);
		int[] arr = new int[5];
		//for( int idx = 0; idx < 5; idx++ ) { arr[idx] = in.nextInt(); }
		arr[0] = 5;
		arr[1] = 5;
		arr[2] = 5;
		arr[3] = 5;
		arr[4] = 5;
		getMinMaxSums( arr );
	}
	
	public static void getMinMaxSums( int[] ints ) {
		// Aggregated sums
		long[] sums = new long[ints.length];
		// Omitted number
		long omit = 0;
		// Min and max values
		Long min = null;
		Long max = null;
		// Generating sums
		for ( int idx = 0; idx < ints.length; idx++ ) {
            for ( int val = 0; val < ints.length; val++ ) {
                if ( idx != val ) { sums[idx] += ints[val]; }
			}
        }
		// Determine min and max sums
		for ( long num : sums ) {
			if ( min == null || min >= num ) { min = num; }
			if ( max == null || max <= num ) { max = num; }
		}
		// Print sums
		System.out.println( min + " " + max );
	}
	
}



