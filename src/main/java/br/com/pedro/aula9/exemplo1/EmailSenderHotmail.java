package br.com.pedro.aula9.exemplo1;

public class EmailSenderHotmail implements Sender{
    @Override
    public void send(String msgs) {
        System.out.println("Enviando email hotmail");
        System.out.println(msgs);
    }
}
