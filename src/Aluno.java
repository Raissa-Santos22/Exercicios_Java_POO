public class Aluno {
    private String nome;
    private int nota;

    public void setNome(String nome){
        this.nome = nome;
    }
    public void setNota(int nota){
        this.nota = nota;
    }

    public String getNome(){
        return nome;
    }
    public int getNota(){
        return nota;
    }

    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.setNome("Ana");
        aluno.setNota(10);
        System.out.println("==================================");
        System.out.println("NOME DO ALUNO : " + aluno.getNome());
        System.out.println("NOTA DO ALUNO : " + aluno.getNota());
        System.out.println("===================================");
    }

}
