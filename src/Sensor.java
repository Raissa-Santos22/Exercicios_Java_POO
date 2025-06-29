public class Sensor {
    public int lerTemperatura(){
        var temperatura = 30;
       return temperatura;
    }

    public static void main(String[] args) {
        Sensor sensor = new Sensor();
        System.out.println("A temperatura é : " + sensor.lerTemperatura() + " graus Celsius");
    }
}
