package cursojava.listaExerciciosDois;

import java.util.Scanner;

public class Exerc12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Qual o valor da sua hora de trabalho?");
		double valorHora = scan.nextDouble();
		
		System.out.println("Quantas horas voce trabalha por mes?");
		int qtdHoras = scan.nextInt();
		
		double salario = valorHora * qtdHoras;
		double fgts = salario * 0.11;
		double inss = salario * 0.1;
		double sindicato = salario * 0.03;
		double impostoRenda = 0.0;
		
		if (salario <= 900.00) {
			impostoRenda = salario;
		} else if(salario > 900.00 && salario <= 1500) {
			impostoRenda = salario * 0.05;
		} else if(salario > 1500.00 && salario <= 2500) {
			impostoRenda = salario * 0.05;
		} else{
			impostoRenda = salario * 0.2;
		}
		
		double descontos = inss + sindicato + impostoRenda;
		double salarioLiquido = salario + fgts - descontos;
		
		System.out.println("Salário bruto: R$"+ salario);
		System.out.println("IR: R$"+ impostoRenda);
		System.out.println("INSS: R$"+ inss);		
		System.out.println("FGTS: R$"+ fgts);
		System.out.println("Sindicato: R$"+ sindicato);
		System.out.println("Total de descontos: R$"+ descontos);
		System.out.println("Salário líquido: R$"+ salarioLiquido);
		
	}

}