public class Pessoa {
    private String nome;
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome) throws Exception{
        int qtdePalavras = nome.trim().split(" ").length;
        if(qtdePalavras > 1){
            this.nome = nome;
        }else{
            throw new Exception("Nome deve ter pelo menos duas palavras.");
        }
    }

    private int idade;
    public int getIdade(){
        return this.idade;
    }
    public void setIdade(int idade) throws Exception{
        if(idade >=0 && idade <= 120){
            this.idade = idade;
        }else{
            throw new Exception("Idade deve está entre 0 e 120 anos.");
        }
    }

    void mostrarDados(){
        System.out.printf("%s tem %d anos de idade. \n", this.nome, this.idade);
    }

    public Pessoa(String nome, int idade) throws Exception{
        this.setNome(nome);
        this.setIdade(idade);
    }

    Pessoa(){
        this.nome = "will";
        this.idade = 39;
    }
}