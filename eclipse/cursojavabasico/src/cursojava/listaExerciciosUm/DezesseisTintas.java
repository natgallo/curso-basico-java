package cursojava.listaExerciciosUm;

import java.util.Scanner;

public class DezesseisTintas {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o valor em metros quadrados da área a ser pintada:");
		int area = scan.nextInt();
		
		int qtdTinta = area/3;
		int qtdGaloes = qtdTinta/18;
		
		if(qtdTinta % 18 > 0) {
			qtdGaloes++;
		}
		
		double preco = qtdGaloes * 80;
		
		System.out.println("Quantidade de Galões de 18L: "+ qtdGaloes);
		System.out.println("Preço: "+ preco);
		

	}

}
