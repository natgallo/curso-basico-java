package cursojava.listaExerciciosTres;

import java.util.Scanner;

public class Exerc18 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Quantos números você deseja inserir? ");
		int quantidade = scan.nextInt();

		System.out.print("Digite o 1o número: ");
		int numero = scan.nextInt();

		int soma = numero;
		int maior = numero;
		int menor = numero;

		for (int i = 2; i <= quantidade; i++) {
			System.out.print("Digite o " + i + "o número: ");
			numero = scan.nextInt();

			soma += numero;

			if (numero > maior) {
				maior = numero;
			}

			if (numero < menor) {
				menor = numero;
			}
		}

		System.out.println("Soma dos números: " + soma);
		System.out.println("Maior número: " + maior);
		System.out.println("Menor número: " + menor);
		
		scan.close();
	}
}