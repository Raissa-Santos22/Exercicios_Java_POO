public class MetodosEstaticos {
    public static void dobrar(int x){
        int dobro = x * 2;
        System.out.println(dobro);
    }

    public static int ehpar(int numero){
        return numero;
    }
    public static double valor(double numero){
        return numero;
    }

    public static void conversor(){
        double celsius = 28;
        double fahrenheit = (celsius * 9)/5 + 32;
        System.out.println(celsius + " graus Celsius equivalem a : " + fahrenheit + " fahrenheit");
    }

    public static void datar(){
        System.out.println("A data atual é : 03/07/25");
    }

    public static int maior(int n1, int n2){
        if(n1 > n2){
            return n1;
        }else{
            return n2;
        }
    }
    public static double calcularRaizQuadrada(int numero){
        return Math.sqrt(numero);
    }

    public static void mensagem(){
        System.out.println("Bem vindo ao sistema!");
    }

    public static int calcularFatorial(int numero){
        int fatorial = 1;
        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }
        return fatorial;

    }
    public static void main(String[] args) {
        dobrar(9);
        if(ehpar(4) % 2 == 0){
            System.out.println("O numero " + ehpar(4) + " é par");
        }else{
            System.out.println("O numero " + ehpar(4) + " não é par");
        }
        conversor();
        System.out.println(valor(3.14));
        datar();
        System.out.println("O numero maior é " + maior(1,9));
        System.out.println("A raiz quadrado do numero é : " + calcularRaizQuadrada(9));
        mensagem();
        System.out.println("O valor do fatorial do número é " + calcularFatorial(8));
    }
}
