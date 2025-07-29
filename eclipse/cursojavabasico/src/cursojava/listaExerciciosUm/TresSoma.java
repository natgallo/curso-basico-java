package cursojava.listaExerciciosUm;

import java.util.Scanner;

public class TresSoma {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe um número para soma:");
		int numeroUm = scan.nextInt();
		System.out.println("Informe outro número para soma:");
		int numeroDois = scan.nextInt();
		
		System.out.println("A soma dos números informados é: " + (numeroUm + numeroDois));
		
	}

}
