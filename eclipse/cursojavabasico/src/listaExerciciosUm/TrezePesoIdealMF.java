package listaExerciciosUm;

import java.util.Scanner;

public class TrezePesoIdealMF {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite sua altura e seu sexo: ");
		double altura = scan.nextDouble();
		String sexo = scan.next();
		
		if(sexo.equals("feminino")) {
			double pesoIdealM = (62.1*altura)-44.7;
			System.out.println("Seu peso ideal é: "+ pesoIdealM);
		} 
		else if (sexo.equals("masculino")) {
			double pesoIdealH = (72.7*altura)-58;
			System.out.println("Seu peso ideal é: "+ pesoIdealH);
		} else {
			System.out.println("Sexo inválido. Digite 'masculino' ou 'feminino'.");
		}
		
		System.out.println("Qual seu peso?");
		double pesoAtual = scan.nextDouble();
		
		
	}

}
