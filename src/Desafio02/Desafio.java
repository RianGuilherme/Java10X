package Desafio02;

import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] ninjas = new String[10];
        int ninjasCadastrados = 0;

        System.out.println("Sistema de cadastro de ninjas iniciado!!");

        while (true) {
            System.out.println("\n===== MENU DE GERENCIAMENTO DE NINJAS =====");
            System.out.println("1. Cadastrar novo Ninja");
            System.out.println("2. Listar todos os Ninjas");
            System.out.println("3. Sair");
            System.out.print("Hokage-sama, faca sua escolha: ");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    if (ninjasCadastrados < ninjas.length) {
                        System.out.print("Digite o nome do novo ninja: ");

                        scanner.nextLine();

                        String nomeNinja = scanner.nextLine();
                        ninjas[ninjasCadastrados] = nomeNinja;
                        ninjasCadastrados++;

                        System.out.println("--> Ninja " + nomeNinja + " cadastrado com sucesso!");
                    } else {
                        System.out.println("O resgistro de ninjas está cheio! Impossivel cadastrar.");
                    }
                    break;
                case 2:
                    if (ninjasCadastrados == 0) {
                        System.out.println("--> Nenhum ninja foi cadastrado na Vila da Folha ainda.");
                    } else {
                        System.out.println("\n===== LISTA DE NINJAS DE KONOHA =====");
                        for (int i = 0; i < ninjasCadastrados; i++) {
                            System.out.println((i + 1) + ". " + ninjas[i]);
                        }
                    }
                    break;
                case 3:
                    System.out.println("--> Encerrando sistema. Até a proxima, Hokage-sama!");
                    scanner.close();
                    return;

                default:
                    System.out.println("--> Opcao invalida! Por favor, escolha uma opcao valida");
                    break;
            }
        }

    }
}
