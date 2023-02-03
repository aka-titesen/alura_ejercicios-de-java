package br.com.bytebank.modelo;

public class SistemaInterno {
	private String clave = "12345";
	
	public boolean autenticar(Gerente gerente) {
		boolean puedeIniciarSesion = gerente.iniciarSesion(clave);
		if(puedeIniciarSesion) {
			System.out.println("Login");
			return true;
		}
		System.out.println("Error");
		return false;
	}
}
