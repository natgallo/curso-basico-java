/*
package listaExerciciosUm;

import java.util.Scanner;

public class SeisRaioCirculo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o valor do raio de um círculo: ");
		double raio = scan.nextInt();
		double area = 3.14*(raio*raio);
		
		System.out.println("A área de um círculo de raio " + raio + " é "+ area);
	}

}
*/

//Utilizando a correção, com a classe Math

package listaExerciciosUm;

import java.util.Scanner;

public class SeisRaioCirculo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o valor do raio de um círculo: ");
		double raio = scan.nextInt();
		double area = Math.PI*Math.pow(raio,2);
		
		System.out.println("A área de um círculo de raio " + raio + " é "+ area);
	}

}
