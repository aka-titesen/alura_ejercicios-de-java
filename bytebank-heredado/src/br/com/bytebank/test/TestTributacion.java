package br.com.bytebank.test;
import br.com.bytebank.modelo.*;

public class TestTributacion {

	public static void main(String[] args) {
		CuentaCorriente cc = new CuentaCorriente("222", 333);
        cc.depositar(100.0);

        SeguroDeVida seguro = new SeguroDeVida();

        CalculadoraDeImpuesto calc = new CalculadoraDeImpuesto();

        calc.registrar(cc);
        calc.registrar(seguro);

        System.out.println(calc.getTotalImpuesto());
	}

}
