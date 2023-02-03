package br.com.bytebank.modelo;

public class Gerente extends Funcionario implements Autenticable{

	@Override
	public void setClave(String clave) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean iniciarSesion(String clave) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public double getBonificacion() {
		// TODO Auto-generated method stub
		return 0;
	}

}
