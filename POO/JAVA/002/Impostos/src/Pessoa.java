public abstract class Pessoa {

    Data dt = new Data();

    private String nome;
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    private Data nascimento;
    public String getNome;
    public Data getNascimento() {
        return nascimento;
    }
    public void setNascimento(Data nascimento) {
        this.nascimento = nascimento;
    }

    public Pessoa(String nome, Data nascimento){
        this.nome = nome;
        this.nascimento = nascimento;
    }

    
}



// import java.util.date;