package cursojava.listaExerciciosTres;

import java.util.Scanner;

public class Exerc39 {

	public static void main(String[] args) {
		// Faca um programa que leia uma quantidade indeterminada de números positivos e
		// conte quantos deles estão nos seguintes intervalos:
		// [0-25][26-50][51-75][76-100]

		Scanner scan = new Scanner(System.in);

		boolean flag = true;
		int numero, i1 = 0, i2 = 0, i3 = 0, i4 = 0;

		while (flag == true) {
			System.out.println("Digite um número positivo: ");
			numero = scan.nextInt();

			if (numero < 0) {
				flag = false;
			} else {
				if (numero == 0 || numero <= 25) {
					i1++;
				} else if (numero >= 26 || numero <= 50) {
					i2++;
				} else if (numero >= 51 || numero <= 75) {
					i3++;
				} else if (numero >= 76 || numero <= 100) {
					i4++;
				}
			}


		}
		
		System.out.println("\nQuantidade nos intervalos:");
		System.out.println("[0 - 25]: " + i1);
		System.out.println("[26 - 50]: " + i2);
		System.out.println("[51 - 75]: " + i3);
		System.out.println("[76 - 100]: " + i4);
		scan.close();

	}

}
