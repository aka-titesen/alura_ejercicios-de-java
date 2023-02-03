package intro;
import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		System.out.print("Ingrese un numero para calcular su factorial: ...");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int resultado = factorial(num);
		System.out.println("Funcion de factorial de manera iterativa " + resultado); 
		resultado = factorialRecursiva(num); 
		System.out.println("Funcion de factorial de manera recursiva " + resultado);
	}
	public static int factorial(int n) {
	    int result = 1;
	    for (int i = 1; i <= n; i++) {
	        result *= i;
	    }
	    return result;
	}
	public static int factorialRecursiva(int n) {
	    if (n == 0) {
	        return 1;
	    }
	    return n * factorialRecursiva(n - 1);
	}
}
