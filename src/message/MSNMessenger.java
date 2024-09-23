package message;

// Classe melhorada com herança, abstração e polimorfismo!
public class MSNMessenger extends InstantMessageService {

    @Override
    public void enviarMensagem() {
        validarConexaoInternet();
        System.out.println("Enviando mensagem pelo MSN!");
    }

    @Override
    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo MSN!");
    }
}
