package br.com.pedro.aula2.exercicio;

public class Roupa {

    private String modelo;
    private String cor;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Roupa{" +
                "modelo='" + modelo + '\'' +
                ", cor='" + cor + '\'' +
                '}';
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}
