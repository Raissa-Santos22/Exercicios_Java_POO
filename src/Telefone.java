public class Telefone {
    public void ligarPara(String numero){
        System.out.println("Voce ligou para " + numero);
    }

    public static void main(String[] args) {
        Telefone telefone = new Telefone();
        telefone.ligarPara("40028922");
    }
}
