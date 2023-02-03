package br.com.bytebank.modelo;
import br.com.bytebank.test.Tributacion;

public class SeguroDeVida implements Tributacion{

	@Override
	public double getValorImpuesto() {
		return 0;
	}

}
