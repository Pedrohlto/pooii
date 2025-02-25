package br.com.pedro.aula7.exemplo1;

public class Main {

    public static void main(String[] args) {
        VeiculoTerrestre carro = new VeiculoTerrestre("Astra");
        carro.andar();


        VeiculoNautico barco = new Barco("Modelo de Barco");
        barco.navegar();

        Veiculo patinete = new Patinete("Modelo Patinete");
//        patinete.abastecer();
    }
}
