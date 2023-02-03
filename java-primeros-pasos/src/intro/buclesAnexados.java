package intro;

public class buclesAnexados {
	public static void main(String[] args) {
		for (int i = 0; i <= 10; i++) {
			for (int j = 0; j <= 10; j++) {
				if (j == 0) {
					System.out.println("La tabla del " + i);
				}
				System.out.print(i + " * " + j + " = " + (i * j) + " | ");
			}
			System.out.println();
		}
	}
}
