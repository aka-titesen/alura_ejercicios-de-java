package br.com.bytebank.modelo;

public class ControlBonificacion {
			
	private double suma;
	
	public double registrarSalario(Funcionario funcionario){
		return this.suma = funcionario.getBonificacion() + this.suma;
	}
	
	public double getSuma() {
		return suma;
	}
}
