package br.com.pedro.aula6.exemplo1;

public class CalculoSalarioEstagiario implements RegraDeCalculo{
    @Override
    public double calcularSalario(double salarioBase) {
        double descontoVR = salarioBase * 0.06;
        double descontoVT = salarioBase * 0.09;
        double descontoAssistenciaMedica = salarioBase * 0.05;
        return (salarioBase - descontoVR - descontoVT - descontoAssistenciaMedica);
    }
}
