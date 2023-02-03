package br.com.bytebank.test;

public class testMain {

	public static void main(String[] args) {

		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}

		// [ 0 | 1 | 2 | 3 | 4 ].length --> 5
		int[] edades = new int[5];
		edades[0] = 20;
		edades[1] = 21;
		edades[2] = 22;
		edades[3] = 23;
		edades[4] = 24;
		int tamanho = edades.length;

		for (int i = 0; i < edades.length; i++) {
			int elemento = edades[i];
			if (i == edades.length - 1) {
				System.out.print(elemento);
			} else {
				System.out.print(elemento + ", ");
			}
		}
		//[]
	}
}