package br.com.pedro.aula1.exemploControleRemoto;

public interface ControleRemoto {

    void ligar();
    void desligar();
    String trocarCanal(String numeroCanal);
    String aumentarVolume();
    String abaixarVolume();
    String mute();

}
