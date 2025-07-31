package cursojava.listaExerciciosDois;

import java.util.Scanner;

public class Exerc14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite duas notas:");

		double notaUm = scan.nextDouble();
		double notaDois = scan.nextDouble();

		double media = (notaUm + notaDois) / 2;
		String conceito = "";
		String mensagem = "";

		if (media > 0.0 && media <= 4.0) {
			conceito = "E";
			mensagem = "REPROVADO";
		} else if (media > 4.0 && media <= 6.0) {
			conceito = "D";
			mensagem = "REPROVADO";
		} else if (media > 6.0 && media <= 7.5) {
			conceito = "C";
			mensagem = "APROVADO";
		} else if (media > 7.5 && media <= 9.0) {
			conceito = "B";
			mensagem = "APROVADO";
		} else if (media > 9.0 && media <= 10.0) {
			conceito = "A";
			mensagem = "APROVADO";
		} else {
			System.out.println("valor inválido.");			

		}

		System.out.println("Média de aproveitamento: " + media);
		System.out.println("Conceito: " + conceito);
		System.out.println("Situação: " + mensagem);

	}

}
