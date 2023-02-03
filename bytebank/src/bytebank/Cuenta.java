package bytebank;

public class Cuenta {
	private double saldo;
	private String agencia;
	private int numero;
	private Cliente titular = new Cliente();
	/*
	 * Ésta variable pertenece a la clase, 
	 * todas las intancias van a apuntar a la misma dirección en memoria de la variable total
	 */
	private static int total; 
	
	public Cuenta() {
		total++;
	}

	public Cuenta(double saldo, String agencia, int numero, Cliente titular) {
		super();
		this.saldo = saldo;
		this.agencia = agencia;
		this.numero = numero;
		this.titular = titular;
		total++;
	}
	
	void depositar(double saldo) {
		this.saldo += saldo;
	}
	double retirar(double saldo) {
		if (this.saldo >=saldo) {
			this.saldo -= saldo;
			return saldo;
		}
		return 0;
	}
	double transferir(double saldo, Cuenta cuenta) {

		if(this.saldo >= saldo) {
			this.saldo -= saldo;
			cuenta.depositar(saldo);
		}
		return saldo;
	}
	
	public double getSaldo() {
		return saldo;
	}
	public String getAgencia() {
		return agencia;
	}
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public Cliente getTitular() {
		return titular;
	}
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}	
	public static int getTotal() {
		return Cuenta.total;
	}
}
