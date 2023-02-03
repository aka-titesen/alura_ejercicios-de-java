package br.com.bytebank.modelo;

public class CuentaAhorro extends Cuenta {

	public CuentaAhorro() {

	}

	public CuentaAhorro(String agencia, int numero) {
		super(agencia, numero);
	}

	@Override
	public void depositar(double saldo) {
		this.saldo += saldo;
	}

}
