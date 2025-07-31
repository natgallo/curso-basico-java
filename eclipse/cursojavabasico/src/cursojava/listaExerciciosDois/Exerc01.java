package cursojava.listaExerciciosDois;

import java.util.Scanner;

public class Exerc01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite dois números: ");
		
		int numeroUm = scan.nextInt();
		int numeroDois = scan.nextInt();
		
		if(numeroUm > numeroDois) {
			System.out.print(numeroUm);
		} else if (numeroDois > numeroUm) {
			System.out.print(numeroDois);
		} else {
			System.out.print("Os números são iguais.");
		}

	}

}
