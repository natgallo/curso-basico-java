package cursojava.listaExerciciosTres;

import java.util.Scanner;

public class Exerc20 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite quantas vezes quer descobrir o fatorial de um número: ");
		int qtd = scan.nextInt();

		for (int i = 1; i <= qtd; i++) {
			System.out.println("Digite um número para descobrir seu fatorial: ");
			int n = scan.nextInt(); // 5

			if (n >= 16 || n < 0) {
				System.out.println("Número negativo ou maior ou igual a 16 não é válido, digite outro.");

			} else {
				int fator = 1; // 5

				for (int cont = n; cont >= 1; cont--) {
					fator = fator * cont;
					// fator = 1 * 5
					// fator = 5 * 4
					// fator = 20 * 3
					// fator = 60 * 2
					// fator = 120 * 1

					System.out.println(cont);
				}

				System.out.println(fator);
			}
		}

		scan.close();
	}

}
