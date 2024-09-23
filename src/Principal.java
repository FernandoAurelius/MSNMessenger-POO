import message.FacebookMessenger;
import message.MSNMessenger;
import message.Telegram;

public class Principal {
    public static void main(String[] args) {
        MSNMessenger msn = new MSNMessenger();
        FacebookMessenger facebook = new FacebookMessenger();
        Telegram telegram = new Telegram();

        msn.enviarMensagem();
        msn.receberMensagem();

        facebook.enviarMensagem();
        facebook.receberMensagem();

        telegram.enviarMensagem();
        telegram.receberMensagem();
    }
}
