package message;

// Classe melhorada com herança, abstração e polimorfismo!
public class Telegram extends InstantMessageService {


    @Override
    public void enviarMensagem() {
        validarConexaoInternet();
        System.out.println("Enviando mensagem pelo Telegram!");
    }

    @Override
    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo Telegram!");
    }
}
