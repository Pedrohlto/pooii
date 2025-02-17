package br.com.pedro.aula2.armazem;

public class Tablet {

    private String marca;
    private String modelo;
    private boolean eh3G;

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

    public boolean isEh3G() {
        return eh3G;
    }

    public void setEh3G(boolean eh3G) {
        this.eh3G = eh3G;
    }
}
