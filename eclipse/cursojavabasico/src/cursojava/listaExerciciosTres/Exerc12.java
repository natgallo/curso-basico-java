package cursojava.listaExerciciosTres;

import java.util.Scanner;

public class Exerc12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite um número de 1 a 10.");

		int n = scan.nextInt();
		int tabuada = 0;

		System.out.println("Tabuada de " + n);
		for (int i = 1; i <= 10; i++) {
			tabuada = n * i;
			System.out.println(n + " X " + i + " = " + tabuada);
		}

		scan.close();

	}

}
