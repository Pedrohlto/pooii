package br.com.pedro.aula6.exemplo1;

public class Funcionario {

    private String nome;
    private String cargo;
    private double salarioBase;


    public Funcionario(String nome, String cargo, double salarioBase) {
        this.nome = nome;
        this.cargo = cargo;
        this.salarioBase = salarioBase;
    }

    public String getCargo() {
        return cargo;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public String getNome() {
        return nome;
    }
}
