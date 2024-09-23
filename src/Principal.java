public class Principal {
    public static void main(String[] args) {
        MSNMessenger msn = new MSNMessenger();

        // Agora está de acordo com o encapsulamento, e não exibe informações desnecessárias ao usuário final.
        msn.enviarMensagem();
        msn.receberMensagem();
    }
}
