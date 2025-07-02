public class Funcionario {

    private double salario;
    private String cargo;

    public void setSalario(double salario){
        this.salario = salario;
    }
    public void setCargo(String cargo){
        this.cargo = cargo;
    }

    public double getSalario(){
        return salario;
    }

    public String getCargo(){
        return cargo;
    }

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setCargo("Engenheiro de Software");
        funcionario.setSalario(9000.00);

        System.out.println("===============================");
        System.out.println("CARGO DO FUNCIONARIO : " +funcionario.getCargo());
        System.out.println("SALARIO DO FUNCIONARIO : " + funcionario.getSalario());
    }



}
