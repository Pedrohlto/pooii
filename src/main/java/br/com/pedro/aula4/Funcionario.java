package br.com.pedro.aula4;

public class Funcionario {

    private String nome;
    private String cargo;
    private double salario;
    private String cpf;
    private String email;

    public Funcionario(String nome, String cargo, double salario, String cpf, String email) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
        this.cpf = cpf;
        this.email = email;
    }

    public void modificarSalario(double porcentagem){
        this.salario  = this.salario + (this.salario * porcentagem);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }
}
