package cursojava.listaExerciciosUm;

import java.util.Scanner;

public class OitoSalario {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Qual o valor da sua hora de trabalho?");
		double valorHora = scan.nextDouble();
		
		System.out.println("Quantas horas voce trabalha por mes?");
		int qtdHoras = scan.nextInt();
		
		double salario = valorHora * qtdHoras;
		
		System.out.println("O seu salário mensal é: "+ salario);
		
	}

}
