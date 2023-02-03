package br.com.bytebank.test;
import br.com.bytebank.modelo.*;

public class TestControlBonoficacion {
	public static void main(String[] args) {

		Gerente gerente = new Gerente();
		gerente.setSalario(5000);
		
		Contador contador = new Contador();
		contador.setSalario(5000);
		
		ControlBonificacion cb = new ControlBonificacion();
		cb.registrarSalario(gerente);
		cb.registrarSalario(contador);
		
		System.out.println("Salario total de los funcionario: " + cb.getSuma());
	}
}
