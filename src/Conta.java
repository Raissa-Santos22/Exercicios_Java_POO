public class Conta {
    public void sacar(){

    }

    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente();
        contaCorrente.sacar();

        ContaPoupanca contaPoupanca = new ContaPoupanca();
        contaPoupanca.sacar();
    }
}
