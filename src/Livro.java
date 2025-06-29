public class Livro {
    public String getLivro(){
        String livro = "Orgulho e Preconceito";
        return livro;
    }

    public static void main(String[] args) {
        Livro livro = new Livro();
        System.out.println("O livro é : " + livro.getLivro());
    }
}
