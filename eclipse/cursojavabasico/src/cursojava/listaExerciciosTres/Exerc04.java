package cursojava.listaExerciciosTres;

public class Exerc04 {

	public static void main(String[] args) {
		// país A: 80000 habitantes, taxa anual de crescimento 3%;
		// país B: 200000 habitantes, taxa anual de crescimento 1,5%;

		int habitantesA = 80000;
		int habitantesB = 200000;
		int i = 0;

		while (habitantesA < habitantesB) {
			habitantesA += habitantesA * 0.03; //acrescenta a taxa de crescimento
			habitantesB += habitantesB * 0.015;
			i++;
			System.out.println("habitantes A: "+ habitantesA);
			System.out.println("habitantes B: "+ habitantesB);
			System.out.println("i: "+ i);

		}

		System.out.println("A quantidade em anos para que o país A ultrapasse ou iguale a população do país B é: " + i);

	}

}
