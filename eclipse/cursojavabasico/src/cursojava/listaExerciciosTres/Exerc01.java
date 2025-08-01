package cursojava.listaExerciciosTres;

import java.util.Scanner;

public class Exerc01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int nota = 0;

		do {
			System.out.println("Entre uma nota de 0 a 10.");
			nota = scan.nextInt();
			System.out.println(nota);
		} while (nota > 10 || nota < 0);

		scan.close();

	}

}
