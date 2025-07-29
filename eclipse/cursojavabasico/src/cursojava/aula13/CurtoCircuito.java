package cursojava.aula13;

public class CurtoCircuito {

	public static void main(String[] args) {
			
		boolean verdadeiro = true;
		boolean falso = false;
		boolean resultado1 = falso && verdadeiro;
		//olha apenas o primeiro, sem necessidade de olhar o próximo, uma vez que o primeiro já é falso
		boolean resultado2 = falso & verdadeiro; 
		System.out.print(resultado1);
		System.out.print(resultado2);
		
		int resultado = 1 + 1 - 1 + 1 * 1 / 1;
		System.out.println(resultado);
	}
}
