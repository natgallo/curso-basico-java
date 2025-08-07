package cursojava.listaExerciciosTres;

import java.util.Scanner;

public class Exerc34 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite um número para ser multiplicado.");

		int n = scan.nextInt();

		System.out.println("Começar por: ");
		int inicio = scan.nextInt();

		System.out.println("Terminar em: ");
		int fim = scan.nextInt();

		int tabuada = 0;

		System.out.println("Vou montar a tabuada de " + n + " começando em " + inicio + " e terminando em " + fim + ":");
		for (int i = inicio; i <= fim; i++) {
			tabuada = n * i;
			System.out.println(n + " X " + i + " = " + tabuada);
		}

		scan.close();

	}

}
