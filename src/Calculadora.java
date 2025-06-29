public class Calculadora {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        System.out.println("Soma : " + calculadora.somar());
    }
    public int somar(){
        var n1 = 3;
        var n2 = 5;
        return n1 + n2;
    }
}
