public class ContaBancaria {
    public double getSaldo(){
        double saldo = 2540;
        return saldo;
    }

    public static void main(String[] args) {
        ContaBancaria contaBancaria =  new ContaBancaria();
        contaBancaria.getSaldo();
        System.out.println("Seu saldo bancário é : " + contaBancaria.getSaldo());
    }
}
