package TiposDeDados;

public class DadosPrimitivos {
    public static void main(String[] args) {
        /*
        * Dados primitivos - int, double, float, char, boolean, short
        * Objetivo de aula: Criar um ninja - Naruto -
        * */

        int idade = 17; // valor maximo 2147483647
        double altura = 1.65;
        char inicial = 'N';
        boolean vivoOuMorto = true;
        Long saldoBancario = 203147483649L ; // Valor maximo 9,223,373,036,854,775,807

        System.out.println(idade); // comando para mostrar para o usuario
        System.out.println(saldoBancario);
        System.out.println(altura);
        System.out.println("saldo Bancario é = " + saldoBancario);
        System.out.println("Minha idade é: " + idade);

    }
}
