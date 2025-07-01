public class MensagemComParametro {
    public static void enviar(String texto){
        System.out.println(texto);
    }
    public static void somar(int a, int b){
        int soma = a + b;
        System.out.println("A soma de " + a  + " + " + b + " = " + soma );
    }

    public static void registraNota(double nota){
        System.out.println("Sua nota foi " + nota);
        if(nota > 5){
            System.out.println("Parabéns! Voce passou na prova");
        }else{
            System.out.println("Infelizmente voce reprovou na prova, e irá para a recuperação");
        }
    }

    public static void andar(int metros){
        System.out.println("Voce andou : " + metros + " metros");
    }

    public static void tocarSom(String nomeDoSom){
        System.out.println(nomeDoSom);
    }
    public static void ligarPara(String numero){
        System.out.println("Voce ligou para " + numero);
    }
    public static void enviarPara(String destinatario){
        System.out.println("O destinatario desse email é " + destinatario);
    }

    public static void main(String[] args) {
       enviar("Bem vindo!");
       somar(3,4);
       registraNota(9);
       andar(100);
       ajustarHora(19,00);
       tocarSom("Violão");
       ligarPara("40028922");
       enviarPara("ana@gmail.com");

    }

    public static void ajustarHora(int hora, int minuto){
        System.out.println("Agora são " + hora +  ":" + minuto);
    }
}
