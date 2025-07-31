package cursojava.listaExerciciosDois;

import java.util.Scanner;

public class Exerc05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite duas notas:");

		int notaUm = scan.nextInt();
		int notaDois = scan.nextInt();
		int media = (notaUm+notaDois)/2;
		
		if(media < 7) {
			System.out.println("Reprovado");
		} else if (media == 10) {
			System.out.println("Aprovado com Distinção");
		} else if (media >= 7) {
			System.out.println("Aprovado");
		}
	}

}

//Ctrl + alt + seta = copia linha selecionada para cima ou para baixo.
//Alt + seta pra cima = transporta a linha.
//Ctrl + shift + F = identa o código.