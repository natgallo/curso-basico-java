package cursojava.listaExerciciosTres;

import java.util.Scanner;

public class Exerc31 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double precoPrd = 0.0;
		int i = 1;
		double soma = 0.0;
		
		System.out.println("Lojas Tabajara.");
		
		do {
			precoPrd = scan.nextDouble();
			System.out.println("Produto "+ i + ": R$"+ precoPrd);
			i++;
			soma += precoPrd;
		}while(precoPrd != 0);
		
		System.out.printf("Total: R$ %.2f\n",  soma);
		
		double pagamento = scan.nextDouble();
		double troco = pagamento - soma;
		
		System.out.printf("Dinheiro: R$ %.2f\n", pagamento);
		System.out.printf("Troco: R$ %.2f\n", troco);
		
		
		scan.close();
	}

}
