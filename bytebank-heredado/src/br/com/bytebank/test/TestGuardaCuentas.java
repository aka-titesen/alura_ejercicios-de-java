package br.com.bytebank.test;

import br.com.bytebank.modelo.CuentaCorriente;
import br.com.bytebank.modelo.GuardaCuentas;

public class TestGuardaCuentas {

	public static void main(String[] args) {
		GuardaCuentas guardaCuentas = new GuardaCuentas(); 
		CuentaCorriente cc = new CuentaCorriente("11",22);
		
		guardaCuentas.adicionar(cc);
		
		CuentaCorriente ccObtenida = (CuentaCorriente) guardaCuentas.obtener(0);
		
		System.out.println(ccObtenida.getAgencia());
		

	}

}
