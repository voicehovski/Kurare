// Нужно указывать полное имя пакета даже внутри иерархии. Относительные имена?
package dev.mtd.sty.kurare.feature_uno;

public class Uno {
	public static final String TEMPLATE = "[%d]";
	
	public String action (int i) {
		return String .format ( TEMPLATE, i );
	}
}