package cursojava.listaExerciciosTres;

import java.util.Scanner;

public class Exerc27 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite quantas turmas há:");
		int qtdTurmas = scan.nextInt();
		double soma = 0.0;
		int numero = 0;

		for (int i = 1; i <= qtdTurmas; i++) {
			while (true) { //Repita esse bloco para sempre até que haja um break
				System.out.println("Digite a quantidade de alunos na " + i + "a turma");
				numero = scan.nextInt();
				if (numero > 0 && numero <= 40) {
					break;
				} else {
					System.out.println("Quantidade inválida.");
				}
			}
			soma += numero;
		}

		double media = soma / qtdTurmas;

		System.out.println("A média de alunos por turma é:" + media);

		scan.close();

	}

}