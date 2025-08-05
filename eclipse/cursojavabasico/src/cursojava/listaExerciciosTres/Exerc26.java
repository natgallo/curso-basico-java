package cursojava.listaExerciciosTres;

import java.util.Scanner;

public class Exerc26 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Quantos votantes há?");

		int votantes = scan.nextInt();
		int um = 0;
		int dois = 0;
		int tres = 0;

		for (int i = 1; i <= votantes; i++) {
			System.out.println("Votante " + i + ": Votará em quem? (1 - Fulano" + "2 - Beltrano" + "3 - Ciclano)");
			int candidato = scan.nextInt();
			if (candidato > 3 || candidato <= 0) {
				System.out.println("Valor inválido");
			} else {
				switch (candidato) {
				case 1:
					um++; break;
				case 2:
					dois++; break;
				case 3:
					tres++; break;
				}
			}
		}
		System.out.println("Candidato um: " + um);
		System.out.println("Candidato dois: " + dois);
		System.out.println("Candidato tres: " + tres);

		scan.close();

	}

}
