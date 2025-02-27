package br.com.pedro.aula9.exemplo1;

public class PushNotification implements Sender{
    @Override
    public void send(String msgs) {
        System.out.println("Notificação por push");
    }
}
