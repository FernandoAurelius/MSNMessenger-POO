package message;

import java.lang.String;

public class InstantMessageService {

    public String name;

    public InstantMessageService(String name) {
        this.name = name;
    }

    public void enviarMensagem() {
        validarConexaoInternet();
        System.out.println("Enviando mensagem pelo " + name);
        salvarHistoricoMensagem();
    }

    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo " + name);
    }

    private void validarConexaoInternet() {
        System.out.println("Validando se está conectado à Internet");
    }

    private void salvarHistoricoMensagem() {
        System.out.println("Salvando mensagem no histórico");
    }
}
