package cursojava.listaExerciciosTres;

import java.util.Scanner;

public class Exerc25 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite quantas pessoas há na turma:");
		int qtdPessoas = scan.nextInt();
		double soma = 0.0;
		
		for(int i = 1; i <= qtdPessoas; i++) {
			System.out.println("Digite a " + i + " idade");
			double numero = scan.nextDouble();
			soma += numero;
		}
		
		double media = soma/qtdPessoas;
		
		System.out.println("A média é:"+ media);
		
		if(media >= 0 || media <= 25) {
			System.out.println("Jovem");
		} else if (media >= 26 || media <= 60 ){
			System.out.println("Adulta");			
		} else {
			System.out.println("Idosa");						
		}		
		
		scan.close();

	}

}