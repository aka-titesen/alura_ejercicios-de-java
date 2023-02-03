package bytebank;

public class pruebaMetodos {
	public static void main(String[] args) {
		Cuenta miCuenta = new Cuenta();
		miCuenta.depositar(500);
		miCuenta.retirar(250);
		System.out.println("Saldo en mi cuenta " + miCuenta.getSaldo());
		
		Cuenta cuentaDeJimena = new Cuenta();
		cuentaDeJimena.depositar(100000);
		System.out.println("Saldo en la cuenta de Jimena " + cuentaDeJimena.getSaldo());
		cuentaDeJimena.transferir(10000, miCuenta);
		System.out.println("Luego de la transferencia");
		System.out.println("Saldo en mi cuenta " + miCuenta.getSaldo());
		System.out.println("Saldo en la cuenta de Jimena " + cuentaDeJimena.getSaldo());

		Cliente diego = new Cliente();
		diego.setNombre("Diego");
		diego.setDocumento("40807581");
		diego.setTelefono("11237468101");

		Cuenta cuentaDiego = new Cuenta();
		cuentaDiego.setAgencia("01");
		cuentaDiego.setNumero(001133);
		cuentaDiego.depositar(60000);
		cuentaDiego.setTitular(diego);
		
		System.out.println("Total de cuentas " + Cuenta.getTotal());

		System.out.println(cuentaDiego.getTitular());
	}
}
