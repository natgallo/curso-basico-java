package cursojava.listaExerciciosDois;

import java.util.Scanner;

public class Exerc19 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int numero = scan.nextInt();

		if (numero < 1000) {
			int centenas = numero / 100;
			int restoCentenas = numero % 100;
			int dezenas = restoCentenas / 10;
			int restoDezenas = restoCentenas % 10;
			int unidades = restoDezenas / 1;

			String resultado = "";

			// Resultado usando o operador ternário condição ? valorSeVerdadeiro :
			// valorSeFalso
			if (centenas > 0) {
				resultado += centenas + (centenas == 1 ? " centena" : " centenas");
			}
			if (dezenas > 0) {
				if (!resultado.isEmpty()) {
					resultado += ", ";
				}
				resultado += dezenas + (dezenas == 1 ? " dezena" : " dezenas");
			}
			if (unidades > 0) {
				if (!resultado.isEmpty()) {
					resultado += " e ";
				}
				resultado += unidades + (unidades == 1 ? " unidade" : " unidades");
			}

			System.out.println(resultado);

		} else {
			System.out.println("Número inválido.");
		}

		scan.close();

	}

}
