package br.com.pedro.aula7.exemplo1;

public class VeiculoNautico extends Veiculo{
    public VeiculoNautico(String modelo) {
        super(modelo);
    }

    public void navegar(){
        System.out.println("Navegando");
    }
}
