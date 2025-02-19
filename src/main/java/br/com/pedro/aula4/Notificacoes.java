package br.com.pedro.aula4;

public class Notificacoes {

    public void enviarEmailPromocao(Funcionario funcionario) {
        System.out.println("Enviando e-mail de promoção para " + funcionario.getEmail());
    }
}
