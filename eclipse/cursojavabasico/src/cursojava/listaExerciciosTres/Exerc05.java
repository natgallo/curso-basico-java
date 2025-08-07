package cursojava.listaExerciciosTres;

import java.util.Scanner;

public class Exerc05 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int habitantesA = 0;
		int habitantesB = 0;
		double taxaA = 0.0;
		double taxaB = 0.0;
		int i = 0;
		boolean flag = true;
		int cont = 0;

		do {
			System.out.println("Digite o numero de habitantes de um país: ");
			habitantesA = scan.nextInt();
			if (habitantesA <= 0) {
				flag = true;
			} else {
				System.out.println("Digite o numero de habitantes de um outro país: ");
				habitantesB = scan.nextInt();
				if (habitantesB <= 0) {
					flag = true;
				} else {
					System.out.println("Digite a taxa de crescimento anual do primeiro pais: ");
					taxaA = scan.nextDouble();
					if (taxaA < 0) {
						flag = true;
					} else {
						System.out.println("Digite a taxa de crescimento anual do segundo pais:  ");
						taxaB = scan.nextDouble();
						if (taxaB < 0) {
							flag = true;
						} else {

							while (habitantesA < habitantesB) {
								habitantesA += habitantesA * taxaA; // acrescenta a taxa de crescimento
								habitantesB += habitantesB * taxaB;
								i++;
								System.out.println("habitantes A: " + habitantesA);
								System.out.println("habitantes B: " + habitantesB);
								System.out.println("i: " + i);
							}
							cont++;
						}
					}
				}
			}
		} while (flag = true && cont < 5);

		System.out.println("A quantidade em anos para que o país A ultrapasse ou iguale a população do país B é: " + i);

	}

}