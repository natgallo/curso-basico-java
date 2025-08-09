package cursojava.listaExerciciosTres;

import java.util.Scanner;

public class Exerc36 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int numero;
		double altura;
		int codigoA = 0;
		int codigoB = 0;
		
		double maisAlto = 0.0;
		double maisBaixo = Double.MAX_VALUE;
		
		for (int i = 1; i <= 10; i++) {
			System.out.println("Digite o número do aluno:");
			numero = scan.nextInt();
			
			System.out.println("Digite a altura do aluno:");
			altura = scan.nextDouble();
			
			if(altura > maisAlto) {
				maisAlto = altura;
				codigoA = numero;
			}
			
			if (altura < maisBaixo) {
				maisBaixo = altura;
				codigoB = numero;
			}
		}
		
		System.out.println("O aluno mais alto tem "+maisAlto+" de altura, e o número dele é "+codigoA);
		System.out.println("O aluno mais baixo tem "+maisBaixo+" de altura, e o número dele é "+codigoB);
		
		scan.close();
	}
}