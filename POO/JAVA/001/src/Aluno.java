public final class Aluno extends Pessoa {
    private String matricula;
    public String getMatricula(){
        return matricula;
    }
    public void setMatricula(String matricula){
        this.matricula = matricula.toUpperCase();
    }

    public void mostrarDados(){
        System.out.printf("%s tem %d anos de idade e tem Matrícula nº %s.\n", this.getNome(), getIdade(), getMatricula());
    }

    public Aluno(String nome, int idade, String matricula) throws Exception{
        super(nome, idade);
        this.setMatricula(matricula);
    }
}
