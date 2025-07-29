/*
package listaExerciciosUm;

import java.util.Scanner;

public class SeteAreaDeUmQuadrado {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o valor de um lado do quadrado: ");
		double lado = scan.nextDouble();
		double area = lado * lado;
		double areaDuplicada = area*2;
		
		System.out.println("A área duplicada de um quadrado de área "+ area + " é: " + areaDuplicada);
		
	}

}
*/

//Utilizando a correção, com a classe Math

package listaExerciciosUm;

import java.util.Scanner;

public class SeteAreaDeUmQuadrado {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o valor de um lado do quadrado: ");
		double lado = scan.nextDouble();
		double area = Math.pow(lado, 2);
		double areaDuplicada = area*2;
		
		System.out.println("A área duplicada de um quadrado de área "+ area + " é: " + areaDuplicada);
		
	}

}
