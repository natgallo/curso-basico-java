/*package cursojava.listaExerciciosTres;

import java.util.Scanner;

public class Exerc38 {

	public static void main(String[] args) {
		//Faça um programa que receba o valor de uma dívida e mostre uma tablea com os seguintes dados: valor da dívida, valor dos juros, quantidade de parcelas e valor da parcela:
		//Os juros e a quantidade de parcelas seguem a tabela abaixo:
		Quantidade de Parcelas * de juros sobre o valor incial da dívida
		1 - 0
		3 - 10 = 0,1
		6 - 15 = 0,15
		9 - 20 = 0,2
		12 - 25 = 0,25

		
		Scanner scan = new Scanner(System.in);
		
		double divida, valorJuros = 0.0, valorParcela = 0.0;
		int parcela;
		
		System.out.println("Digite o valor da dívida: ");
		divida = scan.nextDouble();
		
		System.out.println("Digite a quantidade de parcelas: ");
		parcela = scan.nextInt();	
		
		if(parcela <= 1) {
			valorJuros = 0;
			valorParcela = divida*valorJuros/parcela;
		}else if(parcela > 1 && parcela <= 3) {
			valorJuros = 0.1;
			valorParcela = divida*valorJuros/parcela;
		}else if(parcela > 3 && parcela <= 6) {
			valorJuros = 0.15;
			valorParcela = divida*valorJuros/parcela;
		}else if(parcela > 6 && parcela <= 9) {
			valorJuros = 0.2;
			valorParcela = divida*valorJuros/parcela;
		}else if(parcela > 9 && parcela <= 12) {
			valorJuros = 0.25;
			valorParcela = divida*valorJuros/parcela;
		}
		
		System.out.println("Valor da dívida   Valor dos Juros  Quantidade de Parcelas   Valor da Parcela");
		System.out.println("R$"+divida+"          R$"+divida*valorJuros+"          "+parcela+"                        R$"+valorParcela);
		
		
		
		scan.close();
		

	}

}

*/

package cursojava.listaExerciciosTres;

import java.util.Scanner;

public class Exerc38 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o valor da dívida: ");
        double divida = scan.nextDouble();

        // Tabela de parcelas e juros
        int[] parcelas = {1, 3, 6, 9, 12};
        double[] juros = {0.0, 0.1, 0.15, 0.2, 0.25};

        System.out.printf("%-18s %-18s %-25s %-18s%n",
                "Valor da dívida", "Valor dos Juros", "Quantidade de Parcelas", "Valor da Parcela");

        for (int i = 0; i < parcelas.length; i++) {
            double valorJuros = divida * juros[i];
            double totalDivida = divida + valorJuros;
            double valorParcela = totalDivida / parcelas[i];

            System.out.printf("R$%-16.2f R$%-16.2f %-25d R$%-16.2f%n",
                    totalDivida, valorJuros, parcelas[i], valorParcela);
        }

        scan.close();
    }
}
