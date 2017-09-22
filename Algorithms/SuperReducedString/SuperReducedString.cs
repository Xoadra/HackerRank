



using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;


namespace SuperReducedString {

	class SuperReducedString {

		static string superReducedString( string depair ) {
			// Placeholder reduced string
			string unpair = "";
			System.Console.WriteLine(  );
			// Building reduced string
			for ( int idx = 0; idx < depair.Length; idx++ ) {
				System.Console.WriteLine( idx );
				if ( idx + 1 < depair.Length && depair[ idx ] == depair[ idx + 1 ] ) { idx++; }
				else { unpair += depair[ idx ]; }
			}
			// Verifying reduced string
			for ( int idx = 0; idx < unpair.Length - 1; idx++ ) {
				if ( unpair[ idx ] == unpair[ idx + 1 ] ) { unpair = superReducedString( unpair ); }
			}
			// Return statement cases
			System.Console.WriteLine(  );
			if ( unpair.Length == 0 ) { return "Empty String"; }
			else { return unpair; }
		}

		static void Main( String[ ] args ) {
			/* string s = Console.ReadLine( ); */
			string s = "baab";
			//"aaabccddd"
			string result = superReducedString( s );
			Console.WriteLine( result );
			System.Console.WriteLine(  );
		}

	}
	
}



