package Condicoes;

import java.util.Scanner;

public class ScannerNinja {
    public static void main(String[] args) {

        /*
        * Scanner = ë um jeito de trazer o usuario para dentro da aplicacao.
        * Objetivo: o usuario vai criar um ninja e vamos validar os dados.
        * */

        // abrir o Scanner
        Scanner caixaDeTexto = new Scanner(System.in);

        // recber o nome do ninja
        System.out.println("Escreva o nome do ninja aqui: ");
        String nomeDoninja = caixaDeTexto.nextLine();
        System.out.println("o nome do ninja é " + nomeDoninja);

        // receber a idade do ninja
        System.out.println("Digite a idade do ninja aqui: ");
        int idadeDoNinja = caixaDeTexto.nextInt();
        System.out.println("A idade do seu ninja é: " + idadeDoNinja);

        if (idadeDoNinja >= 18) {
            System.out.println("Seu ninja é maior de idade, e já pode fazer missoes fora da vila");
        } else {
            System.out.println("Seu ninja é menor de idade, treine mais para conseguir persmissao para fazer missoes fora da vila");

        }



        caixaDeTexto.close();
    }
}
