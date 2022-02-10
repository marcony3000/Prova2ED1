package br.edu.ifs.ED.Pilha;

public class Expressao {

    public static void imprimeResultado(String expressao){
        String resultadoDescricao = "incorreto";
        boolean resultado = verificaExpressao(expressao);
        if (resultado){
            resultadoDescricao = "correto";
        }
        System.out.println(expressao + " está " + resultadoDescricao);
    }

    final static String ABRE = "([{";
    final static String FECHA = ")]}";

    public static boolean verificaExpressao(String expressao){

        Pilha<Character> pilha = new Pilha<Character>();
        int index = 0;
        char simbolo, topo;

        while (index < expressao.length()){
            simbolo = expressao.charAt(index);

            if (ABRE.indexOf(simbolo) > -1){
                pilha.empilha(simbolo);

            } else if (FECHA.indexOf(simbolo) > -1){

                if (pilha.estaVazia()){
                    return false;
                } else {
                    topo = pilha.desempilha();

                    if (ABRE.indexOf(topo) != FECHA.indexOf(simbolo)){
                        return false;
                    }
                }
            }

            index++;
        }

        return true;
    }
}
