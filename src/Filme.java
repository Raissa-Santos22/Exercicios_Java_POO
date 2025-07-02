public class Filme {
    private String nome;
    private int duracao;

    public void setNome(String nome){
        this.nome = nome;
    }
    public void setDuracao(int duracao){
        this.duracao = duracao;
    }
    public String getNome(){
        return nome;
    }
    public int getDuracao(){
        return duracao;
    }

    public static void main(String[] args) {
        Filme filme = new Filme();
        filme.setNome("Vingadores Ultimato");
        filme.setDuracao(3);

        System.out.println("==========================================");
        System.out.println("   FICHA DO FILME                         ");
        System.out.println("NOME : " + filme.getNome());
        System.out.println("DURAÇAO : " + filme.getDuracao() + "  HORAS");
        System.out.println("===========================================");
    }

}
