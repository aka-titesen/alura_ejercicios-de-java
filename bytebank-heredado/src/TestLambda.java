import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.bytebank.modelo.Cuenta;
import br.com.bytebank.modelo.CuentaAhorro;
import br.com.bytebank.modelo.CuentaCorriente;
import br.com.bytebank.modelo.cliente.Cliente;

public class TestLambda {

	public static void main(String[] args) {
		/**
		 * ? Las intefaces funcionales suelen traer métodos 
		 * implementados en la misma interfaz y ésta solo 
		 * puede tener un método default, el método puede
		 * ser sobreescrito pero por "default" la interfaz
		 * ya tiene la implementación
		 * */
		 
		CuentaCorriente cc = new CuentaCorriente();
		Cliente c = new Cliente();
		c.setNombre("Wilhem Hartmann");
		cc.setTitular(c);
		cc.setNumero(30);
		cc.depositar(10000);
		CuentaAhorro ca = new CuentaAhorro();
		Cliente cl1 = new Cliente();
		cl1.setNombre("Federico Ordenex");
		ca.setTitular(cl1);
		ca.setNumero(15);
		ca.depositar(5000);
		CuentaCorriente cc2 = new CuentaCorriente();
		Cliente cl2 = new Cliente();
		cl2.setNombre("Erika Miralles");
		cc2.setTitular(cl2);
		cc2.setNumero(10000);
		cc2.depositar(6000);
		CuentaAhorro ca2 = new CuentaAhorro();
		Cliente cl3 = new Cliente();
		cl3.setNombre("Gabriel Lo Celso");
		ca2.setTitular(cl3);
		ca2.setNumero(400);
		ca2.depositar(3000);

		List<Cuenta> cuentas = new ArrayList();
		cuentas.add(cc);
		cuentas.add(ca);
		cuentas.add(cc2);
		cuentas.add(ca2);
		//Lambda
		/*
		 * Forma 1
		cuentas.sort((Cuenta o1, Cuenta o2) -> {
			return Integer.compare(o1.getNumero(), o2.getNumero());
		});
		
		* Forma 2
		cuentas.sort((o1,o2) -> 
			 Integer.compare(o1.getNumero(), o2.getNumero())
		);
		* Forma 3
		Collections.sort(cuentas,(c1,c2) ->
		 c1.getTitular().getNombre()
		 .compareTo(c2.getTitular().getNombre())
	);
		 */
		
		cuentas.forEach(cuenta -> System.out.println(cuenta));

	}

}
