package br.com.pedro.aula6.exemplo1;

public class Main {

    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario("Pedro", "Analista", 1000);
        Funcionario funcionario2 = new Funcionario("João", "Gerente", 1000);
        Funcionario funcionario3 = new Funcionario("Paulo", "Estagiário", 1000);

        CalculadoraRH calculadoraRH = new CalculadoraRH();

        System.out.println(calculadoraRH.calcularSalario(funcionario, new CalculoSalarioAnalista()));
        System.out.println(calculadoraRH.calcularSalario(funcionario2, new CalculoSalarioGerente()));
        System.out.println(calculadoraRH.calcularSalario(funcionario3, new CalculoSalarioEstagiario()));
        System.out.println(calculadoraRH.calcularSalario(funcionario3, new CalculoSalarioPleno()));

    }
}
