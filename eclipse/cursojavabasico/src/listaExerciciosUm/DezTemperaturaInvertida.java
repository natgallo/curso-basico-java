package listaExerciciosUm;

import java.util.Scanner;

public class DezTemperaturaInvertida {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em Celsius: ");
		double temperaturaC = scan.nextDouble();
		
		double conversaoFarenheit = (temperaturaC*9/5) + 32;
		
		System.out.println("A temperatura em Farenheit é: "+ conversaoFarenheit);

	}

}
