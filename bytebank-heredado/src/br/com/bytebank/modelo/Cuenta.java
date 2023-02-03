package br.com.bytebank.modelo;

import br.com.bytebank.modelo.cliente.Cliente;

/**
 * Cuenta va a crear nuevas instancias de nuevas Corrientes
 * 
 * @version 1.0
 * @author Facundo
 *
 */
public abstract class Cuenta implements Comparable<Cuenta>{

	// public //Accesible desde cualquier parte
	// --default //Accesible dentro del paquete
	// --protected //default + calses hijas (Es parecido al private pero los hijos
	// pueden acceder a el)
	// ---private //Solo desde la clase misma

	protected double saldo;
	private String agencia;
	private int numero;
	private Cliente titular = new Cliente();
	/*
	 * Ésta variable pertenece a la clase, todas las intancias van a apuntar a la
	 * misma dirección en memoria de la variable total
	 */
	private static int total;

	/**
	 * Instancia una nueva cuenta sin parametros
	 */
	public Cuenta() {

	}

	/**
	 * Instancia una nueva cuenta usando agencia y número
	 * 
	 * @param agencia
	 * @param numero
	 */
	public Cuenta(String agencia, int numero) {
		this.agencia = agencia;
		this.numero = numero;
		total++;
	}

	public abstract void depositar(double saldo);

	/**
	 * Éste método retira dinero de la cuenta y si ocurre un error devolver una
	 * excepción
	 * 
	 * @param saldo
	 * @throws SaldoInsuficienteException
	 */
	public void retirar(double saldo) throws SaldoInsuficienteException {
		if (this.saldo < saldo) {
			throw new SaldoInsuficienteException("No tiene saldo");
		}
		this.saldo -= saldo;
	}

	public double transferir(double saldo, Cuenta cuenta) {

		if (this.saldo >= saldo) {
			try {
				this.retirar(saldo);
			} catch (SaldoInsuficienteException e) {
				e.printStackTrace();
			}
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

	@Override
	public String toString() {
		return "{ Cuenta: Agencia," + this.agencia + " Numero, " + this.numero + " Saldo, " + this.saldo + " Titular: "
				+ this.titular.getNombre() + " }";
	}

	/**
	 * @author Facundo
	 * @param obj, recibe como parámetro la clase más generalista y casteamos al
	 *             objeto más generalista de nuestra propia linea de herencia
	 * @return boolean, si ambos objetos son verdaderos devolverá true o lo
	 *         contrario false La lógica de comprobación la implementamos nostros...
	 *         Si no sobreescribimos éste método, la lógica por defecto es.. if(obj
	 *         === this). Es decir; compara las referencias dando la posibilidad de
	 *         tener muchos objetos con diferentes referencias pero con los valores
	 *         de los atributos IGUALES.
	 */
	@Override
	public boolean equals(Object obj) {
		Cuenta cuenta = (Cuenta) obj;
		return this.agencia == cuenta.getAgencia() && this.numero == cuenta.getNumero();
	}
	
	@Override
	public int compareTo(Cuenta o) {
		return Double.compare(this.saldo, o.getSaldo());
	}
}
