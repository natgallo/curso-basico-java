package cursojava.listaExerciciosTres;

import java.util.Scanner;

public class Exerc07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite 5 números.");
		
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		int n3 = scan.nextInt();
		int n4 = scan.nextInt();
		int n5 = scan.nextInt();
		
		int maior = Math.max(n1, Math.max(n2, Math.max(n3, Math.max(n4, n5))));
		
		System.out.println("O número maior é: "+ maior);
		
		scan.close();
	}

}
