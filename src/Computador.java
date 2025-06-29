public class Computador {
    public double getMemoriaRam(){
        double memoriaRam = 8;
        return memoriaRam;
    }

    public static void main(String[] args) {
        Computador computador = new Computador();
        System.out.println("A memória RAM do computador é de : " + computador.getMemoriaRam() + " Gb");
    }
}
