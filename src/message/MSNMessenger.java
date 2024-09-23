package message;

// Classe melhorada com herança e abstração!
public class MSNMessenger extends InstantMessageService {

    @Override
    public void enviarMensagem() {
        System.out.println("Enviando mensagem pelo MSN!");
    }

    @Override
    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo MSN!");
    }
}
