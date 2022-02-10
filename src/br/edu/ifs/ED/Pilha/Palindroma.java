package br.edu.ifs.ED.Pilha;

public class Palindroma {

    public static void imprimeResultado(String palavra){
        boolean resultado = testaPalindromo(palavra);
        String resultadoDescricao = " Não é Palindromo";
        if (resultado){
            resultadoDescricao = " É Palindromo";
        }
        System.out.println(palavra + resultadoDescricao);
    }

    public static boolean testaPalindromo(String palavra){

        Pilha<Character> pilha = new Pilha<Character>();

        for (int i=0; i<palavra.length(); i++){
            pilha.empilha(palavra.charAt(i));
        }

        String palavraInversa = "";
        while (!pilha.estaVazia()){
            palavraInversa += pilha.desempilha();
        }

        if (palavraInversa.equalsIgnoreCase(palavra)){
            return true;
        }

        return false;
    }
}
