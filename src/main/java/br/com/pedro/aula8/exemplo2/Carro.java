package br.com.pedro.aula8.exemplo2;

public class Carro implements Veiculo {
    public void dirigir() {
        System.out.println("O carro está dirigindo.");
    }

    public void acelerar() {
        System.out.println("O carro está acelerando.");
    }

    public void frear() {
        System.out.println("O carro está freando.");
    }

    public void decolar() {
        throw new UnsupportedOperationException("Carros não podem decolar!");
    }

    public void aterrissar() {
        throw new UnsupportedOperationException("Carros não podem aterrissar!");
    }
}
