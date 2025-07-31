package cursojava.listaExerciciosDois;

import java.util.Scanner;

public class Exerc16 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o valor de a, b e c:");

		int a = scan.nextInt();

		if (a == 0) {
			System.out.println("Equação não é do segundo grau.");
		} else {
			int b = scan.nextInt();
			int c = scan.nextInt();

			int delta = ((int) Math.pow(b, 2)) - 4 * a * c;

			if (delta < 0) {
				System.out.println("Não existem raízes reais.");
			} else if (delta == 0) {
				double raiz = -b/(2.0*a);
				System.out.println("Existe uma raiz: " + raiz);
			} else {
				double raiz1 = (-b + Math.sqrt(delta))/(2.0 *a);
				double raiz2 = (-b - Math.sqrt(delta))/(2.0 *a);
				System.out.println("Existem duas raizes reais e diferentes: " + raiz1 + " e " + raiz2);
			}

		}

		scan.close();
	}

}
