package message;

// Classe repetindo redundantemente o mesmo código, o que pode ser melhorado com herança!
public class FacebookMessenger extends InstantMessageService {
    public FacebookMessenger() {
        super("Facebook");
    }
}
