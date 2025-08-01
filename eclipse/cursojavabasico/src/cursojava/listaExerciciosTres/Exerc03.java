package cursojava.listaExerciciosTres;

import java.util.Scanner;

public class Exerc03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String nome = "";
		int idade = 0;
		int salario = 0;
		String sexo = "";
		String estadoCivil = "";
		boolean flag = true;

		do {
			System.out.println("Digite seu nome (maior que 3 caracteres)");
			nome = scan.next();
			if (nome.length() < 3) {
				flag = false;
			} else {
				System.out.println("Digite sua idade (entre 0 e 150)");
				idade = scan.nextInt();
				if (idade < 0 || idade > 150) {
					flag = false;
				} else {
					System.out.println("Digite seu salario (maior que 0)");
					salario = scan.nextInt();
					if (salario < 0) {
						flag = false;
					} else {
						System.out.println("Digite seu sexo (f/m)");
						sexo = scan.next().toLowerCase();
						if (sexo.equals("f") || sexo.equals("m")) {
							System.out.println("Qual seu estado civil?");
							estadoCivil = scan.next().toLowerCase();

							switch (estadoCivil) {
							case "s":
							case "c":
							case "v":
							case "d":
								flag = true;
								break;
							default:
								flag = false;
								break;
							}
						} else {
							flag = false;
						}
					}
				}

			}

		} while (flag == false);

		System.out.println("Usuário cadastrado.");
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Salário: R$" + salario);
		System.out.println("Sexo: " + sexo);
		System.out.println("Estado Civil: " + estadoCivil);

		scan.close();
	}

}
