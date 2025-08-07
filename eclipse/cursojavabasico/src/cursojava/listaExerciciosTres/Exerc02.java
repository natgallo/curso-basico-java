package cursojava.listaExerciciosTres;

import java.util.Scanner;

public class Exerc02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String user = "";
		String senha = "";
		
		boolean infoValidas = false;
		
		do {
			System.out.println("Digite o nome de usuario: ");
			user = scan.next();
			System.out.println("Digite uma senha: ");
			senha = scan.next();
			
			if(user.equals(senha)) {
				infoValidas = false;
				System.out.println("Senha igual a usuário, digite novamente.");
			} else {
				System.out.println("Senha e usuários válidos.");
				infoValidas = true;
			}
			
		} while(!infoValidas);
		
		System.out.println("Usuário salvo: "+ user + " senha: " + senha);
		
		scan.close();

	}

}
