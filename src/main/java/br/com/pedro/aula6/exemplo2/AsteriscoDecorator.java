package br.com.pedro.aula6.exemplo2;

public class AsteriscoDecorator extends DecoratorTexto{
    public AsteriscoDecorator(Formatador formatador) {
        super(formatador);
    }

    @Override
    public String formatar(String texto){
        return "*" + super.formatar(texto) + "*";
    }
}
