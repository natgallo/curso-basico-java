package cursojava.listaExerciciosTres;

import java.util.Scanner;

public class Exerc08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite 5 números.");

		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		int n3 = scan.nextInt();
		int n4 = scan.nextInt();
		int n5 = scan.nextInt();

		int soma = n1 + n2 + n3 + n4 + n5;
		int media = soma / 5;

		System.out.println("A soma é: " + soma);
		System.out.println("A média é: " + media);

	}

}
