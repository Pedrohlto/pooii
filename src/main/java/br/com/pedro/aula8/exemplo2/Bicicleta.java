package br.com.pedro.aula8.exemplo2;

public class Bicicleta implements Veiculo {
    public void dirigir() {
        System.out.println("A bicicleta está dirigindo.");
    }

    public void acelerar() {
        throw new UnsupportedOperationException("Bicicletas não podem acelerar!");
    }

    public void frear() {
        System.out.println("A bicicleta está freando.");
    }

    public void decolar() {
        throw new UnsupportedOperationException("Bicicletas não podem decolar!");
    }

    public void aterrissar() {
        throw new UnsupportedOperationException("Bicicletas não podem aterrissar!");
    }
}