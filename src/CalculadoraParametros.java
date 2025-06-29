public class CalculadoraParametros {
    public void somar(int a, int b){
        int soma = a + b;
        System.out.println("A soma de " + a  + " + " + b + " = " + soma );
    }

    public static void main(String[] args) {
        CalculadoraParametros calculadora = new CalculadoraParametros();
        calculadora.somar(4,5);
    }
}
