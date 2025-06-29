public class Email {
    public void enviarPara(String destinatario){
        System.out.println("O destinatario desse email é " + destinatario);
    }

    public static void main(String[] args) {
        Email email = new Email();
        email.enviarPara("amanda@gmail.com");
    }
}
