package message;

// Superclasse aplicando abstração!
public abstract class InstantMessageService {
    public abstract void enviarMensagem();
    public abstract void receberMensagem();

    protected void validarConexaoInternet() {
        System.out.println("Validando se está conectado à Internet");
    }
}
