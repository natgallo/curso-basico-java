package cursojava.listaExerciciosTres;

import java.util.Scanner;

public class Exerc35 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int codigo;
		double peso, altura;

		int cont = 0;
		double somaP = 0.0;
		double somaA = 0.0;

		double gordo = 0.0, magro = Double.MAX_VALUE;
		double alto = 0.0, baixo = Double.MAX_VALUE;

		int codG = 0, codM = 0, codA = 0, codB = 0;

		while (true) {
			System.out.print("Digite seu código (0 para sair): ");
			codigo = scan.nextInt();

			if (codigo == 0) {
				break;
			}

			System.out.print("Digite seu peso (kg): ");
			peso = scan.nextDouble();

			System.out.print("Digite sua altura (m): ");
			altura = scan.nextDouble();

			cont++;
			somaP += peso;
			somaA += altura;

			if (peso > gordo) {
				gordo = peso;
				codG = codigo;
			}
			if (peso < magro) {
				magro = peso;
				codM = codigo;
			}
			if (altura > alto) {
				alto = altura;
				codA = codigo;
			}
			if (altura < baixo) {
				baixo = altura;
				codB = codigo;
			}
		}

		if (cont == 0) {
			System.out.println("Nenhum dado foi inserido.");
		} else {
			System.out.printf("Mais gordo: Código %d com %.2f kg\n", codG, gordo);
			System.out.printf("Mais magro: Código %d com %.2f kg\n", codM, magro);
			System.out.printf("Mais alto: Código %d com %.2f m\n", codA, alto);
			System.out.printf("Mais baixo: Código %d com %.2f m\n", codB, baixo);
			System.out.printf("Média de peso: %.2f kg\n", somaP / cont);
			System.out.printf("Média de altura: %.2f m\n", somaA / cont);
		}

		scan.close();
	}
}