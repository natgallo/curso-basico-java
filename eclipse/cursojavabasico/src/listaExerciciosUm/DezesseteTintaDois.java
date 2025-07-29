package listaExerciciosUm;

import java.util.Scanner;

public class DezesseteTintaDois {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o valor em metros quadrados da área a ser pintada:");
		int area = scan.nextInt();
		
		double qtdTinta = (area+(0.1*area))/6;
		double qtdGaloes18 = qtdTinta/18;
		double qtdGaloes3 = qtdTinta/3.6;
		
		if(qtdTinta % 18 > 0) {
			qtdGaloes18++;
		}
		
		if(qtdTinta % 3.6 > 0){
			qtdGaloes3 += 1;
		}
		
		double preco18 = qtdGaloes18 * 80;
		double preco3 = qtdGaloes3 * 25;
		
		double qtdTintaMista = (area+(0.1*area))/6;
		double qtdGaloes18Mista = qtdTintaMista/18;
		double qtdGaloes3Mista = 0.0;
		double resto18 = qtdTintaMista % 18;

		
		if(resto18 > 3.6) {
			qtdGaloes3Mista = (resto18/3.6);
			if(resto18 % 3.6 > 0) {
				qtdGaloes3Mista++;
			}
		} else if (resto18 > 0) {
			qtdGaloes18Mista++;
		}
		
		double qtdTotal = qtdGaloes18Mista + qtdGaloes3Mista;	
		double precoMisto18 = qtdGaloes18Mista * 80;
		double precoMisto3 = qtdGaloes3Mista * 25;
		double precoTotalMisto = precoMisto18 + precoMisto3;
		
		System.out.printf("Quantidade de Galões de 18L: %.0f%n", qtdGaloes18);
		System.out.printf("Preço: %.2f%n", preco18);
		
		System.out.printf("Quantidade de Galões de 3,6L: %.0f%n", qtdGaloes3);
		System.out.printf("Preço: %.2f%n", preco3);
		
		System.out.printf("Quantidade de Galões de 3,6L: %.0f%n", qtdGaloes3Mista);
		System.out.printf("Preço: %.2f%n", precoMisto3);
		
		System.out.printf("Quantidade de Galões de 18L: %.0f%n", qtdGaloes18Mista);
		System.out.printf("Preço: %.2f%n", precoMisto18);
		
		System.out.printf("Quantidade de Galões: %.0f%n", qtdTotal);
		System.out.printf("Preço Total: %.2f%n", precoTotalMisto);

	}

}
