package cursojava.listaExerciciosUm;

import java.util.Scanner;

public class CincoMetros {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um valor em metro: ");
		double valorMetro = scan.nextDouble();
		double calculoCentimetro = valorMetro * 100;
		
		System.out.println("O valor em centímetro é: " + calculoCentimetro);

	}

}
