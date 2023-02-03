package br.com.bytebank.test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import br.com.bytebank.modelo.Cuenta;
import br.com.bytebank.modelo.CuentaCorriente;
import br.com.bytebank.modelo.cliente.Cliente;

public class TestArrayList {
	public static void main(String[] args) {
		List<Cliente> listClientes = new LinkedList<>();
				
		List<Cuenta> list = new ArrayList<>();

		// Referencia Objeto --> HEAP
		// [cc, cc2] --> Referencias
		// cc3 no está en la lista
		Cuenta cc = new CuentaCorriente("11", 22);
		Cuenta cc2 = new CuentaCorriente("13", 42);
		/*
		 * (1) Desde el punto de vista del negocio, si creo una cuenta con el mismo
		 * numero de agencia y de cuenta ES LA MISMA CUENTA. ¿Cierto?. Pero para Java
		 * será otro objeto aunqué los valores de sus atributos sean iguales a otro. ?
		 * ¿CÓMO HACEMOS PARA QUE JAVA COMPARE LOS VALORES DE LOS ATRIBUTOS DE LOS
		 * OBJETOS?
		 */
		Cuenta cc3 = new CuentaCorriente("11", 22);

		list.add(cc);
		list.add(cc2); // Fijense que no cc3 a la lista

		Cliente cliente = new Cliente();

		Cuenta obtenerCuenta = (Cuenta) list.get(0);

		for (Cuenta cuenta : list) {
			System.out.println(cuenta);
		}

		/**
		 * Contains usa por defecto el método equal y su lógica para hacer las
		 * comprobaciones entre objetos, si no sobreescribimos el método por defacto
		 * comparará por referencia, es decir que podremos muchos objetos con los mismos
		 * valores de atributoss
		 */
		boolean contiene = list.contains(cc3);

		if (contiene) {
			System.out.println("Si contiene");
		}
	}
}
