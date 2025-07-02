public class Endereco {
    private String rua;
    private String cidade;
    private int numeroCasa;

    public void setRua(String rua){
        this.rua = rua;
    }
    public void setCidade(String cidade){
        this.cidade = cidade;
    }
    public void setNumeroCasa(int numeroCasa){
        this.numeroCasa = numeroCasa;
    }

    public String getRua(){
        return rua;
    }

    public String getCidade(){
        return cidade;
    }

    public int getNumeroCasa(){
        return numeroCasa;
    }

    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setCidade("RJ");
        endereco.setRua("Duque de caxias");
        endereco.setNumeroCasa(45);

        System.out.println("===========================");
        System.out.println("      ENDEREÇO             ");
        System.out.println("===========================");
        System.out.println("CIDADE :   " + endereco.getCidade());
        System.out.println("RUA : "      + endereco.getRua());
        System.out.println("NUMERO : "   + endereco.getNumeroCasa());
        System.out.println("===========================");
    }
}
