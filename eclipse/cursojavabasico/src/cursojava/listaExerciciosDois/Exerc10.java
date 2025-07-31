package cursojava.listaExerciciosDois;

import java.util.Scanner;

public class Exerc10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Em qual turno voce estuda? (M, V, N)");
		
		String turno = scan.next().toUpperCase();
		
		if (turno.equals("M")) {
			System.out.println("Bom dia!");
		} else if (turno.equals("V")) {
			System.out.println("Boa tarde!");
		} else if (turno.equals("N")) {
			System.out.println("Boa noite!");
		} else {
			System.out.println("Valor Inválido");
		}

	}

}
