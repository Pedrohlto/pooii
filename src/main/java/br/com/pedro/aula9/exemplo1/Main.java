package br.com.pedro.aula9.exemplo1;

public class Main {

    public static void main(String[] args) {

        Pessoa pessoaExemplo = new Pessoa();
        pessoaExemplo.setTelefone("119765858487");

        NotificationService servicoNotificacao = new NotificationService(new EmailSenderGmail());
        NotificationService servicoDois = new NotificationService(new WhatsappNotification());

        System.out.println("");






    }
}
