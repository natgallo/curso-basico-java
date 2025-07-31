package cursojava.listaExerciciosDois;

import java.util.Scanner;

public class Exerc20 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite tres notas: ");

		int notaUm = scan.nextInt();
		int notaDois = scan.nextInt();
		int notaTres = scan.nextInt();

		int media = (notaUm + notaDois + notaTres)/3;
		String resultado = "";
		
		if(media == 10) {
			resultado = "Aprovado com distinção";
		} else if(media >= 7) {
			resultado = "Aprovado";
		}else {
			resultado = "Reprovado";
		}
		
		System.out.println(resultado);
		scan.close();

	}

}
