package bytebank;

public class TestReferencia {
	
	public static void main(String[] args) {
		Cuenta primeraCuenta = new Cuenta(); // Crea un nuevo espacio en memoria y primeraCuenta apunto a ella
		primeraCuenta.depositar(200d);
		
		Cuenta segundaCuenta = primeraCuenta; // segundaCuenta también apuntará el mismo espacio en memoria
		segundaCuenta.depositar(100d);
		
		//Tanto si hago cambios en primeroCuenta o segundaCuenta va a hacer cambios al mismo espacio de memoria, ya que las variables apuntan al mismo
		
		System.out.println("Primera cuenta: " + primeraCuenta.getSaldo());
		System.out.println("Segundo cuenta: " + segundaCuenta.getSaldo());
		
		System.out.println("Primera cuenta: " + primeraCuenta.getSaldo());
		System.out.println("Segundo cuenta: " + segundaCuenta.getSaldo());
		
		if (primeraCuenta == segundaCuenta) {//En éste caso entraría en el else, ya que el id del espacio en memoria que apuntan ambas variables es la misma
			System.out.println("Si son iguales, id de primeraCuenta: " + primeraCuenta + " - id de segundaCuenta: " + segundaCuenta);
		} else {
			System.out.println("No son iguales, id de primeraCuenta: " + primeraCuenta + " - id de segundaCuenta: " + segundaCuenta);
		}
		
	}
	
}
