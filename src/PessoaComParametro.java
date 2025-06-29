public class PessoaComParametro {
    public void andar(int metros){
        System.out.println("Voce andou : " + metros + " metros");
    }

    public static void main(String[] args) {
       PessoaComParametro pessoa = new PessoaComParametro();
       pessoa.andar(200);
    }
}
