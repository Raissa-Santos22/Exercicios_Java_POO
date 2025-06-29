public class Pessoa {
    public String getNome(){
        var nome = "Ana";
        return nome;
    }

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        System.out.println("O nome é : " + pessoa.getNome());
    }

}
