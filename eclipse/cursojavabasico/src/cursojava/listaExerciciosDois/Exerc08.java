package cursojava.listaExerciciosDois;

import java.util.Scanner;

public class Exerc08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o preço de tres produtos:");
		
		int numeroUm = scan.nextInt(); //2
		int numeroDois = scan.nextInt(); //4
		int numeroTres = scan.nextInt(); //3
		
		int menor = Math.min(numeroUm, Math.min(numeroDois, numeroTres));
		
		System.out.println("O produto que deve ser comprado é o que custa: R$"+ menor);

	}

}
