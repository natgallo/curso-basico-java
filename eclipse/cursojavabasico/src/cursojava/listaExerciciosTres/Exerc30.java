package cursojava.listaExerciciosTres;

import java.util.Scanner;

public class Exerc30 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("informe o preço do pão:");
		double precoPao = scan.nextDouble();
		
		System.out.println("Preço do pão: R$" + precoPao);
		System.out.println("Panificadora Pão de Ontem - Tabela de preços");
		for(int i = 1; i <= 50; i++) {
			System.out.println(i+" - R$"+ i*precoPao);			
		}
		
		scan.close();
		
	}

}
