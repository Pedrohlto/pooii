package br.com.pedro.aula9.exemplo1;

public class WhatsappNotification implements Sender {
    @Override
    public void send(String msgs) {
        System.out.println("Mandando por whatsapp");
    }
}
