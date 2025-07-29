 package cursojava.listaExerciciosUm;

import java.util.Scanner;

public class DezoitoMB {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o tamanho do arquivo (em MB): ");
        double tamanhoMB = scan.nextDouble();

        System.out.print("Digite a velocidade da internet (em Mbps): ");
        double velocidadeMbps = scan.nextDouble();

        // Converte tamanho do arquivo de MB para megabits
        double tamanhoEmMegabits = tamanhoMB * 8;

        // Calcula o tempo em segundos
        double tempoSegundos = tamanhoEmMegabits / velocidadeMbps;

        // Converte para minutos e segundos
        int minutos = (int) tempoSegundos / 60;
        int segundos = (int) tempoSegundos % 60;

        System.out.printf("Tempo estimado de download: %d minutos e %d segundos%n", minutos, segundos);

    }
}