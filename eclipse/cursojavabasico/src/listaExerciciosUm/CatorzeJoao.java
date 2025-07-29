package listaExerciciosUm;

import java.util.Scanner;

public class CatorzeJoao {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//peixe maior que 50kg = -R$4 por kg excedente
		System.out.println("Digite o peso do peixe pescado em kg:");
		double pesoPeixe = scan.nextDouble();
		
		double multa = 4.00;
		double excesso = (pesoPeixe - 50);
		double multaAplicada = excesso * multa;
		
		if(pesoPeixe > 50) {
			System.out.println("Valor Excesso: "+ excesso);
			System.out.println("Multa: "+ multaAplicada);
		}else {
			System.out.println("Valor Excesso: ZERO");
			System.out.println("Multa: ZERO");
		}
		
	}

}
