public class MensagemComParametro {
    public void enviar(String texto){
        System.out.println(texto);
    }

    public static void main(String[] args) {
        MensagemComParametro mensagem = new MensagemComParametro();
        mensagem.enviar("Bem vindo!");
    }
}
