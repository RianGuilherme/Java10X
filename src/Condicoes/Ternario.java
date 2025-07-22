package Condicoes;
import java.util.Scanner;

public class Ternario {
    public static void main(String[] args) {
        // Verificando a maioridade: A pessoa é maior de idade ou não?

        Scanner scanner = new Scanner(System.in);

        int idade =11;
        String statusMaioridade = (idade >= 18) ? "Voce é maior de idade" : "Voce é menor de idade";
        System.out.println(statusMaioridade);



        scanner.close();
    }
}
