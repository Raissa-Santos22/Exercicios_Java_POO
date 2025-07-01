public class MetodosSimples {
    public static void ligar(){
        System.out.println("A lampada está ligada");
    }

    public static void buzinar(){
        System.out.println("Bi,bi");
    }

    public static void main(String[] args) {
        ligar();
        buzinar();
        iniciar();
        mostrarMensagem();
        ligarTela();
        reiniciarSistema();
        mostrarHora();
        boasvindas();
        exibirSoma();
        mostrarCelsius();
    }

    public static void iniciar(){
        System.out.println("Jogo iniciado!");
    }

    public static void mostrarMensagem(){
        System.out.println("Estudando Java com POO!");
    }

    public static void ligarTela(){
        System.out.println("Tela ligada");
    }

    public static void reiniciarSistema(){
        System.out.println("Sistema reiniciado");
    }

    public static void mostrarHora(){
        System.out.println("Hora atual: 14:00");
    }

    public static void boasvindas(){
        System.out.println("Bem vindo ao sistema!");
    }

    public static void exibirSoma(){
        var n1 = 5;
        var n2 = 3;
        var soma = n1+n2;

        System.out.println("A soma de : " + n1 + " + " + n2 + " = " + soma);

    }

    public static void mostrarCelsius(){
        System.out.println("Temperatura atual: 25°C");
    }

}

