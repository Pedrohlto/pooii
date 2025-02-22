package br.com.pedro.aula6.exemplo1;

public class CalculadoraRH {

    public double calcularSalario(Funcionario funcionario, RegraDeCalculo regraDeCalculo) {
        return regraDeCalculo.calcularSalario(funcionario.getSalarioBase()) - consultaTributoFederal();
    }
//
//    public double calcularFerias(Funcionario funcionario, RegraDeCalculoFerias regraDeCalculoFerias) {
//
//    }

//    public double calcularSalario(Funcionario funcionario) {
//        if (funcionario.getCargo().equalsIgnoreCase("Analista")) {
//            double salario = funcionario.getSalarioBase();
//            double descontoVR = salario * 0.03;
//            double descontoVT = salario * 0.06;
//            return (salario - descontoVR - descontoVT) - consultaTributoFederal();
//        } else if (funcionario.getCargo().equalsIgnoreCase("Gerente")) {
//            return funcionario.getSalarioBase()  - consultaTributoFederal();
//        } else if (funcionario.getCargo().equalsIgnoreCase("Estagiário")) {
//            double salario = funcionario.getSalarioBase();
//            double descontoVR = salario * 0.06;
//            double descontoVT = salario * 0.09;
//            double descontoAssistenciaMedica = salario * 0.05;
//            return (salario - descontoVR - descontoVT - descontoAssistenciaMedica) - consultaTributoFederal();
//        } else {
//            throw new IllegalArgumentException("Cargo não reconhecido.");
//        }


    private double consultaTributoFederal() {
        return 1;
    }
}
