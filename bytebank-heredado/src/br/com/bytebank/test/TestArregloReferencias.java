package br.com.bytebank.test;

import br.com.bytebank.modelo.*;
import br.com.bytebank.modelo.cliente.Cliente;

public class TestArregloReferencias {
	public static void main(String[] args) {
		CuentaCorriente cc = new CuentaCorriente("22", 25); // CC guarda una referencia de memoria donde está alojado
															// los datos

		// [ cc | | | | ] ahora la variable que está en ésta estructura (arreglo) pero
		// áun asi sigue apuntando a la misma referencia en memoria, es decir; no cree
		// ningun objeto nuevo
		Object[] cuentas = new Object[5];

		cuentas[0] = cc;
		
		Cliente cliente = new Cliente();
		cuentas[2] = cliente;
		
		Cliente clienteObtenido = (Cliente) cuentas[2];

		CuentaAhorro ca = new CuentaAhorro("44", 55);

		cuentas[1] = ca;

		/*
		 * ? Guardo la cuentaCorriente guardado en la primera posición del arreglo pero
		 * al estar enmascarado como Cuenta no me dejaba guardar en la variable cuenta
		 * de la clase CuentaCorriente de la línea 28. Aunque la referencia que tenía
		 * era la de una cuenta más generica el no pierde su esencia y puedo ser
		 * casteado de nuevo ... ! Aunque hay que tener en cuenta que no podemos entre
		 * clases hijas si no por ejemplo de clase padre a hija
		 */
		CuentaCorriente cuenta = (CuentaCorriente) cuentas[0];

		System.out.println(cc); // Ambas apuntan a la misma referencia
		System.out.println(cuentas[0]);// Ambas apuntan a la misma referencia

		cuentas[1] = new CuentaCorriente("11", 99);
		System.out.println(cuentas[0].toString()); // Referencia a los datos del objeto de la clase CuentaCorriente en
													// memoria
		System.out.println(cuentas[1].toString());
	}
}
