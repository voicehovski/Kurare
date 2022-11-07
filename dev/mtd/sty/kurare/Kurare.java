package dev.mtd.sty.kurare;

// Just nice class
public class Kurare {
	public static final String MESSAGE = "Ok";
	
	public static void main (String [] args) {
		pr ( MESSAGE );
	}
	
	public static void pr ( String message ) {
		System .out .println ( message );
	}
	
	public static void pr ( int i ) {	// Do we need this method
		System .out .println ( i );
	}
	
	public static void pr ( Object o ) {
		System .out .println ( o );
	}
}