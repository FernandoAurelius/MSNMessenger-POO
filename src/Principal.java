public class Principal {
    public static void main(String[] args) {
        MSNMessenger msn = new MSNMessenger();

        // Não está de acordo com o encapsulamento, e está exibindo informações desnecessárias ao usuário final
        msn.validarConexaoInternet();
        msn.enviarMensagem();
        msn.salvarHistoricoMensagem();

        msn.receberMensagem();
    }
}
