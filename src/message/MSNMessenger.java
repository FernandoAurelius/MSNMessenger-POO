package message;

public class MSNMessenger {
    public void enviarMensagem() {
        validarConexaoInternet();
        System.out.println("Enviando mensagem");
        salvarHistoricoMensagem();
    }

    public void receberMensagem() {
        System.out.println("Recebendo mensagem");
    }

    private void validarConexaoInternet() {
        System.out.println("Validando se está conectado à Internet");
    }

    private void salvarHistoricoMensagem() {
        System.out.println("Salvando mensagem no histórico");
    }
}
