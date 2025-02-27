package br.com.pedro.aula9.exemplo1;

public class EmailSenderGmail implements Sender {

    @Override
    public void send(String msgs) {
        System.out.println("autenticando o e-mail");
        System.out.println("Validando destinatario");
        System.out.println("Sending email: " + msgs);
        System.out.println("Recebendo resposta");
    }
}
