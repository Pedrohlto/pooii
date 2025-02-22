package br.com.pedro.aula6.exemplo2;

public class Main {

    public static void main(String[] args) {
        /*FormatadorTexto formatador = new FormatadorTexto();
        System.out.println(formatador.formatar("Olá, mundo!", "maiusculo"));
        System.out.println(formatador.formatar("Olá, mundo!", "asterisco"));*/

        TextoSimples textoSimples = new TextoSimples();
        MaiusculoDecorator maiusculoDecorator = new MaiusculoDecorator(textoSimples);
        AsteriscoDecorator asteriscoDecorator = new AsteriscoDecorator(maiusculoDecorator);
        System.out.println(maiusculoDecorator.formatar("Texto passado por fora"));


    }
}
