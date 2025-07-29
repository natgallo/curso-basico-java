package cursojava.listaExerciciosUm;

import java.util.Scanner;

public class QuinzeHolerite {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Qual o valor da sua hora de trabalho?");
		double valorHora = scan.nextDouble();
		
		System.out.println("Quantas horas voce trabalha por mes?");
		int qtdHoras = scan.nextInt();
		
		double salario = valorHora * qtdHoras;
		double inss = salario * 0.08;
		double sindicato = salario * 0.05;
		double impostoRenda = salario * 0.11;
		double salarioLiquido = salario - (impostoRenda + inss + sindicato);
		
		System.out.println("O seu salário bruto mensal é: "+ salario);
		System.out.println("INSS: "+ inss);
		System.out.println("Sindicato: "+ sindicato);
		System.out.println("IR: "+ impostoRenda);
		System.out.println("O seu salário bruto mensal é: "+ salarioLiquido);
		
	}

}
