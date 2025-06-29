public class Celular {
    public String getMarca(){
        String marca = "Apple";
        return marca;
    }

    public static void main(String[] args) {
        Celular celular = new Celular();
        System.out.println("A marca do celular é : " + celular.getMarca());
    }
}
