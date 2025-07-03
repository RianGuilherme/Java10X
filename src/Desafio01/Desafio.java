package Desafio01;

public class Desafio {
    public static void main(String[] args) {
        /*
        * Crie um programa que representa tres ninjas da Vila da Folha (Konoha)
        * de "Naruto" e suas respectivas missoes.
        *
        * Cada ninja tem um nome, uma idade e uma missao atribuida a ele, como
        * o nome da missao, nivel de dificuldade e status de conclusao.
        * */

        String ninja1 = "Naruto Uzumaki";
        int idadeNinja1 = 14;
        String missaoNinja1 = "Peitar o Madara";
        char dificuldadeMisaoNinja1 = 'S';
        boolean StatusNinja1 = true;

        if (idadeNinja1 < 15) {
            if (dificuldadeMisaoNinja1 == 'C' || dificuldadeMisaoNinja1 == 'D') {
                StatusNinja1 = true;
            } else {
                StatusNinja1 = false;
            }
        }


        String ninja2 = "Sasuke Uchiha";
        int idadeNinja2 = 17;
        String missaoNinja2 = "X1 contra o Itachi";
        char dificuldadeMissaoNinja2 = 'A';
        boolean StatusNinja2 = true;

        if (idadeNinja2 <15) {
            if (dificuldadeMissaoNinja2 == 'C' || dificuldadeMissaoNinja2 == 'D') {
                StatusNinja2 = true;
            } else {
                StatusNinja2 = false;
            }
        }

        String ninja3 = "Sakura Haruno";
        int idadeNinja3 = 16;
        String missaoNinja3 = "Parar de ser Chata";
        char dificuldadeMissaoNinja3 = 'D';
        boolean StatusNinja3 = false;

        if (idadeNinja3 <15) {
            if ( dificuldadeMissaoNinja3 == 'C' || dificuldadeMissaoNinja3 == 'D') {
                StatusNinja3 = true;
            } else {
                StatusNinja3 = false;
            }
        }

        System.out.println("--- REGISTRO DE NINJAS DE KONOHA ---");
        System.out.println(" ");

        System.out.println("### DETALHE DO NINJA 1 ###");
        System.out.println("Nome: "+ ninja1);
        System.out.println("Idade: "+ idadeNinja1);
        System.out.println("Missao: "+ missaoNinja1);
        System.out.println("Dificuldade: " + dificuldadeMisaoNinja1);

        if (StatusNinja1) {
            System.out.println("Status da Missao: realizada com SUCESSO!!");
        } else {
            System.out.println("Missao em andamento!!");
        }

        System.out.println(" ");
        System.out.println("### DETALHE DO NINJA 2 ###");
        System.out.println("Nome: "+ ninja2);
        System.out.println("Idade: "+idadeNinja2);
        System.out.println("Missao: "+missaoNinja2);
        System.out.println("Dificuldade: "+ dificuldadeMissaoNinja2);

        if (StatusNinja2) {
            System.out.println("Status da Missao: Realizada com SUCESSO!!");
        } else {
            System.out.println("Status da Missao: Em andamento!!");
        }

        System.out.println(" ");
        System.out.println("### DETALHE DO NINJA 3 ###");
        System.out.println("Nome: "+ninja3);
        System.out.println("Idade: "+ idadeNinja3);
        System.out.println("Missao: "+ missaoNinja3);
        System.out.println("Dificuldade: "+ dificuldadeMissaoNinja3);

        if (StatusNinja3) {
            System.out.println("Status da Missao: Realizada com SUCESSO!!");
        } else {
            System.out.println("Status da Missao: Em andamento!!");
        }
    }
}
