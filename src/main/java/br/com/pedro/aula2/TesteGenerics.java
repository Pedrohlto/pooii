package br.com.pedro.aula2;

import br.com.pedro.aula1.exercicio.Pdf;

public class TesteGenerics {

    public static void main(String[] args) {
        Caixa caixaDeString = new Caixa<>();
        caixaDeString.setConteudo("Uma String");
        caixaDeString.setConteudo(123);

        Caixa<Pdf> caixaComArquivosPdf = new Caixa<>();
        caixaComArquivosPdf.setConteudo(new Pdf());

        CarrinhoControle<Gasolina> carrinho = new CarrinhoControle<>();

        CarrinhoControle<Pilha> carrinhoDePilha = new CarrinhoControle<>();
    }
}
