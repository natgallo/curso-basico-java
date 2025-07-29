package listaExerciciosUm;

import java.util.Scanner;

public class OnzeCalculos {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite dois números inteiros e um real: ");
		int numeroIntUm = scan.nextInt();
		int numeroIntDois = scan.nextInt();
		double numeroReal = scan.nextDouble();
		
		int resultado = (numeroIntUm*2) * (numeroIntDois/2);
		System.out.println(resultado);
		
		double resultado2 = (numeroIntUm * 3) + numeroReal;
		System.out.println(resultado2);
		
		double resultado3 = numeroReal * numeroReal * numeroReal;
		System.out.println(resultado3);
	}

}
