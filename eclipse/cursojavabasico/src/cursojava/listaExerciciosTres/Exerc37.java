package cursojava.listaExerciciosTres;

import java.util.Scanner;

public class Exerc37 {

	public static void main(String[] args) {
		// Foi feita uma estatística em cinco cidades brasileiras para coletar dados
		// sobre acidentes de transito. Foram obtidos os seguintes dados:
		// Código da cidade;
		// Num de veículos de passeio
		// Num de acidentes de transito com vítimas

		Scanner scan = new Scanner(System.in);

		int codigo, veiculosPasseio, acidentes;
		int codMaior = 0;
		int codMenor = Integer.MAX_VALUE;
		int maiorAcidentes = 0;
		int menorAcidentes = Integer.MAX_VALUE;
		int soma = 0;
		int somaAcidentes = 0;
		int cont = 0;

		for (int i = 0; i < 5; i++) {
			System.out.println("Digite o código da cidade:");
			codigo = scan.nextInt();

			System.out.println("Digite a quantidade de veículos de passeio da cidade:");
			veiculosPasseio = scan.nextInt();

			System.out.println("Digite o número de acidentes de transito com vítimas:");
			acidentes = scan.nextInt();

			soma += veiculosPasseio;

			if (acidentes > maiorAcidentes) {
				maiorAcidentes = acidentes;
				codMaior = codigo;
			}
			if (acidentes < menorAcidentes) {
				menorAcidentes = acidentes;
				codMenor = codigo;
			}

			if (veiculosPasseio < 2000) {
				somaAcidentes += acidentes;
				cont++;
			}

		}

		// Deseja-se saber:
		// Qual o maior e menor indice de acidentes de transito e a que cidade pertence;
		// Qual a média de veículos nas cinco cidades juntas;
		// Qual a média de acidentes de transito nas cidades com menos de 2000 veículos
		// de passeio;

		System.out.println("O maior índice de acidentes é da cidade de código " + codMaior + " com "+ maiorAcidentes);
		System.out.println("O menor índice de acidentes é da cidade de código " + codMenor + " com "+ menorAcidentes);
		System.out.println("A média de veículos das cinco cidades é: " + soma/5.0);
		System.out.println("A média de acidentes de transito nas cidades com menos de 2000 veículos é: " + somaAcidentes/(double)cont);

		scan.close();

	}

}
