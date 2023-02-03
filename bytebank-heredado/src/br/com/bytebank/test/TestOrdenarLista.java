package br.com.bytebank.test;

import br.com.bytebank.modelo.*;
import br.com.bytebank.modelo.cliente.Cliente;

import java.util.*;

public class TestOrdenarLista {

	public static void main(String[] args) {
		CuentaCorriente cc = new CuentaCorriente();
		Cliente c = new Cliente();
		c.setNombre("Wilhem Hartmann");
		cc.setTitular(c);
		cc.setNumero(30);
		cc.depositar(10000);
		CuentaAhorro ca = new CuentaAhorro();
		Cliente c1 = new Cliente();
		c1.setNombre("Federico Ordenex");
		ca.setTitular(c1);
		ca.setNumero(15);
		ca.depositar(5000);
		CuentaCorriente cc2 = new CuentaCorriente();
		Cliente c2 = new Cliente();
		c2.setNombre("Erika Miralles");
		cc2.setTitular(c2);
		cc2.setNumero(10000);
		cc2.depositar(6000);
		CuentaAhorro ca2 = new CuentaAhorro();
		Cliente c3 = new Cliente();
		c3.setNombre("Gabriel Lo Celso");
		ca2.setTitular(c3);
		ca2.setNumero(400);
		ca2.depositar(3000);

		List<Cuenta> cuentas = new ArrayList();
		cuentas.add(cc);
		cuentas.add(ca);
		cuentas.add(cc2);
		cuentas.add(ca2);

		System.out.println("Antes de ordenar");
		for (Cuenta cuenta : cuentas) {
			System.out.println(cuenta);
		}
		// FORMA ACTUAL DE ORDENAR
		// Ordenar las cuentas
		// Interface - Cualquier clase hija de Cuenta
		// Comparator <? extend Cuenta> c
		cuentas.sort(new OrdenadorPorNumeroCuenta());
		System.out.println();
		System.out.println("Despues de ordenar numero de cuenta");
		for (Cuenta cuenta : cuentas) {
			System.out.println(cuenta);
		}
		cuentas.sort(new OrdenadorPorNombreTitular());
		System.out.println();
		System.out.println("Despues de ordenar titular de cuenta");
		for (Cuenta cuenta : cuentas) {
			System.out.println(cuenta);
		}
		/*
		 * FUNCION ANONIMA
		 * 
		Collections.sort(new Comparator<Cuenta>() {
			@Override
			public int compare(Cuenta o1, Cuenta o2) {
				return o1.getAgencia().compareTo(o1.getAgencia());
			}
		});
		
		Collections.sort(cuentas, new Comparator<Cuenta>() {
			@Override
			public int compare(Cuenta o1, Cuenta o2) {
				return o1.getTitular().getNombre().compareTo(o2.getTitular().getNombre());
			}
		});
		*/
		// FORMA ANTIGUA DE ORDENAR
		/*
		 * Implementamos la interface Comparable en Cuenta, e sobreescribmos el método
		 * CompareTo y le establecimos como lógica de ordenamiento por saldo
		 */
		System.out.println();
		System.out.println("Después de ordenar por saldo de cuenta con el metodo antiguo");
		Collections.sort(cuentas);
		for(Cuenta cuenta : cuentas) {
			System.out.println(cuenta);
		}
	}
}

class OrdenadorPorNumeroCuenta implements Comparator<Cuenta> {

	public OrdenadorPorNumeroCuenta() {

	}

	@Override
	public int compare(Cuenta o1, Cuenta o2) {

		/*
		 * FORMA BASICA if (o1.getNumero() == o2.getNumero()) { return 0; } else if
		 * (o1.getNumero() > o2.getNumero()) { return 1; } else { return -1; }
		 */

		/*
		 * FORMA INTERMEDIA return o1.getNumero() - o2.getNumero();
		 */
		// FORMA WRAPPER
		return Integer.compare(o1.getNumero(), o2.getNumero());
	}

}

class OrdenadorPorNombreTitular implements Comparator<Cuenta> {

	@Override
	public int compare(Cuenta o1, Cuenta o2) {
		return o1.getTitular().getNombre().compareTo(o2.getTitular().getNombre());
	}

}
