package cursojava.listaExerciciosDois;

import java.util.Scanner;

public class Exerc15 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int ladoUm = scan.nextInt();
		int ladoDois = scan.nextInt();
		int ladoTres = scan.nextInt();

		if (((ladoUm + ladoDois) > ladoTres) && ((ladoDois + ladoTres) > ladoUm) && ((ladoTres + ladoUm) > ladoDois)) {
			if (ladoUm == ladoDois && ladoDois == ladoTres) {
				System.out.println("Equilátero");
			} else if (ladoUm == ladoDois || ladoUm == ladoTres || ladoDois == ladoTres) {
				System.out.println("Isósceles");
			} else {
				System.out.println("Escaleno");
			}
		} else {
			System.out.println("Não é triangulo.");
		}
		
		scan.close();

	}

}
