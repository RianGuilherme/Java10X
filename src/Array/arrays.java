package Array;

public class arrays {
    public static void main(String[] args) {
        // Arrays sao tipo referencia
        String[] ninja = new String[6];
        ninja[0] = "Naruto Uzumaki";
        ninja[1] = "Sasuke Uchiha";
        ninja[2] = "Sakura Haruno";
        ninja[3] = "Kakashi Hatake";
        ninja[4] = "Minato Uzumaki";
        System.out.println(ninja[5]);

        // Array idade
        int[] idade = new int[2];
        idade[0] = 16;
        System.out.println(idade[0]);

        // Array ponto flutuante
        double[] flutuante = new double[1];
        flutuante[0] = 1.5;
        System.out.println(flutuante[0]);

        // Array verdadeiroOuFalso
        boolean[] verdadeiroOuFalso = new boolean[1];
        verdadeiroOuFalso[0] = true;
        System.out.println(verdadeiroOuFalso[0]);

        // Redeclarar o ARRAY
        ninja = new String[7];
        ninja[0] = "Hashirama Senju";
        ninja[1] = "Tobirama Senju";
        ninja[2] = "Hiruzen Sarutobi";
        ninja[3] = "Minato Namikaze";
        ninja[4] = "Tsunade Senju";
        ninja[5] = "Kakashu Hatake";
        ninja[6] = "Naruto Uzumaki";

        // For para fazer um LOOP no array
        for (int i = 0; i < 7; i++) {
            System.out.println(ninja[i]);
        }
    }
}
