package br.com.pedro.aula9.exemplo1;

public class NotificationService {

    private Sender sender;

    public NotificationService(Sender sender) {
        this.sender = sender;
    }

    public void setSender(Sender sender){
        this.sender = sender;
    }

    public void sendNotification(String message) {
        System.out.println("Processing notification...");
        sender.send(message);
    }
}
