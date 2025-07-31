package cursojava.listaExerciciosDois;

import java.util.Scanner;

public class Exerc09 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite tres números:");
		
		int numeroUm = scan.nextInt(); //2
		int numeroDois = scan.nextInt(); //4
		int numeroTres = scan.nextInt(); //3
		
		int maior = Math.max(numeroUm, Math.max(numeroDois, numeroTres));
		int menor = Math.min(numeroUm, Math.min(numeroDois, numeroTres));
		
		int soma = numeroUm + numeroDois + numeroTres;
		int meio = soma - (maior + menor);

		System.out.printf(maior+" "+meio+" "+menor);

	}

}
