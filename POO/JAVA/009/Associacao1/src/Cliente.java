public class Cliente {
    
    private String nome;
    private Endereco endereco;


    public Cliente() {
    }


    public Cliente(String nome, Endereco endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return this.endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public void imprimeInformacao(){
        System.out.println(this.nome);
        System.out.println(this.endereco.toString());
    }
}
