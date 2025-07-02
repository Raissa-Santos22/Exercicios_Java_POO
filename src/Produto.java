public class Produto {
    private int preco;
    private String nome;

    public void setNome(String nome){
        this.nome = nome;
    }
    public void setPreco(int preco){
        this.preco = preco;
    }
    public String getNome(){
        return nome;
    }
    public int getPreco(){
        return preco;
    }

    public static void main(String[] args) {
        Produto produto = new Produto();
        System.out.println("==========================");
        produto.setNome("Computador");
        produto.setPreco(2000);
        System.out.println("NOME DO PRODUTO : " + produto.getNome());
        System.out.println("PREÇO DO PRODUTO : " + produto.getPreco());
    }
}
