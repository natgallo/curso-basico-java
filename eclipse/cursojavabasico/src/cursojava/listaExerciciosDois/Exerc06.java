package cursojava.listaExerciciosDois;

import java.util.Scanner;

public class Exerc06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite tres números:");
		
		int numeroUm = scan.nextInt();
		int numeroDois = scan.nextInt();
		int numeroTres = scan.nextInt(); 
		
		int maior = Math.max(numeroUm, Math.max(numeroDois, numeroTres));
		
		System.out.println(maior);

	}

}

