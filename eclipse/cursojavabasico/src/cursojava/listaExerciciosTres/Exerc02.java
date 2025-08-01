package cursojava.listaExerciciosTres;

import java.util.Scanner;

public class Exerc02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String user = "";
		String senha = "";
		
		do {
			System.out.println("Digite o nome de usuario: ");
			user = scan.next();
			System.out.println("Digite uma senha: ");
			senha = scan.next();
			
		} while(user.equals(senha));
		
		System.out.println("Usuário salvo: "+ user + " senha: " + senha);

	}

}
