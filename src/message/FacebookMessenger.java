package message;

// Classe melhorada com herança e abstração!
public class FacebookMessenger extends InstantMessageService {

    @Override
    public void enviarMensagem() {
        System.out.println("Enviando mensagem pelo Facebook!");
    }

    @Override
    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo Facebook!");
    }
}
