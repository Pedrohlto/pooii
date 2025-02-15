package br.com.pedro.aula2;

import br.com.pedro.aula1.exercicio.Pdf;

public class TesteGenerics {

    public static void main(String[] args) {
        Caixa<String> caixaDeString = new Caixa<>();
        caixaDeString.setConteudo("Uma String");

        Caixa<Pdf> caixaComArquivosPdf = new Caixa<>();
        caixaComArquivosPdf.setConteudo(new Pdf());

        CarrinhoControle<Gasolina> carrinho = new CarrinhoControle<>();

        CarrinhoControle<Pilha> carrinhoDePilha = new CarrinhoControle<>();
    }
}
