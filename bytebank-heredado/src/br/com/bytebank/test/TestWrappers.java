package br.com.bytebank.test;

public class TestWrappers {
	public static void main(String[] args) {
		Double numeroDouble = 33.0; //Autoboxing
		Boolean verdadero = true;
		
		Double numeroDouble2 = Double.valueOf(33);
		
		String numeroString = "43"; //Autoboxing
		Double stringToDouble = Double.valueOf(numeroString);
		Integer stringToInteger = Integer.valueOf(numeroString);
		
		Number numero = Integer.valueOf(5);
		double numeroDoublePrim = numero.doubleValue(); //Unboxing
		
		Boolean falso = Boolean.FALSE;
		
	}
}
