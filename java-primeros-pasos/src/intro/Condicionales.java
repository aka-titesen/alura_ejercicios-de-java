package intro;

public class Condicionales {
	public static void main(String[] args) {
		int edad = 24;
		/*
		 * Si la condicional va a ejecutar una sola línea de código, podemos obviar las
		 * llaves
		 */
		if (edad >= 18)
			System.out.println("Es mayor");
		// Mejoras
		int edad2 = 18;
		int cantidadPersonas = 2;
		boolean esPareja = cantidadPersonas > 1;
		boolean puedeEntrar = edad2 >= 18 && esPareja;
		/*
		 * Si la condicional va a ejecutar una sola línea de código, podemos obviar las
		 * llaves
		 */
		if (puedeEntrar) {
			System.out.println("Es mayor");
		} else {
			System.out.println("Usted no está permitido entrar");
		}
	}
}
