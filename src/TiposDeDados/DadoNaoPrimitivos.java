package TiposDeDados;

import java.util.Locale;

public class DadoNaoPrimitivos {
    public static void main(String[] args) {
        // tudo que for digitado aqui dentro com o comando PSVM vai ser compilado pelo java

        /*
         * Dados nao primitivos: String, Array, Enum
         * Objetivo: Criar um ninja, e atribuir metodos a ele.
         * */

        String nome = "Naruto Uzumaki";
        String nomeEmCaixaAlta = nome.toUpperCase();
        System.out.println("Esse texto esta em CAPSLOCK: " + nomeEmCaixaAlta);
        System.out.println("Esse texto esta normal: " + nome);

        String aldeia = "Aldeia da Folha";
        String aldeiaEmCaixaBaixa = aldeia.toLowerCase();
        System.out.println(aldeiaEmCaixaBaixa);
    }
}
