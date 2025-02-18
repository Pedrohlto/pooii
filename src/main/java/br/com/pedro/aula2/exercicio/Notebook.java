package br.com.pedro.aula2.exercicio;

public class Notebook {

    public String marca;
    public String modelo;
    public String memoria;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMemoria() {
        return memoria;
    }

    public void setMemoria(String memoria) {
        this.memoria = memoria;
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", memoria='" + memoria + '\'' +
                '}';
    }
}
