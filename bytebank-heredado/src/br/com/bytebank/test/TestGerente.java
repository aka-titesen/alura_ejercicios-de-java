package br.com.bytebank.test;
import br.com.bytebank.modelo.*;

public class TestGerente {
	
	public static void main(String[] args) {
		Gerente gerente = new Gerente();
		gerente.setNombre("Gabriel");
		gerente.setDocumento("25713551");
		gerente.setSalario(5000);
		gerente.setClave("password123");
		gerente.iniciarSesion("password123");
		System.out.println(gerente.getBonificacion());
	}
}
