package listaExerciciosUm;

import java.util.Scanner;

public class NoveTemperatura {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em Farenheit: ");
		double temperaturaF = scan.nextDouble();
		
		double conversaoCelsius = ((temperaturaF-32)*5)/9;
		
		System.out.println("A temperatura em Celsius é: "+ conversaoCelsius);

	}

}
