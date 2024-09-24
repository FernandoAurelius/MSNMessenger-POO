import message.FacebookMessenger;
import message.InstantMessageService;
import message.MSNMessenger;
import message.Telegram;

import java.util.Scanner;

// Fluxo melhorado utilizando polimorfismo!
public class Principal {
    public static void main(String[] args) {
        InstantMessageService ims;

        ims = getChosenApp(getAppName());

        ims.enviarMensagem();
        ims.receberMensagem();
    }

    private static InstantMessageService getChosenApp(String appName) {
        if (appName.equalsIgnoreCase("MSN")) {
            return new MSNMessenger();
        } else if (appName.equalsIgnoreCase("Facebook")) {
            return new FacebookMessenger();
        } else if (appName.equalsIgnoreCase("Telegram")) {
            return new Telegram();
        }
        System.out.println("Você escolheu um serviço inválido. Por favor, tente novamente: ");
        return getChosenApp(getAppName());
    }

    private static String getAppName() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the messenger application (MSN/Facebook/Telegram): ");
        return sc.nextLine();
    }
}
