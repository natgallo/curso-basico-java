package cursojava.listaExerciciosDois;

import java.util.Scanner;

public class Exerc02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número:");
		
		int numero = scan.nextInt();
		
		if (numero > 0) {
			System.out.println("Positivo");
		} else if (numero < 0) {
			System.out.println("Negativo");
		} else {
			System.out.println("Zero");
		}
	}

}
