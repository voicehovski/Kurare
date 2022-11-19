// Нужно указывать полное имя пакета даже внутри иерархии. Относительные имена?
package dev.mtd.sty.kurare.feature_uno;

public class Uno {
	public static final String TEMPLATE = "[%d]";
	
	// Не знаю зачем такие сложности, но пусть будет
	private String template = TEMPLATE;
	
	public Uno ( String template ) {
		this .template  = template;
	}
	
	public Uno (  ) {
		
	}
	
	public Uno setTemplate ( String template ) {
		this .template = template;
		return this;
	}
	
	public String action (int i) {
		return String .format ( template, i );
	}
	
	public String getTemplate (  ) {
		return template;
	}
}