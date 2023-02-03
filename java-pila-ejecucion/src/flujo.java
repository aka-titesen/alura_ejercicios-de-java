public class flujo {
	public static void main(String[] args) {
		System.out.println("Inicio main");
		metodo1();
		System.out.println("Fin main");
	}

	private static void metodo1() {
		System.out.println("Inicio metodo1");
		try {
			metodo2();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Fin de metodo1");
	}

	private static void metodo2() throws MiException {
		// System.out.println("Inicio metodo2");
		// System.out.println("Fin metodo2");
		int num = 5 / 0; // Excepcion no verificada, dará ArithmeticException
		Cuenta c = null; // Excepción no verificada, dará NullPointerException
		c.depositar(); // -->
		/*
		 * for (int i = 0; i <= 5; i++) { System.out.println(i); try { if (i == 3) { int
		 * num = 0; int resultado = i / num; System.out.println(resultado); } String
		 * palabra = null; System.out.println(palabra.toString()); } catch
		 * (ArithmeticException | NullPointerException e) {
		 * System.out.println("Atrapé una excepcion");
		 * System.out.println(e.getMessage()); e.printStackTrace(); } }
		 */
	}
}
