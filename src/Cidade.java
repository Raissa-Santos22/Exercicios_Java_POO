public class Cidade {
    public int getPopulacao(){
        int populacao = 2000000;
        return populacao;
    }

    public static void main(String[] args) {
        Cidade cidade = new Cidade();
        cidade.getPopulacao();
        System.out.println("A população da cidade é de : " + cidade.getPopulacao() + " milhoes de habitantes");
    }
}
