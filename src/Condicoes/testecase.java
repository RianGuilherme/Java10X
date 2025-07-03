package Condicoes;
import java.util.Scanner;

public class testecase {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o numro do mes: ");
        int numeroDoMes = scanner.nextInt();

        System.out.println("Voce ditou o numero do mes de: " + numeroDoMes);

        switch (numeroDoMes) {
            case 1:
                System.out.println("Voce escolheu o mes de: " + numeroDoMes);
                break;
            case 2:
                System.out.println("Voce escolheu o mes de: " + numeroDoMes);
                break;
        }




        scanner.close();
    }
}
