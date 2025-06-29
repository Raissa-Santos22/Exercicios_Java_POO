public class RelogioParametros {
    public void ajustarHora(int hora, int minuto){
        System.out.println("Agora são " + hora +  ":" + minuto);
    }

    public static void main(String[] args) {
        RelogioParametros relogioParametros = new RelogioParametros();
        relogioParametros.ajustarHora(11, 33);
    }
}
