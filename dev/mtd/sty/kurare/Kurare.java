package dev.mtd.sty.kurare;

import java.lang.Number;
import dev.mtd.sty.kurare.feature_uno.Uno;

public class Kurare {
	public static final String MESSAGE = "Ok";
	
	public static void main (String [] args) {
		pr ( MESSAGE );
		pr ( new Uno (  ) .setTemplate ( "#%d#" ) .action ( 444 ) );
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