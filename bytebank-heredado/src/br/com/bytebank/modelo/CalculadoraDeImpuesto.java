package br.com.bytebank.modelo;
import br.com.bytebank.test.Tributacion;

public class CalculadoraDeImpuesto {
	private double totalImpuesto;

	public void registrar(Tributacion t) {
		double valor = t.getValorImpuesto();
		this.totalImpuesto += valor;
	}

	public double getTotalImpuesto() {
		return totalImpuesto;
	}
}
