package intro;

public class Scope {
	public static void main(String[] args) {
		int edad = 18;
		int cantidadPersonas = 2;

		/* (1)
		 * Ésta variable vive dentro del main, porque puede vivir
		 * dentro de otros scope como los if de abajo, 
		 * ésto nos daría error en ellos, porque
		 * estaríamos intentando declarar e inicializar una variable
		 * que tiene el mismo nombre que la de alcance global
		 */
		boolean esPareja = cantidadPersonas > 1;
		
		if (cantidadPersonas > 1) {
			/*
			 *  (3 -->) El alcance de la variable está limítada a "vivir",
			 * dentro de la llave de apertura y cierra del if 
			 * */
			//boolean esPareja = true; /* (2) No podriamos con el mismo nombre que la global */
		} else {
			/*
			 * (3.1 -->)También está fuera de alcance,
			 * sin embargo si lo declaro boolean "esPareja = false;"
			 * pero viviría dentro del scope del else
			 */
			//boolean esPareja = false; /* (2.1) No podriamos con el mismo nombre que la global */
		}
		
		/* (4) "esPareja" está haciendo referencia a la variable global*/
		boolean puedeEntrar = edad >= 18 && esPareja; 
		System.out.println("El valor de la condición es : " + puedeEntrar);
		if (puedeEntrar) {
			System.out.println("Es mayor");
		} else {
			System.out.println("Usted no está permitido entrar");
		}
	}
}
