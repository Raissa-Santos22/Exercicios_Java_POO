import java.sql.SQLOutput;
public class MetodosComRetornoEParametros {
    public static int somar(int a , int b){
        return a + b;
    }
    public static int par(int numero) {
       return numero;
    }

     public static String saudacao(String nome){
        return nome;
    }
    public static int nascer(int ano_Nacimento){
        int ano_Atual = 2025;
        return ano_Atual - ano_Nacimento;
    }
    public static double calcularMedia(int n1, int n2, int n3){
        return (n1 + n2 + n3) /3.0;
    }
    public static int acrescimo(int valor, int taxa){
        return valor + taxa;
    }
    public static int fatorial(int numero){
        int fatorial = 1;
        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }
        return fatorial;
    }
    public static int maior(int n1, int n2){
        if(n1 > n2){
            return n1;
        }else{
            return n2;
        }
    }
    public static void main(String[] args) {
        System.out.println("A soma dos numeros é igual a : " + somar(3,4));
        if(par(4) % 2 == 0){
            System.out.println("O numero é par");
        }else{
            System.out.println("O numero não é par");
        }
        System.out.println("Bem vindo ao nosso sistema : " + saudacao("Ana"));
        System.out.println("Voce tem " + nascer(1998) + " anos");
        System.out.println("A sua média foi : " + calcularMedia(4,6,9));
        if(calcularMedia(4,6,9) > 6){
            System.out.println("Parabéns, voce foi aprovado!");
        }else{
            System.out.println("Infelizmente voce foi reprovado e terá que fazer a recuperação");
        }
        System.out.println("O valor total após o acrescimo foi de " + acrescimo(100, 30) + " R$");
        System.out.println("O valor do fatorial é " + fatorial(9));
        System.out.println("O numero maior é : " + maior(3,4));
    }

}
