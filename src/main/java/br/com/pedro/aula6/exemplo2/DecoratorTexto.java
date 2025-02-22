package br.com.pedro.aula6.exemplo2;

public abstract class DecoratorTexto implements Formatador{

    protected Formatador formatador;

    public DecoratorTexto(Formatador formatador){
        this.formatador = formatador;
    }

    @Override
    public String formatar(String texto){
        return formatador.formatar(texto);
    }

}
