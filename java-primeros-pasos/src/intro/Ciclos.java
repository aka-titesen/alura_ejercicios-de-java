package intro;
import java.util.Iterator;

public class Ciclos {
	public static void main(String[] args) {
		//While
		int contador= 1;
		while (contador <= 10) { //mientras que (condicion)
			//Ejecuta ésto
			System.out.println(contador);
			contador++;
		}
		//Scope en ciclos
		int count = 1;
		//int total = 0; //Fuera del scope del while, ahora sumaría los números del 1 al 10
		while(count <= 10) {
			int total = 0; //En cada iteración total se establece en cero y luego toma el valor de count
			total += count;
			System.out.println(total);//Devolvera del 1 al 10
			count++;
		}
		//for
		//   Variable (i)   Condicion (i<=10)  ejecuta al terminar una iteración (i++)
		// A partir de la segunda iteración el for obvia la variable contador (i)
		// porque solo necesita declararse e inicializarse una sola vez
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		
	}
}
