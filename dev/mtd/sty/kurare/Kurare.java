package dev.mtd.sty.kurare;

import java.lang.Number;

// Just nice class
public class Kurare {
	public static final String MESSAGE = "Ok";
	
	public static void main (String [] args) {
		pr ( MESSAGE );
	}
	
	public static void pr ( String message ) {
		System .out .println ( message );
	}
	
	public static void pr ( Number i ) {
		System .out .println ( i );
	}
	
	public static void pr ( Object o ) {
		System .out .println ( o );
	}
}