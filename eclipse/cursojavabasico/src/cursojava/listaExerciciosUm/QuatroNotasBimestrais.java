package cursojava.listaExerciciosUm;

import java.util.Scanner;

public class QuatroNotasBimestrais {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite as 4 notas bimestrais: ");
		int notaUm = scan.nextInt();
		int notaDois = scan.nextInt();
		int notaTres = scan.nextInt();
		int notaQuatro = scan.nextInt();	
		
		System.out.println("A média é: " + (notaUm+notaDois+notaTres+notaQuatro)/4);
	}

}
