public class Aluno extends Pessoa{
    
    @Override
    public void saudacao(String nome){
        System.out.println("Ola, Tudo bem "+nome+"? Gosta de programar?");
    }
}
