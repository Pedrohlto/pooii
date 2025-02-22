package br.com.pedro.aula6.exemplo1;

public class CalculoSalarioAnalista implements RegraDeCalculo{
    @Override
    public double calcularSalario(double salarioBase) {
        double descontoVR = salarioBase * 0.03;
        double descontoVT = salarioBase * 0.06;
        return (salarioBase - descontoVR - descontoVT);
    }
}
