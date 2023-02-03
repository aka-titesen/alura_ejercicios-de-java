package intro;
import java.util.Scanner;

public class Palindromo {

	public static void main(String[] args) {
		System.out.print("Ingresa una palabra: ...");
		Scanner sc = new Scanner(System.in);
		String palabra = sc.nextLine();
		boolean resultado = esPalindromo(palabra);
		if (resultado) {
			System.out.println("Con metodos | " + palabra + " es Palindromo");
		} else {
			System.out.println("Con metodos | " + palabra + " no es Palindromo");
		}

		resultado = esPalindromoLogica(palabra);
		if (resultado) {
			System.out.println("Con logica | " + palabra + " es Palindromo");
		} else {
			System.out.println("Con logica | " + palabra + " no es Palindromo");
		}
		
		resultado = esPalindromoRecursivo(palabra, 0, palabra.length()-1);
		
		if (resultado) {
			System.out.println("Con recursividad | " + palabra + " es Palindromo");
		} else {
			System.out.println("Con recursividad | " + palabra + " no es Palindromo");
		}
	}

	public static boolean esPalindromo(String palabra) {
		String palabraInversa = new StringBuilder(palabra).reverse().toString();
		return palabra.equalsIgnoreCase(palabraInversa);
	}

	public static boolean esPalindromoLogica(String palabra) {
		int izquierda = 0;
		int derecha = palabra.length() - 1;
		while (izquierda < derecha) {
			if (palabra.charAt(izquierda) != palabra.charAt(derecha)) {
				return false;
			}
			izquierda++;
			derecha--;
		}
		return true;
	}
	
	public static boolean esPalindromoRecursivo(String palabra, int izquierda, int derecha) {
	    if (izquierda >= derecha) {
	        return true;
	    }
	    if (palabra.charAt(izquierda) != palabra.charAt(derecha)) {
	        return false;
	    }
	    return esPalindromoRecursivo(palabra, izquierda + 1, derecha - 1);
	}


	/*
	 * StringBuilder es una clase en Java que proporciona métodos para trabajar con
	 * cadenas de caracteres. Es una clase mutable, lo que significa que puedes
	 * modificar su contenido mediante métodos como append(), insert(), delete(),
	 * replace(), etc. Algunas de las principales ventajas de utilizar StringBuilder
	 * en lugar de String son: Puedes modificar el contenido de un objeto
	 * StringBuilder sin tener que crear uno nuevo cada vez. StringBuilder es más
	 * eficiente para realizar muchas operaciones de concatenación, ya que no crea
	 * un nuevo objeto en cada operación. StringBuilder es recomendado para
	 * aplicaciones multihilos, ya que es seguro para usar en entornos * multihilos.
	 * Algunos ejemplos de uso de StringBuilder incluyen:
	 * 
	 * 1) Concatenando varias cadenas de caracteres:
	 * 
	 * StringBuilder sb = new StringBuilder(); 
	 * sb.append("Hello"); 
	 * sb.append(" ");
	 * sb.append("world!"); 
	 * System.out.println(sb.toString()); // imprime "Hello world!"
	 * 
	 * 2) Insertando un caracter o cadena en una posición específica:
	 * 
	 * StringBuilder sb = new StringBuilder("Hello"); 
	 * sb.insert(5, " world!");
	 * System.out.println(sb.toString()); // imprime "Hello world!"
	 *
	 * 3) Reemplazando un rango de caracteres:
	 * 
	 * StringBuilder sb = new StringBuilder("Hello world!"); 
	 * sb.replace(0, 5, "Hi");
	 * System.out.println(sb.toString()); // imprime "Hi world!"
	 * 
	 * 4) Invertiendo el orden de los caracteres:
	 * 
	 * StringBuilder sb = new StringBuilder("Hello world!"); 
	 * sb.reverse();
	 * System.out.println(sb.toString()); // imprime "!dlrow olleH"
	 */

}
