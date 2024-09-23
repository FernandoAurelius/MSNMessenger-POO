import message.FacebookMessenger;
import message.InstantMessageService;
import message.MSNMessenger;
import message.Telegram;

import java.util.Scanner;

// Fluxo melhorado utilizando polimorfismo!
public class Principal {
    public static void main(String[] args) {
        InstantMessageService ims = null;

        ims = getChosenApp(getAppName(), ims);

        ims.enviarMensagem();
        ims.receberMensagem();
    }

    private static InstantMessageService getChosenApp(String appName, InstantMessageService ims) {
        if (appName.equalsIgnoreCase("MSN")) {
            return new MSNMessenger();
        } else if (appName.equalsIgnoreCase("Facebook")) {
            return new FacebookMessenger();
        } else if (appName.equalsIgnoreCase("Telegram")) {
            return new Telegram();
        }
        return getChosenApp(getAppName(), ims);
    }

    private static String getAppName() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the messenger application (MSN/Facebook/Telegram): ");
        String appName = sc.nextLine();
        sc.close();
        return appName;
    }
}
