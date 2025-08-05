package cursojava.listaExerciciosTres;

import java.util.Scanner;

public class Exerc23 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite um número inteiro: ");

		int n = scan.nextInt();
		int totalDivisoes = 0;

		for (int i = 2; i <= n; i++) {
			int divisores = 0;
			
			for (int f = 1; f <= i; f++) {
				if (i % f == 0) {
					divisores++;
					totalDivisoes++;
				}
			}
			
			if (divisores == 2) {
				System.out.println(i);
			}
		}
		
		System.out.println(totalDivisoes);

		scan.close();

	}

}
