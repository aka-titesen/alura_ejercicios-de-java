package intro;

public class TipoVariable {

	public static void main(String[] args) {
		//TIPOS DE DATOS PRIMITIVOS
		
		//Númericos
		
		//Int
		int edad = 24;
		//Double
		double salario = 1250.50;
		//Operaciones con double
		double salarioMitad = salario/2;
		
		/*
		 En ésta división debería devolver un decimal,
		 pero el valor que guarda el resultado es entero, el redondea el el mismo
		 */
		int division = 1250 / 3;
		
		//long
		long numeroGigante = 500000000000L;
		//short
		short numeroPequenho = 13000;
		//byte
		byte numeroMinusculo = 127;
		//float
		float numeroDecimalMasPequenho = 2.5F;
		
		//Casting
		double variable1 = 230.9;
		//Estamos forzando el casteo pero teniendo en cuenta que se cortarán los decimales
		int variable1Entero = (int) variable1; //Cast
		
		//Cadenas de carácteres
		
		char caracter = 'a'; //Hace referencia a los valores de la tabla ascii
		
		caracter = 65; //Es igual a "a"
		
		//Estamos sumando pero haciendo referencia a la tabla ascii
		caracter = 65+1; //Es igual a "b"
		
		/*
		 Si no forzamos el casteo, 
		 aunque "caracter" es char, 1 es int.
		 y el compilar toma en consideración el número más grande,
		 que es int, y devolverá una suma normal.
		 Nosotros queremos que sume pero para referirse a un valor, 
		 de la table ascii
		 */
		char segundoCaracter = (char) (caracter+1); //Es igual a "c"
		
		//CLASES
		
		String palabra = "hola mundo";
		palabra = palabra + " 2022";
		System.out.println(palabra);
		
		//EJEMPLO DE MANJEJO DE LAS VARIABLES
			
		int numero1 = 5;
		int numero2 = 9;
		
		System.out.println(numero2); //Imprime 9
		
		numero2 = numero1; //Asigno el valor de numero1 a numero2
		System.out.println(numero2); //Imprime 5
		
		numero1 = 88; //Asigno el valor 88 a numero1
		//numero2 = ???
		
		/*
		 * En algunos lenguajes de programacion se basan mucho,
		 * en lo que son punteros, en donde la variable no apunto al valor, 
		 * sino a la dirección en memoria de la variable. 
		 * En el caso de Java las variables reciben el valor
		 * */
		
		}
	}

