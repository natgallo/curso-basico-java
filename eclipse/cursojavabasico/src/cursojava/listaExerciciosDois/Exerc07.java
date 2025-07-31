package cursojava.listaExerciciosDois;

import java.util.Scanner;

public class Exerc07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite tres números:");
		
		int numeroUm = scan.nextInt(); //2
		int numeroDois = scan.nextInt(); //4
		int numeroTres = scan.nextInt(); //3
		
		int maiorDoisTres = Math.max(numeroDois, numeroTres);
		int maior = Math.max(maiorDoisTres, numeroUm);
		int menorDoisTres = Math.min(numeroDois, numeroUm);
		int menor = Math.min(menorDoisTres, numeroTres);
		
		System.out.println(maior);
		System.out.println(menor);

	}
}
