package bytebank;

public class main {
	public static void main(String[] args) {
		//   Variable | Valor
		// A la derecha es la representación o referencia del valor y a la izquierda el mismo
		// El statement new Cuenta(); crea un nuevo espacio en la memoria con el valor de new Cuenta();
		// cuenta es una referencia al lugar en la memoria
		// Cada vez que creamos un nuevo objeto en la memoria de JAVA, el le asigno un id automaticamente que es alfanúmerico
		// Variable var = new Variable();
		// var		-->		id = 12345ACDFG
		// No significa que estamos guardando el valor de la cuenta dentro de la variable 
		// En Java una variable es una referencia a un lugar en la memoria donde está el valor
		Cuenta primeraCuenta = new Cuenta();
		primeraCuenta.depositar(400);
		
		Cuenta segundaCuenta = new Cuenta();
		segundaCuenta.depositar(400);
		
		if (primeraCuenta == segundaCuenta) {
			System.out.println("Si son iguales, id de primeraCuenta: " + primeraCuenta + " - id de segundaCuenta: " + segundaCuenta);
		} else {//En éste caso entraría en el else, ya que el id del espacio en memoria que apuntan ambas variables es diferente
			System.out.println("No son iguales, id de primeraCuenta: " + primeraCuenta + " - id de segundaCuenta: " + segundaCuenta);
		}
		//Java solo compara el id de ambos objetos, es decir aunque hayan objetos con la misma información adentro pero con diferentes id, es decir; con diferentes espacios en memoria para Java serán iguales.
		//Logicamente hay otras opciones para comparar objetos
	}
}
