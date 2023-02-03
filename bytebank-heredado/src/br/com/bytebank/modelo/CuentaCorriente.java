package br.com.bytebank.modelo;

import br.com.bytebank.test.Tributacion;

public class CuentaCorriente extends Cuenta implements Tributacion {

	public CuentaCorriente() {

	}

	public CuentaCorriente(String agencia, int numero) {
		super(agencia, numero);
	}

	@Override
	public void retirar(double saldo) {
		double comision = 0.2;
		saldo += comision;
		try {
			super.retirar(saldo);
		} catch (SaldoInsuficienteException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void depositar(double saldo) {
		// TODO Auto-generated method stub

	}

	@Override
	public double getValorImpuesto() {
		// TODO Auto-generated method stub
		return 0;
	}
}
