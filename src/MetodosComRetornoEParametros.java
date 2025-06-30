import java.sql.SQLOutput;
public class MetodosComRetornoEParametros {
    public int somar(int a , int b){
        return a + b;
    }
    public int par(int numero) {
       return numero;
    }

    public String saudacao(String nome){
        return nome;
    }
    public int nascer(int ano_Nacimento){
        int ano_Atual = 2025;
        return ano_Atual - ano_Nacimento;
    }
    public double calcularMedia(int n1, int n2, int n3){
        return (n1 + n2 + n3) /3.0;
    }
    public int Acrescimo(int valor, int taxa){
        return valor + taxa;
    }
    public int Fatorial(int numero){
        int fatorial = 1;
        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }
        return fatorial;
    }
    public int maior(int n1, int n2){
        if(n1 > n2){
            System.out.println("O numero 1 é o maior");
            return n1;
        }else{
            System.out.println("O numero 2 é o maior");
            return n2;
        }
    }

    public static void main(String[] args) {
        MetodosComRetornoEParametros metodos = new MetodosComRetornoEParametros();
        System.out.println("A soma dos numeros é igual a : " + metodos.somar(3,4));
        if(metodos.par(4) % 2 == 0){
            System.out.println("O numero é par");
        }else{
            System.out.println("O numero não é par");
        }
        System.out.println("Bem vindo ao nosso sistema : " + metodos.saudacao("Ana"));
        System.out.println("Voce tem " + metodos.nascer(1998) + " anos");
        System.out.println("A sua média foi : " + metodos.calcularMedia(4,6,9));
        if(metodos.calcularMedia(4,6,9) > 6){
            System.out.println("Parabéns, voce foi aprovado!");
        }else{
            System.out.println("Infelizmente voce foi reprovado e terá que fazer a recuperação");
        }
        System.out.println("O valor total após o acrescimo foi de " + metodos.Acrescimo(100, 30) + " R$");
        System.out.println("O valor do fatorial é " + metodos.Fatorial(9));
        System.out.println(metodos.maior(3,4));
    }

}
