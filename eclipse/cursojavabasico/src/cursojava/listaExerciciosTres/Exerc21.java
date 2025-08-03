package cursojava.listaExerciciosTres;

import java.util.Scanner;

public class Exerc21 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite um número: ");
		int n = scan.nextInt();
		int cont = 0;

		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				cont++;
			}
		}

		if (cont == 2) {
			System.out.println("é primo");
		} else {
			System.out.println("não é primo");
		}

		scan.close();

	}

}
