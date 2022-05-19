import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!. \n");

     //   Pessoa p1 = new Pessoa();
     //   p1.setNome("Willdeglan Gomes");
     //   p1.setIdade(40);

     //   p1.mostrarDados();

     //   Pessoa p2 = new Pessoa();
     //   p2.mostrarDados();

     //   Aluno a1 = new Aluno("Hilp25", 25, "computação");
     //   a1.mostrarDados();
        
        ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
        pessoas.add(new Aluno("Aluno 1", 25, "gfdsgsaadsf"));
        pessoas.add(new Professor("Prof 1", 50, "Licenciatura"));
        pessoas.add(new Aluno("Aluno 2", 29, "gffdsfdsgdsf"));
        pessoas.add(new Aluno("Aluno 3", 31, "gfdsgdsf"));
        pessoas.add(new Professor("Prof 2", 55, "Letras"));
        pessoas.add(new Aluno("Aluno 4", 21, "gfdsgdssdsf"));
        pessoas.add(new Aluno("Aluno 5", 22, "gfdsaasgdsf"));
        pessoas.add(new Professor("Prof 3", 30, "Ciencias"));
        
        for(Pessoa pessoa : pessoas){
            pessoa.mostrarDados();
        }
    }
}
