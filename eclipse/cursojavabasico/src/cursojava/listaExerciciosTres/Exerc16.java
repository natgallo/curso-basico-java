package cursojava.listaExerciciosTres;

import java.util.Scanner;

public class Exerc16 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int numeroA = 1;
		int numeroB = 0;
		int i = 0;
		int numero = 0;

		while (i < n && numeroA <= 500) {
			System.out.println(numeroA);
			numero = numeroA + numeroB;
			numeroB = numeroA;
			numeroA = numero;
			i++;
		}
		scan.close();

	}

}
