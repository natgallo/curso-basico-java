package cursojava.listaExerciciosTres;

import java.util.Scanner;

public class Exerc33 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Quantas temperaturas você deseja inserir? ");
		int quantidade = scan.nextInt(); //3

		System.out.print("Digite a 1a temperatura: ");
		int temp = scan.nextInt(); // 30

		int soma = temp; //30
		int maior = temp; //30
		int menor = temp; //30

		for (int i = 2; i <= quantidade; i++) {
			System.out.print("Digite a " + i + "a temperatura: ");//1 passada
			temp = scan.nextInt();//20
			
			soma += temp;

			if (temp > maior) { //20 > 30 não
				maior = temp; 
			}

			if (temp < menor) { //20 < 30 sim
				menor = temp; //menor = 20
			}
		}

		System.out.println("Média das temperaturas: " + soma/quantidade);
		System.out.println("Maior temperatura: " + maior);
		System.out.println("Menor temperatura: " + menor);
		
		scan.close();
	}
}