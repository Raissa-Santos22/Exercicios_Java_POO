public class ContaBancaria {
    private String titular;
    private int saldo;

    public void setTitular(String titular){
        this.titular = titular;
    }
    public void setSaldo(int saldo){
        this.saldo = saldo;
    }

    public String getTitular(){
        return titular;
    }
    public int getSaldo(){
        return saldo;
    }

    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
        conta.setSaldo(3690);
        conta.setTitular("João Pedro");

        System.out.println("==========================================");
        System.out.println("TITULAR DA CONTA : " + conta.getTitular());
        System.out.println("SALDO DA CONTA : " + conta.getSaldo());
        System.out.println("==========================================");
    }
}

