package cursojava.listaExerciciosDois;

import java.util.Scanner;

public class Exerc11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite seu salário:");
		
		double salario = scan.nextDouble();
		
		double novoSalario = 0.00;
		double aumentoAplicado = 0.00;
		String porcentual = "";
		
		if (salario <= 280.00) {
			novoSalario = salario + (salario * 0.2);
			aumentoAplicado = salario * 0.2;
			porcentual = "20%";
		} else if (salario > 280.00 && salario < 700.00) {
			novoSalario = salario + (salario * 0.15);
			aumentoAplicado = salario * 0.15;
			porcentual = "15%";
		} else if (salario > 700.00 && salario < 1500.00) {
			novoSalario = salario + (salario * 0.1);
			aumentoAplicado = salario * 0.1;
			porcentual = "10%";
		} else if (salario > 1500) {
			novoSalario = salario + (salario * 0.05);
			aumentoAplicado = salario * 0.05;
			porcentual = "5%";
		}
		
		System.out.println("O salário antes do reajuste: R$"+ salario);
		System.out.println("O porcentual do aumento aplicado: "+ porcentual);
		System.out.println("Valor do aumento: R$"+ aumentoAplicado);
		System.out.println("Novo salário: R$"+ novoSalario);

	}

}
