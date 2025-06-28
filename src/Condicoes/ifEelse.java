package Condicoes;

public class ifEelse {
    public static void main(String[] args) {

        String name = "Naruto Uzumaki";
        String Rank;
        int idade = 16;
        boolean Hokage = false;
        short numeroDeMissoes = 19;

        if (numeroDeMissoes == 10 && idade > 15) {
            System.out.println("Rank: Chunnin");
        } else if (numeroDeMissoes >= 20) {
            System.out.println("Rank: Jounnin");
        } else {
            System.out.println("Rank: Gennin");
        }
    }
}
