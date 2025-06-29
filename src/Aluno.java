public class Aluno {
    private int nota1 = 5;
    private int nota2 = 7;
    private int nota3 = 2;

    public double getMedia() {
        int soma = nota1 + nota2 + nota3;
        double media = soma/3.0;
        if(media > 5){
            System.out.println("Aluno aprovado!");
        }else{
            System.out.println("Aluno reprovado");
        }
        return media; // Usando 3.0 para forçar divisão com ponto flutuante
    }

    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        System.out.println("A média do aluno é: " + aluno.getMedia());
    }
}
