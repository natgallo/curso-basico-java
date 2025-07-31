package cursojava.listaExerciciosDois;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Exerc18 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite uma data no formato dd/mm/aaaa: ");
        String entrada = scan.nextLine();

        // Define o formato esperado
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        try {
            // Tenta converter a entrada em uma data
            LocalDate data = LocalDate.parse(entrada, formatter);
            System.out.println("Data válida: " + data.format(formatter));
        } catch (DateTimeParseException e) {
            System.out.println("Data inválida ou fora do formato dd/mm/aaaa.");
        }

        scan.close();
    }
}