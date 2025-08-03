package cursojava.listaExerciciosTres;

import java.util.Scanner;

public class Exerc14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int pares = 0;
		int impares = 0;

		for (int i = 1; i <= 10; i++) {
			System.out.println("Digite números: ");

			int numero = scan.nextInt();

			if (numero % 2 != 0) {
				impares++;
			} else {
				pares++;
			}
		}

		System.out.println("Impares: " + impares);
		System.out.println("Pares: " + pares);

		scan.close();

	}

}
