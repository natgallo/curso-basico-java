package cursojava.listaExerciciosTres;

import java.util.Scanner;

public class Exerc13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite uma base e um expoente inteiros:");

		int base = scan.nextInt();
		int expoente = scan.nextInt(); 
		int resultado = base; 

		for (int i = 1; i < expoente; i++) {
			resultado = resultado * base;
		}

		System.out.println(resultado);
		scan.close();

	}

}
