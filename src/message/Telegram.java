package message;

// Classe melhorada com herança e abstração!
public class Telegram extends InstantMessageService {


    @Override
    public void enviarMensagem() {
        System.out.println("Enviando mensagem pelo Telegram!");
    }

    @Override
    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo Telegram!");
    }
}
