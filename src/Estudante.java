public class Estudante {
    public void registraNota(double nota){
        System.out.println("Sua nota foi " + nota);
        if(nota > 5){
            System.out.println("Parabéns! Voce passou na prova");
        }else{
            System.out.println("Infelizmente voce reprovou na prova, e irá para a recuperação");
        }
    }

    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.registraNota(3);
    }
}
