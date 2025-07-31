package cursojava.aula16;

public class LoopWhile {

	public static void main(String[] args) {

		int i = 1; // count ou cont
		int max = 10;

		System.out.println("Contando até " + max);
		
		//Se a expressão for verdadeira ele segue a lógica
		while (i <= max) {
			System.out.println("Valor de i: " + i);
			i++; // i = i + 1; i += 1;
		}
		
		System.out.println(i);
		
		//Faz a lógica e depois verifica a expressão
		do {
			i++;
			System.out.println("Valor de i: " + i);
		} while (i < 15);
		
		System.out.println(i);

	}

}
