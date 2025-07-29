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
			System.out.println("Qual seu peso atual?");
			double pesoAtual = scan.nextDouble();
			if(pesoAtual > pesoIdealM){
				System.out.println("Acima do peso");
			} else if(pesoAtual < pesoIdealM) {
				System.out.println("Abaixo do peso");
			} else {
				System.out.println("Peso Ideal");
			}
		} 
		else if (sexo.equals("masculino")) {
			double pesoIdealH = (72.7*altura)-58;
			System.out.println("Seu peso ideal é: "+ pesoIdealH);
			System.out.println("Qual seu peso atual?");
			double pesoAtual = scan.nextDouble();
			if(pesoAtual > pesoIdealH){
				System.out.println("Acima do peso");
			} else if(pesoAtual < pesoIdealH) {
				System.out.println("Abaixo do peso");
			} else {
				System.out.println("Peso Ideal");
			}
		} else {
			System.out.println("Sexo inválido. Digite 'masculino' ou 'feminino'.");
		}
	}

}
