package message;

// Classe repetindo redundantemente o mesmo código, o que pode ser melhorado com herança!
public class FacebookMessenger {
    public void enviarMensagem() {
        validarConexaoInternet();
        System.out.println("Enviando mensagem pelo Facebook");
        salvarHistoricoMensagem();
    }

    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo Facebook");
    }

    private void validarConexaoInternet() {
        System.out.println("Validando se está conectado à Internet");
    }

    private void salvarHistoricoMensagem() {
        System.out.println("Salvando mensagem no histórico");
    }
}
