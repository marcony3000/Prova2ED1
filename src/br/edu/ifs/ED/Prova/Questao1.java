package br.edu.ifs.ED.Prova;
import br.edu.ifs.ED.Pilha.Expressao;
import br.edu.ifs.ED.Pilha.Pilha;

public class Questao1 {

    public static void main(String[] args) {

        System.out.println("Resposta Letra A");

        Expressao.imprimeResultado("(5+3*{2*[3+4]})");
        Expressao.imprimeResultado("(5+3*{2*[3+4})");
        Expressao.imprimeResultado("5+3*{2*3+4})");

        System.out.println("Ressposta Letra B");

        Expressao.imprimeResultado("(5+3∗{2∗[3+4]})");
        Expressao.imprimeResultado("(5+3{2∗[3+4}");
        Expressao.imprimeResultado("5+3∗∗{2∗3+4})");

        Expressao.imprimeResultado("{2*[3*(2+1)+2]+1}");
    }
}

