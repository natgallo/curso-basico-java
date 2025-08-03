package cursojava.listaExerciciosTres;

import java.util.Scanner;

public class Exerc17 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite um número: ");

		int n = scan.nextInt(); // 5
		int fator = 1; // 5

		for (int i = n; i >= 1; i--) {
			fator = fator * i;
			//fator = 1 * 5
			//fator = 5 * 4
			//fator = 20 * 3
			//fator = 60 * 2
			//fator = 120 * 1

			System.out.println(i);
		}

		System.out.println(fator);

		scan.close();
	}

}
