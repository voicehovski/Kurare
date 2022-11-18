// Нужно указывать полное имя пакета даже внутри иерархии. Относительные имена?
package dev.mtd.sty.kurare.feature_uno;

public class Uno {
	public static final String TEMPLATE = "[%d]";
	
	private String template;
	
	public Uno ( String template ) {
		this .template  = template;
	}
	
	public Uno (  ) {
		this .template = TEMPLATE;
	}
	
	public String action (int i) {
		return String .format ( template, i );
	}
}