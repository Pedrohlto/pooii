package br.com.pedro.aula6.exemplo2;

public class MaiusculoDecorator extends DecoratorTexto{

    public MaiusculoDecorator(Formatador formatador) {
        super(formatador);
    }

    @Override
    public String formatar(String texto){
        return super.formatar(texto).toUpperCase();
    }
}
