package br.com.bytebank.test;

import java.util.*;

public class TestRepasoArray {
	public static void main(String[] args) {
		int[] numeros = new int[10];
		int numeroPrimitivo = 40;
		//W R A P P E R
		Integer numeroObjeto = 50;
		//Autoboxing
		Integer conversionInteger = Integer.valueOf(numeroPrimitivo);
		List<Integer> lista = new ArrayList();
		/**
		 * Autoboxing, la lista recibe un numero primitivo pero lo convierte al objeto
		 * Integer
		 */
		lista.add(conversionInteger);
		lista.add(numeroObjeto);
		for (Integer numero : lista) {
			System.out.println(numero);
		}
		/**
		 * Unboxing, lo contrario de Autoboxing
		 * */
		int valorPrimitivo = numeroObjeto.intValue();
		byte byteNumero = numeroObjeto.byteValue();
		double doubleNumero = numeroObjeto.doubleValue();
		float floatNumero = numeroObjeto.floatValue();
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.SIZE); //bits
		System.out.println(Integer.BYTES); //bytes
	}
}
