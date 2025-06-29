public class Moeda {
    public double getValor(){
        var valor = 1.00;
        return valor;
    }

    public static void main(String[] args) {
        Moeda moeda = new Moeda();
        System.out.println("O valor da moeda é " + moeda.getValor());
    }
}
