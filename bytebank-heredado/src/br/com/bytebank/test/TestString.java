package br.com.bytebank.test;

public class TestString {
	public static void main(String[] args) {
		String nombre = "Facundo";
		char soloUno = 0;
		int indice = 0;

		/**
		 * ! Todo String es inmutable, no se puede cambiar una vez creado, si en todo
		 * caso queremos tenemos que reasignarlo, es decir; se volverá a crear con
		 * nuevos valores, el espacio en memoria se elimina para cargarse la misma
		 * variable con otros datos
		 */
		System.out.println("Antes de los metodos: " + nombre);
		nombre = nombre.replace("a", "e");
		nombre = nombre.concat(" Nicolas Gonzalez");
		nombre = nombre.toUpperCase();
		nombre = nombre.toLowerCase();
		soloUno = nombre.charAt(0);
		indice = nombre.indexOf("n");
		print("Despues de los metodos : " + nombre);
		print("Solo Uno: " + soloUno);
		print("Número del indice de la letra n: " + indice);
	}
	
	public static void print(Object valor) {
		System.out.println(valor);
	}
}
