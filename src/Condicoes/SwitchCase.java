package Condicoes;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {

        /*
        * SwitchCases: que servem para gerar casos especificos
        * objetivo: pedir pro usuario escolher entre os Ninjas.
        * switchCase
        * */

        // Pedir para o usuario
        Scanner scanner = new Scanner(System.in);

        // mostrar opcoes ao usuario
        System.out.println("Escolha um Personagem: ");
        System.out.println("1 - Naruto Uzumaki");
        System.out.println("2 - Sasuke Uchiha");
        System.out.println("3 - Sakura Haruno");

        // pedir para o usuario escolher uma das opceos
        int escolhaDoUsuario = scanner.nextInt();

        System.out.println("Voce digitou o numero: " + escolhaDoUsuario);

        // reacao ao escolher um personagem

        switch (escolhaDoUsuario) {
            case 1:
                System.out.println("Voce escolheu o Naruto Uzumaki, o proximo Hokage");
                break;
            case 2:
                System.out.println("Voce escolheu o Sasuke Uchiha, o ninja mlk dos sharingan");
                break;
            case 3:
                System.out.println("Voce escolheu a Sakura Haruno, aprendiz da quinta Hokage");
                break;
            default:
                System.out.println("Voce nao digitou uma resposta valida");
        }




        scanner.close();
    }
}
