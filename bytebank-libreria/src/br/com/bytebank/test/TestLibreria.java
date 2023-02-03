package br.com.bytebank.test;

import br.com.bytebank.modelo.*;

/**
 * Exporté como jar otro proyecto y lo coloqué en una carpeta lib en éste
 * proyecto, selecciona el jar y le di build path, el buildpath, es el conjunto
 * de librerias que usa java para compilar el proyecto, es decir; es la ruta de
 * construcción, entonces, necesitamos agregar el jar a la misma. Una vez hecho
 * el proyecto tendrá como referencia al jar
 * @author Facundo
 */

public class TestLibreria {
	public static void main(String[] args) {
		Cuenta cuenta = new CuentaCorriente("12", 12);
	}
}
