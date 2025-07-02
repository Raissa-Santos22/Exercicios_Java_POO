public class Empresa {
    private long cnpj;
    private String nome;

    public void setNome(String nome){
        this.nome = nome;
    }
    public void setCNPJ(long cnpj){
        this.cnpj = cnpj;
    }
    public String getNome(){
        return nome;
    }
    public long getCnpj(){
        return cnpj;
    }

    public static void main(String[] args) {
        Empresa empresa = new Empresa();
        empresa.setNome("Amazon");
        empresa.setCNPJ(1234567890);

        System.out.println("=====================================");
        System.out.println("NOME DA EMPRESA  : " + empresa.getNome());
        System.out.println("CNPJ DA EMPRESA  " + empresa.getCnpj());
        System.out.println("======================================");
    }

}
