



using System;
using System.Collections.Generic;
using System.IO;


class QueueUsingTwoStacks {
    
	static void Main( String[] args ) {
		Pile enq = new Pile( );
		Pile deq = new Pile( );
		//string s = Console.ReadLine( );
		System.Console.WriteLine( "g" );
	}
	
}


class Node {
    
	// Attributes
	public int data { get; set; }
	public Node up { get; set; }

	// Constructor
	public Node( int data ) {
		this.data = data;
	}
    
}


// Pseudo stack implemention
class Pile {
    
	// Attributes
	private Node top { get; set; } 

	// Constructor
	public Pile(  ) {
		
	}

	// Methods
	public void insert( int val ) {
		Node node = new Node( val );
	}

	public Node delete(  ) {
		return new Node( 6 );
	}
    
}



