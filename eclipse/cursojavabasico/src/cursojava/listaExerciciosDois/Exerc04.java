package cursojava.listaExerciciosDois;

import java.util.Scanner;

public class Exerc04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite uma letra do alfabeto");
		
		String letra = scan.next().toLowerCase();
		
		if(letra.length() != 1 || !Character.isLetter(letra.charAt(0))) {
			System.out.println("Entrada inválida.");
		} else {
			switch (letra) {
			case "a": 
			case "e":
			case "i":
			case "o":
			case "u":System.out.println("É uma vogal."); break;
			default:System.out.println("É uma consoante"); break;
			}
		}

		
		/*
		//charAt(0) serve para identificar o item no vetor de acordo com a posição desejada.
		
		System.out.println("Digite um nome:");
		String nome = scan.next();
		System.out.println("Primeira letra: "+ nome.charAt(0));
		
		/*
		//Character.isLetter é um método java usado para validar se o item entre parenteses é uma letra do alfabeto. !Character.isLetter vai negar a validação, 
		ou seja retornará true quando não for letra.
		*/
	}

}
