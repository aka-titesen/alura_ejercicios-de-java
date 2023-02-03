package br.com.bytebank.test;
import br.com.bytebank.modelo.*;

public class TestReferencia {
	public static void main(String[] args) {
		//Elemento más genérico puede ser adaptado,
		//al elemento más especifico
		Funcionario funcionario = new Gerente();
		funcionario.setNombre("Gabriel");
		funcionario.setDocumento("22446578");
		funcionario.setSalario(2500);
		
		Gerente gerente = new Gerente();
	}
}
