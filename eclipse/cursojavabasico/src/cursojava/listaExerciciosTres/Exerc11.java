package cursojava.listaExerciciosTres;

import java.util.Scanner;

public class Exerc11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite dois números inteiros: ");

		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		int soma = 0;

		for (int i = n1; i <= n2; i++) {
			System.out.println(i);
			soma += i; //soma = soma + 1

		}

		System.out.println("a soma dos números é: " + soma);

		scan.close();

	}

}
