package message;

// Classe melhorada com herança, abstração e polimorfismo!
public class FacebookMessenger extends InstantMessageService {

    @Override
    public void enviarMensagem() {
        validarConexaoInternet();
        System.out.println("Enviando mensagem pelo Facebook!");
    }

    @Override
    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo Facebook!");
    }
}
