package cursojava.listaExerciciosTres;

import java.util.Scanner;

public class Exerc28 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe a quantidade de CDs: ");
		
		int qtdCDS = scan.nextInt();
		double soma = 0.0;
		
		for(int i = 1; i <= qtdCDS; i++) {
			System.out.println("Informe o valor do CD "+ i + ": ");
			double valorCD = scan.nextDouble();
			soma += valorCD;
		}
		
		double media = soma/qtdCDS;
		
		System.out.println("Valor total investido em CDs:"+ soma);
		System.out.println("Média de valor por CD "+ media);
		
		
		scan.close();

	}

}
