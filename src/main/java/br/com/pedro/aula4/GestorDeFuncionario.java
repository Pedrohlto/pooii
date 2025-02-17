package br.com.pedro.aula4;

public class GestorDeFuncionario {

    private String nome;
    private String cargo;
    private double salario;

    public GestorDeFuncionario(String nome, String cargo, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    public void aumentarSalario(double percentual) {
        this.salario += this.salario * (percentual / 100);
    }

    public void salvarNoBanco() {
        System.out.println("Salvando " + nome + " no banco de dados...");
    }

    public String gerarRelatorio() {
        return "Funcionário: " + nome + ", Cargo: " + cargo + ", Salário: " + salario;
    }

    public void enviarEmailPromocao() {
        System.out.println("Enviando e-mail de promoção para " + nome);
    }

    public void calcularImpostos() {
        double imposto = salario * 0.2;
        System.out.println("Imposto calculado para " + nome + ": " + imposto);
    }

    public void validarCPF(String cpf) {
        System.out.println("Validando CPF: " + cpf);
    }

    public void exportarParaCSV() {
        System.out.println("Exportando dados do funcionário para CSV...");
    }

    public void imprimirCracha() {
        System.out.println("Imprimindo crachá para " + nome);
    }
}
