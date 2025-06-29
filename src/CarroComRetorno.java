public class CarroComRetorno {
    int velocidade = 40;
    public int getVelocidadeMaxima(){
        if(velocidade > 60){
            System.out.println("Voce está acima da velocidade ! Multado");
        }else{
            System.out.println("Voce está dentro do limite de velocidade");
        }
        return velocidade;
    }
    public static void main(String[] args) {
        CarroComRetorno carro = new CarroComRetorno();
        System.out.println("A velocidade máxima do carro foi : " + carro.getVelocidadeMaxima()
        + "Km/h");
    }
}
