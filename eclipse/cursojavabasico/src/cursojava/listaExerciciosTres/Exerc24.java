package cursojava.listaExerciciosTres;

import java.util.Scanner;

public class Exerc24 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite quantas notas voce quer fazer a média:");
		int qtdNotas = scan.nextInt();
		double soma = 0.0;
		
		for(int i = 1; i <= qtdNotas; i++) {
			System.out.println("Digite a " + i + " nota");
			double numero = scan.nextDouble();
			soma += numero;
		}
		
		double media = soma/qtdNotas;
		
		System.out.println("A média é:"+ media);
		
		scan.close();

	}

}
