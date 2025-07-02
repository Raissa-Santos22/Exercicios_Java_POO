public class Sobrecarga {
    public int somar(int n1, int n2){
        return n1 + n2;
    }
    public int somar(int n1, int n2, int n3){
        return n1 + n2 + n3;
    }
    public double somar(double n1, double n2){
        return n1 + n2;
    }

    public void exibir(String mensagem){
        System.out.println(mensagem);
        System.out.println("=======================");
    }
    public void exibir(String mensagem, int numero){
        int contador = 0;
        while(contador < numero) {
            contador++;
            System.out.println(mensagem);

        }
        System.out.println("=======================");
    }
    public void calcularArea(int lado){
       int areaQuadrado = lado * lado;
        System.out.println("A area do quadrado é : " + areaQuadrado);
        System.out.println("=======================");
    }
    public void calcularArea(int base, int altura){
        int areaRetangulo = base * altura;
        System.out.println("A área do retangulo é igual a : " + areaRetangulo);
        System.out.println("=======================");
    }
    public void mostraDados(String nome, int idade){
        System.out.println("Seu nome é " + nome + " voce tem : " + idade + " anos de idade");
        System.out.println("=======================");
    }
    public void mostrarDados(String nome, int idade, double altura){
        System.out.println("Voce é a " + nome + " tem " + idade + " anos de idade e mede " + altura + " metros ");
        System.out.println("=======================");
    }

    public void maior(int n1, int n2){
        if(n1 > n2){
            System.out.println("O " + n1 + " é o maior numero");
        }else{
            System.out.println("O " + n2 + " é o maior numero");
        }
        System.out.println("=======================");
    }
    public void maior(int n1, int n2, int n3){
        if(n1 > n2 && n1 > n3){
            System.out.println("O numero " + n1 + " é o maior numero");
        }if(n2 > n1 && n2 > n3){
            System.out.println("O numero " + n2 + " é o maior numero");
        }else if(n3 > n1 && n3 > n2){
            System.out.println("O numero " + n3 + " é o maior numero");
        }
        System.out.println("=======================");
    }

    public void listar(int n1, int n2, int n3, int n4){
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        System.out.println(n4);
        System.out.println("=======================");
    }

    public void listar(String a, String b , String c){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println("=======================");
    }

    public void autentificar(String usuario, String senha){
        System.out.println("Usuario : " + usuario);
        System.out.println("Senha : " + senha);
        System.out.println("=======================");
    }
    public void autentificar(String usuario, int codigo){
        System.out.println("Usuario : " + usuario);
        System.out.println("Codigo de verficação + " + codigo);
    }


    public static void main(String[] args) {
        Sobrecarga sobrecarga = new Sobrecarga();
        System.out.println("A soma de dois numeros é igual a " + sobrecarga.somar(2,4));
        System.out.println("A soma de tres numeros é igual a : " + sobrecarga.somar(2,4,6));
        System.out.println("A soma de dois double é igual a : " + sobrecarga.somar(4, 6.5));
        sobrecarga.exibir("Essa é a mensagem");
        sobrecarga.exibir("Essa é a mensagem", 10);
        sobrecarga.calcularArea(4);
        sobrecarga.calcularArea(8,8);
        sobrecarga.mostraDados("Eloisa", 19);
        sobrecarga.mostrarDados("Maria", 22, 1.55);
        sobrecarga.maior(9,11);
        sobrecarga.maior(18,14,11);
        sobrecarga.listar(3,4,5,6);
        sobrecarga.listar("oi", "bom dia", "boa tarde");
        sobrecarga.autentificar("Ana ", "22440");
        sobrecarga.autentificar("Maria" , 34568);
    }
}


