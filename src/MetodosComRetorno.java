public class MetodosComRetorno {

    public static int getMedia() {
         int nota1 = 5;
         int nota2 = 7;
         int nota3 = 2;
         int soma = nota1 + nota2 + nota3;
         int media = soma / 3;
         return media;
    }

    public static int somar(){
        var n1 = 3;
        var n2 = 5;
        return n1 + n2;
    }

    public static int getVelocidadeMaxima() {
        int velocidade = 40;
        if(velocidade > 60){
            System.out.println("Voce ultrapassou o limite de velocidade e será MULTADO");
        }else{
            System.out.println("Voce esta dentro do limite de velocidade");
        }
        return velocidade;
    }

    public static String getMarca(){
        String marca = "Apple";
        return marca;
    }

    public static int getPopulacao(){
        int populacao = 2000000;
        return populacao;
    }

    public static double getMemoriaRam(){
        double memoriaRam = 8;
        return memoriaRam;
    }

    public static int getSaldo(){
        int saldo = 2540;
        return saldo;

    }

    public static String getLivro(){
        String livro = "Orgulho e Preconceito";
        return livro;
    }
    public static double getValor(){
        var valor = 1.00;
        return valor;
    }
    public static String getNome(){
        var nome = "Ana";
        return nome;
    }

    public static int lerTemperatura(){
        var temperatura = 30;
        return temperatura;
    }

    public static void main(String[] args) {
        System.out.println("A média do aluno foi : " + getMedia());
        System.out.println("A soma dos numeros é igual a " + somar());
        System.out.println("A sua velocidade é : " + getVelocidadeMaxima() +  "Km/h");
        System.out.println("A sua marca de celular é : " + getMarca());
        System.out.println("A cidade tem " + getPopulacao() + " milhões de habitantes");
        System.out.println("A memoria RAM é de " + getMemoriaRam() + "Gb");
        System.out.println("Seu saldo bancário é de R$ " + getSaldo());
        System.out.println("O nome do livro é " + getLivro());
        System.out.println("O valor é de " + getValor());
        System.out.println("Bem vinda ao sistema " + getNome());
        System.out.println("A temperatura atual é de " + lerTemperatura());
    }



}
